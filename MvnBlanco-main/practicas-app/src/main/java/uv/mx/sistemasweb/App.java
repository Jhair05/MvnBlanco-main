package uv.mx.sistemasweb;
import static spark.Spark.*;
import spark.Route;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        get("/hello", (req, res) -> "Hello world ");

        get("/aprobado", (req, res) -> {
            System.out.println( "Calificacion: 7" );
            res.redirect("/index.html");
            return res;
        });
        
    }
}


