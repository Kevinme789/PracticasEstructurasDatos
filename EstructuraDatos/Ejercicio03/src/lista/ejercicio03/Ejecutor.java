package lista.ejercicio03;

public class Ejecutor {

    public static void main(String[] args) {
        Metodos obj = new Metodos();
        int opc;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1:
                    obj.insertarPrimeraL();
                    break;
                case 2:
                    obj.insertarSegundaL();
                    break;
                case 3:
                    obj.ordenar(obj.head,1);
                    System.out.println("--Primera Lista--");
                    obj.reporte(obj.head);
                    obj.ordenar(obj.head2,2);
                    System.out.println("--Segunda Lista--");
                    obj.reporte(obj.head2);
                    obj.listaNueva();
                    System.out.println("--Lista Nueva--");
                    obj.reporte(obj.head3);
                    break;

            }
        } while (opc != 0);
    }
}
