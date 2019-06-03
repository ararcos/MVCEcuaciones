<%-- 
    Document   : formPrimerGrado
    Created on : 03/06/2019, 12:51:54
    Author     : alexa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Ecuacion De Primer Grador</title>
        <%@include file="../header.jsp" %>
    </head>
    <body>
       
        <section id="intro">
            <center><h1>Calcular Ecuacion de Primer Grado</h1></center>
        </section>
        <section id="maincontent">
        
        <div class="container">
            <h3>Ingrese los valores</h3>
            <h4>Con el formato f(x)= ax+c </h4>
            <hr>
            <form action="primergrado.htm" method="post" class="contactForm" style="width: 500px; height: 230px">
                <div class="span4 form-group">
                a:
                <input type="text" name="txtA" class="form-control"required/>
                </div>
                <div class="span4 form-group">
                c:
                <input type="text" name="txtC" class="form-control"required/>
                </div>
                <div class="span4 form-group">
                    <button type="submit" class="btn btn-color btn-lg">Calcular</button>
                </div>
            </form>
        </div>  
        </section>
    </body>
</html>

