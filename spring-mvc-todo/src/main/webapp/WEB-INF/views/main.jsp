<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/main.css"
	type="text/css">
</head>
<body>
	<section>
		<div id="button-app">
			<form action="MainServlet" accept-charset="utf-8" method="post"
				class="newtodoform">
				<input class="newtodo" type="submit" value="새로운 todo 등록"
					name="newtodo">
			</form>
		</div>
		<nav id="project-app">

			<ul class="depth01">

				<li>
					<div class="todo">
						<h2 class="h2 web" id="title-block">todo</h2>
						<ul class="depth02">
							<c:if test="${fn:length(list) > 0}">
								<c:forEach items="${list}" var="item">
									<c:if test="${item.type eq 'TODO' }">
										<li>
											<div class="data" id="app-block">
												<p class="titled">${item.title}</p>
												<p class="subd">${item.name},${item.sequence}</p>
											</div>
										</li>
									</c:if>
								</c:forEach>
							</c:if>
						</ul>
					</div>
				</li>
				<li>
					<div class="doing">
						<h2 class="h2 web" id="title-block">doing</h2>
						<ul class="depth02">
							<c:if test="${fn:length(list) > 0}">
								<c:forEach items="${list}" var="item">
									<c:if test="${item.type eq 'DOING' }">
										<li>
											<div class="data" id="app-block">
												<p class="titled">${item.title}</p>
												<p class="subd">${item.name},${item.sequence}</p>
											</div>
										</li>
									</c:if>
								</c:forEach>
							</c:if>
						</ul>
					</div>
				</li>
				<li>
					<div class="done">
						<h2 class="h2 web" id="title-block">done</h2>
						<ul class="depth02">
							<c:if test="${fn:length(list) > 0}">
								<c:forEach items="${list}" var="item">
									<c:if test="${item.type eq 'DONE' }">
										<li>
											<div class="data" id="app-block">
												<p class="titled">${item.title}</p>
												<p class="subd">${item.name},${item.sequence}</p>
											</div>
										</li>
									</c:if>
								</c:forEach>
							</c:if>
						</ul>
					</div>
				</li>

			</ul>
		</nav>
	</section>
</body>
</html>