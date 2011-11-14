package pl.dagguh.soccerfrontend.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author Maciej Kwidziński <maciek.kwidzinski@gmail.com>
 */
@Controller
@SessionAttributes("ticket")
public class MatchList {

	@RequestMapping(value = "/matchList", method = RequestMethod.GET)
	public void showMatchList(Model model) {
		model.addAttribute("foo", "Kebab");
	}
}
