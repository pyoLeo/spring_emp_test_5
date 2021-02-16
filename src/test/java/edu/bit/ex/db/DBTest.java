package edu.bit.ex.db;

import java.util.List;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import edu.bit.ex.mapper.EmpMapper;
import edu.bit.ex.vo.EmpVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DBTest {

	@Setter(onMethod_ = @Autowired)
	private EmpMapper empMapper;
	
	@Test
	public void testList() {
		
		List<EmpVO> list = empMapper.getList();
		
		log.info("empMapper");
		
		for(EmpVO empVO : list) {
			log.info(empVO.getEmpno());
		}
	}
	
	@Test
	public void testRand() {
		
		List<EmpVO> list = empMapper.getList();
		empMapper.update();
		log.info(empMapper);
		for(EmpVO empVO : list) {
			log.info(empVO.getDeptno());
		}
	}
}
