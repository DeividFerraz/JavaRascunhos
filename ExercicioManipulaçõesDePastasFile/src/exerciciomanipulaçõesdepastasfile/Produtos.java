package exerciciomanipulaçõesdepastasfile;

public class Produtos {
    private String name;
    private Double price;
    private Integer quantia;

    public Produtos() {
    }

    public Produtos(String name, Double price, Integer Quantia) {
        this.name = name;
        this.price = price;
        this.quantia = quantia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantia() {
        return quantia;
    }

    public void setQuantia(Integer Quantia) {
        this.quantia = Quantia;
    }
    
    public double total(){
        return price*quantia;
    }
}
