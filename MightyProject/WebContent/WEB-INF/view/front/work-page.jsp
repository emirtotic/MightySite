<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!doctype html>
<html lang="en">

  <head>
    <title>Mighty &mdash; Our Work Page</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link href="https://fonts.googleapis.com/css?family=Muli:400,700" rel="stylesheet">

    <link rel="stylesheet" href="fonts/icomoon/style.css">

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/bootstrap-datepicker.css">
    <link rel="stylesheet" href="css/jquery.fancybox.min.css">
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">
    <link rel="stylesheet" href="fonts/flaticon/font/flaticon.css">
    <link rel="stylesheet" href="css/aos.css">

    <!-- MAIN CSS -->
    <link rel="stylesheet" href="css/style.css">

  </head>

  <body data-spy="scroll" data-target=".site-navbar-target" data-offset="300">

    
    <div class="site-wrap" id="home-section">

      <div class="site-mobile-menu site-navbar-target">
        <div class="site-mobile-menu-header">
          <div class="site-mobile-menu-close mt-3">
            <span class="icon-close2 js-menu-toggle"></span>
          </div>
        </div>
        <div class="site-mobile-menu-body"></div>
      </div>



      <header class="site-navbar site-navbar-target" role="banner">

        <div class="container">
          <div class="row align-items-center position-relative">

            <div class="col-3 ">
              <div class="site-logo">
                <a href="./" class="font-weight-bold">Mighty Emir :)</a>
              </div>
            </div>

            <div class="col-9  text-right">
              

              <span class="d-inline-block d-lg-block"><a href="#" class="text-white site-menu-toggle js-menu-toggle py-5 text-white"><span class="icon-menu h3 text-white"></span></a></span>

              

              <nav class="site-navigation text-right ml-auto d-none d-lg-none" role="navigation">
                <ul class="site-menu main-menu js-clone-nav ml-auto ">
                  <li class="active"><a href="main-page" class="nav-link">Home</a></li>
                  <li><a href="about-page" class="nav-link">About</a></li>
                  <li><a href="work-page" class="nav-link">Work</a></li>
                  <li><a href="blog-page" class="nav-link">Blog</a></li>
                  <li><a href="contact-page" class="nav-link">Contact</a></li>
                </ul>
              </nav>
            </div>

            
          </div>
        </div>

      </header>

    <div class="ftco-blocks-cover-1">
      <div class="site-section-cover overlay" style="background-image: url('images/hero_1.jpg')">
        <div class="container">
          <div class="row align-items-center justify-content-center">
            <div class="col-md-7 text-center">
              <h1 class="mb-4 text-white">Our Work Page</h1>
              <p class="mb-4">On this page I will show some of our projects and members of our team</p>
              <p><a href="contact-page" class="btn btn-primary btn-outline-white py-3 px-5">Contact Us</a></p>
            </div>
          </div>
        </div>
      </div>
    </div>


    <div class="site-section">
      <div class="container">
        <div class="row align-items-center">
          <div class="col-md-4">
            <h2 class="h4 mb-4">About Me</h2>
           	<p>Bachelor of Science in Computer Science and Computer Science. Current student of Cubes Programming School in Belgrade.</p>
            <p>I have been attending<a href="https://cubes.edu.rs/" target="_blank"> Cubes School</a> since October 2019. With daily work and effort, I want to accomplish what I want.</p>
            <p><a href="#" class="btn btn-primary text-white px-5">Our works</a></p>
          </div>
          <div class="col-md-4">
            <img src="images/about_1.jpg" alt="Image" class="img-fluid">
          </div>
        
          <div class="col-md-4">
            
            <h2 class="h4 mb-4">My expertise and skills</h2>

            <div class="progress-wrap mb-4">
              <div class="d-flex">
                <span>Java Core Programming</span>
                <span class="ml-auto">85%</span>
              </div>
              <div class="progress rounded-0" style="height: 7px;">
                <div class="progress-bar" role="progressbar" style="width: 85%;" aria-valuenow="85" aria-valuemin="0" aria-valuemax="100"></div>
              </div>
            </div>

            <div class="progress-wrap mb-4">
              <div class="d-flex">
                <span>Java Web Programming</span>
                <span class="ml-auto">90%</span>
              </div>
              <div class="progress rounded-0" style="height: 7px;">
                <div class="progress-bar" role="progressbar" style="width: 90%;" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100"></div>
              </div>
            </div>

            <div class="progress-wrap mb-4">
              <div class="d-flex">
                <span>Spring & Hibernate Framework</span>
                <span class="ml-auto">93%</span>
              </div>
              <div class="progress rounded-0" style="height: 7px;">
                <div class="progress-bar" role="progressbar" style="width: 93%;" aria-valuenow="93" aria-valuemin="0" aria-valuemax="100"></div>
              </div>
            </div>

            <div class="progress-wrap mb-4">
              <div class="d-flex">
                <span>My SQL</span>
                <span class="ml-auto">70%</span>
              </div>
              <div class="progress rounded-0" style="height: 7px;">
                <div class="progress-bar" role="progressbar" style="width: 83%;" aria-valuenow="83" aria-valuemin="0" aria-valuemax="100"></div>
              </div>
            </div>


          </div>
        </div>
      </div>
    </div>


    <div class="site-section">
      <div class="container">

        <div class="row mb-5">
          <div class="col-md-7 mx-auto text-center">
            <h2 class="heading-29190">Our Projects</h2>
          </div>
        </div>

		<div class="row">
        
        <c:forEach var="projects" items="${projects}">

          <div class="col-md-6 col-lg-4 mb-4">
            <div class="item web">
              <a href="work-single.html" class="item-wrap" data-fancybox="gal">
                <span class="icon-add"></span>
                <img class="img-fluid" src="${projects.image}">
              </a>
            </div>
          </div>

		</c:forEach>

        </div>

        
      </div>
    </div> <!-- END .site-section -->



    <div class="site-section bg-light">
      <div class="container">

        <div class="row mb-5">
          <div class="col-md-7 mx-auto text-center">
            <h2 class="heading-29190">Workers</h2>
          </div>
        </div>

        
        <div class="row">    
     <c:forEach var="workers" items="${workers}">
            

        
          <div class="col-lg-4 col-md-6">
            
            <div>
              <div class="person-pic-39219 mb-4">
                <img src="${workers.image}" alt="Image" class="img-fluid">
              </div>  
              
              <blockquote class="quote_39823">
                <p>${workers.message}</p>
              </blockquote>
              <p>&mdash; ${workers.name}</p>
            </div>
          </div>
          
        
    
   </c:forEach>
   
   </div>
    </div>
    </div>



    <footer class="site-footer">
      <div class="container">
        <div class="row">
          <div class="col-lg-3">
            <h2 class="footer-heading mb-3">About Me</h2>
                <p align="justify" >Bachelor of Science in Computer Science and Computer Science. Current student of Cubes Programming School in Belgrade.</p>
            <p align="justify">I have been attending<a href="https://cubes.edu.rs/" target="_blank"> Cubes School</a> since October 2019. With daily work and effort, I want to accomplish what I want.</p>
          </div>
          <div class="col-lg-8 ml-auto">
            <div class="row">
              <div class="col-lg-6 ml-auto">
                <h2 class="footer-heading mb-4">Quick Links</h2>
                <ul class="list-unstyled">
                  <li><a href="https://cubes.edu.rs/" target="_blank">Cubes School</a></li>
                  <li><a href="main-page">Home</a></li>
                  <li><a href="about-page">About Us</a></li>
                  <li><a href="blog-page">Blogs</a></li>
                  <li><a href="contact-page">Contact Us</a></li>
                </ul>
              </div>
              <div class="col-lg-6">
                <h2 class="footer-heading mb-4">Connect</h2>
                <div class="social_29128 white mb-5">
                  <a href="https://www.facebook.com/" target="_blank"><span class="icon-facebook"></span></a>  
                  <a href="https://www.instagram.com" target="_blank"><span class="icon-instagram"></span></a>  
                  <a href="https://www.twitter.com" target="_blank"><span class="icon-twitter"></span></a>  
                 </div>
                 
                 
                <h2 class="footer-heading mb-4">Newsletter - Recieve news from my Mighty site</h2>
                <form:form role="form" modelAttribute="newsletter" action="newsletter-save">
                  <form:input path="email" type="text" class="form-control mr-3" placeholder="Email"/>
                  <br>
                  <input type="submit" value="Send" class="btn btn-primary">
                </form:form>
              </div>
              
              
              
            </div>
          </div>
        </div>
        <div class="row pt-5 mt-5 text-center">
          <div class="col-md-12">
            <div class="border-top pt-5">
              <p>
            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
            Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="icon-heart text-danger" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank" >Colorlib</a>
            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
            </p>
            </div>
          </div>

        </div>
      </div>
    </footer>

    </div>

    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/jquery-migrate-3.0.0.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/jquery.sticky.js"></script>
    <script src="js/jquery.waypoints.min.js"></script>
    <script src="js/jquery.animateNumber.min.js"></script>
    <script src="js/jquery.fancybox.min.js"></script>
    <script src="js/jquery.stellar.min.js"></script>
    <script src="js/jquery.easing.1.3.js"></script>
    <script src="js/bootstrap-datepicker.min.js"></script>
    <script src="js/isotope.pkgd.min.js"></script>
    <script src="js/aos.js"></script>

    <script src="js/main.js"></script>

  </body>

</html>

