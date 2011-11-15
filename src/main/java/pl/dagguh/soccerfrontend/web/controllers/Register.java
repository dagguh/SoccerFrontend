package pl.dagguh.soccerfrontend.web.controllers;

import pl.dagguh.soccerfrontend.web.forms.Credentials;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.dagguh.soccerfrontend.backend.Account;

/**
 *
 * @author Maciej Kwidziński <maciek.kwidzinski@gmail.com>
 */
@Controller
public class Register {

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
		String message = Account.create(new Account(credentials));
		model.addAttribute("message", message);
	}
}
