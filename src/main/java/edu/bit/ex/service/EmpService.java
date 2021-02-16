package edu.bit.ex.service;

import java.util.List;

import edu.bit.ex.page.Criteria;
import edu.bit.ex.vo.EmpVO;

public interface EmpService {

	public List<EmpVO> getList();

	public void insertEmp(EmpVO empVO);

	public List<EmpVO> getList(Criteria cri);

	public int getTotal(Criteria cri);

	public List<EmpVO> deptList(int deptno);
}
