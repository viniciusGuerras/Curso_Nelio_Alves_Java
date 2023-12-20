package exercicios.exercicioAbstracao.entities;

public abstract class Pessoa {
    private String name;
    private Double rendaAnual;

    public Pessoa(String name, Double rendaAnual) {
        this.name = name;
        this.rendaAnual = rendaAnual;
    }

    public abstract Double impostoPago();

    public String toString(){
           return this.getName() + ": $ " + String.format("%.2f", this.impostoPago());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }
}
