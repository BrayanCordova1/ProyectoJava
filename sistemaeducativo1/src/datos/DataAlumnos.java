package datos;

public class DataAlumnos {
	    private String nombres;
	    private String apellidos;
	    private String dni;
	    private String telefono;
	    private String Codigo;
	    
	    public DataAlumnos(String Codigo, String nombres, String apellidos, String dni, String telefono) {
	    	this.Codigo = Codigo;
	        this.nombres = nombres;
	        this.apellidos = apellidos;
	        this.dni = dni;
	        this.telefono = telefono;
	    }
	    
	    public String getCOdigo() {
	        return Codigo;
	    }
	    
	    public String getNombres() {
	        return nombres;
	    }

	    public void setNombres(String nombres) {
	        this.nombres = nombres;
	    }

	    public String getApellidos() {
	        return apellidos;
	    }

	    public void setApellidos(String apellidos) {
	        this.apellidos = apellidos;
	    }

	    public String getDni() {
	        return dni;
	    }

	    public void setDni(String dni) {
	        this.dni = dni;
	    }

	    public String getTelefono() {
	        return telefono;
	    }

	    public void setTelefono(String telefono) {
	        this.telefono = telefono;
	    }
	   
	    public String toString() {
	        return "Codigo: "+ Codigo + "\n" + "Nombre: " + nombres + "\n" +
	               "Apellidos: " + apellidos + "\n" +
	               "DNI: " + dni + "\n" +
	               "Teléfono: " + telefono + "\n";
	    }
}
