📱 Simulador do iPhone 2007 em Java
“Reviva o início da era dos smartphones com um toque de Java moderno.”

🎬 Introdução

iPhone 2007 Retro é um projeto em Java 24 que simula o funcionamento de um iPhone clássico diretamente no terminal. Ele recria com fidelidade a experiência dos primeiros apps lançados com o iPhone original — como o iPod para música, Telefone para chamadas e Safari como navegador — utilizando recursos de programação orientada a objetos e boas práticas modernas.

⚙️ Funcionalidades

🎶 Ipode: toca músicas, permite seleção, navegação de faixas e favoritos.

📞 Telefone: simula ligações, recebimento, conferências e encerramento.

🌐 Safari: acessa URLs via terminal com feedback em tempo real.

🧠 Sistema central: gerencia os apps, o menu principal e o fluxo do usuário.

🧱 Superclasse App: fornece comandos padronizados para todos os apps.

🧠 Tecnologias utilizadas

✅ Java 24

✅ Paradigma OO completo

✅ Terminal (CLI) como interface de usuário

✅ Diagrama UML em Mermaid

✅ Organização por pacotes e modularidade de código

📚 Público-Alvo

Estudantes de programação

Desenvolvedores Java que querem revisar boas práticas

Curiosos por simulações vintage e reinterpretações retrô

Professores e instrutores buscando material didático ilustrativo

🔁 Relação entre as classes e fluxo do sistema

O projeto simula um ambiente de terminal inspirado no iPhone clássico, com três aplicativos principais: Ipode, Telefone e Safari. O sistema é construído em Java 24 com foco em boas práticas de orientação a objetos (OO), como herança, encapsulamento, abstração e polimorfismo.

[![](https://mermaid.ink/img/pako:eNqNVV1v2jAU_SvIT1SFiBIYECGkbtWkSeWJbg9b9nCxb4i1xI5uHNSV0d9e5wNIQlY1L4nvPT6-5_jaOTCuBTKP8QjS9EHCjiD2lZCE3Eitek-ffeWrnn0KRO8-SXqHMpA_yyVsU0PAzWp1id7CliT1b2qRAHkIzVCs85n0RceghE77G0NS7RzHqYMiPAH6Gw5KIQ16JbCOkirQFFv-6xQS6evwUOkYcy1exVamjk2x3xIt6mpvY1TZqY76IkZzoHWWSg4NiQlkaUt1ihFy6-wZ30EHe1DdhISGNEeBXcmiih9SoG6EQchywa-w1yRNlx2RTA084FoKCak15dGOX0vYaw0WVAzvQPb5-u_kjTRZpO9NBlHL_CINZPJS_psPQD6fs1KZzn17sh4HWuGH9i6AF6RHuQMOHc5YxzluL4Bm11lj8wZWARIq-93Vf4rbFrSoEGIQjQ0bYlxFrZat1hGCqmX5hbfTzpboDQRA8kOSgWNq-_I7RR2tkFHU5f7V0QjbBld2NBRKe4LQMuUnCetdcNoh77xZtWxaSvEqTZ0FrEGqplgbqOT8-n3TmpMf9eW_4bAopBVqFnAOn9Yuw5Xe4XBVo6gFmyS1RJOmqLokCQs0G7AdScG8AKIUByxGe4_lY1Zo85kJMUafefZTAP3xma-OdlIC6qfWMfMMZXYa6WwXngZZIsBgdZmfEahEfpdmyjBvsigYmHdgz8wbj-6c2XTs3k3cxXjhTt3pgP21oLkzniwWs_mn0cgdzVz3OGAvxZojZz6zGBT2KqB19QPJX8c3I5Xlug?type=png)](https://mermaid.live/edit#pako:eNqNVV1v2jAU_SvIT1SFiBIYECGkbtWkSeWJbg9b9nCxb4i1xI5uHNSV0d9e5wNIQlY1L4nvPT6-5_jaOTCuBTKP8QjS9EHCjiD2lZCE3Eitek-ffeWrnn0KRO8-SXqHMpA_yyVsU0PAzWp1id7CliT1b2qRAHkIzVCs85n0RceghE77G0NS7RzHqYMiPAH6Gw5KIQ16JbCOkirQFFv-6xQS6evwUOkYcy1exVamjk2x3xIt6mpvY1TZqY76IkZzoHWWSg4NiQlkaUt1ihFy6-wZ30EHe1DdhISGNEeBXcmiih9SoG6EQchywa-w1yRNlx2RTA084FoKCak15dGOX0vYaw0WVAzvQPb5-u_kjTRZpO9NBlHL_CINZPJS_psPQD6fs1KZzn17sh4HWuGH9i6AF6RHuQMOHc5YxzluL4Bm11lj8wZWARIq-93Vf4rbFrSoEGIQjQ0bYlxFrZat1hGCqmX5hbfTzpboDQRA8kOSgWNq-_I7RR2tkFHU5f7V0QjbBld2NBRKe4LQMuUnCetdcNoh77xZtWxaSvEqTZ0FrEGqplgbqOT8-n3TmpMf9eW_4bAopBVqFnAOn9Yuw5Xe4XBVo6gFmyS1RJOmqLokCQs0G7AdScG8AKIUByxGe4_lY1Zo85kJMUafefZTAP3xma-OdlIC6qfWMfMMZXYa6WwXngZZIsBgdZmfEahEfpdmyjBvsigYmHdgz8wbj-6c2XTs3k3cxXjhTt3pgP21oLkzniwWs_mn0cgdzVz3OGAvxZojZz6zGBT2KqB19QPJX8c3I5Xlug)

🧱 Estrutura hierárquica

Main → Sistema → [Ipode, Telefone, Safari] → App (superclasse)

📌 App.java (abstract)

É a superclasse base para todos os aplicativos do sistema.

Define os métodos comuns, como:

abrir() e fechar() → mensagens de inicialização

mostrarComandos(...) → exibe comandos disponíveis

lerComando(...), informar(...), erro(...) → padronizam entrada e saída

Evita repetição de código e padroniza a experiência entre apps.

🎶 Ipode.java (música)

Herda de App.

Possui lista de músicas e vídeos.

Funcionalidades:

tocarMusica(), pausar()

selecionarMusica(Scanner) → escolha pelo usuário

avancarMusica(), retrocederMusica() → navegação por índice

adicionarFavorito(String) → marca faixas favoritas

📞 Telefone.java (chamadas)

Herda de App.

Gerencia chamadas individuais e conferência.

Funcionalidades:

fazerLigacao(String) → ligação simulada

receberLigacao(), encerrarChamada()

iniciarConferencia(String) → múltiplos participantes

Mantém estado da chamada com emChamada : boolean.

🌐 Safari.java (navegador)

Herda de App.

Simula acesso a uma URL informada pelo usuário.

Método principal:

acessarUrl(String) → imprime a URL acessada

Enxuto e direto, ideal para representar o navegador minimalista.

🧭 Sistema.java (controlador)

Classe principal do sistema, que gerencia os ciclos de vida dos apps.

Instancia os três apps (Ipode, Telefone, Safari).

Apresenta o menu principal e aguarda comandos do usuário.

Responsável por chamar abrir() → menu() → fechar() em cada app.

🎯 Main.java (entrada)

Responsável por iniciar o sistema.

Simplesmente instancia Sistema e chama iniciar().

🧬 Resumo do funcionamento

O usuário inicia o programa pelo Main.

O Sistema exibe o menu geral.

Ao digitar um app, o sistema abre o app, mostra comandos e aguarda interação.

Cada app trata seus próprios comandos usando os métodos herdados e personalizados.

Ao sair, o sistema fecha o app e volta ao menu principal.
