package aula07;


public class Lutador {

    private String nome;
    private String nac;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;


    public Lutador(String nome, String nac, int idade, float alt, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nac = nac;
        this.idade = idade;
        this.altura = alt;
        this.setPeso(peso);;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public void apresentar(){
        System.out.println("Lutador: "+this.getNome()+", "+this.getIdade()+" - "+this.getNac());
        System.out.println("Com "+this.getAltura()+" de altura e pesando "+this.getPeso()+" Kg");
        System.out.println("Categoria: "+this.getCategoria().toUpperCase());
        System.out.println(this.getVitorias()+" vitórias, "+this.getDerrotas()+" derrotas e "+this.getEmpates()+" empates.");
    }

    public void status(){
        System.out.println("===STATUS DO LUTADOR===");
        System.out.println("Lutador: "+this.getNome()+" Peso: "+this.getCategoria());
        System.out.println("Vitórias: "+this.getVitorias());
        System.out.println("Derrotas: "+this.getDerrotas());
        System.out.println("Empates: "+this.getEmpates());
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNac() {
        return this.nac;
    }

    public void setNac(String nac) {
        this.nac = nac;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;

        if (this.getPeso()<52.2){
            this.setCategoria("Inválido");
        }
        else if(this.getPeso()<=70.3){
            this.setCategoria("Leve");
        }
        else if (this.getPeso()<83.9){
            this.setCategoria("Médio");
        }
        else if (this.getPeso()<120.2){
            this.setCategoria("Pesado");
        }
        else {
            this.setCategoria("Inválido");
        }
    }

    public String getCategoria() {
        return this.categoria;
    }

    private void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
        
}
