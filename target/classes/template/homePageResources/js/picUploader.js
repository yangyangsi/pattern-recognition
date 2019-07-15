layui.use('upload', function() {
    var $ = layui.jquery
        , upload = layui.upload;

    //动物图片上传
    var uploadInst = upload.render({
        elem: '#test1'
        , url: '/picRec/animal'
        , before: function (obj) {
            //预读本地文件示例，不支持ie8
            obj.preview(function (index, file, result) {
                $('#demo1').attr('src', result); //图片链接（base64）
            });
        }
        , done: function (res) {
            //如果上传失败
            if (res.code > 0) {
                return layer.msg('上传失败');
            }
            //上传成功
            dataTable(res);
        }
        , error: function () {
            //演示失败状态，并实现重传
            var demoText = $('#demoText');
            demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
            demoText.find('.demo-reload').on('click', function () {
                uploadInst.upload();
            });
        }
    });

    //植物图片上传
    var uploadInst = upload.render({
        elem: '#test2'
        , url: '/picRec/plan'
        , before: function (obj) {
            //预读本地文件示例，不支持ie8
            obj.preview(function (index, file, result) {
                $('#demo2').attr('src', result); //图片链接（base64）
            });
        }
        , done: function (res) {
            //如果上传失败
            if (res.code > 0) {
                return layer.msg('上传失败');
            }
            //上传成功
            dataTable(res);
        }
        , error: function () {
            //演示失败状态，并实现重传
            var demoText = $('#demoText2');
            demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
            demoText.find('.demo-reload').on('click', function () {
                uploadInst.upload();
            });
        }
    });

    //车辆图片上传
    var uploadInst = upload.render({
        elem: '#test3'
        , url: '/picRec/car'
        , before: function (obj) {
            //预读本地文件示例，不支持ie8
            obj.preview(function (index, file, result) {
                $('#demo3').attr('src', result); //图片链接（base64）
            });
        }
        , done: function (res) {
            //如果上传失败
            if (res.code > 0) {
                return layer.msg('上传失败');
            }
            //上传成功
            dataTable(res);
        }
        , error: function () {
            //演示失败状态，并实现重传
            var demoText = $('#demoText3');
            demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
            demoText.find('.demo-reload').on('click', function () {
                uploadInst.upload();
            });
        }
    });

    //通用物体图片上传
    var uploadInst = upload.render({
        elem: '#test4'
        , url: '/picRec/general'
        , before: function (obj) {
            //预读本地文件示例，不支持ie8
            obj.preview(function (index, file, result) {
                $('#demo4').attr('src', result); //图片链接（base64）
            });
        }
        , done: function (res) {
            //如果上传失败
            if (res.code > 0) {
                return layer.msg('上传失败');
            }
            //上传成功
            dataGeneralTable(res);
        }
        , error: function () {
            //演示失败状态，并实现重传
            var demoText = $('#demoText4');
            demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
            demoText.find('.demo-reload').on('click', function () {
                uploadInst.upload();
            });
        }
    });

    //通用菜品图片上传
    var uploadInst = upload.render({
        elem: '#test5'
        , url: '/picRec/dish'
        , before: function (obj) {
            //预读本地文件示例，不支持ie8
            obj.preview(function (index, file, result) {
                $('#demo5').attr('src', result); //图片链接（base64）
            });
        }
        , done: function (res) {
            //如果上传失败
            if (res.code > 0) {
                return layer.msg('上传失败');
            }
            //上传成功
            dataDishTable(res);
        }
        , error: function () {
            //演示失败状态，并实现重传
            var demoText = $('#demoText5');
            demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
            demoText.find('.demo-reload').on('click', function () {
                uploadInst.upload();
            });
        }
    });

})
$(function () {

    //页面按钮的隐藏
    $("#animalRec").on("click",function () {
        $('#uploaderHeadLine').html("<strong>动物识别</strong>");
        $('#tableBody').empty();
        $('#animalButton').show();
        $('#planButton').hide();
        $('#carButton').hide();
        $('#generalButton').hide();
        $('#dishButton').hide();
    })

    $("#planRec").on("click",function () {
        $('#uploaderHeadLine').html("<strong>植物识别</strong>");
        $('#tableBody').empty();
        $('#animalButton').hide();
        $('#planButton').show();
        $('#carButton').hide();
        $('#generalButton').hide();
        $('#dishButton').hide();
    })

    $("#carRec").on("click",function () {
        $('#uploaderHeadLine').html("<strong>车辆识别</strong>");
        $('#tableBody').empty();
        $('#animalButton').hide();
        $('#planButton').hide();
        $('#carButton').show();
        $('#generalButton').hide();
        $('#dishButton').hide();
    })

    $("#generalRec").on("click",function () {
        $('#uploaderHeadLine').html("<strong>通用物体识别</strong>");
        $('#tableBody').empty();
        $('#animalButton').hide();
        $('#planButton').hide();
        $('#carButton').hide();
        $('#generalButton').show();
        $('#dishButton').hide();
    })

    $("#dishRec").on("click",function () {
        $('#uploaderHeadLine').html("<strong>菜品识别</strong>");
        $('#tableBody').empty();
        $('#animalButton').hide();
        $('#planButton').hide();
        $('#carButton').hide();
        $('#generalButton').hide();
        $('#dishButton').show();
    })
})

//将识别数据返回到前端表格中
function dataTable(res) {
    $('#tableBody').empty();
    //判断是否识别不出来
    if(JSON.stringify(res.result[0].baike_info)==="{}"){
        for(var i=0;i<res.result.length;i++){
            $('#tableBody').append("<tr><td>"+res.result[i].name+"</td>"+"<td>"+res.result[i].score*100+"%</td>"+"<td>识别物体不是对应类型</td><td>无图片</td></tr>");
        }
    }else{
        for(var i=0;i<res.result.length;i++){
            $('#tableBody').append("<tr><td>"+res.result[i].name+"</td>"+"<td>"+res.result[i].score*100+"%</td>"+"<td>"+res.result[i].baike_info.description+"</td>"+"<td><img src="+res.result[i].baike_info.image_url+"  /></td></tr>");
        }
    }
}

//通用物体识别数据返回到前端表格中
function dataGeneralTable(res) {
    $('#tableBody').empty();
    //判断是否识别不出来
    if(JSON.stringify(res.result[0].baike_info)==="{}"){
        for(var i=0;i<res.result.length;i++){
            $('#tableBody').append("<tr><td>"+res.result[i].name+"</td>"+"<td>"+res.result[i].score*100+"%</td>"+"<td>识别物体不是对应类型</td><td>无图片</td></tr>");
        }
    }else{
        for(var i=0;i<res.result.length;i++){
            if(JSON.stringify(res.result[i].baike_info)==="{}"){
                $('#tableBody').append("<tr><td>"+res.result[i].keyword+"</td>"+"<td>"+res.result[i].score*100+"%</td>"+"<td>无描述</td>"+"<td>无图片</td></tr>");
            }else{
                $('#tableBody').append("<tr><td>"+res.result[i].keyword+"</td>"+"<td>"+res.result[i].score*100+"%</td>"+"<td>"+res.result[i].baike_info.description+"</td>"+"<td><img src="+res.result[i].baike_info.image_url+"  /></td></tr>");            }
        }
    }
}

//菜品识别数据返回到前端表格中
function dataDishTable(res) {
    $('#tableBody').empty();
    //判断是否识别不出来
    if(JSON.stringify(res.result[0].baike_info)==="{}"){
        for(var i=0;i<res.result.length;i++){
            $('#tableBody').append("<tr><td>"+res.result[i].name+"</td>"+"<td>"+res.result[i].probability*100+"%</td>"+"<td>识别物体不是对应类型</td><td>无图片</td></tr>");
        }
    }else{
        for(var i=0;i<res.result.length;i++){
            if(JSON.stringify(res.result[i].baike_info)==="{}"){
                $('#tableBody').append("<tr><td>"+res.result[i].name+"</td>"+"<td>"+res.result[i].probability*100+"%</td>"+"<td>无描述</td>"+"<td>无图片</td></tr>");
            }else{
                $('#tableBody').append("<tr><td>"+res.result[i].name+"</td>"+"<td>"+res.result[i].probability*100+"%</td>"+"<td>"+res.result[i].baike_info.description+"</td>"+"<td><img src="+res.result[i].baike_info.image_url+"  /></td></tr>");            }
        }
    }
}
