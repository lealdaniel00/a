<?php
    header("Content-type: text/html; charset=utf-8");
    function obtenerResultado($qwery){
        $mysli=new mysqli("localhost","root","","maestria1");
        if($mysli->connect_error) {
            echo "".$mysli->connect_error."";
            exit(); 
        }
        if($mysli->multi_query($qwery)){
            return $mysli->store_result();
        }
        $mysli->close();
    }
?>