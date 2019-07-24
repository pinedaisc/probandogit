package probandogit.com.util;

import java.time.LocalDate;

public class Utils {

	public static String getFecha() {
		return "";
	}
	public static String getNombre() {
		return "miguel";
	}
	
	public static String getApellido() {
		return "Pineda";
	}
	
	public static String getDiaCumple(int año, int mes, int dia) {
		return LocalDate.of(año, mes, dia).getDayOfWeek().toString();
	}
}
