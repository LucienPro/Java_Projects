<%@ page import="java.util.ArrayList" %>
<%@ page import="Modele.Etudiant" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Liste des étudiants</title>
</head>
<body>

<%
    ArrayList<Etudiant> etudiants = ( ArrayList<Etudiant>) request.getAttribute("etudiants");
%>

<h2>Liste des étudiants</h2>

<%
    if (etudiants != null) {
%>
    <table border="1">
        <tr>
            <th>Nom</th>
            <th>Cin</th>
            <th>moyenne</th>
        </tr>

        <% for (Etudiant etudiant : etudiants) { %>
            <tr>
                <td><%= etudiant.getNom() %></td>
                <td><%= etudiant.getCin() %></td>
                <td><%= etudiant.getMoyenne() %></td>
            </tr>
        <% } %>

    </table>
<%
    } 
%>


</body>
</html>