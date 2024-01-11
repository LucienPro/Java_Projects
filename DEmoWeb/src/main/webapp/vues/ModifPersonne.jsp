<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Date"%>
<%@ page import = "packagetest.Personne"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modification du profil</title>
</head>
<body>

<H1> Modification de la personne</H1>

<% Personne pers = (Personne)request.getSession().getAttribute("personne"); %>

<p>	Nom : <%=pers.getNom() %> <br>
Prenom : <%=pers.getPrenom() %><br>
Ville de naissance : <%=pers.getVilleNaissance() %><br>

</body>
</html>