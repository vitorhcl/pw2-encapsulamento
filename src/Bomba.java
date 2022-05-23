
public class Bomba {
	private int pressaoDesejada;
	public int getPressaoDesejada() {
		return pressaoDesejada;
	}
	public void setPressaoDesejada(int pressaoDesejada) {
		this.pressaoDesejada = pressaoDesejada;
	}
	private int pressaoLida;
	public int getPressaoLida() {
		return pressaoLida;
	}
	public void setPressaoLida(int pressaoLida) {
		this.pressaoLida = pressaoLida;
	}
	public int obterResultado() {
		return this.pressaoDesejada - this.pressaoLida;
	}
}
