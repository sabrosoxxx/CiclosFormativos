
/**
 * un examen que se calificarán de uno a diez, y sacar en ambos casos una puntuación superior a cinco.
 * Los exámenes se componen de 30 preguntas que se eligen y ordenan al azar. 
 * Las preguntas tienen un enunciado y cuatro posibles respuestas
 * @author ticop
 */
public class Examen {

    private String descripcion;

    private pregunta[] listaPreguntas;

    public void calificar() {
    }

    public void elegirPregunta() {
    }

    public void ordenarPreguntas() {
    }

    private static class pregunta {

        public pregunta() {
        }
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the listaPreguntas
     */
    public pregunta[] getListaPreguntas() {
        return listaPreguntas;
    }

    /**
     * @param listaPreguntas the listaPreguntas to set
     */
    public void setListaPreguntas(pregunta[] listaPreguntas) {
        this.listaPreguntas = listaPreguntas;
    }
}
