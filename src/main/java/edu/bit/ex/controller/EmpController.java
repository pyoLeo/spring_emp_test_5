package edu.bit.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
public class EmpController {
	
	private EmpService empService;
	
	@GetMapping("/emp/list")
	public String list(Model model) {
		log.info("list()");
		model.addAttribute("list", empService.getList());
		
		return "list";
	}
	
	@RequestMapping("/insert")
	public String insert_view(EmpVO empVO, Model model) throws Exception {
		log.info("insert_view()");
		
		return "emp_insert";
	}
	
	@GetMapping("list3")
	public String list3(Model model) {
		log.info("list3()");
		model.addAttribute("emplist", empService.getList());
		
		return "ajaxList";
	}
	/*
	 * @RequestMapping("/emp/inserted") public String insert(@ModelAttribute("emp")
	 * EmpVO empVO, Model model, BindingResult result) throws Exception {
	 * log.info("write()");
	 * 
	 * String page = "redirect:list";
	 * 
	 * EmpValidator validator = new EmpValidator(); validator.validate(empVO,
	 * result);
	 * 
	 * if(result.hasErrors()) { empService.insertEmp(empVO); page = "emp_insert"; }
	 * return page; }
	 * 
	 * @InitBinder protected void initBinder(WebDataBinder binder) {
	 * binder.setValidator(new EmpValidator()); }
	 */
	
	@GetMapping("/list2")
	public void list2(Criteria cri, Model model) {
		log.info("list2()");
		log.info(cri);
		
		model.addAttribute("list", empService.getList(cri));	//list��ü �����Ǿ� getList()���� ���
		int total = empService.getTotal(cri);
		log.info("total" + total);
		
		model.addAttribute("pageMaker", new PageVO(cri, total));
	}
}
