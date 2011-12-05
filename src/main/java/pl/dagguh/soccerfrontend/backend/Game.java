package pl.dagguh.soccerfrontend.backend;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Maciej Kwidziński <maciek.kwidzinski@gmail.com>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Game {

	@Id
	@GeneratedValue
	private long id;
	private String redPlayerNick;
	private String bluePlayerNick;
	private boolean isItRedsTurn;
	private GameField gameField;

	public long getId() {
		return id;
	}

	public String getBluePlayerNick() {
		return bluePlayerNick;
	}

	public void setBluePlayerNick(String bluePlayerNick) {
		this.bluePlayerNick = bluePlayerNick;
	}

	public GameField getGameField() {
		return gameField;
	}

	public void setGameField(GameField gameField) {
		this.gameField = gameField;
	}

	public boolean isIsItRedsTurn() {
		return isItRedsTurn;
	}

	public void setIsItRedsTurn(boolean isItRedsTurn) {
		this.isItRedsTurn = isItRedsTurn;
	}

	public String getRedPlayerNick() {
		return redPlayerNick;
	}

	public void setRedPlayerNick(String redPlayerNick) {
		this.redPlayerNick = redPlayerNick;
	}

	@Override
	public String toString() {
		return "Game{" + "id=" + id + ", redPlayerNick=" + redPlayerNick + ", bluePlayerNick=" + bluePlayerNick + ", isItRedsTurn=" + isItRedsTurn + ", gameField=" + gameField + '}';
	}
}
