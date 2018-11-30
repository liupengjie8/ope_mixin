<html lang="zh-CN" xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Hello World</title>
</head>
<body>
Hi!!!!!!!!!!!!!!!!!!!JSP
<input type="text" th:value="${user.getName()}" ></input>

<p th:text="*{name}" ></p>
<p th:utext="${user.getName()}" ></p>
</body>
</html>
