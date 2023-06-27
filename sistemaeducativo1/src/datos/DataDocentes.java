package datos;

public class DataDocentes {
		
	    private static int ultimoCodigoDocente = 1000;
	    
	    private int codigoDocente;
	    private String nombres;
	    private String apellidos;
	    private String telefono;
	    private String dni;
	    
	    public void Docente(String nombres, String apellidos, String telefono, String dni) {
	        this.codigoDocente = generarCodigoDocente();
	        this.nombres = nombres;
	        this.apellidos = apellidos;
	        this.telefono = telefono;
	        this.dni = dni;
	    }
	    
	    private static int generarCodigoDocente() {
	        ultimoCodigoDocente++;
	        return ultimoCodigoDocente;
	    }
	    
	    public int getCodigoDocente() {
	        return codigoDocente;
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
	    
	    
	    public String getTelefono() {
	        return telefono;
	    }
	    
	    public void setTelefono(String telefono) {
	        this.telefono = telefono;
	    }
	    
	    public String getDni() {
	        return dni;
	    }
	    
	    public void setDni(String dni) {
	        this.dni = dni;
	    }
}
