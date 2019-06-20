package haagahelia.fi.Project.management.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import haagahelia.fi.Project.management.domain.Card;
import haagahelia.fi.Project.management.domain.CardListRepository;
import haagahelia.fi.Project.management.domain.CardRepository;

@Controller
public class ListController {
	@Autowired
	private CardRepository cRepo;
	@Autowired
	private CardListRepository clRepo;
	
	@RequestMapping(value = {"/"})
	public String main(Model model) {
		model.addAttribute("cardLists", clRepo.findAll());
		model.addAttribute("mcards", cRepo.findAll());
		model.addAttribute("newcard", new Card());
		return "main";
	}
	@RequestMapping(value= "/save", method = RequestMethod.POST)
	public String save(Card card) {
		cRepo.save(card);
		System.out.println(card);
		return "redirect:/";
	}
}
