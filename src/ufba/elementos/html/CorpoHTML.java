package ufba.elementos.html;

import ufba.elementos.Corpo;

public class CorpoHTML extends Corpo {

	@Override
	public String getOutput() {
		return "<p>" + getTexto() + "</p>";
	}

}
