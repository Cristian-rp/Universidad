def hanoi(n, origen, auxiliar, destino, movimientos):
    # Caso base: si solo hay 1 disco, moverlo directamente
    if n == 1:
        movimientos.append(f"Mover disco 1 de {origen} a {destino}")
        print(f"Mover disco 1 de {origen} → {destino}")
        return
    
    # Paso 1: Mover n-1 discos de origen a auxiliar (usando destino como apoyo)
    hanoi(n - 1, origen, destino, auxiliar, movimientos)
    
    # Paso 2: Mover el disco más grande de origen a destino
    movimientos.append(f"Mover disco {n} de {origen} a {destino}")
    print(f"Mover disco {n} de {origen} → {destino}")
    
    # Paso 3: Mover n-1 discos de auxiliar a destino (usando origen como apoyo)
    hanoi(n - 1, auxiliar, origen, destino, movimientos)


# Función para visualizar las torres
def visualizar_torres(torres):
    """
    Muestra el estado actual de las tres torres.
    """
    print("\n" + "="*50)
    
    # Encontrar la altura máxima
    altura_maxima = max(len(torres['A']), len(torres['B']), len(torres['C']))
    
    # Imprimir cada nivel desde arriba hacia abajo
    for nivel in range(altura_maxima - 1, -1, -1):
        linea = ""
        for torre_nombre in ['A', 'B', 'C']:
            if nivel < len(torres[torre_nombre]):
                disco = torres[torre_nombre][nivel]
                linea += f"  {disco}  "
            else:
                linea += "  |  "
        print(linea)
    
    # Imprimir las bases
    print("-----" * 3)
    print("  A    B    C  ")
    print("="*50 + "\n")


# Función recursiva con visualización
def hanoi_visual(n, origen, auxiliar, destino, torres):
    """
    Resuelve Torres de Hanoi mostrando cada paso visualmente.
    """
    # Caso base: mover un solo disco
    if n == 1:
        print(f"\n→ Mover disco 1 de {origen} a {destino}")
        disco = torres[origen].pop()
        torres[destino].append(disco)
        visualizar_torres(torres)
        return
    
    # Paso 1: Mover n-1 discos a auxiliar
    hanoi_visual(n - 1, origen, destino, auxiliar, torres)
    
    # Paso 2: Mover el disco más grande a destino
    print(f"\n→ Mover disco {n} de {origen} a {destino}")
    disco = torres[origen].pop()
    torres[destino].append(disco)
    visualizar_torres(torres)
    
    # Paso 3: Mover n-1 discos de auxiliar a destino
    hanoi_visual(n - 1, auxiliar, origen, destino, torres)


# Programa principal
if __name__ == "__main__":
    print("="*20)
    print("  TORRES DE HANOI  ")
    print("="*20)
    
    # Solicitar número de discos
    n = int(input("\n¿Cuántos discos? (2-8): "))
    
    # Calcular movimientos mínimos necesarios
    movimientos_minimos = (2 ** n) - 1
    print(f"\nMovimientos mínimos necesarios: {movimientos_minimos}")
    
    # Preguntar si quiere ver la visualización
    opcion = input("\n¿Ver solución paso a paso? (s/n): ").lower()
    
    if opcion == 's':
        # Inicializar torres
        torres = {
            'A': list(range(n, 0, -1)),  # Torre A con todos los discos
            'B': [],                      # Torre B vacía
            'C': []                       # Torre C vacía
        }
        
        print("\nEstado inicial:")
        visualizar_torres(torres)
        
        input("Presiona Enter para comenzar...")
        
        # Resolver con visualización
        hanoi_visual(n, 'A', 'B', 'C', torres)
        
        print(f"\n¡Completado! {movimientos_minimos} movimientos realizados")
        
    else:
        # Resolver sin visualización
        movimientos = []
        print()
        hanoi(n, 'A', 'B', 'C', movimientos)
        print(f"\nTotal de movimientos: {len(movimientos)}")