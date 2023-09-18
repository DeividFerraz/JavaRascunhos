package criaçãodeesseçõespersonalizadastrycatchfinally;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    public Reservation() {
    }

    
    
    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
        if(!checkOut.after(checkIn)){
            throw new DomainException("data de checkOut nao pode ser dps que a data de checkIn");
        }   
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }
    
    public long duration(){//long serve para pegar a duração entre duas datas
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    
    public void updateDates(Date checkIn, Date checkOut)throws DomainException{
        Date now = new Date();
        if(checkIn.before(now) || checkOut.before(now)){
            throw new DomainException("data n pode ser mais antigas que as passadas");//usamos essa essseção quando os argumnetos passados para o metodo sao invalidos
        } if(!checkOut.after(checkIn)){
            throw new DomainException("data de checkOut nao pode ser dps que a data de checkIn");
        }    

        this.checkIn = checkIn;
        this.checkOut = checkOut;
            
    }

    @Override
    public String toString() {
        return "Reservation{" + "roomNumber=" + roomNumber + ", checkIn=" +  sdf.format(checkIn) 
                + ", checkOut= " + sdf.format(checkOut) + duration() + " noites" + '}'
                ;
    }
    
}
