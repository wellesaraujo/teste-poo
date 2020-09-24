package aula07;
import java.util.Random;
public class Luta {
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;


    public void marcarLuta(Lutador l1, Lutador l2){ 
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
          this.setAprovada(true);
          this.setDesafiado(l1);
          this.setDesafiante(l2);
          System.out.println("Luta Marcada com Sucesso!");
          System.out.println(this.desafiado.getNome().toUpperCase()+" vs "+this.desafiante.getNome().toUpperCase());
          System.out.println("Categoria: "+this.desafiante.getCategoria().toUpperCase());
        }
        else {
            this.setAprovada(false);
            this.desafiado = null;
            this.desafiante = null;
            System.out.println("Não foi possível marcar a luta, verifique a categoria dos lutadores!");
            System.out.println(l1.getNome()+" - "+l1.getCategoria());
            System.out.println(l2.getNome()+" - "+l2.getCategoria());
        }
    }

    public void lutar(){
        if (this.getAprovada()){
            System.out.println("===========DESAFIADO===========");
            this.desafiado.apresentar();
            System.out.println("================================");
            System.out.println();
            System.out.println("===========DESAFIANTE===========");
            this.desafiante.apresentar();
            System.out.println("================================");

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            System.out.println("Luta em andamento...");
            System.out.println();
            System.out.println();
            System.out.println("*****RESULTADO DA LUTA*****");
            switch (vencedor){
                case 0:
                    System.out.println("EMPATE!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(this.desafiado.getNome().toUpperCase()+" VENCEU!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(this.desafiante.getNome().toUpperCase()+" VENCEU!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        } else{
            System.out.println("Luta não aprovada!");
        }
    }


    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return this.aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
