<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<html>
<head>
	<meta charset="UTF-8">
	<script src="https://code.jquery.com/jquery-2.2.4.js" integrity="sha256-iT6Q9iMJYuQiMWNd9lDyBUStIq/8PuOW33aOqmvFpqI=" crossorigin="anonymous"></script>
	<script type="text/javascript" src="/resources/events.js"></script>
</head>
<body>
	<h3>Alta nueva:</h3>
	<form action="/enviaAlta">
		<input type="text" name="user">
		<input type="text" name="email">
		<input type="submit" name="send" value="Aceptar">
		<input type="submit" name="cancel" value="Cancelar">
	</form>
</body>
</html>