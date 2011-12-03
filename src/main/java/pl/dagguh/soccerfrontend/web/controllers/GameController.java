package pl.dagguh.soccerfrontend.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import pl.dagguh.soccerfrontend.backend.AuthenticatedPlayer;
import pl.dagguh.soccerfrontend.backend.GameServiceBoundary;

/**
 *
 * @author Maciej Kwidziński <maciek.kwidzinski@gmail.com>
 */
@Controller
@SessionAttributes({"nick", "ticket", "gameId"})
public class GameController {

	@RequestMapping(value = "/gameList", method = RequestMethod.GET)
	public void showGameList(Model model) {
		model.addAttribute("foo", "Kebab");
	}

	@RequestMapping(value = "/game", method = RequestMethod.GET)
	public void showGame(Model model) {
		model.addAttribute("foo", "Kebab");
	}

	@RequestMapping(value = "/createGame", method = RequestMethod.POST)
	public String createGame(@ModelAttribute("nick") String nick, @ModelAttribute("ticket") String ticket, Model model) {
		String gameId = GameServiceBoundary.createGame(new AuthenticatedPlayer(nick, ticket));
		model.addAttribute("gameId", gameId);
		return "redirect:game";
	}
}
