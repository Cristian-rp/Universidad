<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Respuesta Numeros Primos</title>
</head>
<body>
    <!-- Inicio php -->
    <?php
    if(isset($_POST['verificar'])){
        $num=$_POST['n'];
    }//Cierre if 1

    //Proceso
    echo '<center><font face=tahoma color=green><h3><br>';
    
    //Ciclo for
    for($n=1;$n<=$num;$n++){
        if($n==2){
            echo $n.' es un numero primo <br>';
        }else if($n<2 || $n%2==0){
            echo $n.' no es un numero primo <br>';
        }else{
            $res=true;

            //Ciclo while
            $i=3;
            while($i<=sqrt($n)){
                if($n%$i==0){
                    echo $n.' no es un numero primo <br>';
                    $res=0;
                }
                $i+=2;
            }
            /*
            //Ciclo for
            for($i=3;$i<=sqrt($n);$i+=2){
                if($n%$i==0){
                    echo $n.' no es un numero primo <br>';
                    $res=0;
                }
            }*/
            if($res == true){
                echo $n.' es un numero primo <br>';
            }  
        }
    }
    ?>
</body>
</html>