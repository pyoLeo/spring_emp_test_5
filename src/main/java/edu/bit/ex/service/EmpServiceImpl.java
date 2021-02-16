package edu.bit.ex.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.bit.ex.mapper.EmpMapper;
import edu.bit.ex.page.Criteria;
import edu.bit.ex.vo.EmpVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class EmpServiceImpl implements EmpService {

	private EmpMapper mapper;
	
	@Override
	public List<EmpVO> getList() {
		// TODO Auto-generated method stub
		log.info("getList()------");
		return mapper.getList();
	}

	@Override
	public void insertEmp(EmpVO empVO) {
		// TODO Auto-generated method stub
		log.info("insertEmp()------");
		mapper.insertEmp(empVO);
	}

	@Override
	public List<EmpVO> getList(Criteria cri) {
		// TODO Auto-generated method stub
		log.info("get List with criteria" + cri);
		return mapper.getListWithPaging(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		// TODO Auto-generated method stub
		log.info("get toal count");
		return mapper.getTotalCount(cri);
	}

	@Override
	public List<EmpVO> deptList(int deptno) {
		// TODO Auto-generated method stub
		log.info("get " + deptno + " list");
		return mapper.deptList(deptno);
	}
	

	

}
