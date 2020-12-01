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
                    <li class="list-inline-item"><a class="h2 text-primary font-secondary" href="@@page-link">阅读文章</a>
                    </li>
                    <li class="list-inline-item text-white h3 font-secondary @@nasted"></li>
                </ul>
                <p class="text-lighten">Our courses offer a good compromise between the continuous assessment favoured
                    by some universities and the emphasis placed on final exams by others.</p>
            </div>
        </div>
    </div>
</section>
<!-- /page title -->

<!-- new -->
<section class="section">
    <div data-ref="mixitup-target" class="container">
        <div class="row">
            <div class="col-12">
                <a class="h3 text-break font-secondary" href="student-new-single?newId=${new.newId}">${new.newTitle}</a>
                <p></p>
                <ul class="list-inline filter-controls mb-5">
                    <li class="list-inline-item m-3 text-uppercase" data-filter=".content">双语</li>
                    <li class="list-inline-item m-3 text-uppercase" data-filter=".lang-cn">中文</li>
                    <li class="list-inline-item m-3 text-uppercase" data-filter=".lang-en">英语</li>
                </ul>
                <span>作者：${new.newWriter}</span>
                <span>时间：${new.newTime}</span>
                <span>来源：${new.newFrom}</span>
                <p></p>
                <img class="rounded-0" style="height: 394px; width: 700px;" src="assetEducenter/images/news/${new.newImg}">
            </div>
        </div>

        <div class="row" data-ref="mixitup-container">
            <div data-ref="mixitup-target" class="mb-5 content">
                <div class="border-0 rounded-0">
                    <div class="col-lg-10 mb-5 mb-lg-0">
                        <p class="mb-5 " style="color: #333333;font-size: 18px; font-weight: 400;">${new.newContent}</p>
                    </div>
                </div>
            </div>

            <div data-ref="mixitup-target" class="mb-5 lang-cn">
                <div class="border-0 rounded-0">
                    <div class="col-lg-10 mb-5 mb-lg-0">
                        <p class="mb-5 " style="color: #006200;font-size: 18px; font-weight: 400;">${new.newCn}</p>
                    </div>
                </div>
            </div>

            <div data-ref="mixitup-target" class="mb-5 lang-en">
                <div class="border-0 rounded-0">
                    <div class="col-lg-10 mb-5 mb-lg-0">
                        <p class="mb-5 " style="color: #333333;font-size: 18px; font-weight: 400;">${new.newEn}</p>
                    </div>
                </div>
            </div>
        </div>
        <p>（翻译:${new.newTranslator}）</p>
    </div>
</section>
<!-- /courses -->

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