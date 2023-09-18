package entidades;

import java.util.Date;

public class HoraContrato {
    private Date date;
    private Double ValueValorHora;
    private Integer hours;
    
    
    public HoraContrato(){
    }

    public HoraContrato(Date date, Double ValueValorHora, Integer hours) {
        this.date = date;
        this.ValueValorHora = ValueValorHora;
        this.hours = hours;
        
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValueValorHora() {
        return ValueValorHora;
    }

    public void setValueValorHora(Double ValueValorHora) {
        this.ValueValorHora = ValueValorHora;
    }
    
    public double totalvalue(){
        return ValueValorHora * hours;
    }
}
