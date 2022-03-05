<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1> Login </h1>
<form action="LoginServlet" method="POST">
<table>
    <tr>
        <td> Usuário: </td>
        <td> <input type="text" name="user"></td>
    </tr>
    <tr>
        <td> Senha: </td>
        <td> <input type="password" name="password"></td>
    </tr>
    <tr>
        <td colspan="2"> <input type="submit" value="OK"></td>
    </tr>
</table>
</form>
</body>
</html>