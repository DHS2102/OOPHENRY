public class AppSuma {
    public static void main(String[] args) throws Exception {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        controlador.iniciar();
    } 
}
