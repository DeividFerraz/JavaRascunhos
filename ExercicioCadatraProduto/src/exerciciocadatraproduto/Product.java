package exerciciocadatraproduto;

public class Product {
    //Atributos
    private String name;
    private double price;
    
    //Metodos especiais
    public String priceTag(){
       String a = " ";
       return a;
    } 

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + priceTag() + '}';
    }
    
    
}
