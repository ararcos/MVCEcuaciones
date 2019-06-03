<%-- 
    Document   : header
    Created on : 03/06/2019, 12:18:52
    Author     : alexa
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <%@include file="header.jsp" %>  
    </head>

    <body>
   <section id="intro">

            <div class="container">
                <div class="row">
                    <div class="span6">
                        <h2><strong>Matematicas<span class="highlight primary">Assistant</span></strong></h2>
                        <p class="lead">
                            Bienvenido a tu asistente de Matematicas<br>
                            Aqui podras encontrar ayuda en tres tematicas de matematicas básica
                        </p>
                        <ul class="list list-ok strong bigger">
                            <li>Ecuaciones de Primer Grado</li>
                            <li>Ecuaciones de Segundo Grado</li>
                        </ul>

                    </div>
                    <div class="span6">

                        <div class="group section-wrap upper" id="upper">
                            <div class="section-2 group">
                                <ul id="images" class="rs-slider">
                                    <li class="group">
                                        <a href="#">
                                            <img src="assets/img/slides/refine/slide1.jpg" alt="" />
                                        </a>
                                    </li>
                                    <li class="group">
                                        <a href="#" class="slide-parent">
                                            <img src="assets/img/slides/refine/slide2.jpg" alt=""/>
                                        </a>
                                    </li>
                                    <li class="group">
                                        <img src="assets/img/slides/refine/slide3.jpg" alt="" />
                                    </li>
                                </ul>
                            </div>
                            <!-- /.section-2 -->
                        </div>

                    </div>
                </div>
            </div>

        </section>
    </body>
</html>
