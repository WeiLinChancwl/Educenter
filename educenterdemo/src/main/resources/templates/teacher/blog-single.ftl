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
                    <li class="list-inline-item"><a class="h2 text-primary font-secondary" href="blog">我们的博客</a></li>
                    <li class="list-inline-item text-white h3 font-secondary nasted">博客详情</li>
                </ul>
                <p class="text-lighten">Our courses offer a good compromise between the continuous assessment favoured
                    by some universities and the emphasis placed on final exams by others.</p>
            </div>
        </div>
    </div>
</section>
<!-- /page title -->

<!-- blog details -->
<section class="section-sm bg-gray">
    <div class="container">
        <div class="row">
            <div class="col-12 mb-4">
                <img src="assetEducenter/images/blog/${blog.blogImg}" alt="blog-thumb" class="img-fluid w-100">
            </div>
            <div class="col-12">
                <ul class="list-inline">
                    <li class="list-inline-item mr-4 mb-3 mb-md-0 text-light"><span
                                class="font-weight-bold mr-2">作者:</span>${blog.blogWriter}</li>
                    <li class="list-inline-item mr-4 mb-3 mb-md-0 text-light">${blog.blogTime}</li>
                    <li class="list-inline-item mr-4 mb-3 mb-md-0 text-light"><i class="ti-book mr-2"></i>Read 289</li>
                    <li class="list-inline-item mr-4 mb-3 mb-md-0 text-light"><i class="ti-share mr-2"></i>289</li>
                    <li class="list-inline-item mr-4 mb-3 mb-md-0 text-light"><a class="text-light" href="#"><i
                                    class="ti-comments mr-2"></i>265</a></li>
                </ul>
            </div>
            <!-- border -->
            <div class="col-12 mt-4">
                <div class="border-bottom border-primary"></div>
            </div>
            <div class="col-12 mb-5">
                <h2>${blog.blogTitle}</h2>
                <p>${blog.blogContent}</p>
            </div>
            <!-- comment box -->
            <div class="col-12">
                <form action="#" class="row">
                    <div class="col-sm-6">
                        <input type="text" class="form-control mb-4" id="name" name="name" placeholder="Full Name">
                    </div>
                    <div class="col-sm-6">
                        <input type="email" class="form-control mb-4" id="mail" name="mail" placeholder="Email Address">
                    </div>
                    <div class="col-12">
                        <textarea name="comment" id="comment" class="form-control mb-4"
                                  placeholder="Comment Here..."></textarea>
                    </div>
                    <div class="col-12">
                        <button type="submit" value="send" class="btn btn-primary">提交评论</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>
<!-- /blog details -->

<!-- recommended post -->
<section class="section">
    <div class="container">
        <div class="row">
            <div class="col-12">
                <h2 class="section-title">推荐博客</h2>
            </div>
        </div>
        <div class="row justify-content-center">
            <#list blogs as blog>
                <#if (blog_index == 3)>
                    <#break>
                </#if>
                <!-- blog post -->
                <article class="col-lg-4 col-sm-6 mb-5 mb-lg-0">
                    <div class="card rounded-0 border-bottom border-primary border-top-0 border-left-0 border-right-0 hover-shadow">
                        <img class="card-img-top rounded-0" src="assetEducenter/images/blog/${blog.blogImg}"
                             alt="Post thumb">
                        <div class="card-body">
                            <!-- post meta -->
                            <ul class="list-inline mb-3">
                                <!-- post date -->
                                <li class="list-inline-item mr-3 ml-0">${blog.blogTime}</li>
                                <!-- author -->
                                <li class="list-inline-item mr-3 ml-0">By ${blog.blogWriter}</li>
                            </ul>
                            <a href="blog-single">
                                <h4 class="card-title">${blog.blogTitle}</h4>
                            </a>
                            <p class="card-text">${blog.blogTitle}</p>
                            <a href="teacher-blog-single?blogId=${blog.blogId}" class="btn btn-primary btn-sm">查看更多</a>
                        </div>
                    </div>
                </article>
            </#list>
        </div>
    </div>
</section>
<!-- /recommended post -->

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