import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;

public class ManejoNColasComoListasLigadas {
    public static void main(String[] args) {
        int n, colaIndicada;
        String aCod;
        char aSexo, opc;
        float aValorCompra;
        Cliente unCliente;
        do {
            n = Integer.parseInt(showInputDialog(null, "Ingrese el numero de colas a procesar", "Entrada", JOptionPane.INFORMATION_MESSAGE));
        } while (n < 1);
        listaLigadaCola[] vObjColas = new listaLigadaCola[n];
        for (int i = 0; i < n; i++) {
            listaLigadaCola objCola = new listaLigadaCola();
            vObjColas[i] = objCola;
        }
        do {
            colaIndicada = Integer.parseInt(showInputDialog(null, "Ingrese numero de cola (-1 para salir)", "Entrada Cola a procesar", JOptionPane.INFORMATION_MESSAGE));
            if (colaIndicada != -1) {
                colaIndicada = colaIndicada - 1;
                do {
                    opc = Menu(colaIndicada);
                    System.out.println();
                    switch (opc) {
                        case '1':
                            aCod = showInputDialog(null, "Ingrese codigo", "Entrada", JOptionPane.INFORMATION_MESSAGE);
                            aSexo = showInputDialog(null, "Ingrese sexo", JOptionPane.INFORMATION_MESSAGE).charAt(0);
                            aValorCompra = Float.parseFloat(showInputDialog(null, "Ingrese valor de compra", JOptionPane.INFORMATION_MESSAGE));
                            vObjColas[colaIndicada].encolar(aCod, aSexo, aValorCompra);
                            break;

                        case '2':
                            if (vObjColas[colaIndicada].colaVacia()) {
                                System.out.println("La cola #" + (colaIndicada + 1) + "esta vacia");
                            } else {
                                System.out.println("Codigo desencolado: " + vObjColas[colaIndicada].desencolar().getCodigo());
                            }
                            break;
                        case '3':
                            if (vObjColas[colaIndicada].colaVacia()) {
                                System.out.println("La cola #" + (colaIndicada + 1) + "esta vacia");
                            } else {
                                unCliente = vObjColas[colaIndicada].mostrarCola();
                                while (unCliente != null) {
                                    System.out.println(unCliente.getCodigo() + "\t" + unCliente.getValorCompra() + "\n");
                                    unCliente = vObjColas[colaIndicada].mostrarCola();
                                }
                            }
                            break;
                        case '4':
                            System.out.println("El acumulado de la cola #" + (colaIndicada + 1) + " es $" + vObjColas[colaIndicada].getAcumValorCompra());
                            break;
                        case '5':
                            System.out.println("Cantidad de mujeres de la cola #" + (colaIndicada + 1) + " es " + vObjColas[colaIndicada].getContMujeres());
                            break;
                        case '6':
                            System.out.println("Cantidad de hombres de la cola #" + (colaIndicada + 1) + " es " + vObjColas[colaIndicada].getContHombres());
                            break;
                        case '7':
                            break;
                        default:
                            break;
                    }
                } while (opc != '7');
            }
        } while (colaIndicada != -1);
    }

    static char Menu(int pl) {
        String input;
        char opcion;
        do {
            input = JOptionPane.showInputDialog(null, "1. Encolar\n2. Desencolar\n3. Mostrar cola\n4. Mostrar Acumulado\n5. Contar mujeres\n6. Contar Hombres\n7. Salir", "Cola #" + (pl + 1), JOptionPane.INFORMATION_MESSAGE);
            opcion = input.charAt(0);
        } while (opcion < '1' || opcion > '7');
        return opcion;
    }
}