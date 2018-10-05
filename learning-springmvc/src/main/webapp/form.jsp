<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>表单</title>
</head>
<body>
	<form action="/learning-springmvc/my/test5" method="post">
		<input type="text" name="name"/>
		<input type="text" name="age"/>
		<input type="text" name="address.city"/>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>