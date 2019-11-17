package ufba.elementos.markdown;

import ufba.elementos.Corpo;

public class CorpoMarkdown extends Corpo {

	@Override
	public String getOutput() {
		return getTexto() + "\n\n";
	}

}
