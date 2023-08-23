package br.com.JSF;

import java.util.ArrayList;
import java.util.List;

import javax.faces.component.html.HtmlCommandButton;

public class PessoaBean {
	
	private String nome;
	private String sobrenome;
	private String nomeCompleto;
	private List<String> nomes = new ArrayList<String>();
	private HtmlCommandButton htmlCommandButton; 
	
	public HtmlCommandButton getHtmlCommandButton() {
		return htmlCommandButton;
	}

	public void setHtmlCommandButton(HtmlCommandButton htmlCommandButton) {
		this.htmlCommandButton = htmlCommandButton;
	}

	public String addNome() {
		nomeCompleto = nome + " " + sobrenome;
		return "";
	}
	
	public String addNomes() {
		nomes.add(nome);
		
		if(nomes.size() > 3) {
			htmlCommandButton.setDisabled(true);
		}
		return "";
	}
	
	public List<String> getNomes() {
		return nomes;
	}

	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
}

