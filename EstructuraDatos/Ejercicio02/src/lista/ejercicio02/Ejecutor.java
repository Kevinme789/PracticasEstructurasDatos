package lista.ejercicio02;

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
                    obj.reporte();
                    break;

            }
        } while (opc != 0);
    }
}
