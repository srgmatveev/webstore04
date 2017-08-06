<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
	
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,
initial-scale=1">
<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />
<title>Пользователи</title>
</head>
<body>
   <section>
      <div class="jumbotron">
         <div class="container">
            <h1>Пользователи</h1>
            <p>All the available пользлватели in our store</p>
         </div>
      </div>
   </section>

   <section class="container">
      <div class="row">
         <c:forEach items="${customers}" var="customer">
            <div class="col-sm-6 col-md-3">
               <div class="thumbnail">
                  <div class="caption">
                     <h3>${customer.customerId}</h3>
                     <p>${customer.name}</p>
                     <p>${customer.address}</p>
<p>Есть заказы в ${customer.noOfOrdersMade} units in stock</p>
                  </div>
               </div>
            </div>
         </c:forEach>
      </div>
   </section>
</body>
</html>
