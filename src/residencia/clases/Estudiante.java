package residencia.clases;

/**
 * @author Gorka
 *
 */
public class Estudiante extends Personas {
	public String codEstudiante;
	
	/**
	 * Crea un nuevo estudiante con toda la documentación necesaria
	 * @param nombre- Es el nombre del estudiante
	 * @param apellidos - Es el primer y segundo apellido del estudiante
	 * @param edad - Es la edad del estudiante con valor de numero entero
	 * @param DNI - Es el DNI del estudiante
	 * @param usuario - Es el usuario con el que iniciara sesión el estudiante
	 * @param contrasenia - Es la contraseña vinculada con el usuario con la que iniciara sesión el estudiante
	 * @param codEstudiante - Es el codigo identificativo que tiene cada estudiante
	 */
	public Estudiante(String nombre, String apellidos, int edad, String DNI, String usuario, String contrasenia, String codEstudiante) {
		super(nombre, apellidos, edad, DNI, usuario, contrasenia);
		// TODO Auto-generated constructor stub
		this.codEstudiante = codEstudiante;
	}

	/**
	 * @return - Devuelve un valor String que contienen el codigo del estudiante
	 */
	public String getCodEstudiante() {
		return codEstudiante;
	}

	/**
	 * @param codEstudiante - - Define un valor String que contiene el codigo del estudiante
	 */
	public void setCodEstudiante(String codEstudiante) {
		this.codEstudiante = codEstudiante;
	}

}
