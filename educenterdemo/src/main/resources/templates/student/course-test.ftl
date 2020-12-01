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

<body onload="examTime()">


<#include "header.ftl"/>

<!-- page title -->
<section class="page-title-section overlay" data-background="assetEducenter/images/backgrounds/page-title.jpg">
    <div class="container">
        <div class="row">
            <div class="col-md-8">
                <ul class="list-inline custom-breadcrumb">
                    <li class="list-inline-item"><a class="h2 text-primary font-secondary" href="@@page-link"></a></li>
                    <li class="list-inline-item text-white h3 font-secondary @@nasted">阅读测试</li>
                </ul>
            </div>
        </div>
    </div>
</section>
<!-- /page title -->

<!-- problems -->
<section class="section">
    <div class="container">
        <div class="row">
            <h2>阅读理解题</h2><br/>
            <form action="ExamServlet" method="post" name="exam">
                <span>考试时间:&nbsp;&nbsp;15分钟</span>&nbsp;&nbsp;&nbsp;&nbsp;
                <span>计时:<span id="time" style="color: red"></span>&nbsp;&nbsp;&nbsp;<br/><br/></span>
                <#list problems as problem>
                    <br/>
                    <p class="mb-5 " style="color: #333333;font-size: 18px; font-weight: 400;">
                        *问题描述*：${problem.question}&nbsp;[${problem.score}分]<br/>
                        <input type="radio" name="${problem.problemId}" value="A"/>&nbsp;&nbsp;A. ${problem.answera}
                        <br/>
                        <input type="radio" name="${problem.problemId}" value="B"/>&nbsp;&nbsp;B. ${problem.answerb}
                        <br/>
                        <input type="radio" name="${problem.problemId}" value="C"/>&nbsp;&nbsp;C. ${problem.answerc}
                        <br/>
                        <input type="radio" name="${problem.problemId}" value="D"/>&nbsp;&nbsp;D. ${problem.answerd}
                        <br/>
                    </p>
                </#list>
                <input type="submit" value="交卷"/>
            </form>
        </div>
    </div>

</section>

<script>
    var time = 15 * 60;
    function examTime() {
        //得到class为time的span标签
        var spanTime = document.getElementById("time");
        --time;
        //获取小时
        var hour = parseInt(time / 3600);
        //获取分钟
        var min = parseInt(time % 3600 / 60);
        //获取秒
        var second = time - hour * 3600 - min * 60;
        //将这个标签设置为time
        spanTime.innerHTML = min + "分钟" + second + "秒";
        //判断时间到了就提交
        if (time == 0) {
            alert("考试结束");
            document.exam.submit();
        }
        setTimeout("examTime()", 1000);
    }
</script>

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