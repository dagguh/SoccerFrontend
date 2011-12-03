package pl.dagguh.soccerfrontend.backend;

import javax.xml.bind.annotation.XmlRootElement;
import org.apache.log4j.Logger;

/**
 *
 * @author Maciej Kwidziński <maciek.kwidzinski@gmail.com>
 */
@XmlRootElement
public class AuthenticatedPlayer {

	private static Logger log = Logger.getLogger(AuthenticatedPlayer.class);
	private String nick;
	private String ticket;

	public AuthenticatedPlayer() {
		log.info("Constructing without parameters");
	}

	public AuthenticatedPlayer(String nick, String ticket) {
		this.nick = nick;
		this.ticket = ticket;
		log.info("Constructing with parameters " + this);
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "AuthenticatedPlayer{" + "nick=" + nick + ", ticket=" + ticket + '}';
	}
}
