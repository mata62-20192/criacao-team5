package ufba.elementos.markdown;

import ufba.elementos.Cabecalho;

public class CabecalhoMarkdown extends Cabecalho {

	@Override
	public String getOutput() {
		return "# " + getTitulo() + "\n\n" +
				"## " + getEmpresa() + "\n\n";
	}
}
