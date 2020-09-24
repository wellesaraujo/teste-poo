package projetopessoas;

public class Bolsista extends Aluno {

    private int bolsa;
    private String curso;

    public void renovarBolsa(){
        System.out.println("A bolsa foi renovada com sucesso.");
    }
    @Override
    public void pagarMensal(){
        System.out.println("A mensalidade com desconto de bolsista foi paga.");
    }

    public int getBolsa() {
        return this.bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
}
