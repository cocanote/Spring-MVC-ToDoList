<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css" type="text/css">
</head>
<body>
	<section>
        <div id="button-app">
            <form action = "MainServlet" accept-charset="utf-8"  method = "post" class="newtodoform">
                <input class="newtodo" type="submit" value="새로운 todo 등록" name="newtodo" >
                </form>
        </div>
		<nav id="project-app">
		
			<ul class="depth01">
				<li>
					<div class="todo">
						<h2 class="h2 web" id="title-block">TODO</h2>
						<ul class="depth02">
							<li><div class="data" id="app-block">
									<p class="titled">aaa</p>
									<p class="subd">bbb</p>
								</div></li>
							<li><div class="data" id="app-block">
									<p class="titled">aaa</p>
									<p class="subd">bbb</p>
									<li><div class="data" id="app-block">
											<p class="titled">aaa</p>
											<p class="subd">bbb</p>
										</div></li>
						</ul>
					</div>
				</li>
				<li><div class="doing">
						<h2 class="h2 web" id="title-block">DOING</h2>
						<ul class="depth02">
							<li><div class="data" id="app-block">
									<p class="titled">aaa</p>
									<p class="subd">bbb</p>
								</div></li>
							<li><div class="data" id="app-block">
									<p class="titled">aaa</p>
									<p class="subd">bbb</p>
									<li><div class="data" id="app-block">
											<p class="titled">aaa</p>
											<p class="subd">bbb</p>
										</div></li>
						</ul>
					</div></li>
				<li>
					<div class="done">
						<h2 class="h2 web" id="title-block">DONE</h2>
						<ul class="depth02">
							<li><div class="data" id="app-block">
									<p class="titled">aaa</p>
									<p class="subd">bbb</p>
								</div></li>
							<li><div class="data" id="app-block">
									<p class="titled">aaa</p>
									<p class="subd">bbb</p>
									<li><div class="data" id="app-block">
											<p class="titled">aaa</p>
											<p class="subd">bbb</p>
										</div></li>
						</ul>
					</div>
				</li>
			</ul>
		</nav>
	</section>
</body>
</html>