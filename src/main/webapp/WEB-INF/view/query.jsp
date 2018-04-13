<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <script type="text/javascript" src="/layui/layui.all.js"></script>
    <script type="text/javascript" src="/js/jquery-3.3.1.js"></script>
    <link rel="stylesheet" href="/layui/css/layui.css">
    <title>Title</title>
</head>
<body>
<table id="demo" lay-filter="test"></table>
</body>
<script>
    layui.use('table', function(){
        var table = layui.table;
        //第一个实例
        table.render({
            elem: '#demo'
            ,height: 315
            ,url: '/query_table' //数据接口
            ,width:800
            ,page: true //开启分页
            ,cols: [[ //表头
                {field: 'id', title: 'ID', width:80, sort: true, fixed: 'left'}
                ,{field: 'username', title: '用户名', width:80}
                ,{field: 'name', title: '昵称', width:80, sort: true}
            ]]
        });

    });
</script>
</html>