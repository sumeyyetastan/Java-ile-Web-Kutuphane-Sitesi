<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script src="responsiveslides.min.js"></script>
<div class="container-fluid text-center">
  <div class="row content">
    <%@ include file="sidenav-left.jsp" %>
    <div class="col-sm-8 text-left">
    
    <br>
    <br>
 <form action="dataInsert" method="post">
 <div class="form-group">
 <label for="exampleInputEmail1">Email address</label>
    <input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Email Giriniz">
</div>
  <div class="form-group">
  
   <label for="exampleInputEmail1">Kullanıcı Adı</label>
    <input type="text" name="name" class="form-control" placeholder="Kullanıcı Adı">
  
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Şifre</label>
    <input type="password" name="surname" class="form-control" placeholder="Şifre">
  </div>
  
 <button type="submit" onclick="myFunction()" class="btn btn-primary">Yeni Kullanıcı Ekle</button>
</form>
        <br>
 <script>
function myFunction() {
  alert("Kullanıcı Eklendi");
}
</script>
       
        <br>
         </div>
    <%@ include file="sidenav-right.jsp" %>
  </div>
</div>
  <%@ include file="footer.jsp" %>
</body>
</html>











