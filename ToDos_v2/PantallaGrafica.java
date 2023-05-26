import javax.swing.JOptionPane;
public class PantallaGrafica extends PantallaActualizada{
    public void mostrarPendiente(ToDo unPendiente){
        JOptionPane.showMessageDialog(null, unPendiente.descripcion);
    }
    public void mostrarLibretaPendientes(LibretaPendientes unaLibreta){
        String cadSalida="-----------\n";
        for(ToDo unPendiente:unaLibreta.obtenerTodosLosPendientes()){
            if(unPendiente != null){
                cadSalida = cadSalida + unPendiente.toString()+"\n";
            }else{
                cadSalida = cadSalida + "Vacio\n";
            }
            
        }
        cadSalida = cadSalida + "-----------";
        JOptionPane.showMessageDialog(null, cadSalida);  
    }
    
}