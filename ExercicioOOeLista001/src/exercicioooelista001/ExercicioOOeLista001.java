
package exercicioooelista001;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioOOeLista001 {

    public static void main(String[] args) {
            
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
           //lista gereric
        List<ExercicioOOeLista001> list = new ArrayList<>();
        
        System.out.println("Quantas Pessoas Vamos Cadastrar");
        int n = sc.nextInt();
        
        for(int i = 0; i <n; i++){
            System.out.println("Employee #" + (i + 1) + ":");
            
            System.out.print("id: ");
            Integer id = sc.nextInt();
            
            System.out.print("name: ");
            sc.nextLine();
            String name = sc.nextLine();
            
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            
            ExercicioOOeLista001 emp = new ExercicioOOeLista001(id, name, salary);
            
            list.add(emp);
        }
        
        System.out.println("Qual funcionario vai ter o salario aumentado? ");
        int idsalary = sc.nextInt();
        
        Integer pos = position(list, idsalary);
        if(pos==null){
            System.out.println("Esse id nao existe!!!");
        } else{
            System.out.print("Qial porcentagem ?");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }
        
        System.out.println();
        System.out.println("Lista de funcionario: ");
        //para com funcionario(emp) na minha lista, me mostre funcionario(emp)
        for(ExercicioOOeLista001 emp : list){
            System.out.println(emp);
        }
        
        sc.close();
             
    }
    
    //funcao para ver se o elemento da lista existe... esse List nao tem nada ve com o outro, aquele só foi declarado dentro do main
      public static Integer position(List<ExercicioOOeLista001> list, int id){
        //size() é o tamanho da lista
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id)
                return i;
        }
        return null;
      }
    }
    
}
