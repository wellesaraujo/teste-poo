package aula02;
public class App {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor="Azul";
        c1.modelo="BIC";
        c1.ponta=0.5f;
        c1.tampada=false;
        c1.carga=70;

        Caneta c2 = new Caneta();
        c2.cor="Vermelha";
        c2.modelo="Faber Castel";
        c2.ponta=1;
        c2.tampada=true;
        c2.carga=100;

        c1.status();
        System.out.println();
        c2.status();
        System.out.println();
        c1.rabiscar();
        c2.rabiscar();
        c2.destampar();
        c2.rabiscar();
        c2.status();
    }
}
