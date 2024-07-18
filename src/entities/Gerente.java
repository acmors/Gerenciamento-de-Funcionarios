package entities;

public class Gerente extends Funcionario{
	
	private String departamento;

	public Gerente(String nome, Double salario, String departamento) {
		super(nome, salario);
		this.departamento = departamento;
	}
	
	@Override
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Departamento: " + departamento);
	}
}
