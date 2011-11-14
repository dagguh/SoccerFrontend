package pl.dagguh.soccerfrontend.backend;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.ClientResponse.Status;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.log4j.Logger;

/**
 *
 * @author Maciej Kwidziński <maciek.kwidzinski@gmail.com>
 */
@XmlRootElement
public class Player {

	private static Logger log = Logger.getLogger(Player.class);
	private String nick;
	private int score;

	public Player() {
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Player{" + "nick=" + nick + ", score=" + score + '}';
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
}
