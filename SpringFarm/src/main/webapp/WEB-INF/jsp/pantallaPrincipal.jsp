<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<html>
<head>
	<meta charset="utf-8">
	<script src="https://code.jquery.com/jquery-2.2.4.js" integrity="sha256-iT6Q9iMJYuQiMWNd9lDyBUStIq/8PuOW33aOqmvFpqI=" crossorigin="anonymous"></script>
	
</head>
<body>
<form id="form1" action="/" method="POST">
	<h2>Perfil de dueño:</h2>
	<label>Usuario: ${nameOwner.name}</label>
	<label>Mail: ${nameOwner.id}</label>
	<label>Cuenta: ${nameOwner.email}</label>
	<input type="submit" name="send" value="Enviar">
</form>
<form id="form2" action="/" method="POST">
	<h2>Listado de bichos</h2>
	<table>
		<tr>
			<td style="border: solid 1px">ID</td>
			<td style="border: solid 1px">Nombre</td>
			<td style="border: solid 1px">Hambre</td>
			<td style="border: solid 1px">Limpieza</td>
			<td style="border: solid 1px">Estado</td>
			<td style="border: solid 1px">Alimentar</td>
			<td style="border: solid 1px">Limpiar</td>
		</tr>
		<c:forEach var="c" items="${list}">
		<tr>
			<td style="border: solid 1px">${c.id}</td>
			<td style="border: solid 1px">${c.name}</td>
			<td style="border: solid 1px">${c.hungry}</td>
			<td style="border: solid 1px">${c.cleany}</td>
			<td style="border: solid 1px">${c.alive}</td>
			<td style="border: solid 1px">
				Alimentar <input type="checkbutton" name="foody" value="${c.id}"></td>
			</td>
			<td style="border: solid 1px">
				Lavar <input type="checkbutton" name="cleany" value="${c.id}"></td>
			</td>
		</tr>
		</c:forEach>
	</table>
	<input type="submit" name="send" value="Enviar">
</form>
</body>
</html>