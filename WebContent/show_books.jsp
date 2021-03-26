
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "homework.proje.Books" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
  <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <style>

    footer {
      background-color: white;
      padding: 25px;
      color: black;
      font-weight: 800;
    }

    .carousel-inner img {
      width: 100%; 
      min-height: 200px;
    }

   
    @media (max-width: 600px) {
      .carousel-caption {
        display: none; 
      }
    }
  </style>
</head>
<body>

<div class="container">
<div class="row">
  <div class="col-sm-8">
     
      <div class="carousel-inner" role="listbox">
        <div class="item">
          <img src="${requestScope.books1.path}">
          <div class="carousel-caption">
          
          </div>      
        </div>

        <div class="item active">
          <img src="${requestScope.books1.path}">
          <div class="carousel-caption">
          
          </div>      
        </div>
      </div>
  </div>
  <div class="col-sm-4">
    <div class="well">
      <p><strong>Kitap İsmi : </strong> ${requestScope.books1.name}</p>
    </div>
    <div class="well">
      <p><strong> Baskı Sayısı : </strong> ${requestScope.books1.baskisay}</p>
    </div>
    <div class="well">
         <p><strong> Sayfa sayısı : </strong> ${requestScope.books1.sayfasayi}</p>
    </div>
     <div class="well">
          <p><strong>Cilt Tip : </strong> ${requestScope.books1.cilttip}</p>
    </div>
     <div class="well">
            <p><strong> Yazar : </strong> ${requestScope.books1.yazar}</p>
    </div>
     <div class="well">
           <p><strong> Açıklama : </strong> ${requestScope.books1.acıklama}</p>
    </div>
    
  </div>
</div>
<hr>
</div>

 
  <%@ include file="footer.jsp" %>

</body>
</html>
