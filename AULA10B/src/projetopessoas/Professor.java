package projetopessoas;

public class Professor extends Pessoa {

    private String espec;
    private float salario;

    public void aumento(float valor) {
        this.setSalario(this.getSalario()+valor);
        System.out.println(this.getNome()+" recebeu um aumento de R$"+valor+". Seu novo salário é R$"+this.getSalario());
    }
    public String getEspec() {
        return this.espec;
    }

    public void setEspec(String espec) {
        this.espec = espec;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    
}
