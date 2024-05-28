/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 2.1
 * <p>
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n2_estudiante
 * Autor: Equipo Cupi2 2016
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package uniandes.cupi2.estudiante.mundo;

/**
 * Clase que modela un estudiante
 */
public class Estudiante {
	// -----------------------------------------------------------------
	// Atributos
	// -----------------------------------------------------------------

	/**
	 * Código del estudiante
	 */
	private int codigo;

	/**
	 * Nombre del estudiante
	 */
	private String nombre;

	/**
	 * Apellido del estudiante
	 */
	private String apellido;

	/**
	 * Curso del estudiante
	 */
	private Curso curso1;

	/**
	 * Curso del estudiante
	 */
	private Curso curso2;

	/**
	 * Curso del estudiante
	 */
	private Curso curso3;

	/**
	 * Curso del estudiante
	 */
	private Curso curso4;

	/**
	 * Curso del estudiante
	 */
	private Curso curso5;

	/**
	 * Actividad extracurricular 1.
	 */
	private Actividad actividad1;

	/**
	 * Actividad extracurricular 2.
	 */
	private Actividad actividad2;

	/**
	 * Actividad extracurricular 3.
	 */
	private Actividad actividad3;

	// -----------------------------------------------------------------
	// Constructores
	// -----------------------------------------------------------------

	/**
	 * Constructor de un estudiante
	 *
	 * @param elNombre - nombre del estudiante - elNombre != null
	 * @param elApellido - apellido del estudiante - elApellido != null
	 * @param elCodigo - código del estudiante - elCodigo > -1
	 */
	public Estudiante(String elNombre, String elApellido, int elCodigo) {
		// TODO
	}

	// -----------------------------------------------------------------
	// Métodos
	// -----------------------------------------------------------------

	/**
	 * Método que asigna un curso a un estudiante. <br>
	 * <b>post: </b> El estudiante tiene un nuevo curso, si es el quinto ingreso, ya el estudiante no puede manejar más. <br>
	 *
	 * @param curso a asignar
	 * @return true si puedo asignar el curso y false en caso contrario
	 */
	public boolean asignarCurso(Curso curso) {
		// TODO
	}

	/**
	 * Metódo que calcula el promedio del estudiante. <br>
	 * <b>post: </b> Retornó el promedio ponderado del estudiante. <br>
	 *
	 * @return promedio - promedio de los cursos vistos por el estudiante - promedio >= 0.0
	 */
	public double calcularPromedioEstudiante() {
		// TODO
	}

	/**
	 * Método que indica si el pensum del estudiante incluye el curso <br>
	 * <b>post: </b> Retorno true si el estudiante vió el curso, false de lo contrario. <br>
	 *
	 * @param codigoCurso - código del curso del cual se desea saber si el estudiante ya lo vió - nombreCurso != null
	 * @return true si ya se vió curso ( nota != 0.0 ), false de lo contrario
	 */
	public boolean pensumIncluyeCurso(String codigoCurso) {
		// TODO
	}

	/**
	 * Indica si el estudiante se encuentra en prueba académica. <br>
	 *
	 * @return true si se encuentra en prueba, false de lo contrario
	 */
	public boolean estudianteEstaPrueba() {
		// TODO
	}

	/**
	 * Indica si el estudiante tiene todos los cursos asignados. <br>
	 * <b>post: </b> Retorno true si los 5 cursos se encuentran copados, false de lo contrario. <br>
	 *
	 * @return cursosLlenos - Retorna true si los cursos estan copados, false de lo contrario
	 */
	public boolean tieneCursosCompletos() {
		// TODO
	}

	/**
	 * Método usado para buscar un curso. <br>
	 * <b>post: </b> Retorno true si el curso esta registrado los cursos del estudiante, false de lo contrario. <br>
	 *
	 * @param codigoCurso - código del curso a buscar - codigoCurso != null
	 * @return Curso si el curso está, null de lo contrario
	 */
	public Curso buscarCurso(String codigoCurso) {
		// TODO
	}

	/**
	 * Método que retorna el código del estudiante
	 *
	 * @return codigo del estudiante
	 */
	public int darCodigo() {
		// TODO
	}

	/**
	 * Método que retorna el nombre del estudiante
	 *
	 * @return nombre del estudiante - nombre != null
	 */
	public String darNombre() {
		// TODO
	}

	/**
	 * Método que retorna el apellido del estudiante
	 *
	 * @return apellido del estudiante - apellido != null
	 */
	public String darApellido() {
		// TODO
	}

	/**
	 * Método que retorna el Curso 1 del estudiante
	 *
	 * @return curso 1
	 */
	public Curso darCurso1() {
		// TODO
	}

	/**
	 * Método que retorna el Curso 2 del estudiante
	 *
	 * @return curso 2
	 */
	public Curso darCurso2() {
		// TODO
	}

	/**
	 * Método que retorna el Curso 3 del estudiante
	 *
	 * @return curso 3
	 */
	public Curso darCurso3() {
		// TODO
	}

	/**
	 * Método que retorna el Curso 4 del estudiante
	 *
	 * @return curso 4
	 */
	public Curso darCurso4() {
		// TODO
	}

	/**
	 * Método que retorna el Curso 5 del estudiante
	 *
	 * @return curso 5
	 */
	public Curso darCurso5() {
		// TODO
	}

	// -----------------------------------------------------------------
	// Extensión
	// -----------------------------------------------------------------

	/**
	 * Devuelve la actividad extracurricular 1.
	 *
	 * @return Actividad extracurricular 1.
	 */
	public Actividad darActividad1() {
		// TODO
	}

	/**
	 * Devuelve la actividad extracurricular 2.
	 *
	 * @return Actividad extracurricular 2.
	 */
	public Actividad darActividad2() {
		// TODO
	}

	/**
	 * Devuelve la actividad extracurricular 3.
	 *
	 * @return Actividad extracurricular 3.
	 */
	public Actividad darActividad3() {

		return actividad3;
	}

	/**
	 * Agrega una actividad dados su nombre, tipo de actividad y hroas dedicadas
	 *
	 * @param nombreAct Nombre de la actividad a agregar.
	 * @param tipo Tipo de la actividad a agregar.
	 * @param horasDedicadas Horas dedicadas de la actividad a agregar.
	 * @return True si logra agregar la actividad, false de lo contrario.
	 */
	public boolean agregarActividad(String nombreAct, int tipo, int horasDedicadas) {
		// TODO

	}

	/**
	 * Elimina una actividad extracurricular dado el nombre.
	 *
	 * @param nombreAct Nombre de la actividad. nombre!="" && nombre!=null.
	 * @return True si logra eliminar una actividad con el nombre pasado por parámetro, false de lo contrario.
	 */
	public boolean eliminarActividad(String nombreAct) {
		// TODO
	}

	/**
	 * Devuelve un texto con el tipo de actividad extracurricular con mayor tiempo dedicado.
	 *
	 * @return Tipo de actividad con mas horas dedicadas.
	 * Esto puede ser "Académico", "Deportivo" ó "Trabajo social".
	 */
	public String darTipoActividadMasTiempoDedicado() {
		// TODO
	}

	/**
	 * Calcula la cantidad de actividades que tienen una cantidad de horas dedicadas mayor a 100.
	 *
	 * @return Cantidad de actividades que tiene mas de 100 horas dedicadas.
	 */
	public int contarActividadesMasDe100Horas() {
		// TODO
	}

	/**
	 * Determina si un estudiante cumple con los requisitos para postularse para una beca de liderazgo integral.
	 * Los requisitos son:
	 * a.	Tener un promedio superior o igual a 4,7.
	 * b.	Haber dedicado más de 100 horas a actividades extracurriculares de tipo trabajo social.
	 * c.	Haber dedicado más de 100 horas a actividades extracurriculares de tipo deportivo.
	 * d.	Haber dedicado más de 100 horas a actividades extracurriculares de tipo académico
	 *
	 * @return True si cumple todos los requisitos, false de lo contrario.
	 */
	public boolean cumpleRequisitosBeca() {
		// TODO
	}

	/**
	 * Método de extensión
	 *
	 * @return Respuesta de extensión
	 */
	public String metodo1() {

		return "respuesta 1";
	}

	/**
	 * Método de extensión
	 *
	 * @return Respuesta de extensión
	 */
	public String metodo2() {

		return "respuesta 2";
	}

}