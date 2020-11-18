package residencia.clases;

/**
 * @author Gorka
 *
 */
public class Trabajador extends Personas {
	public String codTrabajador;
	public String ocupacion;
	
	/**
	 * Crea un nuevo trabajador con toda la documentación necesaria
	 * @param nombre - Es el nombre del trabajador
	 * @param apellidos - Es el primer y segundo apellido del trabajador
	 * @param edad - Es la edad del trabajador con valor de numero entero
	 * @param DNI - Es el DNI del trabajador
	 * @param usuario - Es el usuario con el que iniciara sesión el trabajador
	 * @param contrasenia - Es la contraseña vinculada con el usuario con la que iniciara sesión el trabajador
	 * @param codTrabajador - Es el codigo identificativo que tiene cada trabajador
	 */
	public Trabajador(String nombre, String apellidos, int edad, String DNI, String usuario, String contrasenia, String codTrabajador, String ocupacion) {
		super(nombre, apellidos, edad, DNI, usuario, contrasenia);
		// TODO Auto-generated constructor stub
		this.codTrabajador = codTrabajador;
		this.ocupacion = ocupacion;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	/**
	 * @return - Devuelve un valor String que contienen el codigo del trabajador 
	 */
	public String getCodTrabajador() {
		return codTrabajador;
	}

	/**
	 * @param codTrabajador - Define un valor String que contiene el codigo del trabajador
	 */
	public void setCodTrabajador(String codTrabajador) {
		this.codTrabajador = codTrabajador;
	}
	public void comprobarOcupacion(){
		if (ocupacion != "Mantenimiento" || ocupacion != "Limpieza" ){
			System.out.println("ocupacion incorrecta");
		}else{
			System.out.println("ocupacion correcta");
		}
	}
}
