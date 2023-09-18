package criaçãodeesseçõespersonalizadastrycatchfinally;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CriaçãodeEsseçõesPersonalizadasTryCatchFinally {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");//serve para converter um texto em data
        
        try{
            System.out.print("room number: ");
            int number = sc.nextInt();
            System.out.println("checkIn date (dd/MM/yyyy)");
            Date checkIn = sdf.parse(sc.next());
            System.out.println("checkOut date (dd/MM/yyyy)");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Coloque a data de atualização da nova reserva:");
            System.out.println("checkIn date (dd/MM/yyyy)");
            checkIn = sdf.parse(sc.next());
            System.out.println("checkOut date (dd/MM/yyyy)");
            checkOut = sdf.parse(sc.next());


            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reserva: " + reservation);
        } catch(ParseException e){
            System.out.println("Invalid date format");
        } catch (DomainException e){
            System.out.println("Error na reservação: " + e.getMessage());
        } catch(RuntimeException e){//runtime , pega os erros de modo geral
            System.out.println("Erro inesperado");
        }

    }
    
}
