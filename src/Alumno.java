/**
 * public class Alumno extends Persona llama a la clase madre persona
 * @author ticop
 */
public class Alumno extends Persona {
    /**
     * Calcula la media de los alumno
     */
     private double notamedia;
    /**
     * Los alumnos y alumnas de Ciclos Formativos a Distancia se matriculan de varios módulos 
     */
    private Modulo[] matricula;
    /**
     * @return the notamedia
     */
    public double getNotamedia() {
        return notamedia;
    }

    /**
     * @param notamedia the notamedia to set
     */
    public void setNotamedia(double notamedia) {
        this.notamedia = notamedia;
    }

    /**
     * @return the matricula
     */
    public Modulo[] getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(Modulo[] matricula) {
        this.matricula = matricula;
    }

   

    public void emitierCertificado() {
    }

    public double calcularNotaMedia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void matricular() {
    }
}
