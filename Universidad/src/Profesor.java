public class Profesor extends Trabajador{
    private Integer id;
    private String catedraQueDicta;
    private Aula aula;
    private Departamento departamento;
    private Dedicacion dedicacion;

    enum Dedicacion {
        SIMPLE, SEMIEXCLUSIVA, EXCLUSIVA;
    }
}
