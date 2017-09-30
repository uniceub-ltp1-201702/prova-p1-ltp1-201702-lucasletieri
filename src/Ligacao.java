import java.time.*;
public class Ligacao {
private String codigo;
private String telefone;
private LocalDate inicio;
private LocalDate fim;
private String cidade;
private String UF;

//construtor
public Ligacao(String codigo, String telefone, LocalDate inicio, LocalDate fim, String cidade, String uF) {
	super();
	this.codigo = codigo;
	this.telefone = telefone;
	this.inicio = inicio;
	this.fim = fim;
	this.cidade = cidade;
	this.UF = uF;
}

//get & set
public String getCodigo() {
	return codigo;
}

public void setCodigo(String codigo) {
	this.codigo = codigo;
}

public String getTelefone() {
	return telefone;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}

public LocalDate getInicio() {
	return inicio;
}

public void setInicio(LocalDate inicio) {
	this.inicio = inicio;
}

public LocalDate getFim() {
	return fim;
}

public void setFim(LocalDate fim) {
	this.fim = fim;
}

public String getCidade() {
	return cidade;
}

public void setCidade(String cidade) {
	this.cidade = cidade;
}

public String getUF() {
	return UF;
}

public void setUF(String uF) {
	UF = uF;
}

//toString
@Override
public String toString() {
	return "Ligacao [codigo=" + codigo + ", telefone=" + telefone + ", inicio=" + inicio + ", fim=" + fim + ", cidade="
			+ cidade + ", UF=" + UF + "]";
}



}
