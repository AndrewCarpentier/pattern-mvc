<%--
  Created by IntelliJ IDEA.
  User: 59013-64-02
  Date: 29/10/2018
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Produit</title>
    <link rel="stylesheet" type="text/css" href="../../ressources/css/produit/produits.css" />
    <link rel="shortcut icon" href="../../ressources/img/icone/produitico.jpg" type="image/x-icon" />
</head>
<body>

    <div id="produits-titre">
        <h1>Produits</h1>
    </div>

    <c:forEach var="produit" items="${produit }">
        <div id="produits-container-image" class="containerimg">
            <a href="detailproduits?nom=${produit.nom }&prix=${produit.prix }&img=${produit.urlImage }" target="_blank">
                <img src="${produit.urlImage }" alt="${produit.nom }" id="${produit.nom }"/>
            </a>
            <p class="nom-produit">${produit.nom }</p>
            <p class="prix">${produit.prix }€</p>
        </div>
    </c:forEach>

</body>
</html>