package pl.dagguh.soccerfrontend.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.dagguh.soccerfrontend.backend.Player;
import pl.dagguh.soccerfrontend.web.forms.Credentials;

/**
 *
 * @author Maciej Kwidziński <maciek.kwidzinski@gmail.com>
 */
@Controller
public class RegisterController {

	@RequestMapping(value = "/registerForm", method = RequestMethod.GET)
	public void onGet(Model model) {
		model.addAttribute(new Credentials());
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String onMisusedGet() {
		return "redirect:registerForm";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public void onPost(@ModelAttribute Credentials credentials, Model model) {
		String message = Player.register(new Player(credentials));
		model.addAttribute("message", message);
	}
}
