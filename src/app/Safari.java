package app;

import java.util.Scanner;

public class Safari extends App {
    private String urlAtual;

    public Safari() {
        super("Safari");
    }

    public void menu(Scanner input) {
        mostrarComandos("navegar", "sair");

        while (true) {
            lerComando(input, "🌐 Digite uma URL ou 'sair':");
            var entrada = input.nextLine().trim().toLowerCase();

            if (entrada.equals("sair")) return;

            acessarUrl(entrada);
        }
    }

    public void acessarUrl(String url) {
        if (url == null || url.isBlank()) {
            erro("URL inválida.");
        } else {
            urlAtual = url;
            informar("Acessando: " + urlAtual);
        }
    }
}
