<%@ page import="java.util.ArrayList" %>
<%@ page import="Modele.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Liste des étudiants</title>
</head>
<body>  

<c:set var="etudiants" value="${requestScope.etudiants}" />

<h2>Liste des étudiants</h2>

<c:choose>
    <c:when test="${not empty etudiants}">
        <table border="1">
            <tr>
                <th>Nom</th>
                <th>Cin</th>
                <th>Moyenne</th>
            </tr>

            <c:forEach var="etudiant" items="${etudiants}">
                <tr>
                    <td>${etudiant.nom}</td>
                    <td>${etudiant.cin}</td>
                    <td>${etudiant.moyenne}</td>
                </tr>
            </c:forEach>
        </table>
    </c:when>
    <c:otherwise>
        <h1>Erreur, pas d'étudiant</h1>
    </c:otherwise>
</c:choose>

</body>
</html>