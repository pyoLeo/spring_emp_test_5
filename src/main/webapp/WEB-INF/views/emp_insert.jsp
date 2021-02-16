<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" type="text/css" />  
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>  
<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
<script type="text/javascript">
$(function() {
    $( "#Date" ).datepicker({
    });
});

function check() {
	if(!document.)
}
</script>
<style>
input {
	float:center;
}
</style>
</head>
<body>
	<h2>사원 정보 입력</h2>
	<hr>
	<form action="/insert" ><br />
	사원번호 : <input type="text" class="empno_input" check_result="fail" required id="empno" maxlength="4" name="${emp.empno}">
	<button type="button" class="no_overlap_button" onclick="no_overlap_check()">중복검사</button>
	<img id="id_check_sucess" style="display: none;"><br/>
	사원이름 : <input type="text" id="ename" name="${emp.ename}"><br />
	사원직급 : <input type="text" id="job" name="${emp.job}"><br />
	매니저 : <select name="${emp.mgr}">
				<option value="">매니저선택</option>
				<option value="7566">(7566)JONES</option>
				<option value="7698">(7698)BLAKE</option>
				<option value="7782">(7782)CLARK</option>
				<option value="7839">(7839)KING</option>
				<option value="7902">(7902)FORD</option>
				<option value="null">(NULL)PRESIDENT</option>
			</select>
	<br />
	입사일 : <input type="text" id="Date" name="${emp.hireDate}"  value="연도 - 월 - 일"/><br />
	급여 : <input type="text" id="sal" name="${emp.sal}"><br />
	커미션 : <input type="text" id="comm" name="${emp.comm}"><br />
	부서 : <select name="${emp.deptno}">
			<option value="">부서선택</option>
			<option value="10">(10)ACCOUNTING</option>
			<option value="20">(20)RESEARCH</option>
			<option value="30">(30)SALES</option>
			<option value="40">(40)OPERATIONS</option>
		</select>
	<br />
	<input type="submit" value="입력" >
	<input type="reset" value="초기화">
	</form>
</body>
</html>