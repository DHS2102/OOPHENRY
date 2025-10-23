// Clase independiente para el cálculo de áreas geométricas
// No usa librerías externas, solo operaciones básicas

public class Areas {

    // Área del cuadrado = lado^2
    public double areaCuadrado(double lado) {
        return lado * lado;
    }

    // Área del rectángulo = base * altura
    public double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    // Área de la circunferencia = π * radio^2 (con π aproximado)
    public double areaCircunferencia(double radio) {
        double pi = 3.1416;
        return pi * radio * radio;
    }

    // Área del triángulo rectángulo = (base * altura) / 2
    public double areaTrianguloRectangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}
