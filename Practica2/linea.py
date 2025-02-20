from punto import Punto

class Linea:
    def __init__(self, p1: Punto, p2: Punto):
        self.p1 = p1
        self.p2 = p2
    
    def __str__(self):
        return f"Linea(p1={self.p1}, p2={self.p2})"
    
    def dibujaLinea(self):
        print(f"Dibujando línea desde {self.p1} hasta {self.p2}")

# Ejemplo de uso:
if __name__ == "__main__":
    p1 = Punto(0, 0)
    p2 = Punto(3, 4)
    linea = Linea(p1, p2)
    print(linea)
    linea.dibujaLinea()
