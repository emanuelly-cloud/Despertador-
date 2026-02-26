import java.util.*;  //importação de todos os módulos da biblioteca útil
import java.time.*; //importação de todos os módulos da biblioteca time
public class Variavel {  //declaração de classe variavel
    public static void main(String[] args) {  //declaração de método executor main (), ou superclasse
        int horaAtual = LocalDateTime.now().getHour(); //declaração da variável horaAtual que vai receber em um número inteiro o resultado da chamada do metodo getHour()
        int minutoAtual = LocalDateTime.now().getMinute(); 
        int segundoAtual = LocalDateTime.now().getSecond(); //os nomes das variaveis não podem ser iguais
        System.out.println(horaAtual+";"+minutoAtual+";"+segundoAtual);  //Impressão de variavel horaAtual no terminal saída do sistema
         //para concatenar(juntar) tem que colocar o "+";"" e então o comando de minuto e segundo vão ser adicionados ao system.out
    } //finalizou método executor main()
} //finalizou classe Variavel