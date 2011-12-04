package pl.dagguh.soccerfrontend.web.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import pl.dagguh.soccerfrontend.backend.AuthenticatedPlayer;
import pl.dagguh.soccerfrontend.backend.GameServiceBoundary;

/**
 * @author Maciej Kwidziński <maciek.kwidzinski@gmail.com>
 */
@Controller
@SessionAttributes({"nick", "ticket", "gameId", "color", "openGameId"})
public class GameController {

	private static Logger log = Logger.getLogger(GameController.class);
	private static final String redPlayerColor = "red";
	private static final String bluePlayerColor = "blue";

	@RequestMapping(value = "/chooseGame", method = RequestMethod.GET)
	public void showGameChoice(Model model) {
		String gameId = GameServiceBoundary.getOpenGameId();
		model.addAttribute("openGameId", gameId);
	}

	@RequestMapping(value = "/game", method = RequestMethod.GET)
	public void showGame(Model model) {
		model.addAttribute("foo", "Kebab");
	}

	@RequestMapping(value = "/createGame", method = RequestMethod.POST)
	public String createGame(@ModelAttribute("nick") String nick, @ModelAttribute("ticket") String ticket, Model model) {
		String gameId = GameServiceBoundary.createGame(new AuthenticatedPlayer(nick, ticket));
		log.info("Created game " + gameId);
		model.addAttribute("gameId", gameId);
		model.addAttribute("color", redPlayerColor);
		return "redirect:game";
	}

	@RequestMapping(value = "/joinGame", method = RequestMethod.POST)
	public String joinOpenGame(@ModelAttribute("openGameId") String gameIdToJoin, Model model) {
		log.info("Joining game " + gameIdToJoin);
		model.addAttribute("color", bluePlayerColor);
		return "redirect:game";
	}
}
