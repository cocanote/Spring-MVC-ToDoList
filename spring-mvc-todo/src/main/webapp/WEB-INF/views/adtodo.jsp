<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>TODO LIST</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/register.css" type="text/css">
</head>
<body>

	<section> 
		<form action = "reg" accept-charset="utf-8"  method = "get">
			<H2>할일 등록</H2>
			<div class="add_secttion">
				<div class="put_info">
					<div>어떤일인가요?</div>

					<input class="work" type="text" placeholder="할일을 입력해주세요" id="work"
						name="thing" maxlength="24">
				</div>
				<div class="put_info">
					<div>누가 할일인가요?</div>
					<input class="work" type="text" placeholder="누가 할일인지 알려주세요 "
						id="who" name="name" maxlength="24">
				</div>
				<div class="put_info">
					<div>우선순위를 선택하세요</div>
					<input type="radio" value="1" name="sequence">1순위 <input
						type="radio" value="2" name="sequence">2순위 <input
						type="radio" value="3" name="sequence">3순위
				</div>
			</div>
			
			<div class="buttons">
				<input type="button" value="&lt이전">
				<input type="reset" value="내용지우기"> <input type="submit" name="addtodo">

			</div>
		</form>
	</section>
</body>
</html>