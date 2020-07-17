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
			<form action="adtodo" accept-charset="utf-8" method="post"
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
												<p class="subd">등록날자 :${item.regdate} ${item.name}.
													우선순위${item.sequence}
												<form action="mod" accept-charset="utf-8" method="get"
													class="modiform">
													<input type="hidden" value=${item.id } name="id"> <input
														type="hidden" value="DOING" name="type"> <input
														class="modiB" type="submit" value="→" name=modi>
												</form>
												</p>

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
												<p class="subd">등록날자 :${item.regdate} ${item.name}. 우선순위
													${item.sequence}<form action="mod" accept-charset="utf-8" method="get"
													class="modiform">
													<input type="hidden" value=${item.id } name="id">
													<input type="hidden" value="DONE" name="type">
													<input class="modiB" type="submit" value="→" name=modi>
												</form>
													</p>
												
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
												<p class="subd">등록날자 :${item.regdate} ${item.name}. 우선순위
													${item.sequence}
													<form action="mod" accept-charset="utf-8" method="get"
													class="modiform">
													<input type="hidden" value=${item.id } name="id">													
													<input class="modiB" type="submit" value="del" name=modi>
												</form>
													</p>
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