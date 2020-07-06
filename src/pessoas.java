import java.util.ArrayList;
import java.util.List;

import primeiroprojeto_enuns.hobby;

public class pessoas {
	
	public pessoas(String nome, int idade, hobby costume) {
		
		this.nome = nome;
		this.idade = idade;
		this.costume = costume;
		
	}
	
	private String nome;
	private int idade;
	private hobby costume;
	private List<Transporte> locomocao = new ArrayList<>();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public hobby getCostume() {
		return costume;
	}
	public void setCostume(hobby costume) {
		this.costume = costume;
	}
	public List<Transporte> getLocomocao() {
		return locomocao;
	}
	public void addtransporte(Transporte t) {
		locomocao.add(t);
	}
}