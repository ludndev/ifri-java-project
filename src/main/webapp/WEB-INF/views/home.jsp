
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Gesttion de Banque</title>
    <meta content="" name="description">
    <meta content="" name="keywords">

    <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
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

<div class="container-fluid" style="margin-top: 75px;">

</div>

</body>
<script type="text/javascript" src="assets/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="assets/js/fontawesome-all.min.js"></script>
<script type="text/javascript" src="assets/js/jquery-3.3.1.slim.min.js"></script>
</html>