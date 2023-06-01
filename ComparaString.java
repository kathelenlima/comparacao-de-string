
package comparas;
import java.util.Scanner;
public class ComparaString {

    public static void main(String[] args) {
        //Declarações
        String nome1, nome2;
        Scanner tec = new Scanner(System.in);
        
        //Leitura
        System.out.print("Informe o 1º nome: ");
        nome1 = tec.next();
        
        System.out.print("Informe o 2º nome: ");
        nome2 = tec.next();
        
        //Compara desconsiderando a caixa:
        if (nome1.equalsIgnoreCase(nome2)){
            System.out.println("\nOs nomes digitados são igauais!");
        }else {
            System.out.println("\nOs nomes digitados são diferentes!");
        }
                
    }
    
}
