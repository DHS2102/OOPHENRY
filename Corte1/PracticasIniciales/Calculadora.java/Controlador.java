// Clase CONTROLADOR: coordina la comunicación entre la Vista y el Modelo

public class Controlador {
  private Modelo modelo;
  private Vista vista;
  private Areas areas; // Instancia de la clase Areas

  // Constructor: conecta modelo, vista y clase de áreas
  public Controlador(Modelo modelo, Vista vista) {
    this.modelo = modelo;
    this.vista = vista;
    this.areas = new Areas();
  }

  // Método principal que controla el flujo del programa
  public void iniciar() {
    int opcion;

    do {
      // Muestra el menú principal al usuario
      opcion = vista.mostrarMenu();

      switch (opcion) {
        case 0: // SUMA
          vista.mostrarResultado(
              modelo.sumar(
                  vista.pedirNumero("Ingrese el primer número:"),
                  vista.pedirNumero("Ingrese el segundo número:")));
          break;

        case 1: // RESTA
          vista.mostrarResultado(
              modelo.restar(
                  vista.pedirNumero("Ingrese el primer número:"),
                  vista.pedirNumero("Ingrese el segundo número:")));
          break;

        case 2: // MULTIPLICACIÓN
          vista.mostrarResultado(
              modelo.multiplicar(
                  vista.pedirNumero("Ingrese el primer número:"),
                  vista.pedirNumero("Ingrese el segundo número:")));
          break;

        case 3: // División
          try {
            double a = vista.pedirNumero("Ingrese el dividendo:");
            double b = vista.pedirNumero("Ingrese el divisor:");
            double resultado = modelo.dividir(a, b);
            vista.mostrarResultado(resultado);
          } catch (ArithmeticException e) {
            vista.mostrarError(e.getMessage());
          }
          break;

        case 4: // POTENCIACIÓN
          double base = vista.pedirNumero("Ingrese la base:");
          int exponente = (int) vista.pedirNumero("Ingrese el exponente (entero):");
          vista.mostrarResultado(modelo.potenciar(base, exponente));
          break;

        case 5: // RAÍZ CUADRADA
          double numero = vista.pedirNumero("Ingrese el número:");
          vista.mostrarResultado(modelo.raizCuadrada(numero));
          break;

        case 6: // FACTORIZAR
          int n = (int) vista.pedirNumero("Ingrese un número entero:");
          vista.mostrarResultado(modelo.factorizar(n));
          break;

        case 7: // SUBMENÚ DE ÁREAS
          int subopcion = vista.mostrarMenuAreas();

          switch (subopcion) {
            case 0: // Cuadrado
              double lado = vista.pedirNumero("Ingrese el lado del cuadrado:");
              vista.mostrarResultado(areas.areaCuadrado(lado));
              break;

            case 1: // Rectángulo
              double baseR = vista.pedirNumero("Ingrese la base del rectángulo:");
              double alturaR = vista.pedirNumero("Ingrese la altura del rectángulo:");
              vista.mostrarResultado(areas.areaRectangulo(baseR, alturaR));
              break;

            case 2: // Circunferencia
              double radio = vista.pedirNumero("Ingrese el radio de la circunferencia:");
              vista.mostrarResultado(areas.areaCircunferencia(radio));
              break;

            case 3: // Triángulo rectángulo
              double baseT = vista.pedirNumero("Ingrese la base del triángulo:");
              double alturaT = vista.pedirNumero("Ingrese la altura del triángulo:");
              vista.mostrarResultado(areas.areaTrianguloRectangulo(baseT, alturaT));
              break;
          }
          break;

        case 8: // SALIR
          vista.mostrarMensaje("Saliendo del programa...");
          break;

        default:
          vista.mostrarMensaje("Opción inválida.");
      }
    } while (opcion != 8);
  }
}
