<?php
    include("conexion.php");
    $codigoabuscar=$_GET["cod"];
    if($resultado=obtenerResultado("SELECT * FROM `estudiantes` where codigo ='$codigoabuscar'")){
        while($fila = $resultado->fetch_array(MYSQLI_NUM)){
            echo json_encode($fila);
        }    
    }
?>