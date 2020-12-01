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
                    <li class="list-inline-item"><a class="h2 text-primary font-secondary" href="courses">我的课程</a></li>
                    <li class="list-inline-item text-white h3 font-secondary "></li>
                </ul>
                <p class="text-lighten">我们的课程在一些大学喜欢的持续评估和另一些大学强调的期末考试之间提供了一个很好的妥协。</p>
            </div>
        </div>
    </div>
</section>
<!-- /page title -->

<!-- courses -->
<section class="section">
    <div data-ref="mixitup-target" class="container">
        <div class="row">
            <div class="col-12">
                <ul class="list-inline text-center filter-controls mb-5">
                    <li class="list-inline-item m-3 text-uppercase" data-filter=".news">课程动态</li>
                    <li class="list-inline-item m-3 text-uppercase" data-filter=".alerts">课程公告</li>
                    <li class="list-inline-item m-3 text-uppercase" data-filter=".resources">教学资源</li>
                    <li class="list-inline-item m-3 text-uppercase" data-filter=".homework">课程作业</li>
                    <li class="list-inline-item m-3 text-uppercase" data-filter=".interaction">互动交流</li>
                    <li class="list-inline-item m-3 text-uppercase" data-filter=".classinfo">班级信息</li>
                </ul>
            </div>
        </div>

        <div class="row" data-ref="mixitup-container">
            <div data-ref="mixitup-target" class="mb-5 news">
                <div class="border-0 rounded-0 hover-shadow">
                    <div class="row justify-content-center">
                        <p>暂无课程动态</p>
                    </div>
                </div>
            </div>

            <div data-ref="mixitup-target" class="mb-5 alerts">
                <div class="border-0 rounded-0 hover-shadow">
                    <div class="row justify-content-center">
                        <form action="/adddesc?courseId=${course.cId}" method="POST" enctype="multipart/form-data">
                            <input type="text" name="desc"/>
                            <button type="submit">发布公告</button>
                        </form>
                    </div>
                </div>
            </div>

            <div data-ref="mixitup-target" class="mb-5 resources">
                <div class="border-0 rounded-0 hover-shadow">
                    <div class="row justify-content-center">
                        <#list attachments as attachment>
                            <li class="d-md-table mb-4 w-100 border-bottom hover-shadow">
                                <div class="d-md-table-cell text-center p-4 bg-primary text-white mb-4 mb-md-0">${attachment.attachmentTime}</div>
                                <div class="d-md-table-cell px-4 vertical-align-middle mb-4 mb-md-0">
                                    <a href="/download?attachmentId=${attachment.attachmentId}"
                                       class="h4 mb-3 d-block">${attachment.filename}</a>
                                </div>
                                <div class="d-md-table-cell text-right pr-0 pr-md-4">
                                    <a href="/download?attachmentId=${attachment.attachmentId}" class="btn btn-primary">
                                        下载</a></div>
                            </li>
                        </#list>
                        <br/><br/><hr/>
                        <form action="/upload?courseId=${course.cId}" method="POST" enctype="multipart/form-data">
                            <input name="file" type="file"/>
                            <button type="submit">上传资料</button>
                        </form>
                    </div>
                </div>
            </div>

            <div data-ref="mixitup-target" class="mb-5 homework">
                <div class="border-0 rounded-0 hover-shadow">
                    <div class="row justify-content-center">
                        <form action="/addhomework?courseId=${course.cId}" method="POST" enctype="multipart/form-data">
                            <input name="newhomework" type="text"/>
                            <button type="submit">发布作业</button>
                        </form>
                    </div>
                </div>
            </div>

            <div data-ref="mixitup-target" class="mb-5 interaction">
                <div class="border-0 rounded-0 hover-shadow">
                    <!-- course list -->
                    <div class="row justify-content-center">
                        <p>您还没有发起过提问，请点击 提问！</p>
                    </div>
                </div>
            </div>

            <div data-ref="mixitup-target" class="mb-5 classinfo">
                <div class="border-0 rounded-0 hover-shadow">
                    <!-- course list -->
                    <div class="row justify-content-center">
                        <p>班级信息</p>
                    </div>
                </div>
            </div>
        </div>
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