package dataehoraexemplo03;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DataeHoraExemplo03 {

    public static void main(String[] args) {
        
        LocalDate d04 = LocalDate.parse("2022-07-13");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-13T01:30:26");
        //esse horario é de londres
        Instant d06 = Instant.parse("2022-07-13T01:30:26Z");
        
        LocalDate semanaAnterior = d04.minusDays(7);
        LocalDate ProximaSemana = d04.plusDays(7);
        LocalDate ProximaSemana1 = d04.plusYears(7);
        
        System.out.println("Semana anterior = " + semanaAnterior);
        System.out.println("Proxima semana = " + ProximaSemana);
        System.out.println("Proximos anos = " + ProximaSemana1);
        //localdateTime mexe com horas e minutos
        LocalDateTime semanaAnteriorTime = d05.minusDays(7);
        LocalDateTime proximasemanaTime = d05.plusDays(7);
        
        System.out.println("Semana anterior = " + semanaAnteriorTime);
        System.out.println("Proxima semana = " + proximasemanaTime);
        
        Instant semanaPassadaIn = d06.minus(7, ChronoUnit.DAYS);
        Instant ProximasemanaIn = d06.plus(7, ChronoUnit.DAYS);
        
        System.out.println("Semana anterior = " + semanaPassadaIn);
        System.out.println("proxima semana = " + ProximasemanaIn);
        
        Duration t0 = Duration.between(semanaAnterior.atStartOfDay(), d04.atStartOfDay());
        Duration t1 = Duration.between(semanaAnteriorTime, d05);
        Duration t2 = Duration.between(semanaPassadaIn, d06);
        Duration t3 = Duration.between(d06, semanaPassadaIn);
        
        System.out.println("ti dias = " + t1.toDays());
        System.out.println("t0 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());

        
    }
    
}
