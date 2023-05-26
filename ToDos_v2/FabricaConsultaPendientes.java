import java.util.Scanner;
public class FabricaConsultaPendientes extends FabricaPendientes{
    private Scanner teclado;
    public FabricaConsultaPendientes(){
        teclado = new Scanner(System.in);
    }
    // Preguntar al usuario el pendiente y crear el objeto ToDo
    public ToDo consultarPendiente(){
        String textoPendiente;
        System.out.println("Dame el texto del pendiente");
        textoPendiente = teclado.nextLine();
        ToDo penSalida = crearPendiente(textoPendiente);
        return penSalida;
    }
}