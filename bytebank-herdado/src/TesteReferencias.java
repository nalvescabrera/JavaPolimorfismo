
public class TesteReferencias {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Jo�o");
		g1.setSalario(5000.00);
		
		Funcionario f = new Funcionario();
		f.setSalario(2000.0);
		
		EditorVideo e = new EditorVideo();
		e.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(e);
		controle.registra(d);
		System.out.println(controle.getSoma());
	}

}
