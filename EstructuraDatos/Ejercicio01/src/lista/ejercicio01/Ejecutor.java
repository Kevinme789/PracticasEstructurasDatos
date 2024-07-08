package lista.ejercicio01;

public class Ejecutor {

    public static void main(String[] args) {
        Metodos obj = new Metodos();
        int opc;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1:
                    obj.insertar();
                    obj.reporte();
                    break;
            }
        } while (opc != 0);
    }
}
