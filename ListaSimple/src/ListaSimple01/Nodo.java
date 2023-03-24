package ListaSimple01;

public class Nodo {
    public int dato;
    public Nodo siguiente;
    //contructor para insertar al final
    public Nodo(int d){
        this.dato=d;
    }
    //contructor para insertar al final
    public Nodo(int d, Nodo n){
        dato= d;
        siguiente= n;
    }
}
