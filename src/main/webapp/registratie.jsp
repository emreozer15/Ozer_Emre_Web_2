<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>registratie</title>
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
        <div id="reg">

            <form action="Servlet" method="post" name="registratie">
                <label>Naam</label>
                <input type="text" name="naam">
                <br>
                <label>Voornaam</label>
                <input type="text" name="voornaam">

                <br>
                <label>Leeftijd</label>
                <input type="number" name="leeftijd">

                <br>
                <label>Gewicht</label>
                <input type="number" name="gewicht">

                <br>
                <label>Lengte</label>
                <input type="number" name="lengte">
                <br>
                <input type="submit" value="Enter">
            </form>

        </div>

    </main>
    <footer>
        <p><b>instagram:</b> <a href="https://www.instagram.com/">el_buldoz</a></p>
    </footer>
</div>
</body>
</html>

