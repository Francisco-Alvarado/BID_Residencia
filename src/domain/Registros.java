package domain;

public class Registros {
	private int no_controlreg;
	private String nombre_reg;
	private String carrera_reg;
	private String fecha;
	private String entrada_salida;
	private int idcasillero;
	
	public int getNo_controlreg() {
		return no_controlreg;
	}

	public void setNo_controlreg(int no_controlreg) {
		this.no_controlreg = no_controlreg;
	}

	public String getNombre_reg() {
		return nombre_reg;
	}

	public void setNombre_reg(String nombre_reg) {
		this.nombre_reg = nombre_reg;
	}

	public String getCarrera_reg() {
		return carrera_reg;
	}

	public void setCarrera_reg(String carrera_reg) {
		this.carrera_reg = carrera_reg;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getEntrada_salida() {
		return entrada_salida;
	}

	public void setEntrada_salida(String entrada_salida) {
		this.entrada_salida = entrada_salida;
	}

	public int getIdcasillero() {
		return idcasillero;
	}

	public void setIdcasillero(int idcasillero) {
		this.idcasillero = idcasillero;
	}

    @Override
    public String toString() {
        return "Registro[No. Control: " + no_controlreg
                + ", Nombre: " + nombre_reg
                + ", Carrera: " + carrera_reg
                + ", Fecha de registro: " + fecha
                + ", Entrada/Salida: " + entrada_salida
                + ", No. Casillero: " + idcasillero + ']';
    }
	
	
}
