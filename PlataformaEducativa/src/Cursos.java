import java.util.ArrayList;
import java.util.Date;

public class Cursos {
    private String titulo;
    private String descripcion;
    private Date fechaDeInicio;
    private Integer duracionEnMeses;

    enum Nivel {
        BASICO, INTERMEDIO, AVANZADO;
    }

    private Profesores profesor;
    private ArrayList<Tutores> tutores;
    private ArrayList<RecursosDidacticos> recursos;


}
