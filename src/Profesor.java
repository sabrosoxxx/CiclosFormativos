
/**
 * public class Profesor extends Persona llama a la clase madre persona con sus atributos 
 * @author ticop
 */
public class Profesor extends Persona {
 /**
  * NRP codigo de cada profesor
  */
    private String NRP;
/**
 * Los módulos formativos son impartidos por profesores y profesoras que pondrán 
 * los contenidos del módulo a disposición de los alumnos y alumnas.
 */
    private Modulo[] docencia;
    /**
     * public void anadirModulo: añade los modulos de las clases impartida
     */
    public void anadirModulo() {
    }

    public void setNPR() {
    }

    /**
     * @return the NRP
     */
    public String getNRP() {
        return NRP;
    }

    /**
     * @param NRP the NRP to set
     */
    public void setNRP(String NRP) {
        this.NRP = NRP;
    }

    /**
     * @return the docencia
     */
    public Modulo[] getDocencia() {
        return docencia;
    }

    /**
     * @param docencia the docencia to set
     */
    public void setDocencia(Modulo[] docencia) {
        this.docencia = docencia;
    }
}
