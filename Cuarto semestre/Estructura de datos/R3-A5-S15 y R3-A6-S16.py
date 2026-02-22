
# Clase para crear los nodos del arbol
class Nodo:
    def __init__(self, dato):
        self.dato = dato  # valor que guarda el nodo
        self.izquierdo = None  # apuntador al hijo izquierdo
        self.derecho = None  # apuntador al hijo derecho


# Clase principal del arbol binario
class ArbolBinario:
    def __init__(self):
        self.raiz = None  # inicialmente el arbol esta vacio
    
    # Metodo para insertar un nuevo dato en el arbol
    def insertar(self, dato):
        if self.raiz is None:
            # si el arbol esta vacio, el nuevo nodo es la raiz
            self.raiz = Nodo(dato)
            print(f"Dato {dato} insertado como raiz")
        else:
            # si ya hay raiz, llamamos al metodo recursivo
            self._insertar_recursivo(self.raiz, dato)
    
    # Metodo auxiliar recursivo para insertar
    def _insertar_recursivo(self, nodo, dato):
        if dato < nodo.dato:
            # si el dato es menor, va a la izquierda
            if nodo.izquierdo is None:
                nodo.izquierdo = Nodo(dato)
                print(f"Dato {dato} insertado")
            else:
                self._insertar_recursivo(nodo.izquierdo, dato)
        elif dato > nodo.dato:
            # si el dato es mayor, va a la derecha
            if nodo.derecho is None:
                nodo.derecho = Nodo(dato)
                print(f"Dato {dato} insertado")
            else:
                self._insertar_recursivo(nodo.derecho, dato)
        else:
            # si el dato ya existe no lo insertamos
            print(f"El dato {dato} ya existe en el arbol")
    
    # Recorrido inorden: Izquierda -> Raiz -> Derecha
    def inorden(self):
        print("\nRecorrido In-orden:")
        if self.raiz is None:
            print("El arbol esta vacio")
        else:
            self._inorden_recursivo(self.raiz)
            print()  # salto de linea al final
    
    def _inorden_recursivo(self, nodo):
        if nodo:
            self._inorden_recursivo(nodo.izquierdo)  # primero el subarbol izquierdo
            print(nodo.dato, end=" ")  # luego imprimimos la raiz
            self._inorden_recursivo(nodo.derecho)  # finalmente el subarbol derecho
    
    # Recorrido postorden: Izquierda -> Derecha -> Raiz
    def postorden(self):
        print("\nRecorrido Post-orden:")
        if self.raiz is None:
            print("El arbol esta vacio")
        else:
            self._postorden_recursivo(self.raiz)
            print()
    
    def _postorden_recursivo(self, nodo):
        if nodo:
            self._postorden_recursivo(nodo.izquierdo)  # primero izquierda
            self._postorden_recursivo(nodo.derecho)  # luego derecha
            print(nodo.dato, end=" ")  # al final la raiz
    
    # Recorrido preorden: Raiz -> Izquierda -> Derecha
    def preorden(self):
        print("\nRecorrido Pre-orden:")
        if self.raiz is None:
            print("El arbol esta vacio")
        else:
            self._preorden_recursivo(self.raiz)
            print()
    
    def _preorden_recursivo(self, nodo):
        if nodo:
            print(nodo.dato, end=" ")  # primero imprimimos la raiz
            self._preorden_recursivo(nodo.izquierdo)  # luego izquierda
            self._preorden_recursivo(nodo.derecho)  # y por ultimo derecha


# Funcion que muestra el menu principal
def mostrar_menu():
    print("\n========================================")
    print("   ARBOL BINARIO ORDENADO")
    print("========================================")
    print("1. Insertar dato")
    print("2. Imprimir en In-orden")
    print("3. Imprimir en Post-orden")
    print("4. Imprimir en Pre-orden")
    print("5. Salir")
    print("========================================")


# Funcion principal del programa
def main():
    arbol = ArbolBinario()  # creamos un arbol vacio
    
    # ciclo principal del programa
    while True:
        mostrar_menu()
        opcion = input("\nSeleccione una opcion (1-5): ")
        
        # opcion 1: insertar dato
        if opcion == "1":
            try:
                dato = int(input("Ingrese el numero a insertar: "))
                arbol.insertar(dato)
            except:
                print("Error: debe ingresar un numero valido")
        
        # opcion 2: mostrar inorden
        elif opcion == "2":
            arbol.inorden()
        
        # opcion 3: mostrar postorden
        elif opcion == "3":
            arbol.postorden()
        
        # opcion 4: mostrar preorden
        elif opcion == "4":
            arbol.preorden()
        
        # opcion 5: salir del programa
        elif opcion == "5":
            print("\nGracias por usar el programa!")
            break
        
        # si ingresa una opcion invalida
        else:
            print("\nOpcion no valida, intente de nuevo")


# ejecutar el programa
if __name__ == "__main__":
    main()