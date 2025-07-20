package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Telefone extends App {
    private boolean emChamada = false;
    private final List<String> conferencia = new ArrayList<>();

    public Telefone() {
        super("Telefone");
    }

    public void menu(Scanner input) {
        mostrarComandos("ligar", "receber", "conferencia", "encerrar", "sair");

        while (true) {
            lerComando(input, "📞 Digite o comando:");
            var cmd = input.nextLine().trim().toLowerCase();
            switch (cmd) {
                case "ligar" -> {
                    lerComando(input, "Número para ligar:");
                    fazerLigacao(input.nextLine());
                }
                case "receber" -> receberLigacao();
                case "conferencia" -> {
                    lerComando(input, "Contatos separados por vírgula:");
                    iniciarConferencia(input.nextLine());
                }
                case "encerrar" -> encerrarChamada();
                case "sair" -> { return; }
                default -> erro("Comando inválido.");
            }
        }
    }

    public void fazerLigacao(String numero) {
        if (!emChamada) {
            emChamada = true;
            informar("Ligando para " + numero + "...");
        } else {
            erro("Já está em chamada.");
        }
    }

    public void receberLigacao() {
        if (!emChamada) {
            emChamada = true;
            informar("Recebendo ligação...");
        } else {
            erro("Já está em chamada.");
        }
    }

    public void iniciarConferencia(String contatos) {
        if (!emChamada) {
            emChamada = true;
            conferencia.clear();
            for (var contato : contatos.split(",")) {
                conferencia.add(contato.trim());
            }
            informar("Conferência iniciada com: " + String.join(", ", conferencia));
        } else {
            erro("Já está em chamada. Encerre antes de iniciar outra.");
        }
    }

    public void encerrarChamada() {
        if (emChamada) {
            emChamada = false;
            conferencia.clear();
            informar("Chamada encerrada.");
        } else {
            erro("Nenhuma chamada ativa.");
        }
    }
}
