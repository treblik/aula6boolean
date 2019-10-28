
package confirmarsenha;

import java.util.Scanner;

/**
 *
 * @author Aluno01
 */
public class ConfirmarSenha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        
        Usuario u = new Usuario();
         System.out.println("Digite um O email:");
        //guardo o valor digitado pelo usuario através do sc.nextLine na variável email 
        u.email = sc.nextLine();
        System.out.println("Digite a senha:");
       u.senha = sc.nextLine();
        System.out.println("Repita a senha:");
        u.confirmarSenha = sc.nextLine();
        
       
       
       boolean b;
       int i1;
       int i2;
       
       i1 = 10;
       i2= 5;
       
    } 
}
