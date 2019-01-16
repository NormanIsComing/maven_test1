<%--
  Created by IntelliJ IDEA.
  User: Norman
  Date: 2018/12/26
  Time: 23:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<!-- 引入el标识所需要的标签 -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>message:${message}</h1>
${requestScope.a}
</body>
</html>
