package iphone;

import app.Ipod;
import app.Telefone;
import app.Safari;

import java.util.Scanner;

public class Iphone {
    private final Ipod ipode = new Ipod();
    private final Telefone telefone = new Telefone();
    private final Safari safari = new Safari();

    public void iniciar() {
        var input = new Scanner(System.in);

        System.out.println("📱 Bem-vindo ao iPhone 2007 Retro!");
        System.out.println("Digite o nome de um app: ipod, telefone, safari — ou 'sair' para encerrar.");

        while (true) {
            System.out.print("🧭 Escolha um app: ");
            var comando = input.nextLine().trim().toLowerCase();

            switch (comando) {
                case "sair" -> {
                    System.out.println("👋 Encerrando o sistema. Até logo!");
                    return;
                }
                case "ipod" -> {
                    ipode.abrir();
                    ipode.menu(input);
                    ipode.fechar();
                }
                case "telefone" -> {
                    telefone.abrir();
                    telefone.menu(input);
                    telefone.fechar();
                }
                case "safari" -> {
                    safari.abrir();
                    safari.menu(input);
                    safari.fechar();
                }
                default -> System.out.println("❌ App não reconhecido. Tente novamente.");
            }
        }
    }
}
