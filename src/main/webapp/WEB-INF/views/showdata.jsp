<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<title>账户管理</title>
<meta charset="UTF-8">

<script type="text/javascript" src="js/jquery.min.js"></script>

<body>

	<h2>Kouch：Hello World</h2>

	<h2>账户管理系统</h2>

	<table class="table table-bordered table-hover">
		<thead>
			<tr bgcolor="green">
				<th width="5%">编号</th>
				<th width="10%">账户</th>
				<th width="10%">密码</th>
				<th width="10%">操作</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach var="one" items="${accounts}">
				<tr>
					<td>${one.id}</td>
					<td>${one.account}</td>
					<td>${one.password}</td>
					
					<!-- editAccount.action/delete.action 没写 -->
					<%-- <td><a
						href="${pageContext.request.contextPath}/editAccount.action?param=0&id=${one.id}">编辑</a>
						<a
						href="${pageContext.request.contextPath}/delete.action?id=${one.id}">删除</a>
					</td> --%>
					
					<td><a
						href="">编辑</a>
						<a
						href="">删除</a>
					</td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br />


	<%-- <c:if test="${requestScope.accounts!=null}">
		 <br>id:${requestScope.user.id}
   		 <br>username:${requestScope.user.username}
   		 <br>sex:${requestScope.user.sex}
   		 <br>birthday:${requestScope.user.birthday}
   		 <br>address:${requestScope.user.address}
   		 <br>
	</c:if> --%>



</body>
</html>
