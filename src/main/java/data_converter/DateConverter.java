package data_converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String, Date> {

	public Date convert(String source) {
		if (source == null || source.isEmpty()) {
			return null;
		}
		DateFormat dateFormat = new SimpleDateFormat("dd/MMMM/yyyy hh:mm a");
		Date date = null;
		try {
			date = dateFormat.parse(source);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return date;
	}

}
