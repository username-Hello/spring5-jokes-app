package springframework.guru.joke.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springframework.guru.joke.services.JokeService;

@Controller
public class JokeController {

	private final JokeService jokesService;

	public JokeController(JokeService jokesService) {
		this.jokesService = jokesService;
	}

	@RequestMapping({"/", ""})
	public String showJoke(Model model){

		model.addAttribute("joke", jokesService.getJoke());
		return "jokes/chucknorris";
	}

}
