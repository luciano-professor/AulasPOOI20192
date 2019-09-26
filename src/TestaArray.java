public class TestaArray {

    public static void main(String[] args) {
        
        int[] vetor = {1, 2, 5, 9, 7};
        
        //Usando o enhanced For
        for(int x : vetor){
            System.out.println(x * 2);
        }
        
        //Jeito antigo
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i] * 2);
        }
                       
    }
}