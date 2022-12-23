package Aplicacao;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ProgramaDataHoraAula113 {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-12-09");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26z");
		
		LocalDate semanaPassadaLocalDate = d04.minusDays(7);
		LocalDate proximaSemanaLocalDate = d04.plusDays(7);
		
		System.out.println("Semana Passada LocalDate = " + semanaPassadaLocalDate);
		System.out.println("Proxima Semana LocalDate = " + proximaSemanaLocalDate);
		
		LocalDateTime semanaPassadaLocalDateTime = d05.minusDays(7);
		LocalDateTime proximaSemanaLocalDateTime = d05.plusDays(7);
		
		System.out.println("Semana Passada LocalDateTime = " + semanaPassadaLocalDateTime);
		System.out.println("Proxima Semana LocalDateTime = " + proximaSemanaLocalDateTime);
		
		Instant semanaPassadaInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant proximaSemanaInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("Semana Passada Instant = " + semanaPassadaInstant);
		System.out.println("Proxima Semana Instant = " + proximaSemanaInstant);
		
		Duration t1 = Duration.between(semanaPassadaLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(semanaPassadaLocalDateTime, d05);
		Duration t3 = Duration.between(semanaPassadaInstant, d06);
		Duration t4 = Duration.between(d06, semanaPassadaInstant);
		
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
		
		
		
		
	}

}
