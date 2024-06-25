
package listas.taller2b2p;

/**
 *
 * @author KevinR
 */
public class Taller2b2p {

    public static void main(String[] args) {
            Metodos obj = new Metodos();
            int opc,num;
            do{
            opc = obj.menu();
            switch(opc){
                case 1:
                    obj.llenarLista();
                    break;
                case 2:
                    obj.reporte(obj.raizH);
                    break;
                case 3: obj.reporte(obj.raizM);
            }
            }while(opc != 0);
    }
}
