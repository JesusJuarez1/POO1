public class ToDo{
    public String descripcion;
    public String estado;
    // El metodo toString es ampliamente utilizado
    // Se utiliza para crear una representacion en forma de String de un objeto
    public String toString(){
        return descripcion+"->"+estado;
    }
}