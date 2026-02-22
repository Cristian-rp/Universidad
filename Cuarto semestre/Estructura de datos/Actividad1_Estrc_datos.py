"""
# FUNCIONES POR VALOR
def modificar_numero(num):
    num = 100  # Esto NO afecta al original
    print(f"Dentro de función: num = {num}")

numero_original = 5
print(f"Antes: numero_original = {numero_original}")
modificar_numero(numero_original)
print(f"Después: numero_original = {numero_original}")
print("El número original NO cambió (Función por valor)\n")

"""
# FUNCIONES POR REFERENCIA
def modificar_lista(lista):
    lista.append(4)  # Esto y lo de abajo afecta al original
    lista[0] = 100
    print(f"Dentro de función: lista = {lista}")

lista_original = [1, 2, 3]
print(f"Antes: lista_original = {lista_original}")
modificar_lista(lista_original)
print(f"Después: lista_original = {lista_original}")
print(" La lista original SÍ cambió (Función por referencia)\n")

# DIFERENCIA IMPORTANTE:
def ejemplo_reesignar(lista):
    lista.append(999)     #  MODIFICA el original
    lista = [10, 20, 30]  #  REASIGNA
    print(f"Dentro: lista = {lista}")

mi_lista = [1, 2, 3]
ejemplo_reesignar(mi_lista)
print(f"Fuera: mi_lista = {mi_lista}")
print("Solo la modificación (append) afectó al original")
# demostrando lo anterior dicho alterando la lista original