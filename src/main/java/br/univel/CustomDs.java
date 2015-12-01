package br.univel;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

public class CustomDs implements JRDataSource {
	

	private int count;

	public Object getFieldValue(JRField arg0) throws JRException {
		
		if("F1".equals(arg0.getName())){
			return count + "ola";
		}
		if("F2".equals(arg0.getName())){
			return count + "mundo";
		}
		return "indef";
	}

	public boolean next() throws JRException {
		return count++ < 15;
	}

}