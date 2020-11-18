package residencia.clases;


/**
 * @author Gorka
 *
 */
public class Director extends Personas {
	public String codDirector;

	/**
	 * Crea un nuevo director con toda la documentación necesaria
	 * @param nombre - Es el nombre del direcctor
	 * @param apellidos - Es el primer y segundo apellido del direcctor
	 * @param edad - Es la edad del direcctor con valor de numero entero
	 * @param DNI - Es el DNI del direcctor
	 * @param usuario - Es el usuario con el que iniciara sesión el direcctor
	 * @param contrasenia - Es la contraseña vinculada con el usuario con la que iniciara sesión el direcctor
	 * @param codDirector - Es el codigo identificativo que tiene el direcctor
	 */
	public Director(String nombre, String apellidos, int edad, String DNI, String usuario, String contrasenia, String codDirector) {
		super(nombre, apellidos, edad, DNI, usuario, contrasenia);
		// TODO Auto-generated constructor stub
		this.codDirector = codDirector;
	}

	/**
	 * @return - Devuelve un valor String que contienen el codigo del director 
	 */
	public String getCodDirector() {
		return codDirector;
	}

	/**
	 * @param codDirector - Define un valor String que contiene el codigo del director
	 */
	public void setCodDirector(String codDirector) {
		this.codDirector = codDirector;
	}

}
