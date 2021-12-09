<html>
<head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
	<div class="container mt-3">
	<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">TableCheck</h1>
				<table class="table">
					<tbody>
					<c:forEach items="${user }" var="u">
							<tr>
								<th scope="row">TECHONLY${u.userId }</th>
								<td>${u.fName }</td>
								<td>${u.lName }</td>
								<td>${u.pNum }</td>
								<td>${u.email }</td>
								<td>${u.password }</td>
								<td>${u.addLine1 }</td>
								<td>${u.addLine2 }</td>
								<td>${u.state }</td>
								<td>${u.zipcode }</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
		</div>
		</div>
	</div>
</div>
</body>
</html>

