import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String [] args)
    {
        //Instanciamos objetos de tipo Categoria
        Categoria java = new Categoria ("Java");
        Categoria programacion = new Categoria("Programación");

        //Definiendo lista de autores
        List<Categoria> categorias = new ArrayList<>();
        categorias.add(java);
        categorias.add(programacion);

        //Instanciamos un objeto de tipo Autor
        Autor at1 = new Autor("José Barrientos");
        Autor at2 = new Autor("Mario Bautista");

        //Definiendo lista de autores
        List<Autor> autores = new ArrayList<>();
        autores.add(at1);
        autores.add(at2);

        //Instanciamos un objeto del tipo Titulo
        Titulo t1 = new Titulo();
        t1.titulo = "Programación Orientada a objetos";
        t1.edicion = "Segunda edición";
        t1.ISBN = "190249111";
        t1.autores = autores;
        t1.categorias = categorias;

    }
}
