<!-- Une JSP qui affiche un mot de passe -->
<%
String motdepasse = request.getParameter("valeur");
%>
<%=motdepasse%>