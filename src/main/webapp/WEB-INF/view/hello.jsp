<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link href="/css/hello.css">
</head>
<body>
"hello"
<div id="cal-wrapper">
    <c:set var="flag" value="no-cal"/>
    <c:forEach begin="0" end="6" var="i">
        <c:forEach begin="0" end="5" var="j">
            <c:if test="${i*7+j eq 4 + 28}">
                <c:set var="flag" value="no-cal"/>
            </c:if>
            <c:if test="${i*7+j eq 4}">
                <c:set var="flag" value="yes-cal"/>
            </c:if>
            <div id="cal" class="${flag}" >${i*7+j - 4 + 1}</div>
        </c:forEach>
    </c:forEach>
</div>
</body>
</html>