<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.sv.udb.controlador.*"%>
<%@page import="com.sv.udb.modelo.*"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <link rel="icon" href="assets/img/ui-sam.jpg"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

    <title>Lugares</title>

    <!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href="assets/icono/style.css" rel="stylesheet" />    
    <!-- Custom styles for this template -->
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/style-responsive.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

  <section id="container" >
      <!-- **********************************************************************************************************************************************************
      TOP BAR CONTENT & NOTIFICATIONS
      *********************************************************************************************************************************************************** -->
      <!--header start-->
      <jsp:include page="INCLUDES/HEADER.jsp" flush="true"/>
      <!--header end-->
      
      <!-- **********************************************************************************************************************************************************
      MAIN SIDEBAR MENU
      *********************************************************************************************************************************************************** -->
      <!--sidebar start-->
      <jsp:include page="INCLUDES/ASIDE.jsp" flush="true"/>
      <!--sidebar end-->
      
      <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->
      <!--main content start-->
      <form  action="LugaAcceServ" class="form-horizontal style-form" method="POST">
      <section id="main-content">          
              <section class="wrapper">
                  <h3><i class="fa fa-angle-right"></i>Alumnos</h3>

                  <!-- BASIC FORM ELELEMNTS -->
                  <div class="row mt">
                      <div class="col-lg-12">
                          <div class="form-panel">
                                  <h4 class="mb" id="mensaje">${mensAler}</h4>

                                  <input type="hidden" name="codi" value="${codi}"/>

                                  <div class="form-group">
                                      <div class="col-sm-12">
                                          <label for="nomb">Nombre</label>
                                            <input class="form-control" type="text" name="nomb" id="nomb"value="${nomb_alum}" />
                                      </div>
                                  </div>
                                  
                                        <div class="form-group">
                                      <div class="col-sm-12">
                                          <label for="nomb">Apellido</label>
                                            <input class="form-control" type="text" name="nomb" id="nomb"value="${apel_alum}" />
                                      </div>
                                  </div>
                                      
                                        <div class="form-group">
                                      <div class="col-sm-12">
                                          <label for="nomb">Fecha</label>
                                            <input class="form-control" type="text" name="nomb" id="nomb"value="${fech_naci_alum}" />
                                      </div>
                                  </div>
                                      
                                        <div class="form-group">
                                      <div class="col-sm-12">
                                          <label for="nomb">mail</label>
                                            <input class="form-control" type="text" name="nomb" id="nomb"value="${mail_alum}" />
                                      </div>
                                  </div>
                                        <div class="form-group">
                                      <div class="col-sm-12">
                                          <label for="nomb">Telefono</label>
                                            <input class="form-control" type="text" name="nomb" id="nomb"value="${tele_alum}" />
                                      </div>
                                  </div>
                                        <div class="form-group">
                                      <div class="col-sm-12">
                                          <label for="nomb">Direccion</label>
                                            <input class="form-control" type="text" name="nomb" id="nomb"value="${dire_alum}" />
                                      </div>
                                  </div>
                                        <div class="form-group">
                                      <div class="col-sm-12">
                                          <label for="nomb">Genero</label>
                                            <input class="form-control" type="text" name="nomb" id="nomb"value="${gene_alum}" />
                                      </div>
                                  </div>
                                      
                                      
                              <div class="col s12 center-align">
                                  <input type="submit" name="accionBtn" value="Guardar" class="btn btn-default" />                                      
                              </div>    
                          </div>
                      </div><!-- col-lg-12-->      	
                  </div><!-- /row -->
              </section>
              <section class="wrapper">
                  <div class="row">

                      <div class="col-lg-12">
                          <div class="content-panel">
                              <h4><i class="fa fa-angle-right"></i>Listado de Lugares de Acceso</h4>
                              <hr>
                                  <section class="col-md-12">
                                      <jsp:useBean id="AlumnosCtrl" class="com.sv.udb.controlador.AlumnosCtrl" scope="page"/>
                                        <table class="table">
                                            <thead>
                                                <tr>
                                                    <th>Nombre</th>
                                                    <th>Apellido</th>
                                                    <th>Fecha</th>
                                                     <th>mail</th>
                                                     <th>telefono</th>
                                                     <th>direccion</th>
                                                     <th>genero</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <c:forEach items="${AlumnoCtrl.ConsTodo()}" var="fila">
                                                    <tr>
                                                        <td><c:out value="${fila.nomb_alum}"></c:out></td>
                                                        <td><c:out value="${fila.apel_alum}"></c:out></td>
                                                        <td><c:out value="${fila.fech_naci_alum}"></c:out></td>
                                                        <td><c:out value="${fila.mail_alum}"></c:out></td>
                                                        <td><c:out value="${fila.tele_alum}"></c:out></td>
                                                        <td><c:out value="${fila.dire_alum}"></c:out></td>
                                                        <td><c:out value="${fila.gene_alum}"></c:out></td>
                                                        <c:if test="${fila.esta == 1}">
                                                        <td> <input type="radio" name="codiRadi" value="${fila.codi}"/></td>
                                                        </c:if>
                                                    </tr>
                                                </c:forEach>
                                            </tbody>
                                        </table>
                                  </section>  
                                      <input type="submit" name="accionBtn" value="Consultar" class="btn btn-default" />                      
                              </div>
                          </div>
                      </div>
              </section><! --/wrapper -->
          
      </section><!-- /MAIN CONTENT -->
      </form>
      <!--main content end-->
      <!--footer start-->
      <jsp:include page="INCLUDES/FOOTER.jsp" flush="true" />
      <!--footer end-->
  </section>

    <!-- js placed at the end of the document so the pages load faster -->
    <script src="assets/js/jquery.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script class="include" type="text/javascript" src="assets/js/jquery.dcjqaccordion.2.7.js"></script>
    <script src="assets/js/jquery.scrollTo.min.js"></script>
    <script src="assets/js/jquery.nicescroll.js" type="text/javascript"></script>


    <!--common script for all pages-->
    <script src="assets/js/common-scripts.js"></script>

    <!--script for this page-->
    <script src="assets/js/jquery-ui-1.9.2.custom.min.js"></script>

	<!--custom switch-->
	<script src="assets/js/bootstrap-switch.js"></script>
	
	<!--custom tagsinput-->
	<script src="assets/js/jquery.tagsinput.js"></script>
	
	<!--custom checkbox & radio-->
	<script type="text/javascript" src="assets/js/bootstrap-inputmask/bootstrap-inputmask.min.js"></script>
	

  </body>
</html>
