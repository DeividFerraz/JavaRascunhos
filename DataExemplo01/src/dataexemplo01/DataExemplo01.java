package dataexemplo01;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataExemplo01 {

    public static void main(String[] args) {
        
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        //O withZone especifica o fuso horario que eu irei usar, e o ZoneId ele pega o fuso horario do computador do usuario
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;//me retorna um modelo de data e hora
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;//agr pode ser usado nos INSTANT pois precisa de horario local e esse da.
        
        LocalDate d01 = LocalDate.now(); 
        
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("hora = " + d02.getHour() + ":" + d02.getMinute());
        //esse gera o Horario GMT que é o horario de londres, mostrando o Z no final
        Instant d03 = Instant.now();
        
        LocalDate d04 = LocalDate.parse("2022-07-13");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-13T01:30:26");
        //esse horario é de londres
        Instant d06 = Instant.parse("2022-07-13T01:30:26Z");
        Instant d07 = Instant.parse("2022-07-13T01:30:26-03:00");
        
        LocalDate d08 = LocalDate.parse("20/07/2023", fmt1);
        //pode por em variavel ou colocar direto
        LocalDateTime d09 = LocalDateTime.parse("20/07/2023 01:00", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        
        LocalDate d10 = LocalDate.of(2022, 07, 20);
        //nesse exemplo eu passei Ano, mes, dia, hora e minuto
        LocalDateTime d11 = LocalDateTime.of(2022, 07, 13, 1, 30);
        LocalDateTime d12 = LocalDateTime.parse("2023-07-13T01:30:26");

        
        
        System.out.println("d01: " + d01.toString());// se colocar toString() em tudo tmb imprime pois ja esta correto do lado de fora
        System.out.println("d02: " + d02);
        System.out.println("d03: " + d03);
        System.out.println("d04: " + d04);
        System.out.println("d05: " + d05.format(fmt4));
        System.out.println("d06: " + fmt3.format(d06));
        System.out.println("d07: " + fmt5.format(d07));//Ao contrario da o mesmo resultado
        System.out.println("d08: " + d08.format(fmt1));
        System.out.println("d09: " + d09);
        System.out.println("d10: " + d10);
        System.out.println("d11: " + d11);
        System.out.println("d12: " + d12.format(fmt2));
        
    }
    
}
