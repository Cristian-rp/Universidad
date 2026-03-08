<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Respuesta Tablas n</title>
</head>
<body>
    <!-- Inicio php -->
     <?php
        if(isset($_POST['realizar'])){
            $n=$_POST['n'];
        }//Cierre if

        //Proceso
        echo '<center><font face=tahoma color=green><h3><br>';
        /*
        //Ciclo for
        for($i=1;$i<=$n;$i++){
            echo '<br>Tabla del '.$i.'<br>';
            for($j=1;$j<=10;$j++){
                $res=$i*$j;
                echo $i.'x'.$j.'='.$res.'<br>';
            }//Cierre for 2
        }//Cierre for 1
        */

        //Ciclo while
        $i=1;
        while($i<=$n){
            echo '<br>Tabla del '.$i.'<br>';
            $j=1;
            while($j<=10){
                $res=$i*$j;
                echo $i.'x'.$j.'='.$res.'<br>';
                $j++;
            }//Cierre while 1
            $i++;
        }//Cierre while 2
     ?>
</body>
</html>