<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Respuesta Par o Impar</title>
</head>
<body>
    <!-- Inicio php -->
    <?php
    if(isset($_POST['verificar'])){
        $n=$_POST['n'];
    }//cierre if

    //Proceso
    echo '<center><font face=tahoma color=green><h3><br>';
    $sumapar=0;
    $sumaimpar=0;
    /*
    //Ciclo for
    for($i=1;$i<=$n;$i++){
        if($i%2==0){
            echo $i.' es un numero par <br>';
            $sumapar+=$i;
        }else{
            echo $i.' es un numero impar <br>';
            $sumaimpar+=$i;
        }
    }
    echo 'La suma de los numeros pares es: '.$sumapar.'<br>';
    echo 'La suma de los numeros impares es: '.$sumaimpar.'<br>';
    */
    //Ciclo while
    $i=1;
    while($i<=$n){
        if($i%2==0){
            echo $i.' es un numero par <br>';
            $sumapar+=$i;
        }else{
            echo $i.' es un numero impar <br>';
            $sumaimpar+=$i;
        }
        $i++;
    }
    echo 'La suma de los numeros pares es: '.$sumapar.'<br>';
    echo 'La suma de los numeros impares es: '.$sumaimpar.'<br>';
    ?>
</body>
</html>