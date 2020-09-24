package projetopessoas;
public class App {
    public static void main(String[] args) throws Exception {
        
        Aluno p1 = new Aluno();
        Aluno p2 = new Bolsista();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        Aluno p5 = new Aluno();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");

        p5.setNome("Carlinhos");
        p5.setIdade(25);
        p5.setCurso("Comptucação");
        p5.setMatr(1235);

        p1.pagarMensal();
        p2.pagarMensal();

    }
}
