package listaenlazadadeber.ejemplo05;

public class Ejecutor {

    public static void main(String[] args) {
        Metodos obj = new Metodos();
        int opc;
        do{
        opc = obj.menu();
            switch(opc){
                case 1:
                    obj.llenar();
                    break;
                case 2:
                    System.out.println("Ingrese el numero");
                    int num = obj.entrada.nextInt();
                    obj.eliminar(num);
                    break;
                case 3:
                    obj.recorrer();
                    break;
            }
        }while(opc != 0);
    }
}
