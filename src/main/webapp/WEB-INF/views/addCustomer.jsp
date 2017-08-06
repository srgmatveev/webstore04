<% response.setCharacterEncoding("utf-8"); request.setCharacterEncoding("utf-8"); %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,
initial-scale=1">

<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />
<title>Customers</title>
</head>
<body>
   <section>
      <div class="jumbotron">
         <div class="container">
            <h1>Customers</h1>
            <p>Add customers</p>
         </div>
      </div>
   </section>
   <section class="container">
      <form:form  method="POST" modelAttribute="newCust" class="form-horizontal">
         <fieldset>
            <legend>Add new customer</legend>

            <div class="form-group">
               <label class="control-label col-lg-2 col-lg-2" for="customerId">Customer Id</label>
               <div class="col-lg-10">
                  <form:input id="customerId" path="customerId" type="text" class="form:input-large"/>
               </div>
            </div>
            
             <div class="form-group">
               <label class="control-label col-lg-2 col-lg-2" for="name">ФИО</label>
               <div class="col-lg-10">
                  <form:input id="name" path="name" type="text" class="form:input-large"/>
               </div>
            </div>
            
             <div class="form-group">
               <label class="control-label col-lg-2 col-lg-2" for="address">Адрес</label>
               <div class="col-lg-10">
                  <form:input id="address" path="address" type="text" class="form:input-large"/>
               </div>
            </div>
            
            <div class="form-group">
               <label class="control-label col-lg-2 col-lg-2" for="manufacturer">Есть ли счета?</label>
               <div class="col-lg-10">
                  <form:input id="noOfOrdersMade" path="noOfOrdersMade" type="text" class="form:input-large"/>
               </div>
            </div>
            
           
            <div class="form-group">
               <div class="col-lg-offset-2 col-lg-10">
                  <input type="submit" id="btnAdd" class="btn btn-primary" value ="Add"/>
               </div>
            </div>
         </fieldset>
      </form:form>
   </section>
</body>
</html>
