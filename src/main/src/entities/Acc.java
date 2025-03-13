/*
src: application/bank-itau
*/

package entities;

public class Acc {
    private int matricula;
    private String nome;
    private double saldo = 0;

    //construtores
    public Acc(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    } // 3 args
    public Acc(int matricula, String nome, double depositoInicial) {
        this.matricula = matricula;
        this.nome = nome;
        depositarDinheiro(depositoInicial);
    } //2 args

    // getter e setter
    public int getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo() {
        return saldo;
    }

    //funcoes
    public void sacarDinheiro(double valor){
        saldo -= valor + 5;
    }
    public void depositarDinheiro(double valor){
        saldo += valor;
    }

    //to string
    public String toString(){
        return String.format("Conta: "+ matricula +"\nNome: "+ nome +"\nSaldo: "+ saldo);
    }
}
