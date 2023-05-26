public class ProgToDos_v1{
    public static void main(String args[]){
        
        LibretaPendientes libretaPersonal;
        FabricaConsultaPendientes fabrica = new FabricaConsultaGraficaPendientes();
        Pantalla pantalla = new PantallaGrafica();
        
        libretaPersonal = new LibretaPendientes(3);

        libretaPersonal.agregarPendiente(
                fabrica.consultarPendiente()
                );
        libretaPersonal.agregarPendiente(
                fabrica.consultarPendiente()
                );
        
        pantalla.mostrarLibretaPendientes(libretaPersonal);
                
    }
}