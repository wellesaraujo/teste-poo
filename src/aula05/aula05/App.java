package aula05;
public class App {
    public static void main(String[] args) throws Exception {
        
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(1111);
        c1.setDono("Welles");
        c1.abirConta("CC");

        ContaBanco c2 = new ContaBanco();
        c2.setNumConta(2222);
        c2.setDono("Kawany");
        c2.abirConta("CP");

        c1.depositar(500);
        c2.depositar(230);

        c1.sacar(200);
        c2.pagarMensal();
        c1.fecharConta();

        
        c1.estadoAtual();
        c2.estadoAtual();
    }
}
