package ListaSimple01;

public class Lista {
    //punteros para conocer inicio y final
    protected Nodo inicio, fin;
    public Lista(){
        //los inicializamos en nulo
        inicio=null;
        fin=null;
    }
    //Agregar nodo al inicio de la lista
    public void agregarInicio(int elemento){
        //creamos el nodo
        inicio = new Nodo(elemento, inicio);
        if(fin==null){
            fin=inicio;
        }
    }
    //mostrar los datos
    public void imprimirLista(){
        Nodo recorrer = inicio;
        System.out.println("");
        while(recorrer!=null){
            System.out.print("[" + recorrer.dato + "]-->");
            recorrer = recorrer.siguiente;
        }
    }

    public void eliminar (int elemento){
        if(inicio==fin && elemento== inicio.dato ){
            inicio = fin = null;
        }else if(elemento == inicio.dato){
            inicio = inicio.siguiente;
        }else {
            Nodo anterior, temporal;
            anterior = inicio;
            temporal = inicio.siguiente;
            //recorre la lista hasta que se encuentre el elemento que se esta buscando
            while(temporal != null && temporal.dato != elemento){
                anterior = anterior.siguiente;
                temporal = temporal.siguiente;
            }
            if(temporal != null){
                anterior.siguiente = temporal.siguiente;
                if(temporal == fin){
                    fin = anterior;
                }
            }
        }
    }
    public boolean buscarEnLista(int elemento){
        Nodo temporal = inicio;
        while(temporal != null && temporal.dato != elemento){
            temporal = temporal.siguiente;
        }
        return temporal !=null;
    }
}