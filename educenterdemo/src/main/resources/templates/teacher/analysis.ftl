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
                    <li class="list-inline-item"><a class="h2 text-primary font-secondary" href="@@page-link">数据分析</a>
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

<!-- courses -->
<section class="section">
    <div class="container">
        <!-- course list -->
        <div class="row justify-content-center">
            <#list stucourses as stucourse>
                <!-- stucourse item -->
                <div class="col-lg-4 col-sm-6 mb-5">
                    <div class="card p-0 border-primary rounded-0 hover-shadow">
                        <div class="card-body">
                            <ul class="list-inline mb-2">
                                <li class="list-inline-item"><i
                                            class="ti-calendar mr-1 text-color"></i>${stucourse.cName}
                                </li>
                                <li class="list-inline-item">${stucourse.status}</a></li>
                            </ul>
                            <a href="/teacher-course-single?courseId=${stucourse.cId}">
                                <h4 class="card-title">${stucourse.cName}</h4>
                            </a>
                            成绩:
                            <p class="card-text mb-4">${stucourse.grade!"null"}</p>
                        </div>
                    </div>
                </div>
            </#list>
            <#list stutrains as stutrain>
                <!-- stutrain item -->
                <div class="col-lg-4 col-sm-6 mb-5">
                    <div class="card p-0 border-primary rounded-0 hover-shadow">
                        <div class="card-body">
                            <ul class="list-inline mb-2">
                                <li class="list-inline-item"><i
                                            class="ti-calendar mr-1 text-color"></i>${stutrain.trainName}
                                </li>
                                <li class="list-inline-item">${stutrain.status}</a></li>
                            </ul>
                            <a href="/teacher-train-single?trainId=${stutrain.trainId}">
                                <h4 class="card-title">${stutrain.trainName}</h4>
                            </a>
                            成绩:
                            <p class="card-text mb-4">${stutrain.grade!"null"}</p>
                        </div>
                    </div>
                </div>
            </#list>
        </div>
    </div>
    </div>
    <!-- /course list -->
    </div>
</section>
<!-- /courses -->


<!-- courses -->
<section class="section">
    <div class="container">
        <!-- course list -->
        <div class="row justify-content-center">
            <#list stucourses as stucourse>
                <!-- stucourse item -->
                <div class="col-lg-4 col-sm-6 mb-5">
                    <div class="card p-0 border-primary rounded-0 hover-shadow">
                        <div class="card-body">
                            <ul class="list-inline mb-2">
                                <li class="list-inline-item"><i
                                            class="ti-calendar mr-1 text-color"></i>${stucourse.cName}
                                </li>
                                <li class="list-inline-item">${stucourse.status}</a></li>
                            </ul>
                            <a href="/teacher-course-single?courseId=${stucourse.cId}">
                                <h4 class="card-title">${stucourse.cName}</h4>
                            </a>
                            成绩:
                            <p class="card-text mb-4">${stucourse.grade}</p>
                        </div>
                    </div>
                </div>
            </#list>
            <#list stutrains as stutrain>
                <!-- stutrain item -->
                <div class="col-lg-4 col-sm-6 mb-5">
                    <div class="card p-0 border-primary rounded-0 hover-shadow">
                        <div class="card-body">
                            <ul class="list-inline mb-2">
                                <li class="list-inline-item"><i
                                            class="ti-calendar mr-1 text-color"></i>${stutrain.trainName}
                                </li>
                                <li class="list-inline-item">${stutrain.status}</a></li>
                            </ul>
                            <a href="/teacher-train-single?trainId=${stutrain.trainId}">
                                <h4 class="card-title">${stutrain.trainName}</h4>
                            </a>
                            成绩:
                            <p class="card-text mb-4">${stutrain.grade}</p>
                        </div>
                    </div>
                </div>
            </#list>
        </div>
    </div>
    </div>
    <!-- /course list -->
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