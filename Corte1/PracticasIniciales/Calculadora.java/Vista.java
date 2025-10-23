import javax.swing.JOptionPane;

// Clase VISTA: se encarga de la interacción con el usuario
// Muestra menús, solicita datos y presenta resultados

public class Vista {

    // Menú principal de operaciones
    public int mostrarMenu() {
        String[] opciones = {
                "Sumar", "Restar", "Multiplicar", "Dividir",
                "Potenciación", "Raíz Cuadrada", "Factorizar", "Áreas", "Salir"
        };

        return JOptionPane.showOptionDialog(
                null,
                "Seleccione una operación:",
                "Calculadora OOP",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]);
    }

    // Submenú para las operaciones de áreas
    public int mostrarMenuAreas() {
        String[] opciones = {
                "Cuadrado", "Rectángulo", "Circunferencia", "Triángulo Rectángulo"
        };

        return JOptionPane.showOptionDialog(
                null,
                "Seleccione el área a calcular:",
                "Áreas Geométricas",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]);
    }

    // Solicita un número con validación
    public double pedirNumero(String mensaje) {
        while (true) {
            try {
                return Double.parseDouble(JOptionPane.showInputDialog(mensaje));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Intente de nuevo con un número.");
            }
        }
    }

    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Muestra el resultado de una operación
    public void mostrarResultado(double resultado) {
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }

    // Muestra un mensaje simple
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void mostrarResultado(String resultado) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarResultado'");
    }
}
