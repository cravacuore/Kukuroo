package modeloMiniGobstones;

import java.util.List;

public class Cabezal {
	private Tablero tablero = new Tablero(10, 10);
	public int posicionX = 0;
	public int posicionY = 0;
	
	private Cabezal() {}
	private static Cabezal INSTANCE = new Cabezal();
	public static Cabezal getInstance() {
		return INSTANCE;
	}
	
	public void poner(Bolita bolita){
		this.tablero.add(this, bolita);
	}
	
	public void mover(Direccion direccion){
		switch (direccion) {
			case Norte: this.posicionY -= 1;
			case Este: this.posicionX += 1;
			case Sur: this.posicionY += 1;
			case Oeste: this.posicionX -= 1;
		}
	}
	
	public boolean hayBolitas(Color color){
		List<Bolita> bolitas = this.getBolitasEnCeldaActual();
		for (Bolita b : bolitas) {
			if(b.color.equals(color)) return true;
		}
		return false;
	}
	
	public List<Bolita> getBolitasEnCeldaActual() {
		return this.tablero.getTablero()[this.posicionX][this.posicionY].bolitas;
	}
}