<%-- 
    Document   : tablita
    Created on : Nov 27, 2017, 5:07:36 PM
    Author     : angiem.vargas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1"/>
        <title>Parallax Template - Materialize</title>

        <!-- CSS  -->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
    </head>
    <body>
        <nav class="white" role="navigation">
            <div class="nav-wrapper container">
                <a id="logo-container" href="index.html" class="brand-logo"><img src="1263b41e9234545223b3ec33568c3207--conditioning-logos.jpg" width="100" height="60" alt="1263b41e9234545223b3ec33568c3207--conditioning-logos"/></a>
                <ul class="right hide-on-med-and-down">
                    <li><a href="Tablita">Datos</a></li>
                </ul>
                
                <ul class="right hide-on-med-and-down">
                    <li><a href="GenerarPrediccion">Generar Predicción</a></li>
                </ul>
                

                <%--<ul id="nav-mobile" class="side-nav">
                    <li><a href="index.html">Navbar Link</a></li>
                </ul>--%>

                <a href="#" data-activates="nav-mobile" class="button-collapse"><i class="material-icons">menu</i></a>
            </div>
        </nav>

        <div id="index-banner" class="parallax-container">
            <div class="section no-pad-bot">
                <div class="container">
                    <br><br>
                    <h1 class="header center teal-text text-lighten-2">Datos Registrados</h1>
                    <div class="row center">
                        <h5 class="header col s12 black-text"></h5>
                    </div>
                    <br><br>

                </div>
            </div>
            <div class="parallax"><img src="rayos.jpg" alt="Unsplashed background img 1"></div>
        </div>


        <div class="container">
            <div class="section">

                <!--   Icon Section   -->
                <table class="table table-striped table-dark">
        <tr>
        <th scope="col">Mes</th>
        <th scope="col">Humedad</th>
        <th scope="col">Temperatura</th>
        <th scope="col">Viento</th>
        <th scope="col">Nubosidad</th>
        <th scope="col">Presión Atmosferica</th>
        <th scope="col">Suerte</th>
        </tr>
        <c:forEach items="${Climas}" var="clima">
        <tr>
            <td>
                <center>${clima.mes}</center>
            </td>
            <td>
                <center>${clima.humedad}</center></td>
            <td>
                <center>${clima.temperatura}</center></td>
            <td>
                <center>${clima.viento}</center></td>
            <td>
                <center>${clima.nubosidad}</center></td>
            <td>
                <center>${clima.presiónAtmosferica}</center></td>
           <td><a href="Eliminar?mes=${clima.mes}">Eliminar</a></td>
        </tr>
        </c:forEach>
</table>

                    <div class="icon-block">


                    </div>


                </div>


                <footer class="page-footer teal">
                    <div class="container">
                        <div class="row">
                            <div class="col l6 s12">
                               <h5 class="white-text">Biografia de la Compañia</h5>
          <p class="grey-text text-lighten-4">Nosotros somos un equipo de estudiantes universitarios trabajando todo nuestros tiempo en este proyecto. Cualquier duda que nosotros podamos solucionar para contiunuar con el deswarrollo de este proyecto lo apreciaremos.</p>


                            </div>
                            <div class="col l3 s12">
          <h5 class="white-text">Connect</h5>
          <ul>
              <li class="list-inline-item">
                  <a  href="https://twitter.com/?lang=es"target="_blank"><img alt="siguenos en Twitter" height="40" src="http://2.bp.blogspot.com/-ZaTYz5sdFmc/UiX1V-AhNLI/AAAAAAAAB6M/ufa5OqT3x4o/s1600/Twitter+alt+4.png" title="siguenos en Twitter" width="40" /></a></a></li>
            <li><a class="btn-facebookt" href="https:////es-la.facebook.com/"target="_blank"><img alt="siguenos en facebook" height="40" src="http://1.bp.blogspot.com/-26xGT3R3DRQ/UiX1SY8I8oI/AAAAAAAAB4Y/bKCnHS9IorE/s1600/Facebook+alt+1.png" title="siguenos en facebook" width="40" /></a></li>
           
          </ul>
        </div>
                            
                        </div>
                    </div>
                    <div class="footer-copyright">
                        <div class="container">
                            Made by <a class="brown-text text-lighten-3" href="http://materializecss.com">JOAN</a>
                        </div>
                    </div>
                </footer>


                <!--  Scripts-->
                <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
                <script src="js/materialize.js"></script>
                <script src="js/init.js"></script>

                </body>
                </html>

