/**
 * Los módulos formativos son impartidos por profesores y profesoras que pondrán
 * los contenidos del módulo a disposición de los alumnos y alumnas.
 * 
 * @author ticop
 */
public class Modulo {
    private String nombre;

    private String contenido;

    private int horas;

    private Alumno[] alumnado;

    private Profesor[] claustro;

    private Examen pruebaExamen;

    private Tarea pruebaTarea;
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the contenido
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * @param contenido the contenido to set
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * @return the horas
     */
    public int getHoras() {
        return horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * @return the alumnado
     */
    public Alumno[] getAlumnado() {
        return alumnado;
    }

    /**
     * @param alumnado the alumnado to set
     */
    public void setAlumnado(Alumno[] alumnado) {
        this.alumnado = alumnado;
    }

    /**
     * @return the claustro
     */
    public Profesor[] getClaustro() {
        return claustro;
    }

    /**
     * @param claustro the claustro to set
     */
    public void setClaustro(Profesor[] claustro) {
        this.claustro = claustro;
    }

    /**
     * @return the pruebaExamen
     */
    public Examen getPruebaExamen() {
        return pruebaExamen;
    }

    /**
     * @param pruebaExamen the pruebaExamen to set
     */
    public void setPruebaExamen(Examen pruebaExamen) {
        this.pruebaExamen = pruebaExamen;
    }

    /**
     * @return the pruebaTarea
     */
    public Tarea getPruebaTarea() {
        return pruebaTarea;
    }

    /**
     * @param pruebaTarea the pruebaTarea to set
     */
    public void setPruebaTarea(Tarea pruebaTarea) {
        this.pruebaTarea = pruebaTarea;
    }

   

    public void intmatricularAlumno() {
    }

    public void contratarProfesor() {
    }

    public void evaluarAlumno() {
    }
}
