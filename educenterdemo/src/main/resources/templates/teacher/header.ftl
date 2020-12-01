<!-- header -->
<header class="fixed-top header">
    <!-- top header -->
    <div class="top-header py-2 bg-white">
        <div class="container">
            <div class="row no-gutters">
                <div class="col-lg-4 text-center text-lg-left">
                    <a class="text-color mr-3" href="callto:+15217637517"><strong>tel：</strong> +15217637517</a>
                    <ul class="list-inline d-inline">
                        <li class="list-inline-item mx-0"><a class="d-inline-block p-2 text-color" href="#"><i
                                        class="ti-facebook"></i></a></li>
                        <li class="list-inline-item mx-0"><a class="d-inline-block p-2 text-color" href="#"><i
                                        class="ti-twitter-alt"></i></a></li>
                        <li class="list-inline-item mx-0"><a class="d-inline-block p-2 text-color" href="#"><i
                                        class="ti-linkedin"></i></a></li>
                        <li class="list-inline-item mx-0"><a class="d-inline-block p-2 text-color" href="#"><i
                                        class="ti-instagram"></i></a></li>
                    </ul>
                </div>
                <div class="col-lg-8 text-center text-lg-right">
                    <ul class="list-inline">
                        <li class="list-inline-item"><a
                                    class="text-uppercase text-color p-sm-2 py-2 px-0 d-inline-block"
                                    href="/teacher-about">关于</a></li>
                        <li class="list-inline-item"><a
                                    class="text-uppercase text-color p-sm-2 py-2 px-0 d-inline-block"
                                    href="/teacher-notice">通知</a></li>
                        <li class="list-inline-item"><a
                                    class="text-uppercase text-color p-sm-2 py-2 px-0 d-inline-block"
                                    href="/teacher-research">研究</a></li>
                        <li class="list-inline-item"><a
                                    class="text-uppercase text-color p-sm-2 py-2 px-0 d-inline-block"
                                    href="/teacher-scholarship">年终奖</a></li>
                        <li class="list-inline-item"><a
                                    class="text-uppercase text-color p-sm-2 py-2 px-0 d-inline-block"
                                    href="/teacher-contact">联系</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <!-- navbar -->
    <div class="navigation w-100">
        <div class="container">
            <nav class="navbar navbar-expand-lg navbar-light p-0">
                <a class="navbar-brand" href="/teacher-index"><img src="assetEducenter/images/logo.png" alt="logo"></a>
                <button class="navbar-toggler rounded-0" type="button" data-toggle="collapse" data-target="#navigation"
                        aria-controls="navigation" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navigation">
                    <ul class="navbar-nav ml-auto text-center">
                        <li class="nav-item active">
                            <a class="nav-link" href="/teacher-index">主页</a>
                        </li>
                        <li class="nav-item dropdown view">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                               data-toggle="dropdown"
                               aria-haspopup="true" aria-expanded="false">
                                英语阅读
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="/teacher-news?newType=hot">热点速递</a>
                                <a class="dropdown-item" href="/teacher-news?newType=quora">Quora精选</a>
                                <a class="dropdown-item" href="/teacher-news?newType=word">一词日历</a>
                                <a class="dropdown-item" href="/teacher-news?newType=seechina">老外看中国</a>
                            </div>
                        </li>
                        <li class="nav-item dropdown view">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                               data-toggle="dropdown"
                               aria-haspopup="true" aria-expanded="false">
                                娱乐
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="/teacher-news?newType=tv">英美剧资讯</a>
                                <a class="dropdown-item" href="/teacher-news?newType=fashion">时尚搭配</a>
                                <a class="dropdown-item" href="/teacher-news?newType=work">趣味职场</a>
                                <a class="dropdown-item" href="/teacher-news?newType=topic">口语对话</a>
                            </div>
                        </li>
                        <li class="nav-item @@courses">
                            <a class="nav-link" href="/teacher-courses">课程管理</a>
                        </li>
                        <li class="nav-item @@courses">
                            <a class="nav-link" href="/teacher-train">综合实训</a>
                        </li>
                        <li class="nav-item @@task">
                            <a class="nav-link" href="/teacher-task">任务管理</a>
                        </li>
                        <li class="nav-item @@ability">
                            <a class="nav-link" href="/teacher-ability">能力档案</a>
                        </li>
                        <li class="nav-item @@analysis">
                            <a class="nav-link" href="/teacher-analysis">数据分析</a>
                        </li>
                        <li class="nav-item dropdown view">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                               data-toggle="dropdown"
                               aria-haspopup="true" aria-expanded="false">
                                我们
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="/teacher-teacher">教师</a>
                                <a class="dropdown-item" href="/teacher-notice">通知</a>
                                <a class="dropdown-item" href="/teacher-research">研究</a>
                                <a class="dropdown-item" href="/teacher-scholarship">年终奖</a>
                                <a class="dropdown-item" href="/teacher-course">课程</a>
                                <a class="dropdown-item" href="/teacher-events">活动</a>
                                <a class="dropdown-item" href="/teacher-blog">博客</a>
                            </div>
                        </li>
                        <#if username??>
                            <li class="nav-item dropdown view">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                                   data-toggle="dropdown"
                                   aria-haspopup="true" aria-expanded="false">
                                    ${username}
                                </a>
                                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                    <a class="dropdown-item" href="#">个人信息</a>
                                    <a class="dropdown-item" href="#">消息</a>
                                    <a class="dropdown-item" href="#">修改密码</a>
                                    <a class="dropdown-item" href="/index">退出登录</a>
                                </div>
                            </li>
                        <#else>
                            <li class="nav-item">
                                <a class="nav-link" href="/signin">登录</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="/signup">注册</a>
                            </li>
                        </#if>
                    </ul>
                </div>
            </nav>
        </div>
    </div>
</header>
<!-- /header -->