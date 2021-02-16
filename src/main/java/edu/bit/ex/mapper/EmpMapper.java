package edu.bit.ex.mapper;

import java.util.List;

import edu.bit.ex.page.Criteria;
import edu.bit.ex.vo.EmpVO;

public interface EmpMapper {

	public List<EmpVO> getList();

	public void insertEmp(EmpVO empVO);

	public List<EmpVO> getListWithPaging(Criteria cri);

	public int getTotalCount(Criteria cri);

	public void update();

	public List<EmpVO> deptList(int deptno);

}
