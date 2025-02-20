from punto import Punto

class Circulo:
    def __init__(self, centro: Punto, radio: float):
        self.centro = centro
        self.radio = radio
    
    def __str__(self):
        return f"Circulo(centro={self.centro}, radio={self.radio})"
    
    def dibujaCirculo(self):
        print(f"Dibujando círculo con centro {self.centro} y radio {self.radio}")

# Ejemplo de uso:
if __name__ == "__main__":
    c = Circulo(Punto(2, 2), 5)
    print(c)
    c.dibujaCirculo()
