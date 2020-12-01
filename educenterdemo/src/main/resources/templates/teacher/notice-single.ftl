<!DOCTYPE html>
<html lang="zxx">

<head>
    <meta charset="utf-8">
    <title>云智教育</title>

    <!-- mobile responsive meta -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

    <!-- ** Plugins Needed for the Project ** -->
    <!-- Bootstrap -->
    <link rel="stylesheet" href="assetEducenter/plugins/bootstrap/bootstrap.min.css">
    <!-- slick slider -->
    <link rel="stylesheet" href="assetEducenter/plugins/slick/slick.css">
    <!-- themefy-icon -->
    <link rel="stylesheet" href="assetEducenter/plugins/themify-icons/themify-icons.css">
    <!-- animation css -->
    <link rel="stylesheet" href="assetEducenter/plugins/animate/animate.css">
    <!-- aos -->
    <link rel="stylesheet" href="assetEducenter/plugins/aos/aos.css">
    <!-- venobox popup -->
    <link rel="stylesheet" href="assetEducenter/plugins/venobox/venobox.css">

    <!-- Main Stylesheet -->
    <link href="assetEducenter/css/style.css" rel="stylesheet">

    <!--Favicon-->
    <link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">
    <link rel="icon" href="images/favicon.ico" type="image/x-icon">

</head>

<body>

<#include "header.ftl"/>

<!-- page title -->
<section class="page-title-section overlay" data-background="images/backgrounds/page-title.jpg">
    <div class="container">
        <div class="row">
            <div class="col-md-8">
                <ul class="list-inline custom-breadcrumb">
                    <li class="list-inline-item"><a class="h2 text-primary font-secondary" href="notice">通知</a></li>
                    <li class="list-inline-item text-white h3 font-secondary nasted">通知详情</li>
                </ul>
                <p class="text-lighten">Our courses offer a good compromise between the continuous assessment favoured
                    by some universities and the emphasis placed on final exams by others.</p>
            </div>
        </div>
    </div>
</section>
<!-- /page title -->

<!-- notice details -->
<section class="section">
    <div class="container">
        <div class="row">
            <div class="col-12">
                <div class="d-flex">
                    <div class="text-center mr-4">
                        <div class="p-4 bg-primary text-white">
                            <span class="h2 d-block">${notice.noticeTime}</span>${notice.noticeDate}
                        </div>
                    </div>
                    <!-- notice content -->
                    <div>
                        <h3 class="mb-4">${notice.title}</h3>
                        <p>${notice.content}</p>
                        <ul class="list-styled mb-5">
                            <li>Digital Access to Scholarship at Smart</li>
                            <li>institutes</li>
                            <li>Smart-affiliated hospitals and research</li>
                            <li>Smart Catalyst</li>
                            <li>Smart Library Portal</li>
                            <li>Smart research programs and departments</li>
                        </ul>
                        <p>By ${notice.noticeWriter}</p>
                        <p>${notice.status}</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- /notice details -->

<#include "footer.ftl"/>

<!-- jQuery -->
<script src="assetEducenter/plugins/jQuery/jquery.min.js"></script>
<!-- Bootstrap JS -->
<script src="assetEducenter/plugins/bootstrap/bootstrap.min.js"></script>
<!-- slick slider -->
<script src="assetEducenter/plugins/slick/slick.min.js"></script>
<!-- aos -->
<script src="assetEducenter/plugins/aos/aos.js"></script>
<!-- venobox popup -->
<script src="assetEducenter/plugins/venobox/venobox.min.js"></script>
<!-- mixitup filter -->
<script src="assetEducenter/plugins/mixitup/mixitup.min.js"></script>
<!-- google map -->
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCcABaamniA6OL5YvYSpB3pFMNrXwXnLwU&libraries=places"></script>
<script src="assetEducenter/plugins/google-map/gmap.js"></script>

<!-- Main Script -->
<script src="assetEducenter/js/script.js"></script>

</body>
</html>