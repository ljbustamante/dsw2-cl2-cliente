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
	<div class="container">
		<h3 align="center">Consulta de Productos</h3><br />
		<a class="btn btn-success" href="producto.jsp">Nuevo producto</a><br /><br />
		<form class="form-inline">
			<div class="form-group">
				<label for="minimo">Precio mínimo</label>
				<input
					class="form-control" id="minimo" name="minimo"
					placeholder="Ingrese precio mínimo" />
				<label for="maximo">Precio máximo</label>
				<input
					class="form-control" id="maximo" name="maximo"
					placeholder="Ingrese precio máximo" />
				<button type="button" class="btn btn-primary" id="validatetBtn">Consulta</button>
			</div>
		</form>
		
		<br>
		<p>
		<div id="divProductos">
			<table id="listado" class="table table-striped table-bordered">
				<thead>
					<tr>
						<th>Codigo</th>
						<th>Nombre</th>
						<th>Marca</th>
						<th>Precio</th>
						<th>Stock</th>
					</tr>
				</thead>
				<tbody>

				</tbody>
			</table>

		</div>
	</div>


	<script type="text/javascript">
		$(".btn-primary").click(
				function() {
					var min, max;
					min = $("#minimo").val();
					max = $("#maximo").val();
					$("#listado tbody").empty();
					$.getJSON("listarProductosRangoPrecio", {
						minimo: min, 
						maximo: max
					}, function(response) {
						$.each(response.listaProductos, function(index, item) {
							$("#listado").append(
									"<tr><td>" + item.idProducto + "</td><td>"
											+ item.nombre + "</td><td>"
											+ item.marca + "</td><td>"
											+ item.precio + "</td><td>"
											+ item.stock + "</td></tr>");
						})
					})

				})
	</script>

</body>
</html>












