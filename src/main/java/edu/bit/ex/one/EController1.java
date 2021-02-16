package edu.bit.ex.one;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EController1 {

	@Inject
	EService1 eservice;

	@RequestMapping("/list1")
	public String list(Model model) throws Exception {
		System.out.println("list1()");

		model.addAttribute("list", eservice.selectEmpList());
		return "list2";
	}
}
