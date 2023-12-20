package exercicios.exercicioAbstracao.entities;

public class PessoaFisica extends Pessoa{

    private Double healthCareWaste;

    public PessoaFisica(String name, Double rendaAnual, Double healthCareWaste) {
        super(name, rendaAnual);
        this.healthCareWaste = healthCareWaste;
    }

    @Override
    public Double impostoPago() {
        double imposto;
        if(getRendaAnual() < 20000){
            imposto = (getRendaAnual() * 15/100);
        }
        else{
            imposto = (getRendaAnual() * 25/100);
        }
        if(healthCareWaste > 0){
            imposto -= (getHealthCareWaste() * 50/100);
        }
        return imposto;
    }

    public Double getHealthCareWaste() {
        return healthCareWaste;
    }

    public void setHealthCareWaste(Double healthCareWaste) {
        this.healthCareWaste = healthCareWaste;
    }
}
