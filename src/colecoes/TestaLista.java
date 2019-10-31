package colecoes;

import java.util.ArrayList;

public class TestaLista {
    
    public static void main(String[] args) {
        
        //Criando uma Lista
        ArrayList<String> lista = new ArrayList<String>();
        
        //Adicionando elementos numa lista
        lista.add("Diego");
        lista.add("Carol");
        lista.add("Marko");
        lista.add("Rayssa");
        
        //Recuperar e imprimir o tamanho da lista
        //Usa o método size
        System.out.println("Tamanho: " + lista.size());
        
        //Recuperar um elemento de um indice especifico
        //Usa o método get
        System.out.println(lista.get(1));
                
        //Percorrer uma lista usando indices
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        
        //Percorrer usando o Enhanced For (foreach)
        for(String s : lista){
            System.out.println(s);
        }
    }
    
}
