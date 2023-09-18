package exerciciocadatraproduto;

public class importProduct extends Product{
    private double customsFree;
    
    public importProduct() {
    }

    public importProduct(String name, double price, double customsFree) {
        super(name, price);
        this.customsFree = customsFree;
    }

    public double getCustomsFree() {
        return customsFree;
    }

    public void setCustomsFree(double customsFree) {
        this.customsFree = customsFree;
    }
    
    
    
    @Override
    public String priceTag() {
    double totalPrice = totalPrice();
    String a = "(Customs fee: " + Double.toString(this.customsFree) + ")";
    return super.priceTag() + a;
}

    
    public double totalPrice(){
        return super.getPrice() + this.getCustomsFree();
    }
}
