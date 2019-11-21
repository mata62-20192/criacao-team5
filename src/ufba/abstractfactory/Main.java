package ufba.app;

import patterns.abstractfactory.CriadorDeTelas;
import patterns.abstractfactory.FabricaDeComponentes;
import patterns.abstractfactory.FabricaDeComponentesFlat;
import patterns.abstractfactory.FabricaDeComponentesWindows;
import ufba.factorymethod.CriadorDocumentacao;
import ufba.factorymethod.CriadorDocumentacaoHTML;
import ufba.factorymethod.CriadorDocumentacaoMarkdown;

public class Main {

	public static void main(String[] args) {
		
		FabricaDeDocumentos fabricaHTML = new FabricaDeDocumentosHTML();
		FabricaDeDocumentos fabricaMarkdown = new FabricaDeDocumentosMarkdown();
		
		CriadorDocumentacao criadorHTML = new CriadorDocumentacao(fabricaHTML);
		CriadorDocumentacao criadorMarkdown = new CriadorDocumentacao(fabricaMarkdown);

//		System.out.println(criadorHTML.geraDocumentacao("Exercicio", "Team 5", "We are the champions"));
//		System.out.println(criadorMarkdown.geraDocumentacao("Exercicio", "Team 5", "Yes we can"));
		
	}

}
