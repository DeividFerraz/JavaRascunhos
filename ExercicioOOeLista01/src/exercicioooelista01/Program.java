package exercicioooelista01;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    
        
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
           //lista gereric
        List<ExercicioOOeLista01> list = new ArrayList<>();
        
        System.out.println("Quantas Pessoas Vamos Cadastrar");
        int n = sc.nextInt();
        
        for(int i = 0; i <n; i++){
            System.out.println("Employee #" + (i + 1) + ":");
            
            System.out.print("id: ");
            Integer id = sc.nextInt();
            while(hasId(list, id)){
                System.out.println("id atual ja existe! digite novamente:");
                id = sc.nextInt();
            }
            
            
            System.out.print("name: ");
            sc.nextLine();
            String name = sc.nextLine();
            
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            
            ExercicioOOeLista01 emp = new ExercicioOOeLista01(id, name, salary);
            
            list.add(emp);
        }
        
        System.out.println("Coloque o Id do funcionario que vai ter o salario aumentado: ");
        int idsalary = sc.nextInt();
                                              //filter vai filtrar os funcionarios e trazer somente os que tem o getid existente e pega o primeiro, ou retorna nulo
        ExercicioOOeLista01 emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
        
        //Integer pos = position(list, idsalary);
          //aqui era pos
        if(emp==null){
            System.out.println("Esse id nao existe!!!");
        } else{
            System.out.print("Qual porcentagem: ");
            double percent = sc.nextDouble();
            //era: list.get(pos).increaseSalary(percent);
            emp.increaseSalary(percent);
        }
        
        System.out.println();
        System.out.println("Lista de funcionario: ");
        //para com funcionario(emp) na minha lista, me mostre funcionario(emp)
        //era emp mas nao pode usar o mesmo nome entao sei e
        for(ExercicioOOeLista01 e : list){
            System.out.println(e);
        }
        
        sc.close();
             
    }
    
    //funcao para ver se o elemento da lista existe... esse List nao tem nada ve com o outro, aquele só foi declarado dentro do main
      public static Integer position(List<ExercicioOOeLista01> list, int id){
        //size() é o tamanho da lista
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id)
                return i;
        }
        return null;
      }
      //serve para nao deixar repetir o id
      public static boolean hasId(List<ExercicioOOeLista01> list, int id){
          ExercicioOOeLista01 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
          return emp != null;
      }
    
}
