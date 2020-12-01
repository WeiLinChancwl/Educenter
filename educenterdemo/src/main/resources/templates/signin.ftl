<!DOCTYPE html>
<html lang="zh">

<head>
    <!-- meta data -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <!--font-family-->
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,200,300,400,500,600,700,800,900&amp;subset=devanagari,latin-ext"
          rel="stylesheet">

    <!-- title of site -->
    <title>登录</title>

    <!-- For favicon png -->
    <link rel="shortcut icon" type="image/icon" href="assetlogin/logo/favicon.png"/>

    <!--font-awesome.min.css-->
    <link rel="stylesheet" href="assetlogin/css/font-awesome.min.css">

    <!--animate.css-->
    <link rel="stylesheet" href="assetlogin/css/animate.css">

    <!--bootstrap.min.css-->
    <link rel="stylesheet" href="assetlogin/css/bootstrap.min.css">

    <!-- bootsnav -->
    <link rel="stylesheet" href="assetlogin/css/bootsnav.css">

    <!--style.css-->
    <link rel="stylesheet" href="assetlogin/css/style.css">

    <!--responsive.css-->
    <link rel="stylesheet" href="assetlogin/css/responsive.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->

    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
<!--[if lte IE 9]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="https://browsehappy.com/">upgrade
    your browser</a> to improve your experience and security.</p>
<![endif]-->

<!-- signin end -->
<section class="signin">
    <div class="container">

        <div class="sign-content">
            <h2>登录</h2>
            <form action="/login.do" method="post">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="signin-form">
                            <div class="form-group">
                                <label for="signin_form">账号</label>
                                <input type="text" class="form-control" id="useraccount" name="useraccount"
                                       placeholder="请输入账号">
                            </div><!--/.form-group -->
                            <div class="form-group">
                                <label for="signin_form">密码</label>
                                <input type="password" class="form-control" id="password" name="password"
                                       placeholder="请输入密码">
                            </div><!--/.form-group -->
                            <div class="form-group">
                            <input type="radio" name="user" value="学生" checked="checked"> 学生
                            <input type="radio" name="user" value="老师"> 老师
                            <input type="radio" name="user" value="企业"> 企业
                            </div>
                        </div><!--/.signin-form -->
                    </div><!--/.col -->
                </div><!--/.row -->

                <div class="row">
                    <div class="col-sm-12">
                        <div class="signin-password">
                            <div class="password-circle">
                                <div class="single-password-circle">
                                    <input type="radio" id="radio01" name="radio">
                                    <label for="radio01">
												<span class="round-boarder">
													<span class="round-boarder1"></span>
												</span>记住密码
                                    </label>
                                </div><!--/.single-password-circle-->
                                <div class="single-forgot-password-circle text-right">
                                    <a href="/index">忘记密码？</a>
                                </div><!--/.single-password-circle-->
                            </div><!--/.password-circle-->
                        </div><!--/.signin-password -->
                    </div><!--/.col -->
                </div><!--/.row -->

                <div class="row">
                    <div class="col-sm-12">
                        <div class="signin-footer">
                            <input type="submit" class="btn signin_btn signin_btn_two" value="登录">
                            <p>
                                云智教育新用户 ?
                                <a href="/signup">创建一个账户。</a>
                            </p>
                        </div><!--/.signin-footer -->
                    </div><!--/.col -->
                </div><!--/.row -->
            </form><!--/form -->
        </div>
    </div>
</section><!--/.signin -->

<!-- signin end -->

<!--footer copyright start -->
<footer class="footer-copyright">
    <div id="scroll-Top">
        <i class="fa fa-angle-double-up return-to-top" id="scroll-top" data-toggle="tooltip" data-placement="top"
           title="" data-original-title="Back to Top" aria-hidden="true"></i>
    </div><!--/.scroll-Top-->

</footer><!--/.hm-footer-copyright-->
<!--footer copyright  end -->


<!-- Include all js compiled plugins (below), or include individual files as needed -->

<script src="assetlogin/js/jquery.js"></script>

<!--modernizr.min.js-->
<script src="https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js"></script>

<!--bootstrap.min.js-->
<script src="assetlogin/js/bootstrap.min.js"></script>

<!-- bootsnav js -->
<script src="assetlogin/js/bootsnav.js"></script>

<!-- jquery.sticky.js -->
<script src="assetlogin/js/jquery.sticky.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>


<!--Custom JS-->
<script src="assetlogin/js/custom.js"></script>

</body>

</html>