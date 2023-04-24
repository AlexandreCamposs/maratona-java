package maratona.java.introducao;

public class Aula05EstruturaCondicional {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if(isAutorizadoComprarBebida){
            System.out.println("Está autorizado a comprar bebida");
        }
        if(!isAutorizadoComprarBebida){
            System.out.println("Não está autorizado a comprar bebida");
        }
        boolean c = false;
        if(c = true){
            System.out.println("Algo que não deve ser feito");
        }
    }
}
