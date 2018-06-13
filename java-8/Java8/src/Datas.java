import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Datas {
	
	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		
		//System.out.println(hoje);
		
		LocalDate novaData = LocalDate.of(2099, Month.JANUARY, 25);
		
		Period periodoEntreDatas = Period.between(hoje, novaData);
						
		System.out.println(periodoEntreDatas.getYears());
		
		
		DateTimeFormatter formata = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println(hoje.format(formata));
		
		
		LocalDate aniversarioNamoro = LocalDate.of(2018, Month.MAY, 5);
		
		int anos = aniversarioNamoro.getYear() - hoje.getYear();
		
		//System.out.println(anos);
		
		Period periodo = Period.between(hoje, aniversarioNamoro);
		
		//System.out.println(periodo.getDays() + " " + periodo.getMonths() + " " + periodo.getYears());
		
		
		LocalDate proximoAniversario = aniversarioNamoro.plusYears(1);
		
		//System.out.println(proximoAniversario);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String valorFormatado = proximoAniversario.format(formatador);
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		//System.out.println(valorFormatado);
		
		LocalDateTime agora = LocalDateTime.now();
		//System.out.println(agora.format(formatadorComHoras));
		
		LocalTime intervalo = LocalTime.of(15, 30);
		//System.out.println(intervalo);
	}

}
