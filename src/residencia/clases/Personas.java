package residencia.clases;

/**
 * @author Gorka
 *
 */
public class Personas {
	public String nombre;
	public String apellidos;
	public int edad;
	public String DNI;
	public String usuario;
	public String contrasenia;
	
	/** 
	 * Crea una nueva Persona con toda la documentación necesaria
	 * @param nombre - Es el nombre de la persona
	 * @param apellidos - Es el primer y segundo apellido de la persona
	 * @param edad - Es la edad de la persona con valor de numero entero
	 * @param DNI - Es el DNI de la persona
	 * @param usuario - Es el usuario con el que iniciara sesión la persona
	 * @param contrasenia - Es la contraseña vinculada con el usuario con la que iniciara sesión la persona
	 */
	public Personas(String nombre, String apellidos, int edad, String DNI, String usuario, String contrasenia) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.DNI = DNI;
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		
	}

	
	/**
	 * @return - Devuelve un valor String que contiene el nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre - Define un valor String que contiene el nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return - Devuelve un valor String que contiene los apellidos de la persona
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos - Define un valor String que contiene los apellidos de la persona
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return - Devuelve un valor int que contiene la edad de la persona
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad - Define un valor int que contiene la edad de la persona
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return - Devuelve un valor String que contiene el DNI de la persona
	 */
	public String getDNI() {
		return DNI;
	}

	/**
	 * @param DNI - Define un valor String que contiene el DNI de la persona
	 */
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}

	/**
	 * @return - Devuelve un valor String que contiene el usuario de la persona
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario - Define un valor String que contiene el usuario de la persona
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return - Devuelve un valor String que contiene la contraseña de la persona
	 */
	public String getContrasenia() {
		return contrasenia;
	}

	/**
	 * @param contrasenia - Define un valor String que contiene la contraseña de la persona
	 */
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	

}
