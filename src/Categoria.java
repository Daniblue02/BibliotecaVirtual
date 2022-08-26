import java.util.List;

public class Categoria
{
    String nombre;
    List<Titulo> titulos;
    Categoria supercategoria;

    public Categoria ()
    {

    }
    public Categoria (String nombre)
    {
        this.nombre = nombre;
    }
}
