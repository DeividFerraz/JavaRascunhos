package exercicioooelista01;

public class ExercicioOOeLista01 {
    private Integer id;
    private String name;
    private Double salary;
    
    public ExercicioOOeLista01(){
        
    }
    
    public ExercicioOOeLista01(Integer id, String name, Double salary){
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
    public void increaseSalary(double percentage){
        //regra de 3 Salario * % /100
        salary += salary * percentage / 100;
    }

    @Override
    public String toString() {
        return id +  ", " + name + ", " + String.format("%.2f", salary);
    }
    
    

    
}
