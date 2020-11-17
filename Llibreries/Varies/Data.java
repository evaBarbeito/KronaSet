package Varies;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Data {
	public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

	
	public static String imprimirData(LocalDateTime dataTmp) {
		if (dataTmp == null) {
        	return "NULL";
        } else {
        	return dataTmp.format(formatter);
        }
	}
}
