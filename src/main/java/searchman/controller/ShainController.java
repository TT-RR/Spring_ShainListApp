package searchman.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import searchman.entity.Shain;
import searchman.service.ShainService;

@Controller
public class ShainController {
	@Autowired
	private ShainService shainService;

	@GetMapping("/index")
	public String index(Model model) {

		// リスト取得
		List<Shain> shainList = shainService.findAll();

		// JSPに渡す
		model.addAttribute("shainList", shainList);
		// JSPに転送
		return "index";
	}
}
