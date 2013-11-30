package modeloMiniGobstones;

public class Tablero {
	public Celda [][] tablero;
	public Cabezal cabezal;
	
	public Tablero(int x, int y){
		this.tablero = new Celda [x][y];
	}
	
	public Celda[][] getTablero() {
		return this.tablero;
	}
	
	public void add(Cabezal cabezal, Bolita bolita) {
		this.getTablero()[cabezal.posicionX][cabezal.posicionY].bolitas.add(bolita);
	}
	
	public String print() {
		return this.tablero.toString();
	}
}