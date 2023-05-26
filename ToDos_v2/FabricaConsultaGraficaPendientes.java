import javax.swing.JOptionPane;
// La clase JOptionPane => permite crear cuadro de dialogos para mostrar un texto y para leer texto
public class FabricaConsultaGraficaPendientes extends FabricaConsultaPendientes{
    //En esta version se usan ventanitas
    // La re-escritura del comportamiento de un método se le llama "Overriding"
    public ToDo consultarPendiente(){
        String textoPendiente;
        //System.out.println("Dame el texto del pendiente");
        //textoPendiente = teclado.nextLine();
        textoPendiente = JOptionPane.showInputDialog(null, "Dame el texto del pendiente");
        ToDo penSalida = crearPendiente(textoPendiente);
        return penSalida;
    }
}