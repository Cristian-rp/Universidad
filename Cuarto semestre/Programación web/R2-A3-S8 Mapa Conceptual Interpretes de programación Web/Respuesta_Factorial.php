<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Respuesta Factorial</title>
</head>
<body>
    <!-- Inicio php -->
    <?php
    if(isset($_POST['calcular'])){
        $num=$_POST['num'];
    }//Cierre if

    //Proceso
    echo '<center><font face=tahoma color=green><h3><br>';
    /*
    //Ciclo for
    $factorial=1; //Variable acumuladora
    for($i=1;$i<=$num;$i++){
        $factorial*=$i;
    }
    echo 'El factoria de '.$num.' es '.$factorial.'<br>';
    */
    
    //Ciclo while
    $factorial=1;
    $i=1;
    while($i<=$num){
        $factorial*=$i;
        $i++;
    }
    echo 'El factoria de '.$num.' es '.$factorial.'<br>';
    ?>
</body>
</html>