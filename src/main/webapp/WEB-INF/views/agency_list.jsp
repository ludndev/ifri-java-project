<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Gestion de banque | liste des clients</title>
    <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">

</head>
<body>
<header class="navbar navbar-expand-sm navbar-dark bg-dark navbar-justified fixed-top mb-5">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Gestion de Banque</a>
        <button class="navbar-toggler" data-toggle = "collapse" type="button" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <nav class="ml-auto">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link" href="ajout.html">Ajouter client</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="liste.html">Lister les clients</a>
                    </li>

            </nav>
            <form action="" method="GET" class="form-inline ml-auto float-right" id="searchForm" >
                <div class="input-group ">
                    <input type="search" name="search" placeholder="Rechercher client" class="form-control" />
                    <div class="input-group-append ">
                        <button class="btn btn-primary" type="submit"><i class="fas fa-search"></i></button>
                    </div>
                </div><!--end div.input-group in form#searchForm-->
            </form><!--end form#searchForm-->
            </li>
            </ul>
        </div>
    </div>
</header>

<div class="" style="margin-top: 75px;">
    <div class="container mt-5">

        <a href="/etudiant/nouveau">Nouveau</a>

        <table class="table table-striped table-bordered table-hover table-sm">
            <caption>Liste complète des clients</caption>
            <thead class="thead-dark">
            <tr>
                <th>Nom</th>
                <th>Prénom</th>
                <th>Numéro</th>
                <th>Adresse</th>
                <th>Nom conseillier</th>
            </tr>
            </thead>

            <c:forEach items="${employes}" var="employe">

                <tr>
                    <td>${Employe.nom}</td>
                    <td>${Employe.prenom}</td>
                    <td>${Employe.numero}</td>
                    <td>${Employe.adresse}</td>
                    <td>${Employe.conseillier}</td
                </tr>

            </c:forEach>

        </table>
    </div>
</div>

<a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

</body>
<script type="text/javascript" src="assets/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="assets/js/fontawesome-all.min.js"></script>
<script type="text/javascript" src="assets/js/jquery-3.3.1.slim.min.js"></script>
</html>

