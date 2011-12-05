package pl.dagguh.soccerfrontend.backend;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Maciej Kwidziński <maciek.kwidzinski@gmail.com>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class GameField {

	private long id;
	private int[][] bitMasks;
	private int ballX;
	private int ballY;

	public GameField() {
	}

	public long getId() {
		return id;
	}

	public int getBallX() {
		return ballX;
	}

	public void setBallX(int ballX) {
		this.ballX = ballX;
	}

	public int getBallY() {
		return ballY;
	}

	public void setBallY(int ballY) {
		this.ballY = ballY;
	}

	public int[][] getBitMasks() {
		return bitMasks;
	}

	public void setBitMasks(int[][] bitMasks) {
		this.bitMasks = bitMasks;
	}

	@Override
	public String toString() {
		return "GameField{" + "ballX=" + ballX + ", ballY=" + ballY + '}';
	}
}
