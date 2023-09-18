package exerciciocadatraproduto;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class ExercicioCadatraProduto {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        
        
        List<Product> produto = new ArrayList<>();
        
        System.out.print("Entre com o numero de produtos: ");
        int n = sc.nextInt();
        
        for(int i = 1; i<=n; i++){
            System.out.println("Produto:" + i + "# data"); 
            System.out.print("Comum, Usado ou Importado (c/u/i)?");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name Product: ");
            String name = sc.nextLine();
            System.out.print("Price of product: ");
            double price = sc.nextDouble();
                if(ch == 'i') {
                     System.out.print("Taxa: ");
                     double customsFree = sc.nextDouble();
                     double totalprice = customsFree + price;
                     produto.add(new importProduct(name, totalprice , customsFree));
                } else if (ch == 'u'){
                    System.out.print("ManuFacture date (yyyy/MM/dd): ");
                    String manufactureStr = sc.next();
                    LocalDate manufactureDate = LocalDate.parse(manufactureStr, formatter);
                    produto.add(new UserProduct(name+" (used)", price, manufactureDate));

                }
                else {
                     produto.add(new Product(name, price));
                }
   
        } 
        System.out.println();
            System.out.println("Podutos OK!");
            for(Product a : produto){
                System.out.println(a.getName() + " $" + String.format("%.2f ", a.getPrice()) + a.priceTag());
            }
            
            
    }

    
}
