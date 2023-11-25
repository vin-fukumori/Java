import java.util.Scanner;

class Main {
  static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {

    System.out.println("## Programa de criação de vetor ##");
    System.out.println("Qual o tamanho do vetor?");
    int qtd = input.nextInt();
    int [] x = carregarVetor(qtd);
    System.out.println("O vetor foi carregado com: ");
    exibirVetor(x);
    int maior = maiorValor(x);
    System.out.println("O maior valor é: " + maior);
    int menor = menorValor(x);
    System.out.println("O menor valor é: " + menor);
    int dif = diferenca(maior, menor);
    System.out.println("A diferença entre o maior e menor valor é: " + dif);
    boolean seq = ordemVetor(x);
    System.out.println("O vetor está em ordem crescente? " + seq);
  }

  public static int[] carregarVetor(int qtd){
    int[] x = new int[qtd];
         for (int i = 0; i < qtd; i++){
   System.out.println("Informe um valor: ");
    x[i] = input.nextInt();}
    return x;}

  public static int maiorValor(int[] vetor){
    int maior = Integer.MIN_VALUE;
     for (int i = 0; i < vetor.length; i++){
      int x = vetor[i];
       if (x > maior)
         maior = x;}
    return maior;}

    public static int menorValor(int[] vetor){
    int menor = Integer.MAX_VALUE;
     for (int i = 0; i < vetor.length; i++){
      int x = vetor[i];
       if (x < menor)
         menor = x;}
    return menor;}

    public static int diferenca(int a, int b){
    int x = a - b;
      return x;
    }

 public static boolean ordemVetor(int[] vetor){   
   for (int i = 1; i < vetor.length; i++){
    if (vetor[i-1] > vetor[i]){
      return false;    
    }
     }
     return true;
    }
  
  public static void exibirVetor(int[] vetor){
     for (int i = 0; i < vetor.length; i++){
      System.out.print(vetor[i] + " , ");
        }
    System.out.println();
    }
}