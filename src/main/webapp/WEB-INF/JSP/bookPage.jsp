<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<jsp:directive.page pageEncoding="UTF-8" trimDirectiveWhitespaces="true"/>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="org.springframework.web.client.RestTemplate" %>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script src="<c:url value="/resources/js/bookPage.js" />" type="text/javascript"></script>

<!DOCTYPE html>
<html>
    <head>
        <title>Book-Page</title>
    </head>
    <body>

        <h2>${bookSays}</h2>
        <button id="button1" label="testButton">Click me</button>
    </body>
</html>