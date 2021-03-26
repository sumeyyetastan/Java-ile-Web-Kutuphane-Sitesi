 <%@ include file="header.jsp" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script src="responsiveslides.min.js"></script>
<div class="container-fluid text-center">
  <div class="row content">
    <%@ include file="sidenav-left.jsp" %>
    <div class="col-sm-8 text-left">
    
    <br>
    <br>
 <h6>Blog</h6>
    <br>
  <a href="<c:url value="InsertBook"></c:url>">Kayıt Eklemek İçin Tıklayın</a>
        <br>
        <a href="<c:url value="select"></c:url>">Kayıtları Listelemek İçin Tıklayın</a>
    </div>
    <%@ include file="sidenav-right.jsp" %>
  </div>
</div>
  <%@ include file="footer.jsp" %>
</body>
   