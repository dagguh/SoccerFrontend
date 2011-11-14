package pl.dagguh.soccerfrontend.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.dagguh.soccerfrontend.backend.Player;
import pl.dagguh.soccerfrontend.web.forms.Nick;

/**
 *
 * @author Maciej Kwidziński <maciek.kwidzinski@gmail.com>
 */
@Controller
public class Lookup {

	@RequestMapping(value = "/lookupPlayerForm", method = RequestMethod.GET)
	public void lookupPlayerForm(Model model) {
		model.addAttribute(new Nick());
	}

	@RequestMapping(value = "/lookupPlayer", method = RequestMethod.GET)
	public String lookupPlayer() {
		return "redirect:lookupPlayerForm";
	}

	@RequestMapping(value = "/lookupPlayer", method = RequestMethod.POST)
	public void lookupPlayer(@ModelAttribute Nick nick, Model model) {
		String playerXml = Player.getAsXml(nick.getNick());
		model.addAttribute("nick", nick.getNick());
		model.addAttribute("playerXml", playerXml);
	}
}
