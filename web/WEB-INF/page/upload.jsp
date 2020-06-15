<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<form action="uploadfile" method="post" enctype="multipart/form-data">
    <input type="file" name="picture">
    <input type="submit" value="上 传">
</form>
</body>
</html>