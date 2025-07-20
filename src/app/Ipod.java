package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ipod extends App {
    private final List<String> listaDeMidias = new ArrayList<>(List.of("Hey Jude", "Let It Be", "Yesterday", "Imagine"));
    private final List<String> favoritos = new ArrayList<>();
    private final List<String> videos = new ArrayList<>(List.of("Clip: Hey Jude"));
    private String tituloAtual;
    private String artistaAtual;
    private int faixaAtual = 0;

    public Ipod() {
        super("Ipode");
    }

    public void menu(Scanner input) {
        mostrarComandos("play", "pause", "listar", "favorito", "video", "avancar", "retroceder", "sair");

        while (true) {
            lerComando(input, "🎧 Digite o comando:");
            var cmd = input.nextLine().trim().toLowerCase();
            switch (cmd) {
                case "play" -> tocarMusica();
                case "pause" -> pausar();
                case "listar" -> selecionarMusica(input);
                case "favorito" -> {
                    lerComando(input, "Nome da mídia favorita:");
                    adicionarFavorito(input.nextLine());
                }
                case "video" -> tocarVideo();
                case "avancar" -> avancarMusica();
                case "retroceder" -> retrocederMusica();
                case "sair" -> { return; }
                default -> erro("Comando inválido.");
            }
        }
    }

    public void tocarMusica() {
        if (listaDeMidias.isEmpty()) {
            erro("Nenhuma música disponível.");
            return;
        }

        faixaAtual = Math.max(0, Math.min(faixaAtual, listaDeMidias.size() - 1));
        tituloAtual = listaDeMidias.get(faixaAtual);
        artistaAtual = "Artista Desconhecido";

        informar("Tocando faixa " + (faixaAtual + 1) + ": '" + tituloAtual + "'");
    }

    public void pausar() {
        informar("Reprodução pausada.");
    }

    public void selecionarMusica(Scanner input) {
        if (listaDeMidias.isEmpty()) {
            erro("Lista de músicas vazia.");
            return;
        }

        System.out.println("🎼 Selecione uma música:");
        for (int i = 0; i < listaDeMidias.size(); i++) {
            System.out.println((i + 1) + ". " + listaDeMidias.get(i));
        }

        lerComando(input, "Número da música:");
        try {
            var escolha = Integer.parseInt(input.nextLine());
            if (escolha < 1 || escolha > listaDeMidias.size()) {
                erro("Opção inválida.");
                return;
            }

            faixaAtual = escolha - 1;
            tocarMusica();
        } catch (NumberFormatException e) {
            erro("Entrada inválida. Digite um número.");
        }
    }

    public void avancarMusica() {
        if (listaDeMidias.isEmpty()) {
            erro("Lista de músicas vazia.");
            return;
        }

        faixaAtual = (faixaAtual + 1) % listaDeMidias.size();
        tocarMusica();
    }

    public void retrocederMusica() {
        if (listaDeMidias.isEmpty()) {
            erro("Lista de músicas vazia.");
            return;
        }

        faixaAtual = (faixaAtual - 1 + listaDeMidias.size()) % listaDeMidias.size();
        tocarMusica();
    }

    public void tocarVideo() {
        if (!videos.isEmpty()) {
            informar("Reproduzindo vídeo: " + videos.get(0));
        } else {
            erro("Nenhum vídeo disponível.");
        }
    }

    public void adicionarFavorito(String media) {
        favoritos.add(media);
        informar("'" + media + "' foi adicionada aos favoritos.");
    }
}
