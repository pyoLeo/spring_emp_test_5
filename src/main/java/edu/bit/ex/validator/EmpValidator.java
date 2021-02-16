package edu.bit.ex.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import edu.bit.ex.vo.EmpVO;

public class EmpValidator implements Validator {
	@Override
	public boolean supports(Class<?> clazz) {
		return false;
	}
	
	@Override
	public void validate(Object obj, Errors errors) {
		System.out.println("validate()");
		EmpVO empVO = (EmpVO)obj;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "empno", "trouble");
	}

}
