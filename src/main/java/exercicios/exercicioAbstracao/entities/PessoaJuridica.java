package exercicios.exercicioAbstracao.entities;

public class PessoaJuridica extends Pessoa{

    private int numFuncionarios;

    public PessoaJuridica(String name, Double rendaAnual, int numFuncionarios) {
        super(name, rendaAnual);
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public Double impostoPago(){
        double imposto = (double) 0;
        if(numFuncionarios > 10){
            imposto = (getRendaAnual() * 14/100);
        }
        else{
            imposto = (getRendaAnual() * 16/100);
        }
        return imposto;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }
}
