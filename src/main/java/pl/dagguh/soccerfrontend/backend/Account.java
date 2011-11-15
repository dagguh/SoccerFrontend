package pl.dagguh.soccerfrontend.backend;

import javax.xml.bind.annotation.XmlRootElement;
import org.apache.log4j.Logger;
import pl.dagguh.soccerfrontend.web.forms.Credentials;

/**
 *
 * @author Maciej Kwidziński <maciek.kwidzinski@gmail.com>
 */
@XmlRootElement
public class Account {

	private static Logger log = Logger.getLogger(Account.class);
	private Player player;
	private String password;

	public String getPassword() {
		return password;
	}

	public Account() {
	}

	public Account(Player player, String password) {
		this.player = player;
		this.password = password;
	}

	public Account(String nick, String password) {
		this.player = new Player(nick);
		this.password = password;
	}

	public Account(Credentials credentials) {
		this.player = new Player(credentials.getNick());
		this.password = credentials.getPassword();
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	@Override
	public String toString() {
		return "Account{" + "player=" + player + '}';
	}

	public static String create(Account account) {
		log.info("Creating " + account);
		return Backend.getResource("/account/").put(String.class, account);
	}

	public static String authenticate(Credentials credentials) {
		Account account = new Account(credentials);
		String ticket = Backend.getResource("/account/authenticate").post(String.class, account);
		log.info("For account " + account + " got ticket " + ticket);
		return ticket;
	}
}
