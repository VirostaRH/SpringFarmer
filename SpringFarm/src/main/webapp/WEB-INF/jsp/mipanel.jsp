<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<html>
<head>
	<meta charset="UTF-8">
	<script src="https://code.jquery.com/jquery-2.2.4.js" integrity="sha256-iT6Q9iMJYuQiMWNd9lDyBUStIq/8PuOW33aOqmvFpqI=" crossorigin="anonymous"></script>
	<script type="text/javascript" src="/resources/events.js"></script>
</head>
<body>
	<c:choose>
		<c:when test="${r}">
			<h3>Selecciona qué deseas ver:</h3>
			<form action="/mostrarCriaturas" method="POST">
				<input type="text" name="user" value="${nombre}">
				<input type="submit" name="send" value="Enviar">
			</form>
		</c:when>
		<c:otherwise>
			<form action="/altaUser">
				<input type="submit" name="send" value="Alta nueva">
				<input type="submit" name="cancel" value="Cancelar">
			</form>
		</c:otherwise>
	</c:choose>
</body>
</html>