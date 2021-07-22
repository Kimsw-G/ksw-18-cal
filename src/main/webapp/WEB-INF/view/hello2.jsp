<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link href="/css/hello.css">
    <script src="/js/hello2.js" type="text/javascript" defer="defer"></script>

</head>
<body>
<div id="month>">${month}</div>
<input type="hidden" value="${blank}" id="blank">
<input type="hidden" value="${end}" id="end">
<div id="cal-wrapper">
    <c:forEach begin="0" end="6" var="i">
        <c:forEach begin="0" end="5" var="j">
            <div id="cal" class="cal-${i}-${j}">0</div>
        </c:forEach>
    </c:forEach>
</div>
</body>
</html>