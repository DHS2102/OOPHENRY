import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
//clase vista menu
public class Vista {
    private ImageIcon icono;
    public int mostrarMenu(){

        String[] opciones = {"Sumar","Restar","Multiplicar","Dividir","Salir"};

        int opcion = JOptionPane.showOptionDialog(null, "Seleccione una operacion ", "Calculadora", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        return opcion+1;
    }

    public double pedirNumero(String mensaje){
        while (true) { 
            String valor = (String) JOptionPane.showInputDialog(null, mensaje, "Ingrese un numero", JOptionPane.QUESTION_MESSAGE, icono, null, "");
            if(valor == null){
                mostrarMensaje("operacion invalida");
                return Double.NaN;
            }
            try {
                return Double.parseDouble(valor);
            } catch (NumberFormatException e) {
                mostrarMensaje("ingrese un numero valido");
            }
        }
    }
    public void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "mensaje", JOptionPane.INFORMATION_MESSAGE,icono);
    }

    public void mostrarR(double resultado){
        JOptionPane.showMessageDialog(null, "El resultado es:)" +resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE, icono);
    }
}
