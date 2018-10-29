<%--
  Created by IntelliJ IDEA.
  User: 59013-64-02
  Date: 29/10/2018
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>detail produit</title>
    <link rel="stylesheet" type="text/css" href="../../ressources/css/produit/detailproduits.css" />
    <link rel="shortcut icon" href="../../ressources/img/icone/produitico.jpg" type="image/x-icon" />
</head>
<body>
    <div id="produits-container-image" class="containerimg">
        <img src="${param.img }" alt="${param.nom }" id="${param.nom }" />
        <p class="nom-produit">${param.nom }</p>
        <p class="prix">${param.prix }€</p>
    </div>
</body>
</html>
