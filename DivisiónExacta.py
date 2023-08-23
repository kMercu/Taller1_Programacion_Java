def main():
    numero1 = int(input("Dividendo: "))
    numero2 = int(input("Divisor: "))

    division = numero1 // numero2
    residuo = numero1 % numero2

    if residuo == 0:
        print("La división es exacta.")
    else:
        print("La división no es exacta.")

    print("Cociente:", division)
    print("Residuo:", residuo)

# En Java creamos un objeto para llamar a la clase, pero en Python usamos la siguiente linea:
main()