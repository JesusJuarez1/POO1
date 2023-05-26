public class FabricaPendientes{
    public ToDo crearPendiente(String descripcion){
        ToDo unPendiente = new ToDo();
        unPendiente.descripcion=descripcion;
        unPendiente.estado="activo";
        return unPendiente;
    }
    public ToDo crearPendiente(String descripcion, String estado){
        ToDo unPendiente = new ToDo();
        unPendiente.descripcion=descripcion;
        unPendiente.estado=estado;
        return unPendiente;
    }
}