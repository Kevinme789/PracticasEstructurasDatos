
package listas.ejercicio07;

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
                    System.out.println("--Lista Original");
                    obj.recorrer();
                    obj.ordenar();
                    System.out.println("--Lista Ordenada");
                    obj.recorrer();
                    break;
            }
        }while(opc != 0);
    }
}
