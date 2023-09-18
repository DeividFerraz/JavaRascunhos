package entidades;

import entidadesEnum.CargoTrabalhador;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class Trabalhador {

    private String name;
    private CargoTrabalhador level;
    private Double baseSalary;
    
    private Departamento departamento;
    private List<HoraContrato> contracts = new ArrayList<>();

    public Trabalhador() {
    }

    public Trabalhador(String name, CargoTrabalhador level, Double baseSalary, Departamento departamento) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departamento = departamento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CargoTrabalhador getLevel() {
        return level;
    }

    public void setLevel(CargoTrabalhador level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<HoraContrato> getContracts() {
        return contracts;
    }

   // public void setContracts(List<HoraContrato> contracts) {
     //   this.contracts = contracts;
    //}
    
    public void addContrato(HoraContrato contract){
        contracts.add(contract);
    }
    
    public void removeContrato(HoraContrato contract){
        contracts.remove(contract);
    }
    
    public double income(int ano, int mes){
       double sum = baseSalary;
       Calendar cal = Calendar.getInstance();
        for(HoraContrato c : contracts){
            cal.setTime(c.getDate());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);
            if(ano == c_ano && mes == c_mes){
                sum += c.totalvalue();
            }
        }
        return sum;
    }
}
