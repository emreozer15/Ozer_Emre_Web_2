package ui.controller;

import domain.db.PersoonDB;
import domain.model.Persoon;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    private PersoonDB persoonDB = new PersoonDB();


    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("personen", persoonDB.getPersonen());
        request.getRequestDispatcher("overzicht.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String naam = req.getParameter("naam");
        String voornaam = req.getParameter("voornaam");
        int leeftijd = Integer.parseInt(req.getParameter("leeftijd"));
        int gewicht = Integer.parseInt(req.getParameter("gewicht"));
        int lengte = Integer.parseInt( req.getParameter("lengte"));

        Persoon newperson = new Persoon(naam,voornaam,leeftijd,gewicht,lengte);
        persoonDB.add(newperson);
        req.setAttribute("zwaarste",persoonDB.deZwaarstePersoon());
        req.setAttribute("personen", persoonDB.getPersonen());
        req.getRequestDispatcher("overzicht.jsp").forward(req,resp);

    }
}