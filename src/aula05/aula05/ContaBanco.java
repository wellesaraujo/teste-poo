package aula05;
public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //CONSTRUTOR
    public ContaBanco (){
        //this.setNumConta(numConta);
        //this.tipo=tipo;
        //this.dono=dono;
        this.setSaldo(0);;
        this.setStatus(false);;
    }

    public void abirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if (this.getTipo().equals("CC")){
            this.setSaldo(50f);
        }
        else if (this.getTipo().equals("CP")){
            this.setSaldo(150f);
        }
        System.out.println("Conta aberta com Sucesso!");
    }

    public void fecharConta(){
        if (this.getSaldo()>0f){
            System.out.println("É necessário sacar o saldo de R$"+this.getSaldo()+" antes de fechar a conta.");
        }
        else if (this.getSaldo()<0f){
            System.out.println("É necessário quitar o débito de R$"+this.getSaldo()+" antes de fechar a conta.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }
    
    public void depositar(float valor){

        if (this.getStatus()){
            this.setSaldo(this.getSaldo()+valor);
            System.out.println("R$"+valor+" depositado com sucesso. Seu novo saldo é R$"+this.getSaldo());
        }
        else {
            System.out.println("Impossível depositar. Conta inativa!");
        }
    }

    public void sacar(float valor){
        if (this.getStatus()){
            if (valor > this.getSaldo()){
                System.out.println("Impossível sacar. Valor não disponível em conta Seu saldo atual é de R$"+this.getSaldo());
            }
            else {
                this.setSaldo(this.getSaldo()-valor);
                System.out.println("Saque de R$"+valor+" realizado com sucesso. Seu novo saldo é de R$"+this.getSaldo());
            }
        }
        else {
            System.out.println("Impossível sacar. Conta inativa!");
        }   
    }
    
    public void pagarMensal(){
        if (this.getStatus()){
            int taxa=0;
            if (this.getTipo().equals("CC")){
                taxa=12;
            } else if (this.getTipo().equals("CP")){
                taxa=20;
            }
            this.setSaldo(this.getSaldo()-taxa);
            System.out.println("Mensalidade da Conta tipo "+this.getTipo()+" no valor de R$"+taxa+",00 paga com sucesso! Seu novo saldo é de R$"+this.getSaldo());
        } else {
            System.out.println("Conta inativa. Não é necessário pagar mensalidade.");
        }      
    }

    public void estadoAtual(){
        System.out.println("==============");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Titular: "+this.getDono());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Saldo: R$"+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
        System.out.println("==============");
    }
//SETTERS AND GETTERS
    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

   

}
