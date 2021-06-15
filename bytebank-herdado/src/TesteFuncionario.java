
public class TesteFuncionario {

	public static void main(String[] args) {

		
		Funcionario f1 = new Funcionario();
		f1.setNome("Natalia Cabrera");
		f1.setCpf("2324555646-9");
		f1.setSalario(2600.00);
		
		System.out.println(f1.getNome());
		System.out.println(f1.getBonificacao());
	}

}
