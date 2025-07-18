# 📱 Simulador do iPhone 2007 em Java

Recriação simplificada de três aplicativos icônicos do primeiro iPhone, usando Java com interação por prompt:

- 🎵 iPod: Reproduz músicas com comandos básicos
- ☎️ Telefone: Faz chamadas fictícias e gerencia contatos
- 🌐 Safari: Navega via entrada de URL simulada

---

## 🚀 Como executar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/Modelagem-iPhone-2007.git
cd Modelagem-iPhone-2007
Modelagem-iPhone-2007/
├── src/
│   ├── apps/
│   │   ├── App.java
│   │   ├── IpodPlayer.java
│   │   ├── Telefone.java
│   │   └── Safari.java
│   └── iphone/
│       ├── iPhone.java
│       └── Main.java
├── README.md
└── .gitignore
```mermaid
classDiagram
    class App {
        - nome: String
        + getNome(): String
        + menu(): void
    }

    class ReprodutorMusical {
        - playlist: List<String>
        - faixaAtual: String
        + menu(): void
        + tocar(): void
        + pausar(): void
        + selecionarMusica(musica: String): void
    }

    class AparelhoTelefonico {
        - contatos: Map<String, String>
        - historico: List<String>
        + menu(): void
        + ligar(numero: String): void
        + atender(): void
        + iniciarCorreioVoz(): void
    }

    class NavegadorInternet {
        + menu(): void
        + exibirPagina(url: String): void
        + adicionarNovaAba(): void
        + atualizarPagina(): void
    }

    class iPhone {
        - aplicativos: List<App>
        + iniciarInterface(): void
    }

    class Main {
        + main(args: String[]): void
    }

    %% Relações
    App <|-- ReprodutorMusical
    App <|-- AparelhoTelefonico
    App <|-- NavegadorInternet
    iPhone --> App
    Main --> iPhone
