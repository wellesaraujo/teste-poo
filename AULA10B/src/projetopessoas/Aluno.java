package projetopessoas;

public class Aluno extends Pessoa{

    private int matr;
    private String curso;

    public void cancelarMatr(){
        System.out.println("A matrícula "+this.getMatr()+" do(a) aluno(a) "+this.getNome()+" foi cancelada!");
        this.setMatr(-1);
    }

    public void pagarMensal(){
        System.out.println("A Mensalidade foi paga.");
    }

    public int getMatr() {
        return this.matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
