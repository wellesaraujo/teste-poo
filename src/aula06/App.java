package aula06;
public class App {
    public static void main(String[] args) throws Exception {
        
        ControleRemoto c = new ControleRemoto();
        c.abrirMenu();
        c.ligar();
        c.maisVolume();
        c.maisVolume();
        c.maisVolume();
        c.abrirMenu();
        c.play();
        c.ligarMudo();
        c.abrirMenu();
        c.menosVolume();
        c.abrirMenu();
    }
}
