package exerciciocadatraproduto;

import java.time.LocalDate;


public class UserProduct extends Product {
    private LocalDate manuFacture;

      
    public UserProduct() {
    }

    public UserProduct(String name, double price, LocalDate manuFacture) {
        super(name, price);
        this.manuFacture = manuFacture;
    }

    public LocalDate getManuFacture() {
        return manuFacture;
    }

    public void setManuFacture(LocalDate manuFacture) {
        this.manuFacture = manuFacture;
    }
    
    
    @Override
    public String priceTag(){
        LocalDate manu = manuFacture;
        String a = "(ManuFacture date: " + LocalDate.from(manu) + ")";
        return super.priceTag()+a;
    }
}
