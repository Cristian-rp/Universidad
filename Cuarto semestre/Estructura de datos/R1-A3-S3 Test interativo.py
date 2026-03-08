# Sucursales y productos
sucursales = ["restrepo", "ricaurte", "7-ago", "ferias"]
productos = ["sudadera", "balon", "uniforme", "camiseta"]
	
# Creacion de la matriz
ventas = []  
	
for i in range(len(sucursales)):   #len = devuelve el numero de elementos de la lista
    fila = []                      
    for j in range(len(productos)): 
        fila.append(0)             
    ventas.append(fila)
	
# Precios de los productos
precio = [20000, 50000, 120000, 40000]
	
# FUNCIONES 
def registrar_venta():
    suc = input("Sucursal (restrepo, ricaurte, 7-ago, ferias):\n").lower() # conviere todo a minusculas para identificar
    prod = input("Producto (sudadera, balon, uniforme, camiseta):\n").lower()
    cant = int(input("Cantidad:\n"))
	
    if suc in sucursales and prod in productos: # verifica si el valor igresado existe en la lista = TRUE
        i = sucursales.index(suc) # index da la posicion del elemento encotrado (0, 1, 2, 3)
        j = productos.index(prod)
        ventas[i][j] += cant # se le agrega el valor ingresado a cierta posicion
        print("Venta registrada.")
    else:
        print("Sucursal o producto no válido.")

def imprimir_ventas():
    print("\nMatriz de ventas (cantidades):")
    print(productos)
    for i, fila in enumerate(ventas):
        print(f"{sucursales[i]} {fila}")
def total_ventas():
    total = 0
    for i in range(len(sucursales)):
        for j in range(len(productos)):
            total += ventas[i][j] * precio[j]
    print(f"\nTotal en ventas: {total}")
	
def producto_mas_vendido():
    totales = [sum(ventas[i][j] for i in range(len(sucursales))) for j in range(len(productos))]
    max_prod = productos[totales.index(max(totales))]
    print(f"\nProducto más vendido: {max_prod}")
	
def producto_menos_vendido():
    totales = [sum(ventas[i][j] for i in range(len(sucursales))) for j in range(len(productos))]
    min_prod = productos[totales.index(min(totales))]
    print(f"\nProducto menos vendido: {min_prod}")
	
def sucursal_mas_ventas():
    totales = [sum(ventas[i][j] * precio[j] for j in range(len(productos))) for i in range(len(sucursales))]
    max_suc = sucursales[totales.index(max(totales))]
    print(f"\nSucursal con más ventas: {max_suc}")
	
def sucursal_menos_ventas():
    totales = [sum(ventas[i][j] * precio[j] for j in range(len(productos))) for i in range(len(sucursales))]
    min_suc = sucursales[totales.index(min(totales))]
    print(f"\nSucursal con menos ventas: {min_suc}")
	
while True:
    print("\n--- MENÚ ---")
    print("1. Registrar venta")
    print("2. Imprimir matriz de ventas")
    print("3. Total de ventas en dinero")
    print("4. Producto más vendido")
    print("5. Producto menos vendido")
    print("6. Sucursal con más ventas")
    print("7. Sucursal con menos ventas")
    print("8. Salir")


    opcion = input("Elige una opción: ")
	
    match opcion:
        case "1":
            registrar_venta()
        case "2":
            imprimir_ventas()
        case "3":
            total_ventas()
        case "4":
            producto_mas_vendido()
        case "5":
            producto_menos_vendido()
        case "6":
            sucursal_mas_ventas()
        case "7":
            sucursal_menos_ventas()
        case "8":
            print("Saliendo...")
            break
        case _:
	            print("Opción no válida")
