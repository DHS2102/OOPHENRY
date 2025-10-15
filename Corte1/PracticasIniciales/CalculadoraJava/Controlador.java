public class Controlador{
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar(){
    int opcion = 0;

    do {
      opcion = vista.mostrarMenu();
      if(opcion >= 1 && opcion <= 4){
        double numero1 = vista.pedirNumero("Ingrese el primer numero: ");
        if (Double.isNaN(numero1)) continue;

        double numero2 = vista.pedirNumero("Ingrese el segundo numero: ");
        if (Double.isNaN(numero2)) continue;

      try {
        double resultado = 0;
        switch (opcion) {
          case 1:
            resultado = modelo.sumar(numero1, numero2);
            break;

          case 2:
            resultado = modelo.restar(numero1, numero2);
            break;

          case 3:
            resultado = modelo.multiplicar(numero1, numero2);
            break;

          case 4:
            resultado = modelo.dividir(numero1, numero2);
            break;

        }vista.mostrarR(resultado);

      } catch (ArithmeticException e) {
        vista.mostrarMensaje("Error: " + e.getMessage());
      }

    } else if (opcion == 5) {
        vista.mostrarMensaje("Opción no válida. Por favor, intente de nuevo.");
      }
    }

    while (opcion != 5);
    vista.mostrarMensaje("Gracias por usar la calculadora. ¡Hasta luego!");
  }
}
