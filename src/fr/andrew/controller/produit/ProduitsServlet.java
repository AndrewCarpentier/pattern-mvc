package fr.andrew.controller.produit;

import fr.andrew.bean.Produit;
import fr.andrew.business.produit.ProduitsBusiness;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/produits")
public class ProduitsServlet extends HttpServlet {
    private ProduitsBusiness produitsBusiness = new ProduitsBusiness();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("produit", (ArrayList)produitsBusiness.getListeProduit());

        this.getServletContext().getRequestDispatcher("/WEB-INF/produit/produits.jsp").forward(request,response);
    }
}
