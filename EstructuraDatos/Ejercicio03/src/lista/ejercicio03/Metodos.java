package lista.ejercicio03;

import java.util.Scanner;

public class Metodos {

    Scanner entrada;
    Nodo head, head2, head3;
    Nodo tail, tail2, tail3;

    public Metodos() {
        this.entrada = new Scanner(System.in);
        this.head = null;
        this.tail = null;
        this.head2 = null;
        this.tail2 = null;
        this.head3 = null;
        this.tail3 = null;
    }

    public int menu() {
        System.out.println("[1] Ingresar un valor a Lista 1");
        System.out.println("[2] Ingresar un valor a Lista 2");
        System.out.println("Unir Listas e imprimir");
        System.out.println("[0] Salir");
        return entrada.nextInt();
    }

    public boolean listaVacia(Nodo _head) {
        return (_head == null);
    }

    public Nodo leerNota() {
        System.out.println("Ingrese el Elemento: ");
        int nota = entrada.nextInt();
        return new Nodo(nota);
    }

    public void insertarPrimeraL() {
        Nodo nuevo = leerNota();
        if (listaVacia(head)) {
            head = nuevo;
            tail = nuevo;
        } else {
            tail.sig = nuevo;
            tail = nuevo;
        }
    }

    public void insertarSegundaL() {
        Nodo nuevo = leerNota();
        if (listaVacia(head2)) {
            head2 = nuevo;
            tail2 = nuevo;
        } else {
            tail2.sig = nuevo;
            tail2 = nuevo;
        }
    }

    public void reporte(Nodo _head) {
        if (listaVacia(_head)) {
        } else {
            Nodo actual = _head;
            while (actual != null) {
                System.out.printf(actual.valor + ":");
                actual = actual.sig;
            }
            System.out.println("");
        }
    }

    public void listaNueva() {
        Nodo nuevo1 = head;
        Nodo nuevo2 = head2;
        if (head != null) {
            while (nuevo1 != null) {
                int num = 0;
                Nodo nuevo3 = head3;
                while (nuevo3 != null) {
                    if (nuevo1.valor == nuevo3.valor) {
                        num = 1;
                        break;
                    }
                    nuevo3 = nuevo3.sig;
                }
                if (num == 0) {
                    Nodo unir = new Nodo(nuevo1.valor);
                    if (head3 == null) {
                        head3 = unir;
                        tail3 = unir;
                    } else {
                        tail3.sig = unir;
                        tail3 = unir;
                    }
                }
                nuevo1 = nuevo1.sig;
            }
        }
        if (head2 != null) {
            while (nuevo2 != null) {
                int num = 0;
                Nodo nuevo3 = head3;
                while (nuevo3 != null) {
                    if (nuevo2.valor == nuevo3.valor) {
                        num = 1;
                        break;
                    }
                    nuevo3 = nuevo3.sig;
                }
                if (num == 0) {
                    Nodo unir = new Nodo(nuevo2.valor);
                    if (head3 == null) {
                        head3 = unir;
                        tail3 = unir;
                    } else {
                        tail3.sig = unir;
                        tail3 = unir;
                    }
                }
                nuevo2 = nuevo2.sig;
            }
        }
        ordenar(head3, 3);

    }

    public void ordenar(Nodo _head, int num) {
        Nodo nuevo = _head;
        Nodo nuevo2 = _head;
        int aux;
        while (nuevo2 != null) {
            if (num == 1) {
                tail = nuevo;
            } else if (num == 2) {
                tail2 = nuevo;
            } else {
                tail3 = nuevo;
            }
            nuevo = _head;
            while (nuevo != null) {
                if (nuevo.sig == null) {
                    break;
                }
                if (nuevo.valor > nuevo.sig.valor) {
                    aux = nuevo.valor;
                    nuevo.valor = nuevo.sig.valor;
                    nuevo.sig.valor = aux;
                }

                nuevo = nuevo.sig;
                if (nuevo.sig == null) {
                    break;
                }
            }
            nuevo2 = nuevo2.sig;
        }
        if (num == 1) {
            tail = nuevo;
        } else if (num == 2) {
            tail2 = nuevo;
        } else {
            tail3 = nuevo;
        }
    }
}
