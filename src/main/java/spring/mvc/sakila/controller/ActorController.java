package spring.mvc.sakila.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import spring.mvc.sakila.dao.ActorDao;
import spring.mvc.sakila.model.Actor;

@Controller
public class ActorController {
	
	private final ActorDao actorDao;
	 private static final Logger logger = LoggerFactory.getLogger(ActorController.class);

	@Autowired
	public ActorController(ActorDao actorDao) {
		this.actorDao = actorDao;
	}

	@GetMapping("/actors")
	public String getActors(Model model) {
		List<Actor> actors = actorDao.findAll();
		logger.info(actors.toString());
		System.out.println(actors.toString());
		model.addAttribute("actors", actors);
		return "actorList";
	}
}
