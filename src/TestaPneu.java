
public class TestaPneu {

	public static void main(String[] args) {
		Bomba bomb1 = new Bomba();
		
		bomb1.setPressaoDesejada(30);
		bomb1.setPressaoLida(18);
		System.out.println(bomb1.obterResultado());
		
		Bomba bomb2 = new Bomba();
		bomb2.setPressaoDesejada(27);
		bomb2.setPressaoLida(27);
		System.out.println(bomb2.obterResultado());
		
		Bomba bomb3 = new Bomba();
		bomb3.setPressaoDesejada(27);
		bomb3.setPressaoLida(30);
		System.out.println(bomb3.obterResultado());
	}

}
