package exercicioclasseabstratapolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioClasseAbstrataPolimorfismo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
      
        
        List<TaxPayer> list = new ArrayList<TaxPayer>();
        System.out.println("Entre Com o numero de Comtribuintes: ");
        int n = sc.nextInt();
        
        for(int i = 1; i<=n; i++){
            System.out.println("TaxPayer #" + i + " data:");
            System.out.println("Individual or Company (i/c)");
            char type = sc.next().charAt(0);
            System.out.println("Name: ");
            String name = sc.next();//o next aceita somente uma palavra sem espaços
            System.out.println("Anual Income: ");
            Double AnualIncome = sc.nextDouble();
            if (type == 'i') {
                System.out.println("Gasto com saude");
                Double healthExpenditures = sc.nextDouble();
                individual x = new individual(name, AnualIncome, healthExpenditures);
                list.add(x);
            } else {
                System.out.println("Numero de funcionarios: ");
                Integer numberOfEmployees = sc.nextInt();
                list.add(new Company(name, AnualIncome, numberOfEmployees));
            }
        }
        
        System.out.println("");
        System.out.println("Taxes PAID");
        for(TaxPayer acc : list){
            System.out.println(acc.getName() + ": $ " + String.format("%.2f", acc.tax()));
        }
        
        double sum = 0.0;
        for (TaxPayer acc : list){
            sum += acc.tax();
        }
        System.out.println("Total TAXES: $ " + String.format("%.2f", sum));
    }
    
}
