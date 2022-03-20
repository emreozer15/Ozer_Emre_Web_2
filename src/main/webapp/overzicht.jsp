<%@ page import="domain.model.Persoon" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="domain.db.PersoonDB" %><%--
  Created by IntelliJ IDEA.
  User: emreo
  Date: 27/02/2022
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>overzicht</title>
    <link rel="stylesheet" href="style.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

</head>
<body>
<div id="page">
    <header>
        <b>el_programs</b>
    </header>

    <nav>
        <a href="index.jsp">Home</a>
        <a href="Servlet">Overzicht</a>
        <a href="registratie.jsp">Registratie</a>

    </nav>

    <main>
        <table>
            <thead>
            <tr>
                <th>Naam:</th>
                <th>Voornaam:</th>
                <th>Leeftijd:</th>
                <th>Gewicht:</th>
                <th>Lengte:</th>
            </tr>
            </thead>

            <tbody>
            <%
                ArrayList<Persoon> personen = (ArrayList<Persoon>) request.getAttribute("personen");
                for (Persoon persoon : personen) {
            %>
            <tr>
                <td><%=persoon.getNaam()%></td>
                <td><%=persoon.getVoorNaam()%></td>
                <td><%=persoon.getLeeftijd()%></td>
                <td><%=persoon.getGewicht()%></td>
                <td><%=persoon.getLengte()%></td>
            </tr>
            <%
                }
            %>
            </tbody>

        </table>
        <b>De zwaarste persoon is:</b>
        <%=request.getAttribute("zwaarste")%>
    </main>

    <footer>
        <li><b>instagram:</b> <a href="https://www.instagram.com/">el_buldoz</a></li>

    </footer>


</div>

</body>
</html>

