package service;

import exception.ParametrosInvalidosException;

import java.util.Scanner;

import static java.lang.System.*;

public class Contador {

    Scanner scanner = new Scanner(in);

    public void contando() throws ParametrosInvalidosException{

        out.print("Digite o primeiro número: ");
        int parametro1 = scanner.nextInt();

        out.print("Digite o segundo número: ");
        int parametro2 = scanner.nextInt();

        try {

            if (parametro1 > parametro2) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            int numeroDeInteracoes = parametro2 - parametro1;
            for (int i = 1; i <= numeroDeInteracoes; i++) {
                out.println("Imprimindo o número " + i);
            }

        } catch (NumberFormatException e) {
            out.println("Por favor, forneça números inteiros válidos.");
        } catch (ParametrosInvalidosException e) {
            out.println(e.getMessage());
        }
    }
}
