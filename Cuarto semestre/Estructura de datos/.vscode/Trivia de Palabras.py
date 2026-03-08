# Clase Nodo: Representa cada nodo en la lista simple
class Nodo:
    def __init__(self, cedula, nombre):
        self.cedula = cedula
        self.nombre = nombre
        self.siguiente = None
    
    def __str__(self):
        return f"Cedula: {self.cedula} | Nombre: {self.nombre}"


# Clase ListaSimple: Gestiona la lista enlazada de clientes
class ListaSimple:
    def __init__(self):
        self.cabeza = None
    
    # Método para verificar si la lista está vacía
    def esta_vacia(self):
        return self.cabeza is None
    
    # Método para insertar un cliente de forma ordenada
    def insertar_cliente(self, cedula, nombre):
        nuevo_nodo = Nodo(cedula, nombre)
        
        # Si la lista está vacía
        if self.esta_vacia():
            self.cabeza = nuevo_nodo
            print("✓ Cliente insertado correctamente (primera posición)")
            return
        
        # Si el nuevo cliente va al inicio (ordenado por cédula)
        if cedula < self.cabeza.cedula:
            nuevo_nodo.siguiente = self.cabeza
            self.cabeza = nuevo_nodo
            print("✓ Cliente insertado correctamente (inicio)")
            return
        
        # Buscar la posición correcta
        actual = self.cabeza
        while (actual.siguiente is not None and 
               cedula > actual.siguiente.cedula):
            actual = actual.siguiente
        
        # Verificar si la cédula ya existe
        if actual.siguiente is not None and cedula == actual.siguiente.cedula:
            print("✗ Error: Esta cédula ya existe en la lista")
            return
        
        # Insertar el nodo
        nuevo_nodo.siguiente = actual.siguiente
        actual.siguiente = nuevo_nodo
        print("✓ Cliente insertado correctamente")
    
    # Método para listar clientes de izquierda a derecha
    def listar_clientes(self):
        if self.esta_vacia():
            print("\n✗ La lista está vacía")
            return
        
        print("\n" + "=" * 40)
        print("LISTADO DE CLIENTES")
        print(f"Total de clientes: {self.contar_clientes()}")
        print("-" * 40)
        
        actual = self.cabeza
        contador = 1
        
        while actual is not None:
            print(f"{contador}. {actual}")
            actual = actual.siguiente
            contador += 1
        
        print("=" * 40 + "\n")
    
    # Método para contar clientes
    def contar_clientes(self):
        contador = 0
        actual = self.cabeza
        while actual is not None:
            contador += 1
            actual = actual.siguiente
        return contador


# Clase GestorClientes: Menú y control de la aplicación
class GestorClientes:
    def __init__(self):
        self.lista = ListaSimple()
    
    # Método para mostrar el menú
    def mostrar_menu(self):
        print("╔════════════════════════════════════════╗")
        print("║           MENÚ DE OPCIONES             ║")
        print("╠════════════════════════════════════════╣")
        print("║ 1. Insertar cliente                    ║")
        print("║ 2. Listar clientes hacia la derecha    ║")
        print("║ 3. Salir                               ║")
        print("╚════════════════════════════════════════╝")
        print("Seleccione una opción: ", end="")
    
    # Método para obtener y validar la opción
    def obtener_opcion(self):
        try:
            opcion = int(input())
        except ValueError:
            opcion = -1
        return opcion
    
    # Método para insertar un cliente
    def insertar_cliente(self):
        print("\n--- INSERTAR NUEVO CLIENTE ---")
        
        cedula = input("Ingrese la cédula: ").strip()
        
        if not cedula:
            print("✗ La cédula no puede estar vacía\n")
            return
        
        nombre = input("Ingrese el nombre: ").strip()
        
        if not nombre:
            print("✗ El nombre no puede estar vacío\n")
            return
        
        self.lista.insertar_cliente(cedula, nombre)
        print()
    
    # Método para salir de la aplicación
    def salir(self):
        print("\n╔════════════════════════════════════════╗")
        print("║  ¡Gracias por usar el Gestor de        ║")
        print("║        Clientes! ¡Hasta luego!         ║")
        print("╚════════════════════════════════════════╝")
    
    # Método principal para ejecutar la aplicación
    def ejecutar(self):
        print("╔════════════════════════════════════════╗")
        print("║   GESTOR DE CLIENTES - LISTA SIMPLE    ║")
        print("╚════════════════════════════════════════╝\n")
        
        while True:
            self.mostrar_menu()
            opcion = self.obtener_opcion()
            
            if opcion == 1:
                self.insertar_cliente()
            elif opcion == 2:
                self.lista.listar_clientes()
            elif opcion == 3:
                self.salir()
                break
            else:
                print("✗ Opción no válida. Intente de nuevo.\n")


# Punto de entrada del programa
if __name__ == "__main__":
    gestor = GestorClientes()
    gestor.ejecutar()