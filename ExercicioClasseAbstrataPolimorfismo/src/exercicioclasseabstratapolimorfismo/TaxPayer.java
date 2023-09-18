package exercicioclasseabstratapolimorfismo;

public abstract class TaxPayer {
    private String name;
    private Double anualIncome;
    
    public TaxPayer(){
        
    }

    public TaxPayer(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }
    //se a classe tem pelo menos 1 metodo abstrato, a classe tem qeu ser abstrata
    public abstract double tax();
}
