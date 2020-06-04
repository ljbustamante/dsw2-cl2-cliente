<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html lang="esS">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap-theme.min.css" rel="stylesheet">
<link href="css/bootstrapValidator.min.css" rel="stylesheet">

<link href="css/bootstrap-datepicker.css" rel="stylesheet">

<link href="css/dataTables.bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrapValidator.min.css" rel="stylesheet">


<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrapValidator.min.js"></script>
<script type="text/javascript" src="js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="js/dataTables.bootstrap.min.js"></script>

<script type="text/javascript" src="js/bootstrap-datepicker.min.js"></script>


<script type="text/javascript" src="sweetalert/sweetalert.min.js"></script>




<title>Libro</title>
<style>
.modal-header, h4, .close {
	background-color: #286090;
	color: white !important;
	text-align: center;
	font-size: 20px;
}

.btn-warning, .btn-info {
	width: 100px;
}

.btn-danger, .btn-primary {
	width: 160px;
}
</style>
</head>
<body>
	<c:if test="${sessionScope.MENSAJE!=null}">
		<div class="alert alert-success alert-dismissible">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>Mensaje : </strong>${sessionScope.MENSAJE}
		</div>
		${sessionScope.MENSAJE=null}
	</c:if>


	<div class="container">
		<form id="idRegistra" accept-charset="UTF-8" action="guardarProducto"
			class="form-horizontal" method="post" data-toggle="validator"
			role="form">
			<input type="hidden" id="idProducto" name="idProducto">

			<div class="panel-group" id="steps">
				<!-- Step 1 -->
				<div class="panel panel-default">
					<div class="panel-heading"
						style="text-align: center; font-size: 14px">Registro de nuevo producto</div>
					<div class="panel-body">
						<div class="form-group">
							<label class="col-lg-3 control-label" for="id_reg_nombre">Nombre</label>
							<div class="col-lg-5">
								<input class="form-control" id="nombre" name="producto.nombre"
									placeholder="Ingrese el Nombre" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-3 control-label" for="id_reg_marca">Marca</label>
							<div class="col-lg-5">
								<input class="form-control" id="marca" name="producto.marca"
									placeholder="Ingrese la marca" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-3 control-label" for="id_reg_precio">Precio</label>
							<div class="col-lg-5">
								<input class="form-control" id="precio" name="producto.precio"
									placeholder="Ingrese el precio" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-3 control-label" for="id_reg_stock">Stock</label>
							<div class="col-lg-5">
								<input class="form-control" id="stock" name="producto.stock"
									placeholder="Ingrese stock" />
							</div>
						</div>
					</div>
					<div class="modal-footer"
						style="padding: 5px 20px; text-align: center">
						<a href="consulta.jsp" class="btn btn-info">Volver</a>
						<button type="submit" class="btn btn-primary" id="validatetBtn">Registrar
							Producto</button>
					</div>
				</div>
			</div>
		</form>
	</div>

	<script type="text/javascript">
		$(document)
				.ready(
						function() {
							//validar registra nuevo empleado
							$('#idRegistra')
									.bootstrapValidator(
											{
												message : 'This value is not valid',
												feedbackIcons : {
													valid : 'glyphicon glyphicon-ok',
													invalid : 'glyphicon glyphicon-remove',
													validating : 'glyphicon glyphicon-refresh'
												},
												fields : {
													nombre : {

														selector : '#nombre',
														validators : {
															notEmpty : {
																message : 'El campo Nombre es requerido. No puede estar vacio'
															},
															stringLength : {
																min : 3,
																max : 30,
																message : 'El nombre debe contener minimo 3 y maximo de 30 letras'
															}
														}
													},
													marca : {

														selector : '#marca',
														validators : {
															notEmpty : {
																message : 'El campo Marca es requerido. No puede estar vacio'
															},
															stringLength : {
																min : 3,
																max : 30,
																message : 'La marca debe contener minimo 3 y maximo de 30 letras'
															}
														}
													},
													precio : {
														selector : '#precio',
														validators : {
															notEmpty : {
																message : 'El campo Precio es requerido. No puede estar vacio'
															}
														}
													}

												}
											});
						});
	</script>


</body>
</html>












