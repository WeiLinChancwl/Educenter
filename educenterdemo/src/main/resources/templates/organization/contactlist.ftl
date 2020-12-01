<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>云智教育</title>
    <!-- For favicon png -->
    <link rel="shortcut icon" type="image/icon" href="assetlogin/logo/favicon.png"/>

    <!-- Custom fonts for this template -->
    <link href="assetSBadmin/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="assetSBadmin/css/sb-admin-2.min.css" rel="stylesheet">

    <!-- Custom styles for this page -->
    <link href="assetSBadmin/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">

</head>

<body id="page-top">
<!-- Page Wrapper -->
<div id="wrapper">

    <!-- Sidebar -->
    <#include "sidebar.ftl">
    <!-- End of Sidebar -->

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

        <!-- Main Content -->
        <div id="content">

            <!-- Topbar -->
            <#include "topbar.ftl">
            <!-- End of Topbar -->
            <!-- Begin Page Content -->

            <section class="page-section bg-transparent">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-8">
                            <#list contacts as contact>
                                <div class="list-group" style="width: 100%; height: auto">
                                    <a href="/contact?contactId=${contact.contactId}" class="list-group-item">
                                        <h4 class="list-group-item-heading">${contact.contactTitle}</h4>
                                        <p class="list-group-item-text">${contact.contactTime}</p>
                                        <p class="list-group-item-text">${contact.contactName}</p>
                                    </a>
                                </div>
                            </#list>
                        </div>
                    </div>
                </div>
            </section>
        </div>
    </div>
</div>

<!-- Footer -->
<footer class="bg-light py-5">
    <div class="container">
        <div class="small text-center text-muted">Copyright</div>
    </div>
</footer>

<!-- Bootstrap core JavaScript-->
<script src="assetSBadmin/vendor/jquery/jquery.min.js"></script>
<script src="assetSBadmin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="assetSBadmin/vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="assetSBadmin/js/sb-admin-2.min.js"></script>

<!-- Page level plugins -->
<script src="assetSBadmin/vendor/datatables/jquery.dataTables.min.js"></script>
<script src="assetSBadmin/vendor/datatables/dataTables.bootstrap4.min.js"></script>

<!-- Page level custom scripts -->
<script src="assetSBadmin/js/demo/datatables-demo.js"></script>
</body>

</html>
