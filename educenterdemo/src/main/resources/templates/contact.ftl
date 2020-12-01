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
<section class="page-title-section overlay" data-background="assetEducenter/images/backgrounds/page-title.jpg">
    <div class="container">
        <div class="row">
            <div class="col-md-8">
                <ul class="list-inline custom-breadcrumb">
                    <li class="list-inline-item"><a class="h2 text-primary font-secondary" href="@@page-link">联系我们</a>
                    </li>
                    <li class="list-inline-item text-white h3 font-secondary @@nasted"></li>
                </ul>
                <p class="text-lighten">你还有其他问题吗?别担心，没有什么愚蠢的问题。请填写下面的表格，我们会尽快给您答复。</p>
            </div>
        </div>
    </div>
</section>
<!-- /page title -->

<!-- contact -->
<section class="section bg-gray">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <h2 class="section-title">联系我们</h2>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-7 mb-4 mb-lg-0">
                <form action="#">
                    <input type="text" class="form-control mb-3" id="name" name="name" placeholder="请输入名字">
                    <input type="email" class="form-control mb-3" id="mail" name="mail" placeholder="请输入Email">
                    <input type="text" class="form-control mb-3" id="subject" name="subject" placeholder="请输入主题">
                    <textarea name="message" id="message" class="form-control mb-3" placeholder="请输入内容"></textarea>
                    <button type="submit" value="send" class="btn btn-primary">发送信息</button>
                </form>
            </div>
            <div class="col-lg-5">
                <p class="mb-5">
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Velit recusandae voluptates doloremque
                    veniam temporibus porro culpa ipsa, nisi soluta minima saepe laboriosam debitis nesciunt. Dolore,
                    labore. Accusamus nulla sed cum aliquid exercitationem debitis error harum porro maxime quo iusto
                    aliquam dicta modi earum fugiat, vel possimus commodi, deleniti et veniam, fuga ipsum praesentium.
                    Odit unde optio nulla ipsum quae obcaecati! Quod esse natus quibusdam asperiores quam vel, tempore
                    itaque architecto ducimus expedita
                </p>
                <a href="tel:+8802057843248" class="text-color h5 d-block">+15217637517</a>
                <a href="mailto:yourmail@email.com" class="mb-5 text-color h5 d-block">williamchancwl@163.com</a>
                <p>71 Shelton Street<br>London WC2H 9JQ England</p>
            </div>
        </div>
    </div>
</section>
<!-- /contact -->

<!-- gmap -->
<section class="section pt-0">
    <!-- Google Map -->
    <div id="map_canvas" data-latitude="51.507351" data-longitude="-0.127758"></div>
</section>
<!-- /gmap -->

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