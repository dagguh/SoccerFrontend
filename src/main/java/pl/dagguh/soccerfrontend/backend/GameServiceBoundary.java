package pl.dagguh.soccerfrontend.backend;

import org.apache.log4j.Logger;

/**
 * @author Maciej Kwidziński <maciek.kwidzinski@gmail.com>
 */
public class GameServiceBoundary {

	private static Logger log = Logger.getLogger(GameServiceBoundary.class);

	public static String createGame(AuthenticatedPlayer player) {
		log.info("Creating new game for " + player);
		String gameId = Backend.getResource("/game/").put(String.class, player);
		log.info("Recieved new game id " + gameId);
		return gameId;
	}

	public static String getOpenGameId() {
		String openGameId = Backend.getResource("/game/list").get(String.class);
		log.info("Recieved open game id: " + openGameId);
		return openGameId;
	}
}
