// Clase MODELO: contiene la lógica de los cálculos matemáticos
// Incluye operaciones básicas y las nuevas (potencia, raíz cuadrada, factorial)

public class Modelo {

    // ===== Operaciones básicas =====
    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Método de división con manejo de excepción
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir en cero");
        }
        return a / b;
    }

    // ===== Nueva operación: POTENCIACIÓN =====
    // Calcula base^exponente sin usar Math.pow()
    public double potenciar(double base, int exponente) {
        double resultado = 1;

        // Multiplica la base tantas veces como indique el exponente
        for (int i = 0; i < Math.abs(exponente); i++) {
            resultado *= base;
        }

        // Si el exponente es negativo, se devuelve el inverso
        if (exponente < 0) {
            resultado = 1 / resultado;
        }
        return resultado;
    }

    // ===== Nueva operación: RAÍZ CUADRADA =====
    // Calcula la raíz cuadrada por aproximación (método de Newton-Raphson)
    public double raizCuadrada(double numero) {
        if (numero < 0) {
            System.out.println("Error: no se puede calcular la raíz de un número negativo.");
            return 0;
        }

        double aprox = numero / 2; // valor inicial
        double mejor = 0;

        // Se realiza una aproximación iterativa
        for (int i = 0; i < 10; i++) {
            mejor = 0.5 * (aprox + numero / aprox);
            aprox = mejor;
        }
        return mejor;
    }

    // ===== Nueva operación: FACTORIZAR =====
    // Calcula n! (producto de todos los enteros desde 1 hasta n)
    public long factorizar(int n) {
        if (n < 0) {
            System.out.println("Error: el factorial no está definido para negativos.");
            return 0;
        }
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
