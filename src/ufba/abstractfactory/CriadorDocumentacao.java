package ufba.factorymethod;

import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;

public abstract class CriadorDocumentacao {
	Cabecalho cabecalho;
	Corpo corpo;
	Rodape rodape;
	FabricaDeDocumentos fabrica;
	
	public abstract String geraDocumentacao(String titulo, String empresa, String texto);
}