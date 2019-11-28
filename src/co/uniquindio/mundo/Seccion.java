package co.uniquindio.mundo;

public class Seccion {

	private Puesto puestos[][];
	private TipoSeccion tipo;

	public Seccion() {

	}

	public Seccion(TipoSeccion tipo) {

		puestos = new Puesto[5][5];
		this.tipo = tipo;
	}

	public void llenarMatriz() {

		if (this.getTipo().equals(TipoSeccion.CLUB_FANS)) {

			for (int i = 0; i < puestos.length; i++) {
				for (int j = 0; j < puestos.length; j++) {
					puestos[i][j] = new Puesto(i,j);
					puestos[i][j].setTipoSeccion(TipoSeccion.CLUB_FANS);
				}
			}
		}

		if (this.getTipo().equals(TipoSeccion.PLATEA_1)) {

			for (int i = 0; i < puestos.length; i++) {
				for (int j = 0; j < puestos.length; j++) {
					if (i > j) {
						puestos[i][j] = null;
					} else {
						puestos[i][j] = new Puesto(i,j);
						puestos[i][j].setTipoSeccion(TipoSeccion.PLATEA_1);
					}
				}
			}
		}

		if (this.getTipo().equals(TipoSeccion.PLATEA_2)) {

			for (int i = 0; i < puestos.length; i++) {
				for (int j = 0; j < puestos.length; j++) {
					if (i + j > puestos.length - 1) {
						puestos[i][j] = null;
					} else {
						puestos[i][j] = new Puesto(i,j);
						puestos[i][j].setTipoSeccion(TipoSeccion.PLATEA_2);
					}
				}
			}
		}

		if (this.getTipo().equals(TipoSeccion.SEGUNDO_PISO_1)) {

			for (int i = 0; i < puestos.length; i++) {
				for (int j = 0; j < puestos.length; j++) {
					if (i < j) {
						puestos[i][j] = null;
					} else {
						puestos[i][j] = new Puesto(i,j);
						puestos[i][j].setTipoSeccion(TipoSeccion.SEGUNDO_PISO_1);
					}
				}
			}
		}

		if (this.getTipo().equals(TipoSeccion.SEGUNDO_PISO_2)) {

			for (int i = 0; i < puestos.length; i++) {
				for (int j = 0; j < puestos.length; j++) {
					if (i + j < puestos.length - 1) {
						puestos[i][j] = null;
					} else {
						puestos[i][j] = new Puesto(i,j);
						puestos[i][j].setTipoSeccion(TipoSeccion.SEGUNDO_PISO_2);
					}
				}
			}
		}

	}

	public Puesto[][] getPuestos() {
		return puestos;
	}

	public void setPuestos(Puesto[][] puestos) {
		this.puestos = puestos;
	}

	public TipoSeccion getTipo() {
		return tipo;
	}

	public void setTipo(TipoSeccion tipo) {
		this.tipo = tipo;
	}
}
