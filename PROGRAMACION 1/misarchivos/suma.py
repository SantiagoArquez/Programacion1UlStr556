print("Ingresa números para sumarlos:")
x = 0
while True:
    try:
        num = float(input("Número (o 'salir' para terminar): "))
        x += num
    except ValueError:
        print("Suma total:", x)
        break
