package edu.bit.ex.one;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import edu.bit.ex.vo.EmpVO;

@Service
public class EService1 {

	@Inject
	SqlSession sqlSession;
	
	public List<EmpVO> selectEmpList() throws Exception {
		return sqlSession.selectList("emp.selectEmpList"); //이름은 개발자 맴
	}
}
