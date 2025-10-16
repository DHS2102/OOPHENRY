import ClaseOperaciones

def main():
    obj = ClaseOperaciones.OperacionesBasicas()

    while True:
        print("\n=== MENÚ DE OPERACIONES BÁSICAS ===")
        print("1. Sumar")
        print("2. Restar")
        print("3. Multiplicar")
        print("4. Dividir")
        print("5. Salir")

        opcion = input("Elige una opción: ")

        if opcion == '5':
            print("¡Hasta luego!")
            break

        # Ingreso de valores
        try:
            val1 = float(input("Ingresa el primer número: "))
            val2 = float(input("Ingresa el segundo número: "))
        except ValueError:
            print("❌ Error: debes ingresar valores numéricos.")
            continue

        obj.setVal(val1)
        obj.setVal2(val2)

        if opcion == '1':
            obj.sumar(val1, val2)
            print("✅ Resultado de la suma:", obj.getR())

        elif opcion == '2':
            obj.restar(val1, val2)
            print("✅ Resultado de la resta:", obj.getR())

        elif opcion == '3':
            obj.multiplicar(val1, val2)
            print("✅ Resultado de la multiplicación:", obj.getR())

        elif opcion == '4':
            obj.dividir(val1, val2)
            print("✅ Resultado de la división:", obj.getR())

        else:
            print("❌ Opción no válida. Intenta nuevamente.")

if __name__ == "__main__":
    main()
