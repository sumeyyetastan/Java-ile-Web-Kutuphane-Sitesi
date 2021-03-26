<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList,homework.proje.Books" %>
    
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script src="responsiveslides.min.js"></script>

<div class="container-fluid text-center">
  <div class="row content">
    <%@ include file="sidenav-left.jsp" %>
    <div class="col-sm-8 text-left">
    
    <br>
    <br>

  <div id="myCarousel" class="carousel slide" data-ride="carousel">
   
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <div class="carousel-inner">

      <div class="item active">
        <img src="images/slide_1.jpeg">
        <div class="carousel-caption">
         
        </div>
      </div>

      <div class="item">
        <img src="images/slide_2.jpeg" >
        <div class="carousel-caption">
          
        </div>
      </div>
    
      <div class="item">
        <img src="images/slide_3.jpeg" >
        <div class="carousel-caption">
        
        </div>
      </div>
  
    </div>

    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>

    
    <br>
    
      <p> Okumadan edemem diyorsanız, aradığınız her kitabı Imagine Library instagramında  ve Imagine Library'da bulabilirsiniz. Farklı türdeki tüm kitaplar, 'en çok satanlar' listesinde yer alanlar, kitap kurtlarınca en çok okunanlar ve yeni çıkan kitapların hepsi raflarımızda. Siz sadece ne okumak istediğinize karar verin!</p>
    </div>
  
    <%@ include file="sidenav-right.jsp" %>
  </div>
</div>
  <%@ include file="footer.jsp" %>
</body>
