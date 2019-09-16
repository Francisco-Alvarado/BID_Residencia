package domain;

public class Alumno {
	private int no_control;
	private String nombre;
	private String carrera;
	private int contrasena;
                        
	public int getNo_control() {
		return no_control;
	}
	public void setNo_control(int no_control) {
		this.no_control = no_control;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

                    public int getContrasena() {
                        return contrasena;
                    }

                    public void setContrasena(int contrasena) {
                        this.contrasena = contrasena;
                    }

	@Override
	public String toString(){
		return "Alumno["+"Nombre: "+nombre+", No_control: "+no_control+", Carrera: "+carrera+", Contraseña: "+contrasena+']';
	}
}