package app;

import java.util.Scanner;

public abstract class App {
    protected String nomeApp;  // Nome para mensagens personalizadas

    public App(String nomeApp) {
        this.nomeApp = nomeApp;
    }

    public void abrir() {
        System.out.println("🔓 " + nomeApp + " aberto");
    }

    public void fechar() {
        System.out.println("🚪 " + nomeApp + " fechado");
    }

    public void mostrarComandos(String... comandos) {
        System.out.println("📋 Comandos disponíveis:");
        for (String c : comandos) {
            System.out.println("- " + c);
        }
    }

    public void lerComando(Scanner input, String mensagem) {
        System.out.print(mensagem + " ");
    }

    public void informar(String texto) {
        System.out.println("ℹ️ " + texto);
    }

    public void erro(String texto) {
        System.out.println("❌ " + texto);
    }
}
