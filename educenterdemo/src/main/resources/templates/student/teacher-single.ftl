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
          <li class="list-inline-item"><a class="h2 text-primary font-secondary" href="teacher">我们的老师</a></li>
          <li class="list-inline-item text-white h3 font-secondary nasted">${teacher.tName}</li>
        </ul>
        <p class="text-lighten">
          我们的课程在一些大学喜欢的持续评估和另一些大学强调的期末考试之间提供了一个很好的妥协。</p>
      </div>
    </div>
  </div>
</section>
<!-- /page title -->

<!-- teacher details -->
<section class="section">
  <div class="container">
    <div class="row">
      <div class="col-md-5 mb-5">
        <img class="img-fluid w-100" src="assetEducenter/images/teachers/${teacher.tImg}" alt="teacher">
      </div>
      <div class="col-md-6 mb-5">
        <h3>${teacher.tName}</h3>
        <h6 class="text-color">${teacher.tTitle}</h6>
        <p class="mb-5">Lorem ipsum dolor, sit amet consectetur adipisicing elit. Cumque accusamus tenetur ea harum
          delectus ab consequatur excepturi, odit qui in quo quia voluptate nam optio, culpa aspernatur. Error placeat
          iusto officia voluptas quae.</p>
        <div class="row">
          <div class="col-md-6 mb-5 mb-md-0">
            <h4 class="mb-4">联系信息:</h4>
            <ul class="list-unstyled">
              <li class="mb-3"><a class="text-color" href="mailto:${teacher.tEmail}"><i class="ti-email mr-2"></i>${teacher.tEmail}</a></li>
              <li class="mb-3"><a class="text-color" href="callto:${teacher.tTel}"><i class="ti-mobile mr-2"></i>${teacher.tTel}</a></li>
              <li class="mb-3"><a class="text-color" href="#"><i class="ti-facebook mr-2"></i>${teacher.tName}</a></li>
              <li class="mb-3"><a class="text-color" href="#"><i class="ti-twitter-alt mr-2"></i>${teacher.tName}</a></li>
              <li class="mb-3"><a class="text-color" href="#"><i class="ti-skype mr-2"></i>${teacher.tName}</a></li>
              <li class="mb-3"><a class="text-color" href="#"><i class="ti-world mr-2"></i>${teacher.tName}.com</a></li>
              <li class="mb-3"><a class="text-color" href="#"><i class="ti-location-pin mr-2"></i>1313 Boulevard
                  Cremazie,Quebec</a></li>
            </ul>
          </div>
          <div class="col-md-6">
            <h4 class="mb-4">活动/兴趣总结</h4>
            <ul class="list-unstyled">
              <li class="mb-3">计算机网络</li>
              <li class="mb-3">计算机安全</li>
              <li class="mb-3">人机接口</li>
            </ul>
          </div>
        </div>
      </div>
      <div class="col-12">
        <h4 class="mb-4">生平简介</h4>
        <p class="mb-5">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et
          dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea
          commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat
          nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit
          anim id est laborum. Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque
          laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto.</p>
      </div>
    </div>
    <div class="row justify-content-center">
      <div class="col-12">
        <h4 class="mb-4">课程</h4>
      </div>
      <!-- course item -->
      <div class="col-lg-4 col-sm-6 mb-5">
        <div class="card p-0 border-primary rounded-0 hover-shadow">
          <img class="card-img-top rounded-0" src="assetEducenter/images/courses/course-4.jpg" alt="course thumb">
          <div class="card-body">
            <ul class="list-inline mb-2">
              <li class="list-inline-item"><i class="ti-calendar mr-1 text-color"></i>02-14-2018</li>
              <li class="list-inline-item"><a class="text-color" href="#">Humanities</a></li>
            </ul>
            <a href="course-single">
              <h4 class="card-title">完全自由职业</h4>
            </a>
            <p class="card-text mb-4"> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
              incididunt ut labore et dolore magna.</p>
            <a href="course-single" class="btn btn-primary btn-sm">马上申请</a>
          </div>
        </div>
      </div>
      <!-- course item -->
      <div class="col-lg-4 col-sm-6 mb-5">
        <div class="card p-0 border-primary rounded-0 hover-shadow">
          <img class="card-img-top rounded-0" src="assetEducenter/images/courses/course-5.jpg" alt="course thumb">
          <div class="card-body">
            <ul class="list-inline mb-2">
              <li class="list-inline-item"><i class="ti-calendar mr-1 text-color"></i>02-14-2018</li>
              <li class="list-inline-item"><a class="text-color" href="#">Humanities</a></li>
            </ul>
            <a href="course-single">
              <h4 class="card-title">品牌设计</h4>
            </a>
            <p class="card-text mb-4"> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
              incididunt ut labore et dolore magna.</p>
            <a href="course-single" class="btn btn-primary btn-sm">现在申请</a>
          </div>
        </div>
      </div>
      <!-- course item -->
      <div class="col-lg-4 col-sm-6 mb-5">
        <div class="card p-0 border-primary rounded-0 hover-shadow">
          <img class="card-img-top rounded-0" src="assetEducenter/images/courses/course-6.jpg" alt="course thumb">
          <div class="card-body">
            <ul class="list-inline mb-2">
              <li class="list-inline-item"><i class="ti-calendar mr-1 text-color"></i>02-14-2018</li>
              <li class="list-inline-item"><a class="text-color" href="#">Humanities</a></li>
            </ul>
            <a href="course-single">
              <h4 class="card-title">艺术设计</h4>
            </a>
            <p class="card-text mb-4"> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
              incididunt ut labore et dolore magna.</p>
            <a href="course-single" class="btn btn-primary btn-sm">Apply now</a>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
<!-- /teacher details -->

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