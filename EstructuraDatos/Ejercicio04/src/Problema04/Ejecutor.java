package Problema04;

public class Ejecutor {

    public static void main(String[] args) {
        Metodos obj = new Metodos();
        int opc;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1:
                    obj.insertar();
                    break;
                case 2:
                    System.out.println("--Lista Original--");
                    obj.reporte();
                    obj.imprimirInvertido();
                    break;

            }
        } while (opc != 0);
    }
}
