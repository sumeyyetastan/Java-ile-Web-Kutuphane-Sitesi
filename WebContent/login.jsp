
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

    <style>
        @import url('https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i&display=swap');
        
        body{
            background-color: #efeee8;
            font-family: 'Open Sans', sans-serif;
            background-image:url("images/bg-01.jpg");
            width:100%;
            height: 100vh;
            bakcground-size: 200%;
          
     }
     
     .form-container{
     position: absolute;
     top: 15vh;
     background: #fff;
     padding: 30px;
     border-radius: 10px;
     box-shadow: 0px 0px 10px 0px #000;
    
     }
     
     @media only screen and(max-width: 678px) {
     
     .bg{
          background*size: 300%;
     }
     }
     
     
    </style>
</head>

<body>

    <section class="container-fluid bg">
    <section class="row justify-content-center">
    <section class="col-12 col-sm-6 col-md-3">
      
      <form action="handle_login" method ="post" class="form-container">
  <div class="form-group">

    <input type="text" name="kullaniciadi" placeholder="kullanıcı adı">
    
  </div>
  <div class="form-group">
   
   <input type="password" name="sifre" placeholder="şifre">
  </div>
  <div class="form-group form-check">
   
  </div>
  <button type="submit" class="btn btn-primary btn-block">Giriş Yap</button>
  <div>
  <div>
  <a href="dataInsert.jsp"> Yeni Kullanıcı Ekle</a>
  </div>
  

  </div>
</form>
    
    </section>
    </section>
    </section>

    
    
           
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>

</html>
