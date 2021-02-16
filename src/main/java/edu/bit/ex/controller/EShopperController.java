package edu.bit.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.bit.ex.page.Criteria;
import edu.bit.ex.page.PageVO;
import edu.bit.ex.service.EmpService;
import edu.bit.ex.vo.EmpVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@AllArgsConstructor
@RequestMapping("/eshop/*")
public class EShopperController {
	
	private EmpService empService;
	
	@GetMapping("/emplist")
	public String eshop_list(Model model) {
		log.info("eshop_list()");
		model.addAttribute("list", empService.getList());
		
		return "eshop_list";
	}
	
	@GetMapping("/dept/{deptno}")
	public String dept(@PathVariable int deptno, Model model) {
		log.info("dept()");
	
		model.addAttribute("list", empService.deptList(deptno));
		
		return "dept_list";
	}
}
