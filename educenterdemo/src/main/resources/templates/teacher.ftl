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
          <li class="list-inline-item"><a class="h2 text-primary font-secondary" href="@@page-link">我们的老师</a></li>
          <li class="list-inline-item text-white h3 font-secondary @@nasted"></li>
        </ul>
        <p class="text-lighten">Our courses offer a good compromise between the continuous assessment favoured by some universities and the emphasis placed on final exams by others.</p>
      </div>
    </div>
  </div>
</section>
<!-- /page title -->

<!-- teachers -->
<section class="section">
  <div data-ref="mixitup-target" class="container">
    <div class="row">
      <div class="col-12">
        <!-- teacher category list -->
        <ul class="list-inline text-center filter-controls mb-5">
          <li class="list-inline-item m-3 text-uppercase" data-filter=".arts">艺术</li>
          <li class="list-inline-item m-3 text-uppercase" data-filter=".bio-science">生物科学</li>
          <li class="list-inline-item m-3 text-uppercase" data-filter=".business-study">商业研究</li>
          <li class="list-inline-item m-3 text-uppercase" data-filter=".law">法律</li>
          <li class="list-inline-item m-3 text-uppercase" data-filter=".pharmacy">药学</li>
          <li class="list-inline-item m-3 text-uppercase" data-filter=".science">自然科学</li>
          <li class="list-inline-item m-3 text-uppercase" data-filter=".social-science">社会科学</li>
        </ul>
      </div>
    </div>
    <!-- teacher list -->
    <div class="row" data-ref="mixitup-container">
      <!-- teacher -->
      <div data-ref="mixitup-target" class="col-lg-4 col-sm-6 mb-5 arts law">
        <div class="card border-0 rounded-0 hover-shadow">
          <img class="card-img-top rounded-0" src="assetEducenter/images/teachers/teacher-1.jpg" alt="teacher">
          <div class="card-body">
            <a href="teacher-single?teacherId=1">
              <h4 class="card-title">Jacke Masito</h4>
            </a>
            <p>Teacher</p>
            <ul class="list-inline">
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-facebook"></i></a></li>
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-twitter-alt"></i></a></li>
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-google"></i></a></li>
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-linkedin"></i></a></li>
            </ul>
          </div>
        </div>
      </div>
      <!-- teacher -->
      <div data-ref="mixitup-target" class="col-lg-4 col-sm-6 mb-5 bio-science">
        <div class="card border-0 rounded-0 hover-shadow">
          <img class="card-img-top rounded-0" src="assetEducenter/images/teachers/teacher-2.jpg" alt="teacher">
          <div class="card-body">
            <a href="teacher-single?teacherId=2">
              <h4 class="card-title">Clark Malik</h4>
            </a>
            <p>Teacher</p>
            <ul class="list-inline">
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-facebook"></i></a></li>
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-twitter-alt"></i></a></li>
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-google"></i></a></li>
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-linkedin"></i></a></li>
            </ul>
          </div>
        </div>
      </div>
      <!-- teacher -->
      <div data-ref="mixitup-target" class="col-lg-4 col-sm-6 mb-5 business-study">
        <div class="card border-0 rounded-0 hover-shadow">
          <img class="card-img-top rounded-0" src="assetEducenter/images/teachers/teacher-3.jpg" alt="teacher">
          <div class="card-body">
            <a href="teacher-single?teacherId=3">
              <h4 class="card-title">John Doe</h4>
            </a>
            <p>Teacher</p>
            <ul class="list-inline">
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-facebook"></i></a></li>
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-twitter-alt"></i></a></li>
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-google"></i></a></li>
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-linkedin"></i></a></li>
            </ul>
          </div>
        </div>
      </div>
      <!-- teacher -->
      <div data-ref="mixitup-target" class="col-lg-4 col-sm-6 mb-5 bio-science science arts">
        <div class="card border-0 rounded-0 hover-shadow">
          <img class="card-img-top rounded-0" src="assetEducenter/images/teachers/teacher-1.jpg" alt="teacher">
          <div class="card-body">
            <a href="teacher-single?teacherId=4">
              <h4 class="card-title">Alex Rook</h4>
            </a>
            <p>Teacher</p>
            <ul class="list-inline">
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-facebook"></i></a></li>
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-twitter-alt"></i></a></li>
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-google"></i></a></li>
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-linkedin"></i></a></li>
            </ul>
          </div>
        </div>
      </div>
      <!-- teacher -->
      <div data-ref="mixitup-target" class="col-lg-4 col-sm-6 mb-5 law">
        <div class="card border-0 rounded-0 hover-shadow">
          <img class="card-img-top rounded-0" src="assetEducenter/images/teachers/teacher-2.jpg" alt="teacher">
          <div class="card-body">
            <a href="teacher-single?teacherId=5">
              <h4 class="card-title">Din Martin</h4>
            </a>
            <p>Teacher</p>
            <ul class="list-inline">
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-facebook"></i></a></li>
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-twitter-alt"></i></a></li>
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-google"></i></a></li>
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-linkedin"></i></a></li>
            </ul>
          </div>
        </div>
      </div>
      <!-- teacher -->
      <div data-ref="mixitup-target" class="col-lg-4 col-sm-6 mb-5 science">
        <div class="card border-0 rounded-0 hover-shadow">
          <img class="card-img-top rounded-0" src="assetEducenter/images/teachers/teacher-3.jpg" alt="teacher">
          <div class="card-body">
            <a href="teacher-single">
              <h4 class="card-title">Raka Jim</h4>
            </a>
            <p>Teacher</p>
            <ul class="list-inline">
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-facebook"></i></a></li>
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-twitter-alt"></i></a></li>
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-google"></i></a></li>
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-linkedin"></i></a></li>
            </ul>
          </div>
        </div>
      </div>
      <!-- teacher -->
      <div data-ref="mixitup-target" class="col-lg-4 col-sm-6 mb-5 bio-science">
        <div class="card border-0 rounded-0 hover-shadow">
          <img class="card-img-top rounded-0" src="assetEducenter/images/teachers/teacher-1.jpg" alt="teacher">
          <div class="card-body">
            <a href="teacher-single?teacherId=6">
              <h4 class="card-title">Devid Luis</h4>
            </a>
            <p>Teacher</p>
            <ul class="list-inline">
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-facebook"></i></a></li>
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-twitter-alt"></i></a></li>
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-google"></i></a></li>
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-linkedin"></i></a></li>
            </ul>
          </div>
        </div>
      </div>
      <!-- teacher -->
      <div data-ref="mixitup-target" class="col-lg-4 col-sm-6 mb-5 pharmacy social-science arts">
        <div class="card border-0 rounded-0 hover-shadow">
          <img class="card-img-top rounded-0" src="assetEducenter/images/teachers/teacher-2.jpg" alt="teacher">
          <div class="card-body">
            <a href="teacher-single?teacherId=7">
              <h4 class="card-title">Zim Cook</h4>
            </a>
            <p>Teacher</p>
            <ul class="list-inline">
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-facebook"></i></a></li>
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-twitter-alt"></i></a></li>
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-google"></i></a></li>
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-linkedin"></i></a></li>
            </ul>
          </div>
        </div>
      </div>
      <!-- teacher -->
      <div data-ref="mixitup-target" class="col-lg-4 col-sm-6 mb-5 business-study">
        <div class="card border-0 rounded-0 hover-shadow">
          <img class="card-img-top rounded-0" src="assetEducenter/images/teachers/teacher-3.jpg" alt="teacher">
          <div class="card-body">
            <a href="teacher-single?teacherId=1">
              <h4 class="card-title">Duis Riu</h4>
            </a>
            <p>Teacher</p>
            <ul class="list-inline">
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-facebook"></i></a></li>
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-twitter-alt"></i></a></li>
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-google"></i></a></li>
              <li class="list-inline-item"><a class="text-color" href="#"><i class="ti-linkedin"></i></a></li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
<!-- /teachers -->

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