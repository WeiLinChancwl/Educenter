<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>云智教育</title>
    <!-- For favicon png -->
    <link rel="shortcut icon" type="image/icon" href="assetlogin/logo/favicon.png"/>

    <!-- Custom fonts for this template -->
    <link href="assetSBadmin/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
          rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="assetSBadmin/css/sb-admin-2.min.css" rel="stylesheet">

    <!-- Custom styles for this page -->
    <link href="assetSBadmin/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">

</head>

<body id="page-top">

<!-- Page Wrapper -->
<div id="wrapper">

    <!-- Sidebar -->
    <#include "sidebar.ftl">
    <!-- End of Sidebar -->

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

        <!-- Main Content -->
        <div id="content">

            <!-- Topbar -->
            <#include "topbar.ftl">
            <!-- End of Topbar -->

            <!-- Begin Page Content -->
            <div class="container-fluid">

                <!-- Page Heading -->
                <h1 class="h3 mb-2 text-gray-800">企业用户表</h1>

                <!-- DataTales Example -->
                <div class="card shadow mb-4">
                    <div class="card-header py-3">
                        <h6 class="m-0 font-weight-bold text-primary">企业用户表</h6>
                        <p>这是企业用户表</p>
                    </div>
                    <div class="card-body">
                        <div class="btn-group" role="group" aria-label="...">
                            <button type="button" class="btn btn-success" data-toggle="modal"
                                    data-target="#insertModal">增加
                            </button>
                            <button type="button" class="btn btn-dark" data-toggle="modal" data-target="#deleteModal">
                                删除
                            </button>
                            <button type="button" class="btn btn-primary" data-toggle="modal"
                                    onclick="updateOrganization()" data-target="#updateModal">修改
                            </button>
                        </div>
                        <hr/>
                        <div class="table-responsive">
                            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                <thead>
                                <tr>
                                    <th>标记</th>
                                    <th>账号</th>
                                    <th>密码</th>
                                    <th>名字</th>
                                    <th>Email</th>
                                    <th>Tel</th>
                                    <th>企业称号</th>
                                    <th>简介</th>
                                    <th>企业位置</th>
                                </tr>
                                </thead>
                                <tfoot>
                                <tr>
                                    <th>标记</th>
                                    <th>账号</th>
                                    <th>密码</th>
                                    <th>名字</th>
                                    <th>Email</th>
                                    <th>Tel</th>
                                    <th>企业称号</th>
                                    <th>简介</th>
                                    <th>企业位置</th>
                                </tr>
                                </tfoot>
                                <tbody>
                                <#list organizations as organization>
                                    <tr>
                                        <td><input type="checkbox" name="checkbox_student" value="${organization.oId}"/></td>
                                        <td>${organization.oAccount}</td>
                                        <td>${organization.oPsw}</td>
                                        <td>${organization.oName}</td>
                                        <td>${organization.oEmail}</td>
                                        <td>${organization.oTel !"null"}</td>
                                        <td>${organization.oTitle !"null"}</td>
                                        <td>${organization.oDesc !"null"}</td>
                                        <td>${organization.oLocation !"null"}</td>
                                    </tr>
                                </#list>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- End of Main Content -->

        <!-- Footer -->
        <footer class="sticky-footer bg-white">
            <div class="container my-auto">
                <div class="copyright text-center my-auto">
                    <span>Copyright &copy; 云智教育 </span>
                </div>
            </div>
        </footer>
        <!-- End of Footer -->

    </div>
    <!-- End of Content Wrapper -->

</div>
<!-- End of Page Wrapper -->

<!-- Scroll to Top Button-->
<a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
</a>

<!-- Logout Modal-->
<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
            <div class="modal-footer">
                <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                <a class="btn btn-primary" href="superuserlogin.ftl">Logout</a>
            </div>
        </div>
    </div>
</div>

<!-- Insert Modal-->
<div class="modal fade" id="insertModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">添加</h5>
                <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <form action="/insertstudent" method="post">
                <div class="modal-body">
                    <div class="signin-form">
                        <div class=" ">
                            <div class=" ">
                                <div class="form-group">
                                    <label for="signin_form">账号</label>
                                    <input type="text" class="form-control" id="newaccount" name="newaccount"
                                           placeholder="新建账号">
                                </div><!--/.form-group -->
                                <div class="form-group">
                                    <label for="signin_form">email</label>
                                    <input type="email" class="form-control" id="newemail" name="newemail"
                                           placeholder="email">
                                </div><!--/.form-group -->
                                <div class="form-group">
                                    <label for="signin_form">密码</label>
                                    <input type="password" class="form-control" id="newpassword" name="newpassword"
                                           placeholder="设置密码">
                                </div><!--/.form-group -->
                                <div class="form-group">
                                    <label for="signin_form">手机号</label>
                                    <input type="text" class="form-control" id="newtel" name="newtel" placeholder="手机号">
                                </div><!--/.form-group -->
                                <div class="form-group">
                                    <label for="signin_form">昵称</label>
                                    <input type="text" class="form-control" id="newusername" name="newusername"
                                           placeholder="你的昵称">
                                </div><!--/.form-group -->
                                <div class="form-group">
                                    <label for="signin_form">公司地址</label>
                                    <input type="text" class="form-control" id="newaddress" name="newaddress"
                                           placeholder="公司地址">
                                </div><!--/.form-group -->
                            </div><!--/.col -->
                        </div><!--/.row -->
                    </div>
                </div>
                <div class="modal-footer">
                    <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                    <input type="submit" class="btn btn-primary" value="注册"/>
                </div>
            </form>
        </div>
    </div>
</div>

<!-- Delete Modal-->
<div class="modal fade" id="deleteModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">删除标记行?</h5>
                <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <div class="modal-body">如果想删除改用户就点击"删除"</div>
            <div class="modal-footer">
                <button class="btn btn-secondary" type="button" data-dismiss="modal">取消</button>
                <button class="btn btn-primary" onclick="deleteUser()">删除</button>
            </div>
        </div>
    </div>
</div>

<!-- Update Modal-->
<div class="modal fade" id="updateModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">更改</h5>
                <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <form action="/updateStudent" method="post">
                <div class="modal-body">
                    <div class="signin-form">
                        <div class=" ">
                            <div class=" ">
                                <div class="form-group">
                                    <label for="signin_form">账号</label>
                                    <input type="text" class="form-control" id="newaccount" name="newaccount"
                                           placeholder="更改账号">
                                </div><!--/.form-group -->
                                <div class="form-group">
                                    <label for="signin_form">email</label>
                                    <input type="email" class="form-control" id="newemail" name="newemail"
                                           placeholder="更改email">
                                </div><!--/.form-group -->
                                <div class="form-group">
                                    <label for="signin_form">密码</label>
                                    <input type="password" class="form-control" id="newpassword" name="newpassword"
                                           placeholder="更改密码">
                                </div><!--/.form-group -->
                                <div class="form-group">
                                    <label for="signin_form">手机号</label>
                                    <input type="text" class="form-control" id="newtel" name="newtel" placeholder="手机号">
                                </div><!--/.form-group -->
                                <div class="form-group">
                                    <label for="signin_form">昵称</label>
                                    <input type="text" class="form-control" id="newusername" name="newusername"
                                           placeholder="昵称">
                                </div><!--/.form-group -->
                                <div class="form-group">
                                    <label for="signin_form">公司地址</label>
                                    <input type="text" class="form-control" id="newaddress" name="newaddress"
                                           placeholder="公司地址">
                                </div><!--/.form-group -->
                            </div><!--/.col -->
                        </div><!--/.row -->
                    </div>
                </div>
                <div class="modal-footer">
                    <button class="btn btn-secondary" type="button" data-dismiss="modal">取消</button>
                    <input type="submit" class="btn btn-primary" value="更改"/>
                </div>
            </form>
        </div>
    </div>
</div>

<script>
    function deleteStudent() {
        var checkboxes = document.getElementsByName("checkbox_student");
        var checkboxvalue = new Array();
        for (var k in checkboxes) {
            if (checkboxes[k].checked) {
                var res = checkboxes[k].value;
                checkboxvalue.push(res);
            }
        }
        window.location.href = "/deleteStudent?sIds=" + checkboxvalue;
    }
</script>


<!-- Bootstrap core JavaScript-->
<script src="assetSBadmin/vendor/jquery/jquery.min.js"></script>
<script src="assetSBadmin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="assetSBadmin/vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="assetSBadmin/js/sb-admin-2.min.js"></script>

<!-- Page level plugins -->
<script src="assetSBadmin/vendor/datatables/jquery.dataTables.min.js"></script>
<script src="assetSBadmin/vendor/datatables/dataTables.bootstrap4.min.js"></script>

<!-- Page level custom scripts -->
<script src="assetSBadmin/js/demo/datatables-demo.js"></script>

</body>

</html>
