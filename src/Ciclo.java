
/**
 * Un ciclo formativo se compone de una serie de competencias profesionales,
 * que tienen una descripción y que, a su vez, están formadas por uno o
 * varios módulos, que tienen un nombre, y un número de horas. 
 * @author ticop
 */
public class Ciclo {

    private String nombre;

    private String descripcion;

    private int horas;

    private int year;

    private competencia[] listaCompetencias;

    private static class competencia {

        public competencia() {
        }
    }

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
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the listaCompetencias
     */
    public competencia[] getListaCompetencias() {
        return listaCompetencias;
    }

    /**
     * @param listaCompetencias the listaCompetencias to set
     */
    public void setListaCompetencias(competencia[] listaCompetencias) {
        this.listaCompetencias = listaCompetencias;
    }
}
