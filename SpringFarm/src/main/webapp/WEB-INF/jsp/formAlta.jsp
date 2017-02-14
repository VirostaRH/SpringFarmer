<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<html>
<head>
	<meta charset="utf-8">
	<script src="https://code.jquery.com/jquery-2.2.4.js" integrity="sha256-iT6Q9iMJYuQiMWNd9lDyBUStIq/8PuOW33aOqmvFpqI=" crossorigin="anonymous"></script>
	<script type="text/javascript" src="/resources/events2.js"></script>
</head>
<body>
<form action="/enviaAlta" method="POST">
	<label>Usuario: </label>
	<input type="text" name="user">
	<label>Mail: </label>
	<input type="text" name="mail">
	<input type="submit" name="send" value="Enviar">
	<input type="submit" id="cancel" name="reset" value="Cancelar">
</form>
</body>
</html>