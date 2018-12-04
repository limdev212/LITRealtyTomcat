<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <!-- Title  -->
    <title>My Properties | LIT Realty </title>

    <!-- Favicon  -->
    <link rel="icon" href="img/core-img/favicon.ico">

    <!-- Style CSS -->
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.css">
</head>

<body>
    <!-- Preloader -->
    <div id="preloader">
        <div class="south-load"></div>
    </div>

    <!-- ##### Header Area Start ##### -->
    <header class="header-area">

        <!-- Top Header Area -->
        <div class="top-header-area">
            <div class="h-100 d-md-flex justify-content-between align-items-center">
                <div class="email-address">
                    <a href="mailto:contact@litrealty.com">contact@litrealty.com</a>
                </div>
                <div class="phone-number d-flex">
                    <div class="icon">
                        <img src="img/icons/phone-call.png" alt="">
                    </div>
                    <div class="number">
                        <shiro:guest>
                        <a href="login.jsp">Login</a>
                        </shiro:guest>
                        <shiro:user>
                             <a href="">Welcome <shiro:principal/></a><a href="logout">Log out </a>
                        </shiro:user>
                    </div>
                </div>
            </div>
        </div>

        <!-- Main Header Area -->
        <div class="main-header-area" id="stickyHeader">
            <div class="classy-nav-container breakpoint-off">
                <!-- Classy Menu -->
                <nav class="classy-navbar justify-content-between" id="southNav">

                    <!-- Logo -->
                    <a class="nav-brand" href="index.jsp"><img src="img/core-img/logo.png" alt=""></a>

                    <!-- Navbar Toggler -->
                    <div class="classy-navbar-toggler">
                        <span class="navbarToggler"><span></span><span></span><span></span></span>
                    </div>

                    <!-- Menu -->
                    <div class="classy-menu">

                        <!-- close btn -->
                        <div class="classycloseIcon">
                            <div class="cross-wrap"><span class="top"></span><span class="bottom"></span></div>
                        </div>

                      <!-- Nav Start -->
                        <div class="classynav">
                            <ul>
                                <li><a href="IndexServlet">Dashboard</a></li>
                                
                                
                                <li><a href="MyProperties">Properties</a></li>
                                <li><a href="MyInquiries">Inquiries</a></li>
                                <li><a href="AddNewProperty">Add New Property</a></li>
                                
                                
                            </ul>

                            <!-- Search Form -->
                            <div class="south-search-form">
                                <form action="#" method="post">
                                    <input type="search" name="search" id="search" placeholder="Search Anything ...">
                                    <button type="submit"><i class="fa fa-search" aria-hidden="true"></i></button>
                                </form>
                            </div>

                            <!-- Search Button -->
                            <a href="#" class="searchbtn"><i class="fa" aria-hidden="true"></i></a>
                        </div>
                        <!-- Nav End -->
                    </div>
                </nav>
            </div>
        </div>
    </header>
    <!-- ##### Header Area End ##### -->

    <!-- ##### Breadcumb Area Start ##### -->
    <section class="breadcumb-area bg-img" style="background-image: url(img/bg-img/hero1.jpg);">
        <div class="container h-100">
            <div class="row h-100 align-items-center">
                <div class="col-12">
                    <div class="breadcumb-content">
                        <h3 class="breadcumb-title">Add Property</h3>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- ##### Breadcumb Area End ##### -->

    <section class="south-contact-area section-padding-100">
        <div class="container">
            <div class="row">
                <div style="height: 80px" class="col-12">
                    <div class="contact-heading">
                        <h6>Add Property</h6>
                    </div>
                </div>
            </div>
            
            

            <div class="row">
                
                <div class="col-12 col-lg-12">
                    <img src=""
                    <div class="contact-form">
                        <form action="SaveAddProperty" method="post">
                            <div class="form-group">
                                Street Address: <input type="text"  class="form-control" name="street" id="contact-name" placeholder="Street Address">
                            </div>
                            <div class="form-group">
                                Description: <textarea style="height:80px" class="form-control" name="description" id="message" cols="30" rows="10" placeholder="Description">${property.description}</textarea>
                            </div>
                            <div class="form-group">
                                City: <input type="text" class="form-control" name="city" id="contact-name" placeholder="City">
                            </div>
                            <div class="form-group">
                                Agent: <input type="text" value="${agent.id}" class="form-control" name="agent" id="contact-name" placeholder="City">
                            </div>
                            <div class="form-group">
                                Price: <input type="number" class="form-control" name="price" id="contact-number" placeholder="Price">
                            </div>
                            <div class="form-group">
                                Bedrooms: <input type="number" class="form-control" name="bedrooms" id="contact-number" placeholder="Bedrooms">
                            </div>
                            <div class="form-group">
                                Bathrooms:<input type="number" class="form-control" name="bathrooms" id="contact-number" placeholder="Bathrooms">
                            </div>
                             <div class="form-group">
                                Listing Number: <input type="number" class="form-control" name="listingnum" id="contact-number" placeholder="Listing Number">
                            </div>
                            <div class="form-group">
                                SQ. Feet: <input type="number" class="form-control" name="squarefeet" id="contact-number" placeholder="SQ Feet">
                            </div>
                            <div class="form-group">
                                BER Rating: <input type="text" class="form-control" name="berrating" id="contact-name" placeholder="BER Rating">
                            </div>
                            <div class="form-group">
                                Lot Size: <input type="text" class="form-control" name="lotsize" id="contact-name" placeholder="Lot Size">
                            </div>
                            <div class="form-group">
                                Garage Size: <input type="text"  class="form-control" name="garagesize" id="contact-name" placeholder="Garage Size">
                            </div>
                            <div class="row">
                            <div class="form-group">
                                <div class="col-12 col-md-12 col-lg-12">
                                    Garage Type
                                        <select class="form-control" name="garagetype">
                                            <option value="1">Attached</option>
                                            <option value="2">Detached</option>
                                            <option value="3">Car Port</option>
                                            <option value="4">None</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                            <div class="form-group">
                                <div class="col-12 col-md-12 col-lg-12">
                                    Property Type: 
                                
                                        <select class="form-control" name="propertytype">
                                            <option value="1">Residential</option>
                                            <option value="2">Residential Multi</option>
                                            <option value="3">Commercial</option>
                                            
                                        </select>
                                    
                                </div>
                            </div>
                            </div>
                            <div class="row">
                                <div class="form-group">
                                    <div class="col-12 col-md-12 col-lg-12">
                                        Style
                                        <select class="form-control" name="styletype">
                                            <option  value="1">Bungalow</option>
                                            <option  value="2">Semi Detached</option>
                                            <option  value="3">Detached</option>
                                            <option  value="4">Cottage</option>
                                            <option  value="5">Terrace</option>
                                            <option  value="8">Duplex</option>
                                            <option  value="9">Condo</option>
                                            <option  value="10">Apartment</option>
                                            <option  value="11">Other</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <button type="submit" class="btn south-btn">Save Details</button>
                            </div>
                            
                        </form>
                    </div>
                </div>


             
                
            </div>
        </div>
    </section>

   

    <!-- ##### Footer Area Start ##### -->
    <footer class="footer-area section-padding-100-0 bg-img gradient-background-overlay" style="background-image: url(img/bg-img/cta.jpg);">
        <!-- Main Footer Area -->
        <div class="main-footer-area">
            <div class="container">
                <div class="row">

                    <!-- Single Footer Widget -->
                    <div class="col-12 col-sm-6 col-xl-3">
                        <div class="footer-widget-area mb-100">
                            <!-- Widget Title -->
                            <div class="widget-title">
                                <h6>About Us</h6>
                            </div>

                            <img src="img/bg-img/footer.jpg" alt="">
                            <div class="footer-logo my-4">
                                <img src="img/core-img/logo.png" alt="">
                            </div>
                            <p>Integer nec bibendum lacus. Suspen disse dictum enim sit amet libero males uada feugiat. Praesent malesuada.</p>
                        </div>
                    </div>

                    <!-- Single Footer Widget -->
                    <div class="col-12 col-sm-6 col-xl-3">
                        <div class="footer-widget-area mb-100">
                            <!-- Widget Title -->
                            <div class="widget-title">
                                <h6>Hours</h6>
                            </div>
                            <!-- Office Hours -->
                            <div class="weekly-office-hours">
                                <ul>
                                    <li class="d-flex align-items-center justify-content-between"><span>Monday - Friday</span> <span>09 AM - 19 PM</span></li>
                                    <li class="d-flex align-items-center justify-content-between"><span>Saturday</span> <span>09 AM - 14 PM</span></li>
                                    <li class="d-flex align-items-center justify-content-between"><span>Sunday</span> <span>Closed</span></li>
                                </ul>
                            </div>
                            <!-- Address -->
                            <div class="address">
                                <h6><img src="img/icons/phone-call.png" alt=""> +45 677 8993000 223</h6>
                                <h6><img src="img/icons/envelope.png" alt=""> office@template.com</h6>
                                <h6><img src="img/icons/location.png" alt=""> Main Str. no 45-46, b3, 56832, Los Angeles, CA</h6>
                            </div>
                        </div>
                    </div>

                    <!-- Single Footer Widget -->
                    <div class="col-12 col-sm-6 col-xl-3">
                        <div class="footer-widget-area mb-100">
                            <!-- Widget Title -->
                            <div class="widget-title">
                                <h6>Useful Links</h6>
                            </div>
                            <!-- Nav -->
                            <ul class="useful-links-nav d-flex align-items-center">
                                <li><a href="#">Home</a></li>
                                <li><a href="#">About us</a></li>
                                <li><a href="#">About us</a></li>
                                <li><a href="#">Services</a></li>
                                <li><a href="#">Properties</a></li>
                                <li><a href="#">Listings</a></li>
                                <li><a href="#">Testimonials</a></li>
                                <li><a href="#">Properties</a></li>
                                <li><a href="#">Blog</a></li>
                                <li><a href="#">Testimonials</a></li>
                                <li><a href="#">Contact</a></li>
                                <li><a href="#">Elements</a></li>
                                <li><a href="#">FAQ</a></li>
                            </ul>
                        </div>
                    </div>

                    <!-- Single Footer Widget -->
                    <div class="col-12 col-sm-6 col-xl-3">
                        <div class="footer-widget-area mb-100">
                            <!-- Widget Title -->
                            <div class="widget-title">
                                <h6>Featured Properties</h6>
                            </div>
                            <!-- Featured Properties Slides -->
                            <div class="featured-properties-slides owl-carousel">
                                <!-- Single Slide -->
                                <div class="single-featured-properties-slide">
                                    <a href="#"><img src="img/bg-img/fea-product.jpg" alt=""></a>
                                </div>
                                <!-- Single Slide -->
                                <div class="single-featured-properties-slide">
                                    <a href="#"><img src="img/bg-img/fea-product.jpg" alt=""></a>
                                </div>
                                <!-- Single Slide -->
                                <div class="single-featured-properties-slide">
                                    <a href="#"><img src="img/bg-img/fea-product.jpg" alt=""></a>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>

        <!-- Copywrite Text -->
        <div class="copywrite-text d-flex align-items-center justify-content-center">
            <p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
        </div>
    </footer>
    <!-- ##### Footer Area End ##### -->

    <!-- jQuery (Necessary for All JavaScript Plugins) -->
    <script src="js/jquery/jquery-2.2.4.min.js"></script>
    <!-- Popper js -->
    <script src="js/popper.min.js"></script>
    <!-- Bootstrap js -->
    <script src="js/bootstrap.min.js"></script>
    <!-- Plugins js -->
    <script src="js/plugins.js"></script>
    <script src="js/classy-nav.min.js"></script>
    <script src="js/jquery-ui.min.js"></script>
    <!-- Active js -->
    <script src="js/active.js"></script>
    <!-- Google Maps -->
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAwuyLRa1uKNtbgx6xAJVmWy-zADgegA2s"></script>
    <script src="js/map-active.js"></script>
    
    <script>
        
       $(document).ready( function () {
            $('#table_id').DataTable();
        } );
    </script>
  
    <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js"></script>

</body>

</html>
