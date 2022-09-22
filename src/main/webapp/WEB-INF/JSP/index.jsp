<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<jsp:directive.page pageEncoding="UTF-8" trimDirectiveWhitespaces="true"/>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="org.springframework.web.client.RestTemplate" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Spring Boot Web with JSP - Simple Solution </title>
    </head>
    <body>

        <h3>${message}</h3>
        <h2>${bookSays}</h2>
        <c:set var="author" value="${author}" />
        <h1>my author is: ${author} </h1>
          <c:set var="restTem" value="${restTemplate}"/>
        <h3> restTemplate: ${restTem}</h3>
    </body>
</html>