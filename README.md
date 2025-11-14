Henrique Peduto RM:93658
Pedro Rossini RM:94420

Este projeto foi desenvolvido para a atividade GS2 em Kotlin, utilizando Android Studio e Jetpack Compose. O objetivo foi criar um aplicativo simples com navegação entre telas, contendo login, menu principal, cálculo de IMC e uma tela com os integrantes da equipe. A proposta segue exatamente o que foi solicitado no enunciado da prova, garantindo que todas as funcionalidades essenciais estivessem funcionando e organizadas de forma clara.

O aplicativo inicia na tela de Login, onde o usuário deve informar nome de usuário e senha para acessar o sistema. Foram usados valores fixos para validação, apenas com a intenção de demonstrar o funcionamento da navegação e do controle de acesso.
![image](https://github.com/user-attachments/assets/ac3197e0-5b56-4a23-a105-c0116f70fed7)



Após entrar, o usuário é direcionado ao Menu Principal, que apresenta as três opções principais do app: acessar o cálculo de IMC, visualizar a equipe ou voltar para a tela de login. A navegação entre as telas foi feita com NavController e NavHost, utilizando rotas simples para facilitar o fluxo.
![image](https://github.com/user-attachments/assets/79728602-a0a3-49dd-8312-207b429ad83c)

Na opção de Cálculo de IMC, o usuário informa seu nome, peso e altura. O cálculo segue a fórmula tradicional (peso / altura²), e o resultado é exibido logo abaixo, já formatado com duas casas decimais. Também há um botão para retornar ao menu.
![image](https://github.com/user-attachments/assets/e5a014bd-7f47-428a-b6e7-cd5249ce9ab2)


Por fim, a tela de Equipe apenas apresenta os nomes dos integrantes e um botão de retorno. A ideia dessa tela é cumprir o requisito estrutural do projeto e deixar o fluxo completo.
![image](https://github.com/user-attachments/assets/baa9cbd9-176b-449d-9821-30fc59180498)


O projeto foi configurado com minSdk 26 e compile/target SDK 36, conforme exigido pelas versões mais recentes das bibliotecas AndroidX utilizadas. Todas as dependências necessárias estão incluídas no build.gradle, incluindo Navigation Compose para as trocas de tela.
