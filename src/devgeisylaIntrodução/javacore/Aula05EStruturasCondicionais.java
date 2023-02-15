package devgeisylaIntrodução.javacore;
public class Aula05EStruturasCondicionais {
    public static void main(String[] args) {
        int idade = 17;
        if(idade == 16){
            System.out.println("Você já pode votar na eleição");
        }else if (idade >=18){
            System.out.println("vai lá votar!");
        }
        else{
            System.out.println("Não se aplica");
        }
    }
}