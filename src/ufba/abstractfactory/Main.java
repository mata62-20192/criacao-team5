package ufba.abstractfactory;

public class Main {

	public static void main(String[] args) {
		
		FabricaDeDocumentacao fabricaHTML = new FabricaDeDocumentacaoHTML();
		FabricaDeDocumentacao fabricaMarkdown = new FabricaDeDocumentacaoMarkdown();
		
		CriadorDeDocumentacao documentacaoHTML = new CriadorDeDocumentacao(fabricaHTML);
		CriadorDeDocumentacao documentacaoMarkdown = new CriadorDeDocumentacao(fabricaMarkdown);

		System.out.println(documentacaoHTML.criaDocumentacao("Exercicio", "Team 5", "We are the champions"));
		System.out.println(documentacaoMarkdown.criaDocumentacao("Exercicio", "Team 5", "Yes we can"));
		
	}

}
