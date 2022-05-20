class Main {
  public static void main(String[] args) {
    imprimir();
    imprimirTexto("logaratimo");
    mostrarQuadrado(10);
    somar(10, 20);
    mostrarMaior(10, 20, 30);
    mostrarSexoPorExtenso('y');
    }
  // método somar
  public static void somar(int a, int b){
    System.out.println(a + b );
    System.out.println(" ");
  }
  // método mostrar quadrado
  public static void mostrarQuadrado(int a ){
    System.out.println(Math.pow( a , 2));
    System.out.println(" ");
  }
  // método mostrarMaior
  public static void mostrarMaior(int a, int b, int c){
    System.out.println(Math.max(c,  Math.max(a, b)));
    System.out.println(" ");
    }

  // método mostrarSexoPorExtenso
  public static void mostrarSexoPorExtenso(char sexo){
    if(sexo == 'F'){
       System.out.println("Feminino");
      System.out.println(" ");
    }else if(sexo == 'M'){
       System.out.println("masculino");
      System.out.println(" ");
    }else{
       System.out.println("Desconhecis");
      System.out.println(" ");
    }
  }
  // método imprimirTexto
  public static void imprimirTexto(String texto){
    System.out.println(texto);
    System.out.println(" ");
  }
  // método imprimir
  public static void imprimir(){
    System.out.println("Aprendendo a Linguagem Java");
    System.out.println(" ");
  }
}