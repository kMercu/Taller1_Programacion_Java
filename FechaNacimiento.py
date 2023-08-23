from datetime import datetime

def calcular_edad(fecha_nacimiento):
    # Se obtiene la fecha actual
    fecha_actual = datetime.now()
    
    # Aqui se crea una fecha para el cumpleaños de este año
    cumpleanos = fecha_nacimiento.replace(year=fecha_actual.year)
    
    # En esta parte se calcula la edad teniendo en cuenta si el cumpleaños ya pasó o no
    if cumpleanos > fecha_actual:
        edad = fecha_actual.year - fecha_nacimiento.year - 1
    else:
        edad = fecha_actual.year - fecha_nacimiento.year
    
    return edad

def main():
    try:
        # Como en Java, pedimos la fecha de nacimiento al usuario
        fecha_nacimiento_str = input("Por favor, ingrese su fecha de nacimiento (YYYY-MM-DD): ")
        fecha_nacimiento = datetime.strptime(fecha_nacimiento_str, "%Y-%m-%d")
        
        # Segun los datos proporcionados se calcula la edad de la persona
        edad = calcular_edad(fecha_nacimiento)
        
        # Se imprime su edad y con el except evitamos posibles errores  
        print("Su edad es:", edad, "años.")
    except ValueError:
        print("Oops, parece que la fecha está en un formato incorrecto. Use YYYY-MM-DD.")

if __name__ == "__main__":
    main()