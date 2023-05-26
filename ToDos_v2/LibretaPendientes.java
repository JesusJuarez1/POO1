
public class LibretaPendientes{
    ToDo listaPendientes[];
    public LibretaPendientes(){
        listaPendientes = new ToDo[5];
    }
    public LibretaPendientes(int numPendientes){
        listaPendientes = new ToDo[numPendientes];
    }
    public void agregarPendiente(ToDo nuevoPendiente){
        int posicionvacia;
        posicionvacia = encontrarVacio();
        if( posicionvacia != -1){
            listaPendientes[posicionvacia]=nuevoPendiente;
        }else{
            System.out.println("Ya esta lleno");
        }
    }
    public void borrarPendiente(int posicionABorrar){
        listaPendientes[posicionABorrar]=null;
    }
    public void vaciarPendientes(){
        int i;
        for (i = 0; i<listaPendientes.length;i++){
            borrarPendiente(i);
        }
    }
    public void modificarPendiente(int posicion, String nuevaDescripcion){
        listaPendientes[posicion].descripcion=nuevaDescripcion;
    }
    public void cambiarEstado(int posicion, String nuevoEstado){
        listaPendientes[posicion].estado = nuevoEstado;
    }    
    public ToDo obtenerPendiente(int posicion){
        return listaPendientes[posicion];
    }
    public ToDo[] obtenerTodosLosPendientes(){
        return listaPendientes;
    }
    public LibretaPendientes obtenerTodosLosPendientes(String estado){
        LibretaPendientes libretaSalida;
        int numPendientes = contarPendientes(estado);
        libretaSalida = new LibretaPendientes(numPendientes);
        for(ToDo unPendiente:listaPendientes){
            if(unPendiente != null && 
                unPendiente.estado.equalsIgnoreCase(estado)){
                libretaSalida.agregarPendiente(unPendiente);
            }
        }
        return libretaSalida;        
    }
    
    // equals compara contenido
    public int contarPendientes(String estado){
        int contador;
        contador = 0;
        
        for(ToDo unPendiente:listaPendientes){
            // String tiene metodos para comparar contenidos
            // equals, equalsIgnoreCase
            if(unPendiente != null && 
                unPendiente.estado.equalsIgnoreCase(estado)){
                contador++;
            }
        }
        return contador;
    }
    
    
    
    // regresar la posicion de un lugar vacio en el arreglo
    private int encontrarVacio(){
        // Se compara desde la primera posicion del arreglo hasta el ultimo con null
        // Si no hay uno que sea null, es porque esta lleno y regresa -1
        // Si encuentra uno igual a null, se regresa esa posicion
        int i;
        for(i=0; i<listaPendientes.length;i++){
            if(listaPendientes[i] == null){
                // Ya se encontro, y regresa esa posicion
                return i; //i tiene la posicion vacia
            }
        }
        return -1;
    }
}