<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/30
  Time: 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>企业信息管理</title>
    <script src="../../js/jquery.min.js"></script>
    <script src="../../layui/layui.all.js"></script>

    <link rel="stylesheet" href="../../layui/css/layui.css">
    <script>
          $(function(){

              //给按钮添加一个点击事件。当按钮的值是修改的时候。让文本隐藏。文本框显示。并修改自己的值为确定
            $("#editbase").click(function(){
                if( $(this).text()=="修改"){
                    $("#baseinfo .txtStyle").hide();
                    $("#baseinfo input").show();
                    $(this).text("确定");
                }else{
                    $(this).text("修改");
                    subBusiness();
                }
            })

            //给一个按钮添加文件上传的功能
            layui.upload.render({
                elem: '#test1' //绑定元素
                , url: '/business/uploadfile' //上传接口
                ,data:{businessid:$("#businessid").val()}
                ,before: function(obj) {
                    //预读本地文件示例，不支持ie8
                    obj.preview(function (index, file, result) {
                        $('#tu').attr('src', result); //图片链接（base64）
                    })
                }
                , done: function (res) {
                    if(res.code==0){
                        layui.layer.msg("上传成功了");
                    }else{
                        layui.layer.msg("上传成失败");
                    }
                    //上传完毕回调
                }
                , error: function () {
                    layui.layer.msg("上传成失败");
                }
            });


          })

        //定义一个方法AJAX提交数据到后台
      function subBusiness() {
          var url = $("#url").val();
          var businessplace = $("#businessplace").val();
          var businessphone = $("#businessphone").val();
          var abbreviation = $("#abbreviation").val();
          var businessid = $("#businessid").val();
          //数据验证过程忽略


          //y异步发送请求
          $.post("/business/update",
              {"businessplace":businessplace,"url":url,"businessphone":businessphone,"abbreviation":abbreviation,"businessid":businessid },
              function(response){
                if(response==1){
                    layer.msg('修改完毕了', {
                        icon: 1,
                        time: 2000 //2秒关闭（如果不配置，默认是3秒）
                    }, function(){
                        location.reload()
                    });
                }else{
                    layui.layer.msg("修改失败!"+response);
                }
              });
      }

    </script>
    <style >
      .txtStyle{ width: 90%; text-align: left}
    </style>
  </head>
  <body>
  <div class="layui-tab layui-tab-card" style=" margin: 10px;" >
    <ul class="layui-tab-title">
      <li class="layui-this">企业基本资料</li>
      <li>企业账号信息</li>
      <li>企业LOGO</li>
      <li>企业订阅管理</li>
    </ul>
    <div class="layui-tab-content">
      <div class="layui-tab-item layui-show">
        <form class="layui-form" action="" id="baseinfo">
          <div class="layui-form-item">
            <label class="layui-form-label"><b>官方网址:</b></label>
            <div class="layui-input-block">
              <input id="businessid" type="hidden" value="${business.businessid}">
              <input type="text" id="url" name="url" value="${business.url}" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input" style="display: none">
              <div class="layui-form-label txtStyle">${business.url}</div>
            </div>
          </div>
          <div class="layui-form-item">
            <label class="layui-form-label"><b>企业地址:</b></label>
            <div class="layui-input-block">
              <input type="text" id="businessplace" value="${business.businessplace}" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input" style="display: none">
              <div class="layui-form-label txtStyle">${business.businessplace}</div>
            </div>
          </div>
          <div class="layui-form-item">
            <label class="layui-form-label"><b>企业电话:</b></label>
            <div class="layui-input-block">
              <input type="text" name="businessphone" id="businessphone" value="${business.businessphone}" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input" style="display: none">
              <div class="layui-form-label txtStyle">${business.businessphone}</div>
            </div>
          </div>
          <div class="layui-form-item">
            <label class="layui-form-label"><b>企业简称:</b></label>
            <div class="layui-input-block">
              <input type="text" id="abbreviation" value="${business.abbreviation}" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input" style="display: none">
              <div class="layui-form-label txtStyle">${business.abbreviation}</div>
            </div>
          </div>
          <div class="layui-form-item">
            <label class="layui-form-label"></label>
            <div class="layui-input-block">
              <button type="button" id="editbase" name="sub"  class="layui-btn layui-btn-normal">修改</button>
              <button type="button" id="cancel" name="sub"  class="layui-btn layui-btn-primary ">返回</button>
            </div>
          </div>
        </form>


      </div>
      <div class="layui-tab-item">
        <form class="layui-form" action="" id="businessinfo2">
          <div class="layui-form-item">
            <label class="layui-form-label"><b>企业全称:</b></label>
            <div class="layui-input-block">
              <input type="text" name="title" value="${business.businessname}" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input" style="display: none">
              <div class="layui-form-label txtStyle">${business.businessname}</div>
            </div>
          </div>
          <div class="layui-form-item">
            <label class="layui-form-label"><b>版本类型:</b></label>
            <div class="layui-input-block">
              <input type="text" name="username" value="${business.pversion}" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input" style="display: none">
              <div class="layui-form-label txtStyle">${business.pversion}</div>
            </div>
          </div>
          <div class="layui-form-item">
            <label class="layui-form-label"><b>超管账号:</b></label>
            <div class="layui-input-block">
              <input type="text" name="username" value="${business.smaccount}" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input" style="display: none">
              <div class="layui-form-label txtStyle">${business.smaccount}</div>
            </div>
          </div>
          <div class="layui-form-item">
            <label class="layui-form-label"><b>企业邮箱:</b></label>
            <div class="layui-input-block">
              <input type="text" name="username" value="${business.mail}" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input" style="display: none">
              <div class="layui-form-label txtStyle">${business.mail}</div>
            </div>
          </div>
          <div class="layui-form-item">
            <label class="layui-form-label"></label>
            <div class="layui-input-block">
              <button type="button" id="editEmail" name="sub"  class="layui-btn layui-btn-normal">修改</button>
            </div>
          </div>
        </form>
      </div>
      <div class="layui-tab-item">

        <img src="${business.logo}" class="layui-upload-list" width="240" id="tu" style="display: block" />
        <button type="button" class="layui-btn" id="test1" style="width: 240px">
          <i class="layui-icon">&#xe67c;</i>上传企业Logo
        </button>
      </div>
      <div class="layui-tab-item">内容4</div>
    </div>
  </div>
  </body>
</html>
