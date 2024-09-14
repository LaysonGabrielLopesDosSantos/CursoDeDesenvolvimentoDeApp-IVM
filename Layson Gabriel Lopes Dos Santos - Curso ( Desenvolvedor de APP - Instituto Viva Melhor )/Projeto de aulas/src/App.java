import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception{
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Escolha o projeto");
    System.out.println("1: Formulário");
    System.out.println("2: Converter Real em Dolar");
    System.out.println("3: Calculador de média");
    System.out.println("4: Aprovou ou não");
    System.out.println("5: Negativo ou positivo");
    System.out.println("6: Calculadora");
    System.out.println("7: Dia da semana");
    System.out.println("8: Peso ideal");
    System.out.println("9: Quantidade de maçãs");
    System.out.println("10: Marcas de carros");
    System.out.println("11: Tabuada");
    System.out.println("12: Digite sua senha com 3 chances");
    System.out.println("13: Tamanho de texto");
    System.out.println("14: Altura de texto");
    System.out.println("15: Caso contenha");
    int projeto = scan.nextInt();
    scan.nextLine();
    if (projeto == 1) { 
        System.out.println("Bem vindo ao formulario!");
        System.out.print("Digite seu nome, por favor: ");
        String nome = scan.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.print("Digite seu sexo: ");
        scan.nextLine();
        String genero = scan.nextLine();
        System.out.println("Seu nome é: "+nome+", Minha idade é: "+idade+", e meu sexo é: "+genero);
    } else if (projeto == 2) {
        System.out.print("Bem vindo, converteremos seu dinheiro em dolar, digite o valor: ");
        double dinheiro = scan.nextDouble() / 5;
        System.out.println("Você tem " + dinheiro + " dolares");
    } else if (projeto == 3) {   
        System.out.print("Bom dia, vamos calcular sua média. Primeira Nota: ");
        double nota1 = scan.nextDouble();
        System.out.print("Segunda nota: ");
        double nota2 = scan.nextDouble();
        System.out.print("Terceira nota: ");
        double nota3 = scan.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Sua média é " + media);
    } else if (projeto == 4) {
        System.out.println("Bem vindo, veremos se você foi aprovado!");
        System.out.println("Digite sua nota: ");
        int nota = scan.nextInt();
        if (nota >= 7) {
            System.out.println("Você foi aprovado! :)");
        } else if (nota >= 5 && nota <= 6) {
            System.out.println("Você está de recuperação :(");
        } else {
            System.out.println("Você reprovou... Estude mais!! :("); }
    } else if (projeto == 5) {
        System.out.println("Bem vindo, veremos se seu numero é negativo ou positivo!");
        System.out.println("Digite seu numero: ");
        int ne_po = scan.nextInt();
        if (ne_po>=0) {
            System.out.println("Seu numero é positivo!");
        } else {
            System.out.println("Seu numero é negativo!"); }
    } else if (projeto == 6) {
        System.out.println("Digite o primeiro número: ");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scan.nextDouble();
        System.out.println("Digite 1 para somar, 2 para subtrair, 3 para de dividir, 4 para multiplicar: ");
        int operador = scan.nextInt();
        double valor;
        switch (operador) {
            case 1:
                valor = num1 + num2;
                System.out.println(valor);
            break;
            case 2:
                valor = num1 - num2;
                System.out.println(valor);
            break;
            case 3:
                valor = num1 / num2;
                System.out.println(valor);
            break;
            case 4:
                valor = num1 * num2;
                System.out.println(valor);
            break;
            default:
                System.out.println("Invalido"); }
    } else if (projeto == 7) {
        System.out.println("Digite o dia da semana em numero: ");
        int diasmn = scan.nextInt();
        switch (diasmn) {
            case 1: case 7:
                System.out.println("Fim de semana");
            break;
            case 2: case 3: case 4: case 5: case 6:
                System.out.println("Dia util");
            break;
            default:
                System.out.println("Invalido"); } 
    } else if (projeto == 8) {
        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Digite 1 se você é do genero feminino, digite 2 se você é do genero masculino, biologicamente: ");
        int genero = scan.nextInt();
        double peso = 0;
        if (genero==2) {
            peso = (72.7*altura)-58;
        } else if (genero==1) {
            peso = (62.1*altura)-44.7;
        } else {
            System.out.println("Digito incorreto!");
        } if (peso!=0) {
            System.out.println("Seu peso ideal é: "+ peso); }
    } else if (projeto == 9) {
        System.out.println("Selecione a quantidade de maçãs: ");
        double fruit = scan.nextDouble();
        double valor = 0;
        if (fruit>=12) {
            valor = 0.25;
        } else {
            valor = 0.30; }
        double valorfinal = fruit*valor;
        System.out.println("O valor de cada maçã é "+valor+" e o valor total é "+valorfinal);
    } else if (projeto == 10) {
        System.out.println("Conheça 5 marcas de carros diferentes");
        int marca = 0;
        for (;marca<=5;marca++) {
            switch (marca) {
                case 1:
                    System.out.println("Volvo");
                break;
                case 2:
                    System.out.println("Ford");
                break;
                case 3:
                    System.out.println("Lamborghini");
                break;
                case 4:
                    System.out.println("Nissan");
                break;
                default:
                    System.out.println("Ferrari"); } }
    } else if (projeto == 11) {
        System.out.println("Digite a tabuada que o senhor queira ver: ");
        int tabuada = scan.nextInt();
        int num = 0;
        int valor;
        while (num <= 10) {
            valor = num*tabuada;
            System.out.println(num+" vezes "+tabuada+ " é igual a: " + valor);
            num++;
        }
    } else if (projeto == 12) {
        System.out.print("Digite o nome de usuario: ");
        String nome = scan.nextLine();
        System.out.println("Digite uma senha: ");
        String senha = scan.nextLine();
        int senhaerr = 0;
        System.out.println("Digite a senha, para acessar: ");
        while(senhaerr<4) {
            String senhat = scan.nextLine();
            if (senha.equalsIgnoreCase(senhat)) {
                System.out.println("Aprovado");
                senhaerr = 5;
            } else {
                senhaerr++;
                System.out.println("Tente novamente");
            }
        }
        if (senhaerr == 4) {
            System.out.println("Usuario bloqueado!");
        }
    } else if (projeto == 13){
        System.err.print("Vamos contar as letras de sua palavra, digite a: ");
        String texto = scan.nextLine();
        int textonum = texto.length();
        System.out.println(textonum+" letras");
    } else if (projeto == 14){
        char letras = 'a';
        boolean letrasvf = Character.isLowerCase(letras);
        System.out.println(letrasvf);
    } else if (projeto == 15){
        System.out.print("Diga nos, para onde quer ir? Sul, Norte, Leste ou Oeste?");
        int loop = 1;
        while (loop == 1) {
            String destino = scan.nextLine();
            if (destino.contains("Sul")) {
                System.out.print("Você acabou na praia, voltar?");
                String resposta = scan.nextLine();
                loop++;
                if (resposta.contains("Sim")) {
                    System.out.println("Voltamos, quer ir para onde?");
                    loop--;
                } else if (resposta.contains("Não")){
                    System.out.println("Ok, aproveite a vista!");
                } else {
                    System.out.print("Resposta invalida!");
                }
            } else if (destino.contains("Norte")) {
                System.out.print("Você acabou chegando na floresta, voltar?");
                String resposta = scan.nextLine();
                loop++;
                if (resposta.contains("Sim")) {
                    System.out.println("Voltamos, quer ir para onde?");
                    loop--;
                } else if (resposta.contains("Não")){
                    System.out.println("Ok, aproveite a vista!");
                } else {
                    System.out.print("Resposta invalida!");
                }
            } else if (destino.contains("Leste")) {
                System.out.print("Você acabou chegando nas montanhas, voltar?");
                String resposta = scan.nextLine();
                loop++;
                if (resposta.contains("Sim")) {
                    System.out.println("Voltamos, quer ir para onde?");
                    loop--;
                } else if (resposta.contains("Nao")){
                    System.out.println("Ok, aproveite a vista!");
                } else {
                    System.out.print("Resposta invalida!");
                }
            } else if (destino.contains("Oeste")) {
                System.out.print("Você acabou chegando no ferro-velho, voltar?");
                String resposta = scan.nextLine();
                loop++;
                if (resposta.contains("Sim")) {
                    System.out.println("Voltamos, quer ir para onde?");
                    loop--;
                } else if (resposta.contains("Não")){
                    System.out.println("Ok, aproveite a vista!");
                } else {
                    System.out.print("Resposta invalida!");
                }
            } else {
                System.out.println("Opção invalida!");
                System.out.print("Tente novamente: ");
            }
        }
    }
} }