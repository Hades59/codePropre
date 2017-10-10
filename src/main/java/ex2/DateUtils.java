/**
 * 
 */
package ex2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ETY3
 *
 */
public class DateUtils {

	public static String format(Date date){
		if(date==null){
			return null;
		}
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return f.format(date);
	}
}
