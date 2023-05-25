public class Curso {
    String nome;
    String tempo;
    double taxaAporva;
    int quantidadeAluno;


    public Curso(String nome, String tempo, double taxaAporva, int quantidadeAluno){
        this.nome = nome;
        this.tempo = tempo;
        this.taxaAporva = taxaAporva;
        this.quantidadeAluno = quantidadeAluno;
        }

        public String VoltaNome(){
            return nome;
        }
        public String VoltaTempo(){
            return tempo;
        }
        public double VoltaTaxa(){
            return taxaAporva;
        }
        public int VoltaQuantidade(){
            return quantidadeAluno;
        }
    }