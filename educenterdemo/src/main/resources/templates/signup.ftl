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
    <title>Sign up</title>

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
<section class="signin signup">
    <div class="container">
        <div class="sign-content">
            <h2>注册</h2>
            <form action="/register.do" method="post">
                <div class="signin-form">
                    <div class=" ">
                        <div class=" ">
                            <div class="form-group">
                                <label for="signin_form">账号</label>
                                <input type="text" class="form-control" id="newaccount" name="newaccount" placeholder="新建账号">
                            </div><!--/.form-group -->
                            <div class="form-group">
                                <label for="signin_form">email</label>
                                <input type="email" class="form-control" id="newemail" name="newemail" placeholder="email">
                            </div><!--/.form-group -->
                            <div class="form-group">
                                <label for="signin_form">密码</label>
                                <input type="password" class="form-control" id="newpassword" name="newpassword" placeholder="设置密码">
                            </div><!--/.form-group -->
                            <div class="form-group">
                                <label for="signin_form">手机号</label>
                                <input type="text" class="form-control" id="newtel" name="newtel" placeholder="手机号">
                            </div><!--/.form-group -->
                            <div class="form-group">
                                <label for="signin_form">昵称</label>
                                <input type="text" class="form-control" id="newusername" name="newusername" placeholder="你的昵称">
                            </div><!--/.form-group -->
                            <div class="form-group">
                                <input type="radio" name="newuser" value="学生" checked="checked"> 学生
                                <input type="radio" name="newuser" value="老师"> 老师
                                <input type="radio" name="newuser" value="企业"> 企业
                            </div>
                        </div><!--/.col -->
                    </div><!--/.row -->

                </div><!--/.signin-form -->
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
                            <a href="signin.ftl">忘记密码？</a>
                        </div><!--/.single-password-circle-->
                    </div><!--/.password-circle-->
                </div><!--/.signin-password -->

                <div class="signin-footer">
                    <input type="submit" class="btn signin_btn signin_btn_two" data-toggle="modal"
                            data-target=".signin_modal" value="注册">
                    <p>
                        已有账户 ?
                        <a href="/signin">直接登录。</a>
                    </p>
                </div><!--/.signin-footer -->
            </form>
        </div><!--/.sign-content -->
    </div><!--/.container -->

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