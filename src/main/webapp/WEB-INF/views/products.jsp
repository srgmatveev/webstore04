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

<title><spring:message code="product.message.products"/></title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1><spring:message code="product.message.products"/></h1>
				<p><spring:message code="product.message.caption"/></p>
			</div>
		</div>
	</section>

	<section class="container">
		<div class="row">
			<c:forEach items="${products}" var="product">
				<div class="col-sm-6 col-md-3">
					<div class="thumbnail">
						<div class="caption">
							<h3>${product.name}</h3>
							<p>${product.description}</p>
							<p>$${product.unitPrice}</p>
							<p>Available ${product.unitsInStock} units in stock</p>

							<p>
								<a href=" <spring:url value="/market/product?id=${product.productId}" /> "
									class="btn btn-primary"> 
									<span class="glyphicon-info-sign glyphicon" /></span> Details </a>
							</p>





						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>
</body>
</html>
