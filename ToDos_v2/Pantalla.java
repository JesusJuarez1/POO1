
public class Pantalla{
    public void mostrarPendiente(ToDo unPendiente){
        System.out.println(unPendiente.toString());
    }
    public void mostrarLibretaPendientes(LibretaPendientes unaLibreta){
        System.out.println("-----------");
        for(ToDo unPendiente:unaLibreta.obtenerTodosLosPendientes()){
            mostrarPendiente(unPendiente);
        }
        System.out.println("-----------");
    }
}
// un solo cuadro de dialogo con todo el texto