package maratona.java.javacore.Bintroducaometodos.dominio;

public class Funcionarios {
    public String nome;
    public int idade;
    public double[] salarios ;


    public void imprimeDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(salarios == null){
            return;
        }
        for (double salario: salarios){
            System.out.println(salario + " os Salarios");
        }
        imprimeMediaSalarial();
    }
    public void imprimeMediaSalarial(){
        if(salarios == null){
            return;
        }
        double media = 0;
        for (double salario: salarios){
            media += salario;
            System.out.println("Soma do salario " + media);
        }
        media /= salarios.length;
        System.out.println("A média do salario é: " + media);

    }
}
