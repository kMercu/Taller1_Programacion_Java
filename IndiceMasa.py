def calcular_riesgo_enfermedad_coronaria(edad, imc):
    return 0.5 * edad + 0.7 * imc

edad = float(input("Ingresa tu edad: "))
imc = float(input("Ingresa tu índice de masa corporal (IMC): "))
riesgo = calcular_riesgo_enfermedad_coronaria(edad, imc)
print(f"El riesgo estimado de enfermedades coronarias es: {riesgo}%")