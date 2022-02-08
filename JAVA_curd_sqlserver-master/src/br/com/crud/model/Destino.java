package br.com.crud.model;

public class Destino {
	
	private int Id_Destino;
	private String Cidade;
	private String Horario;
	private String Data;
	public int getId_Destino() {
		return Id_Destino;
	}
	public void setId_Destino(int id_Destino) {
		Id_Destino = id_Destino;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getHorario() {
		return Horario;
	}
	public void setHorario(String horario) {
		Horario = horario;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}

	
}
