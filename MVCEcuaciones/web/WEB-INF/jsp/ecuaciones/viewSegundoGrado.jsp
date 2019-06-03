<%-- 
    Document   : viewPrimerGrado
    Created on : 03/06/2019, 12:53:47
    Author     : alexa
--%>

<%@page import="org.springframework.web.context.request.RequestScope"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Resultados X Ecuacion de Segundo Grado</title>
        <meta charset="utf-8">
        <%@include file="../header.jsp" %>
    </head>
    <body>
        <section id="intro">
            <center><h1>Valores X Calculados</h1></center>
        </section>
        <section id="maincontent">
            <div class="container">
                <center><h2>X = ${requestScope.calculoSegundoGrado.getX1()}<br></h2>
                <h2>X = ${requestScope.calculoSegundoGrado.getX2()}<br></h2></center>
                <table style="width:100%" class="table">
                    <tr>
                        <th>X</th>
                        <th>Y</th> 
                    </tr>
                 <%
                        int j = -20;
                        double[] val =(double[]) request.getAttribute("tabla");
                        for (int i = 0; i < 41; i++) {
                            out.println("<tr><td>" + j + "</td><td>" + val[i] + "</td></tr>");
                            j++;
                        }

                         
                    %>    
                </table>
                <div class="span8">
                    <a href="/MVCEcuaciones/ecuaciones/segundogrado.htm" class="button btn btn-color btn-lg">
                        Volver
                    </a>

                </div>
            </div>
        </section>
    </body>
</html>
