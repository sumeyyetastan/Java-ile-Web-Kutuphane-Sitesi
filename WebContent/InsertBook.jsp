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
 <form action="InsertBook" method="post">
 <div class="form-group">
  
   <label for="exampleInputEmail1">Baski Sayisi</label>
    <input type="text" name="baskiSayisi" class="form-control" placeholder="Kullanıcı Adı">
  
  </div>
  <div class="form-group">
  
   <label for="exampleInputEmail1">Sayfa Sayisi</label>
    <input type="text" name="sayfaSayisi" class="form-control" placeholder="Kullanıcı Adı">
  
  </div>
  <div class="form-group">
  
   <label for="exampleInputEmail1">Cilt Tipi</label>
    <input type="text" name="cilTipi" class="form-control" placeholder="Kullanıcı Adı">
  
  </div>
  <div class="form-group">
  
   <label for="exampleInputEmail1">Yazar</label>
    <input type="text" name="yazar" class="form-control" placeholder="Kullanıcı Adı">
  
  </div>
  
  <div class="form-group">
  
   <label for="exampleInputEmail1">Resim Path</label>
    <input type="text" name="path" class="form-control" placeholder="Kullanıcı Adı">
  
  </div>
   <div class="form-group">
  
   <label for="exampleInputEmail1">Kitap Adı</label>
    <input type="text" name="ad" class="form-control" placeholder="Kullanıcı Adı">
  
  </div>
  <div class="form-group">
  
   <label for="exampleInputEmail1">Kitap Yorumu</label>
    <input type="text" name="aciklama" class="form-control" placeholder="Kullanıcı Adı">
  
  </div>
  
<td><input type="submit" value="Insert"></td>
</form>
        <br>
 <script>
 ${insertMessage}
</script>
<a href="<c:url value="select"></c:url>">Kayıtları Listelemek İçin Tıklayın</a>
       
        <br>
         </div>
    <%@ include file="sidenav-right.jsp" %>
  </div>
</div>
  <%@ include file="footer.jsp" %>
</body>
</html>











