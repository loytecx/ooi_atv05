//importaÃ§Ãµes

public class ContaBancaria{

    //atributos
    private String agencia;
    private String numero;
    private double saldo;
    private String nomeCliente;

    
    public ContaBancaria(String agencia, String nomeCliente) {
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
    }

    public ContaBancaria(String agencia, String numero, String nomeCliente, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
        
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    //metodos
    String depositar(double valor){

        if(valor < 0){
            return "Valor invÃ¡lido!";
        }
        saldo = saldo + valor;
        return "ok";
    }

    String sacar(double valor){
        if(valor < 0){
            return "Valor invÃ¡lido!";
            //return false;
        }
        if(valor > saldo){
            return "Saldo insuficiente!";
            
        }

        saldo = saldo - valor;
        return "ok";

    }

    String mostrarSaldo(){
        String texto="";

        texto = "AgÃªncia: " + agencia +
                " NÃºmero: " + numero +
                " Saldo: " + saldo +
                " Cliente: " + nomeCliente;

        return texto;
    }

}
