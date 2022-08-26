import java.util.List;
public class Autor
{
    String nombre;
    List<Titulo> titulos;

    public Autor()
    {

    }

    //Sobrecarga de constructores
    public Autor (String nombre)
    {
        this.nombre = nombre;
    }

    public Autor (String nombre, List<Titulo> titulos)
    {
        this.nombre=nombre;
        this.titulos=titulos;
    }
}
