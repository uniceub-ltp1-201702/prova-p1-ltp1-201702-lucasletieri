import java.time.*;
public class Cliente {
private String nome;
private String CPF;
private LocalDate nascimento;
private String telefone;
private String cidade;
private String estado;

//construtor
public Cliente(String nome, String cPF, LocalDate nascimento, String telefone, String cidade, String estado) {
	super();
	this.nome = nome;
	this.CPF = cPF;
	this.nascimento = nascimento;
	this.telefone = telefone;
	this.cidade = cidade;
	this.estado = estado;
}
//get & set
public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCPF() {
	return CPF;
}

public void setCPF(String cPF) {
	CPF = cPF;
}

public LocalDate getNascimento() {
	return nascimento;
}

public void setNascimento(LocalDate nascimento) {
	this.nascimento = nascimento;
}

public String getTelefone() {
	return telefone;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}

public String getCidade() {
	return cidade;
}

public void setCidade(String cidade) {
	this.cidade = cidade;
}

public String getEstado() {
	return estado;
}

public void setEstado(String estado) {
	this.estado = estado;
}
//toString
@Override
public String toString() {
	return "Cliente [nome=" + nome + ", CPF=" + CPF + ", nascimento=" + nascimento + ", telefone=" + telefone
			+ ", cidade=" + cidade + ", estado=" + estado + "]";
}


}
