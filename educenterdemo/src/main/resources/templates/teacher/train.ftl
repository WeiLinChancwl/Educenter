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
          <li class="list-inline-item"><a class="h2 text-primary font-secondary" href="trains">我的实训</a></li>
          <li class="list-inline-item text-white h3 font-secondary "></li>
        </ul>
        <p class="text-lighten">我们的课程在一些大学喜欢的持续评估和另一些大学强调的期末考试之间提供了一个很好的妥协。</p>
      </div>
    </div>
  </div>
</section>
<!-- /page title -->

<!-- trains -->
<section class="section">
  <div data-ref="mixitup-target" class="container">
    <div class="row">
      <div class="col-12">
        <ul class="list-inline text-center filter-controls mb-5">
          <li class="list-inline-item m-3 text-uppercase" data-filter=".train-create">创建实训</li>
          <li class="list-inline-item m-3 text-uppercase" data-filter=".train-admin">管理的实训</li>
          <li class="list-inline-item m-3 text-uppercase" data-filter=".task">实训任务管理</li>
          <li class="list-inline-item m-3 text-uppercase" data-filter=".notice">实训动态</li>
        </ul>
      </div>
    </div>

    <div class="row" data-ref="mixitup-container">
      <!-- courses-create -->
      <div data-ref="mixitup-target" class="mb-5 train-create">
        <div class="border-0 rounded-0 hover-shadow">
          <div class="row">
            <div class="col-lg-7 mb-4 mb-lg-0">
              <form action="#">
                <input type="text" class="form-control mb-3" id="c_name" name="c_name"
                       placeholder="请输入实训名称">
                <input type="text" class="form-control mb-3" id="sch_name" name="sch_name"
                       placeholder="请输入实训时长">
                <input type="text" class="form-control mb-3" id="c_type" name="c_type"
                       placeholder="请输入开始时间">
                <input type="text" class="form-control mb-3" id="c_type" name="c_type"
                       placeholder="请输入结束时间">
                <textarea name="c_desc" id="c_desc" class="form-control mb-3"
                          placeholder="请输入实训内容简介"></textarea>
                <input type="file" name="c_img">
                <button type="submit" value="send" class="btn btn-primary">创建实训</button>
              </form>
            </div>
            <div class="col-lg-5">
              <p class="mb-5">
                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Velit recusandae voluptates
                doloremque
                veniam temporibus porro culpa ipsa, nisi soluta minima saepe laboriosam debitis
                nesciunt. Dolore,
                labore. Accusamus nulla sed cum aliquid exercitationem debitis error harum porro maxime
                quo iusto
                aliquam dicta modi earum fugiat, vel possimus commodi, deleniti et veniam, fuga ipsum
                praesentium.
                Odit unde optio nulla ipsum quae obcaecati! Quod esse natus quibusdam asperiores quam
                vel, tempore
                itaque architecto ducimus expedita
              </p>
              <a href="tel:+8802057843248" class="text-color h5 d-block">+15217637517</a>
              <a href="mailto:yourmail@email.com" class="mb-5 text-color h5 d-block">williamchancwl@163.com</a>
              <p>71 Shelton Street<br>London WC2H 9JQ England</p>
            </div>
          </div>
        </div>
      </div>

      <div data-ref="mixitup-target" class="mb-5 train-admin">
        <div class="border-0 rounded-0 hover-shadow">
          <!-- course list -->
          <div class="row justify-content-center">
            <#list trains as train>
              <!-- train item -->
              <div class="col-lg-4 col-sm-6 mb-5">
                <div class="card p-0 border-primary rounded-0 hover-shadow">
                  <img class="card-img-top rounded-0" src="assetEducenter/images/backgrounds/page-title.jpg"
                       alt="train thumb">
                  <div class="card-body">
                    <ul class="list-inline mb-2">
                      <li class="list-inline-item"><i class="ti-calendar mr-1 text-color"></i>${train.time}
                      </li>
                    </ul>
                    <a href="/teacher-train-single?trainId=${train.trainId}">
                      <h4 class="card-title">${train.title}</h4>
                    </a>
                    <p class="card-text mb-4">${train.content}</p>
                    <a href="/train-admin?trainId=${train.trainId}" class="btn btn-primary btn-sm">实训管理</a>
                  </div>
                </div>
              </div>
            </#list>
          </div>
        </div>
      </div>

      <div data-ref="mixitup-target" class="mb-5 task">
        <div class="border-0 rounded-0">
          <div class="col-lg-10 mb-5 mb-lg-0">
            <p class="mb-5 " style="color: #006200;font-size: 18px; font-weight: 400;">暂无实训任务</p>
          </div>
        </div>
      </div>

      <div data-ref="mixitup-target" class="mb-5 notice">
        <div class="border-0 rounded-0">
          <div class="col-lg-10 mb-5 mb-lg-0">
            <p class="mb-5 " style="color: #006200;font-size: 18px; font-weight: 400;">暂无实训动态</p>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
<!-- /trains -->

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