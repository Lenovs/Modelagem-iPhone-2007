classDiagram
direction TB

    class App {
        <<abstract>>
        +abrir()
        +fechar()
        +mostrarComandos(String...)
        +lerComando(Scanner, String)
        +informar(String)
        +erro(String)
        -nomeApp : String
    }

    class Ipod {
        +menu(Scanner)
        +tocarMusica()
        +pausar()
        +selecionarMusica(Scanner)
        +avancarMusica()
        +retrocederMusica()
        +tocarVideo()
        +adicionarFavorito(String)
        -listaDeMidias : List~String~
        -favoritos : List~String~
        -videos : List~String~
        -tituloAtual : String
        -artistaAtual : String
        -faixaAtual : int
    }

    class Telefone {
        +menu(Scanner)
        +fazerLigacao(String)
        +receberLigacao()
        +iniciarConferencia(String)
        +encerrarChamada()
        -emChamada : boolean
        -conferencia : List~String~
    }

    class Safari {
        +menu(Scanner)
        +acessarUrl(String)
        -urlAtual : String
    }

    class Iphone {
        +iniciar()
        -ipode : Ipode
        -telefone : Telefone
        -safari : Safari
    }

    class Main {
        +main(String[])
    }

    App <|-- Ipod
    App <|-- Telefone
    App <|-- Safari

    Iphone --> Ipod
    Iphone --> Telefone
    Iphone --> Safari

    Main --> Iphone
