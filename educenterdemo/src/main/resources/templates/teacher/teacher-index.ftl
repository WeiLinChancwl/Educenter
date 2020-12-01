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
    <link rel="shortcut icon" href="assetEducenter/images/favicon.ico" type="assetEducenter/image/x-icon">
    <link rel="icon" href="assetEducenter/images/favicon.ico" type="assetEducenter/image/x-icon">

</head>

<body>

<#include "header.ftl">

<!-- hero slider -->
<section class="hero-section overlay bg-cover" data-background="assetEducenter/images/banner/banner-1.jpg">
    <div class="container">
        <div class="hero-slider">
            <#list slides as slide>
                <!-- slider item -->
                <div class="hero-slider-item">
                    <div class="row">
                        <div class="col-md-8">
                            <h1 class="text-white" data-animation-out="fadeOutRight" data-delay-out="5"
                                data-duration-in=".3" data-animation-in="fadeInLeft" data-delay-in=".1">${slide.slideTitle}</h1>
                            <p class="text-muted mb-4" data-animation-out="fadeOutRight" data-delay-out="5"
                               data-duration-in=".3" data-animation-in="fadeInLeft" data-delay-in=".4">
                                ${slide.slideContent}</p>
                            <a href="/teacher-contact" class="btn btn-primary" data-animation-out="fadeOutRight" data-delay-out="5"
                               data-duration-in=".3" data-animation-in="fadeInLeft" data-delay-in=".7">Apply now</a>
                        </div>
                    </div>
                </div>
            </#list>
        </div>
    </div>
</section>
<!-- /hero slider -->

<!-- banner-feature -->
<section class="bg-gray">
    <div class="container-fluid p-0">
        <div class="row no-gutters">
            <div class="col-xl-4 col-lg-5 align-self-end">
                <img class="img-fluid w-100" src="assetEducenter/images/banner/banner-feature.png" alt="banner-feature">
            </div>
            <div class="col-xl-8 col-lg-7">
                <div class="row feature-blocks bg-gray justify-content-between">
                    <div class="col-sm-6 col-xl-5 mb-xl-5 mb-lg-3 mb-4 text-center text-sm-left">
                        <i class="ti-book mb-xl-4 mb-lg-3 mb-4 feature-icon"></i>
                        <h3 class="mb-xl-4 mb-lg-3 mb-4">奖学金新闻</h3>
                        <p>年度最佳学生奖学金</p>
                    </div>
                    <div class="col-sm-6 col-xl-5 mb-xl-5 mb-lg-3 mb-4 text-center text-sm-left">
                        <i class="ti-blackboard mb-xl-4 mb-lg-3 mb-4 feature-icon"></i>
                        <h3 class="mb-xl-4 mb-lg-3 mb-4">我们的公告栏</h3>
                        <p>"停课不停学"</p>
                    </div>
                    <div class="col-sm-6 col-xl-5 mb-xl-5 mb-lg-3 mb-4 text-center text-sm-left">
                        <i class="ti-agenda mb-xl-4 mb-lg-3 mb-4 feature-icon"></i>
                        <h3 class="mb-xl-4 mb-lg-3 mb-4">我们的成就</h3>
                        <p>致力打造优秀教育平台</p>
                    </div>
                    <div class="col-sm-6 col-xl-5 mb-xl-5 mb-lg-3 mb-4 text-center text-sm-left">
                        <i class="ti-write mb-xl-4 mb-lg-3 mb-4 feature-icon"></i>
                        <h3 class="mb-xl-4 mb-lg-3 mb-4">现在入场</h3>
                        <p>来学习吧</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- /banner-feature -->

<!-- about us -->
<section class="section">
    <div class="container">
        <div class="row align-items-center">
            <div class="col-md-6 order-2 order-md-1">
                <h2 class="section-title">关于教育中心</h2>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore
                    et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
                    aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
                    cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat </p>
                <p>cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Sed ut
                    perspiciatis unde omnis iste natus error sit voluptatem</p>
                <a href="about" class="btn btn-primary-outline">Learn more</a>
            </div>
            <div class="col-md-6 order-1 order-md-2 mb-4 mb-md-0">
                <img class="img-fluid w-100" src="assetEducenter/images/about/about-us.jpg" alt="about image">
            </div>
        </div>
    </div>
</section>
<!-- /about us -->

<!-- courses -->
<section class="section-sm">
    <div class="container">
        <div class="row">
            <div class="col-12">
                <div class="d-flex align-items-center section-title justify-content-between">
                    <h2 class="mb-0 text-nowrap mr-3">我们的课程</h2>
                    <div class="border-top w-100 border-primary d-none d-sm-block"></div>
                    <div>
                        <a href="/teacher-course" class="btn btn-sm btn-primary-outline ml-sm-3 d-none d-sm-block">查看全部</a>
                    </div>
                </div>
            </div>
        </div>
        <!-- course list -->
        <div class="row justify-content-center">
            <#list courses as course>
                <#if (course_index == 6)>
                    <#break>
                </#if>
                <!-- course item -->
                <div class="col-lg-4 col-sm-6 mb-5">
                    <div class="card p-0 border-primary rounded-0 hover-shadow">
                        <img class="card-img-top rounded-0" src="assetEducenter/images/courses/${course.cImg}"
                             alt="course thumb">
                        <div class="card-body">
                            <ul class="list-inline mb-2">
                                <li class="list-inline-item"><i class="ti-calendar mr-1 text-color"></i>${course.cDate}
                                </li>
                                <li class="list-inline-item"><a class="text-color" href="#">${course.cType}</a></li>
                            </ul>
                            <a href="/teacher-course-single?courseId=${course.cId}">
                                <h4 class="card-title">${course.cName}</h4>
                            </a>
                            <p class="card-text mb-4">${course.cDesc}</p>
                            <a href="/teacher-course-single?courseId=${course.cId}" class="btn btn-primary btn-sm">现在申请</a>
                        </div>
                    </div>
                </div>
            </#list>
        </div>
        <!-- /course list -->

        <!-- mobile see all button -->
        <div class="row">
            <div class="col-12 text-center">
                <a href="/teacher-course" class="btn btn-sm btn-primary-outline d-sm-none d-inline-block">查看全部</a>
            </div>
        </div>
    </div>
</section>
<!-- /courses -->

<!-- cta -->
<section class="section bg-primary">
    <div class="container">
        <div class="row">
            <div class="col-12 text-center">
                <h6 class="text-white font-secondary mb-0">单击以加入高级研讨会</h6>
                <h2 class="section-title text-white">进阶网络培训</h2>
                <a href="/teacher-contact" class="btn btn-secondary">现在加入</a>
            </div>
        </div>
    </div>
</section>
<!-- /cta -->

<!-- success story -->
<section class="section bg-cover" data-background="assetEducenter/images/backgrounds/success-story.jpg">
    <div class="container">
        <div class="row">
            <div class="col-lg-6 col-sm-4 position-relative success-video">
                <a class="play-btn venobox" href="assetEducenter/video/video.mp4" data-vbtype="video">
                    <i class="ti-control-play"></i>
                </a>
            </div>
            <div class="col-lg-6 col-sm-8">
                <div class="bg-white p-5">
                    <h2 class="section-title">成功的故事</h2>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut
                        labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco
                        laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in
                        voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat.</p>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut
                        labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco
                        laboris</p>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- /success story -->

<!-- events -->
<section class="section bg-gray">
    <div class="container">
        <div class="row">
            <div class="col-12">
                <div class="d-flex align-items-center section-title justify-content-between">
                    <h2 class="mb-0 text-nowrap mr-3">即将举行的活动</h2>
                    <div class="border-top w-100 border-primary d-none d-sm-block"></div>
                    <div>
                        <a href="teacher-events" class="btn btn-sm btn-primary-outline ml-sm-3 d-none d-sm-block">查看全部</a>
                    </div>
                </div>
            </div>
        </div>
        <div class="row justify-content-center">
            <#list events as event>
                <#if (event_index == 3)>
                    <#break>
                </#if>
                <!-- event -->
                <div class="col-lg-4 col-sm-6 mb-5 mb-lg-0">
                    <div class="card border-0 rounded-0 hover-shadow">
                        <div class="card-img position-relative">
                            <img class="card-img-top rounded-0" src="assetEducenter/images/events/${event.eventImg}"
                                 alt="event thumb">
                            <div class="card-date">${event.eventTime}<br>${event.eventDate}</div>
                        </div>
                        <div class="card-body">
                            <!-- location -->
                            <p><i class="ti-location-pin text-primary mr-2"></i>${event.eventLocation}</p>
                            <a href="teacher-event-single?eventId=${event.eventId}"><h4 class="card-title">${event.eventTitle}</h4></a>
                        </div>
                    </div>
                </div>
            </#list>
        </div>
        <!-- mobile see all button -->
        <div class="row">
            <div class="col-12 text-center">
                <a href="/teacher-events" class="btn btn-sm btn-primary-outline d-sm-none d-inline-block">查看全部</a>
            </div>
        </div>
    </div>
</section>
<!-- /events -->

<!-- teachers -->
<section class="section">
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-12">
                <div class="d-flex align-items-center section-title justify-content-between">
                    <h2 class="mb-0 text-nowrap mr-3">我们的老师</h2>
                    <div class="border-top w-100 border-primary d-none d-sm-block"></div>
                    <div>
                        <a href="teacher-teacher" class="btn btn-sm btn-primary-outline ml-sm-3 d-none d-sm-block">查看全部</a>
                    </div>
                </div>
            </div>
            <#list teachers as teacher>
                <#if (teacher_index == 3)>
                    <#break>
                </#if>
                <!-- teacher -->
                <div class="col-lg-4 col-sm-6 mb-5 mb-lg-0">
                    <div class="card border-0 rounded-0 hover-shadow">
                        <img class="card-img-top rounded-0" src="assetEducenter/images/teachers/${teacher.tImg}"
                             alt="teacher">
                        <div class="card-body">
                            <a href="teacher-single?teacherId=${teacher.tId}">
                                <h4 class="card-title">${teacher.tName}</h4>
                            </a>
                            <p>Teacher</p>
                            <ul class="list-inline">
                                <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-facebook"></i></a>
                                </li>
                                <li class="list-inline-item"><a class="text-color" href="#"><i
                                                class="ti-twitter-alt"></i></a></li>
                                <li class="list-inline-item"><a class="text-color" href="#"><i
                                                class="ti-google"></i></a>
                                </li>
                                <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-linkedin"></i></a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </#list>
        </div>
    </div>
</section>
<!-- /teachers -->

<!-- blog -->
<section class="section pt-0">
    <div class="container">
        <div class="row">
            <div class="col-12">
                <div class="d-flex align-items-center section-title justify-content-between">
                    <h2 class="mb-0 text-nowrap mr-3">最新博客文章</h2>
                    <div class="border-top w-100 border-primary d-none d-sm-block"></div>
                    <div>
                        <a href="teacher-blog" class="btn btn-sm btn-primary-outline ml-sm-3 d-none d-sm-block">查看全部</a>
                    </div>
                </div>
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
                        <img class="card-img-top rounded-0" src="assetEducenter/images/blog/${blog.blogImg}" alt="Post thumb">
                        <div class="card-body">
                            <!-- post meta -->
                            <ul class="list-inline mb-3">
                                <!-- post date -->
                                <li class="list-inline-item mr-3 ml-0">${blog.blogTime}</li>
                                <!-- author -->
                                <li class="list-inline-item mr-3 ml-0">By ${blog.blogWriter}</li>
                            </ul>
                            <a href="teacher-blog-single?blogId=${blog.blogId}">
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
<!-- /blog -->

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