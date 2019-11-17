package ufba.elementos.html;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import ufba.elementos.Rodape;

public class RodapeHTML extends Rodape {

	@Override
	public String getOutput() {
		DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		return "<hr/>" + df.format(getData()) +
				"</body></html>\n";
	}

}
