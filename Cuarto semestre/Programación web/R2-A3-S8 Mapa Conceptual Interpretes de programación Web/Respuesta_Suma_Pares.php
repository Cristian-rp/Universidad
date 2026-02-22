<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Repuesta Suma de Numeros Pares</title>
</head>
<body>
    <!--Inicio php-->
    <?php
    if(isset($_POST['realizar'])){
        $n = $_POST['num'];
    }//Cierre if

    //Proceso
    echo '<center><font face=tahoma color=green><h3><br>';
    //Ciclo while
    $i=1;
    $suma=0; //Variable acumuladora
    while($i<=$n){
        if($i%2==0){
            $suma+=$i;
        }//Cierre if
        $i++;
    }
    echo 'La suma de los numeros es '.$suma.'<br>';
    /*
    //Ciclo for
    $suma=0; //Variable acumuladora
    for($i=1;$i<=$n;$i++){
        if($i%2 == 0){
            $suma += $i;
        }//Cierre if
    }
    echo 'La suma de los numeros es '.$suma.'<br>';
    */
    ?>
</body>
</html>