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

@WebServlet("/detailproduits")
public class DetailProduitsServlet extends HttpServlet {
    ProduitsBusiness produitsBusiness = new ProduitsBusiness();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        Double prix = Double.valueOf(request.getParameter("prix"));
        String img = request.getParameter("img");


         request.setAttribute("produit", produitsBusiness.getDetailProduit(nom,prix,img));

        this.getServletContext().getRequestDispatcher("/WEB-INF/produit/detailproduits.jsp").forward(request,response);
    }
}
