package pl.dagguh.soccerfrontend.backend;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.ClientResponse.Status;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.log4j.Logger;
import pl.dagguh.soccerfrontend.web.forms.Credentials;

/**
 *
 * @author Maciej Kwidziński <maciek.kwidzinski@gmail.com>
 */
@XmlRootElement
public class Player {

	private static Logger log = Logger.getLogger(Player.class);
	private String nick;
	private String password;
	private int score;

	public Player() {
	}

	public Player(Credentials credentials) {
		this.nick = credentials.getNick();
		this.password = credentials.getPassword();
	}

	public Player(String nick) {
		this.nick = nick;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Player{" + "nick=" + nick + ", password=" + password + ", score=" + score + '}';
	}

	public static String getAsXml(String nick) {
		ClientResponse response = Backend.getResource("/player/" + nick).get(ClientResponse.class);
		log.info("Got response " + response);
		Status status = response.getClientResponseStatus();
		if (Status.NO_CONTENT == status) {
			return "There is no player with nick " + nick;
		} else {
			return response.getEntity(String.class);
		}
	}

	public static String register(Player player) {
		log.info("Creating " + player);
		return Backend.getResource("/player/").put(String.class, player);
	}

	public static String authenticate(Credentials credentials) {
		Player player = new Player(credentials);
		String ticket = Backend.getResource("/player/authenticate").post(String.class, player);
		log.info("For account " + player + " got ticket " + ticket);
		return ticket;
	}
}
