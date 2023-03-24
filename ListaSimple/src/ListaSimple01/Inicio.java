package ListaSimple01;

import javax.swing.JOptionPane;

public class Inicio {
    public static void main(String[] args) {


        int opcion = 0;
        int a1;
        int e1;
        Lista lista01 = new Lista();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar un elemento al inicio\n " +
                        "2. Mostrar los datos de la lista \n"
                        + "3. Elimimar\n"
                        + "4. Buscar\n"
                        + "5. Salir", "Menu", JOptionPane.QUESTION_MESSAGE));
                switch (opcion) {
                    case 1:
                        try {
                            a1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Elemento:", ""));
                            lista01.agregarInicio(a1);
                        } catch (Exception e) {

                        }
                        break;
                    case 2:
                        lista01.imprimirLista();
                        break;
                    case 3:
                        try {
                            e1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese elemento a eliminar:", "Eliminar", JOptionPane.QUESTION_MESSAGE));
                            lista01.eliminar(e1);
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es: "+e1, "Eliminando nodo", JOptionPane.INFORMATION_MESSAGE);
                        } catch (Exception e) {

                        }
                        break;
                    case 4:
                        try {
                            e1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese elemento a Buscar:", "Buscar",JOptionPane.QUESTION_MESSAGE));
                            if(lista01.buscarEnLista(e1)==true){
                                JOptionPane.showMessageDialog(null,"Elemento: "+ e1 + "\n Si se encontro", "Elemento Encontrado", JOptionPane.INFORMATION_MESSAGE);
                            }else{
                                JOptionPane.showMessageDialog(null, "Elemento no encontrado","Error" ,JOptionPane.ERROR_MESSAGE);
                            }

                        } catch (Exception e) {

                        }
                        break;
                    case 5:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
            }

        }while(opcion!=5);
    }
}

