import exception.ParametrosInvalidosException;
import service.Contador;

public class Main {
    public static void main(String[] args) throws ParametrosInvalidosException {

        Contador contador = new Contador();
        contador.contando();

    }
}