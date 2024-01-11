<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Date"%>
<%@ page import = "packagetest.Personne"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>

<% Date dateduJour = new Date();
String nom = request.getParameter("nom");
String prenom = request.getParameter("prenom");
String villeNaissance = request.getParameter("villeNaissance");
Personne pers = new Personne(nom,prenom,villeNaissance);
%>

Bonjour! <%=pers.getNom() %> <%=pers.getPrenom() %>
Nous sommes le <%=dateduJour %>
<% request.getSession().setAttribute("personne", pers); %>

</body>
</html>