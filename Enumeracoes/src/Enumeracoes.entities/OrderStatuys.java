package enumeracoes;

import java.util.Date;

import enumeracoes.Enum;

class OrderStatuys {
    private Integer id;
    private Date moment;
    private Enum status;

    public OrderStatuys(Integer id, Date moment, Enum status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public Enum getStatus() {
        return status;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderStatuys{" + "id=" + id + ", moment=" + moment + ", status=" + status + '}';
    }
    
    
}
