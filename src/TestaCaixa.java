
public class TestaCaixa {

	public static void main(String[] args) {
		Caixa cx1 = new Caixa();
		cx1.setAltura(2);
		cx1.setProfundidade(5);
		cx1.setLargura(3);
		System.out.println(cx1.cabeDentro(3));
		
		Caixa cx2 = new Caixa();
		cx2.setAltura(5);
		cx2.setProfundidade(5);
		cx2.setLargura(5);
		System.out.println(cx2.cabeDentro(5));
		
		Caixa cx3 = new Caixa();
		cx3.setAltura(15);
		cx3.setProfundidade(10);
		cx3.setLargura(9);
		System.out.println(cx3.cabeDentro(9));
	}

}
