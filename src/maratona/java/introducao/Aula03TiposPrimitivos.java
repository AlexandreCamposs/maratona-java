package maratona.java.introducao;
/*
    Crie variáveis para os campos descritos abaixo entre<> e imprima a seguinte mensagem:
    Eu <nome>, morando no endereço <endereço> confirmo que recebi o sálario de <salario>, na data <data>
 */
public class Aula03TiposPrimitivos {
    public static void main(String[]args){
        String nome = "Alexandre";
        String endereço = "Rua alvaro 6695";
        double salario = 2500.12;
        String dataSalario = "18/04/2023";

        System.out.println("Eu " + nome + " morando no " + endereço + " confirmo que recebi o " + salario + ", na data " + dataSalario);

    }
}
