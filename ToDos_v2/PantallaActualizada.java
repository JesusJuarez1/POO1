public class PantallaActualizada extends Pantalla{
    public void mostrarPendiente(ToDo unPendiente){
        if(unPendiente==null){
            System.out.println("Vacio");
        }else{
            super.mostrarPendiente(unPendiente);
        }
    }
}