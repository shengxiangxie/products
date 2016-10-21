<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function changeCode(){
		var time=new Date().getTime();
		document.getElementById("codeId").src="<%=request.getContextPath()%>/CodeServlet?d=" + time;
	}
</script>
</head>
<body>
	<form action="CheckCode" method="post">
		請輸入驗證碼：<input name="code" type="text"/>
		<img id="codeId" src="CodeServlet" onclick="changeCode()" />
		<input type="submit" value="校验"/>
	</form>
	
</body>
</html>