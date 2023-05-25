import java.util.Scanner;

public class TesteCurso {
    public static void main(String[] args) {

        Curso[] curso1 = new Curso[4];

        Scanner reader = new Scanner(System.in);

        System.out.println();
        System.out.println("\033[34;4;1m_____Unversidade Federal de Goiás_____\033[0m");
        System.out.println();
       
        for (int i = 0; i < curso1.length; i++) {
            System.out.println("Nome do "+(i+1)+"° curso: ");
            String nome = reader.nextLine();
            
            System.out.println("Tempo de duração do curso [anos]: ");
            String tempo = reader.nextLine();

            System.out.println("Taxa de Aprovação do curso em %: ");
            double taxaAporva = reader.nextDouble();

            System.out.println("Quantidade de aluno: ");
            int quantidadeAluno = reader.nextInt();

            reader.nextLine();

            curso1[i]= new Curso(nome, tempo, taxaAporva, quantidadeAluno);
            System.out.println();
            System.out.println("\033[32m__________________\033[0m");
            System.out.println();
            }

            for(Curso curso: curso1){
                System.out.println("Curso: "+ curso.VoltaNome());
                System.out.println("Duração: "+curso.VoltaTempo()+" anos.");
                System.out.println("Taxa de aprovação: "+curso.VoltaTaxa()+"%");
                System.out.println("Quantidade de alunos: "+curso.VoltaQuantidade());
                System.out.println("\033[32m______________________\033[0m");
                System.out.println();

            }

        reader.close();


    }
}
