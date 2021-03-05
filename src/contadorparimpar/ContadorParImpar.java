
package contadorparimpar;

import java.util.Scanner;

/* @author ARTHUR CASTRO */

public class ContadorParImpar {

    public static void main(String[] args) {
        
        int par, impar, num;
        
        /*PROCESSAMENTO*/
        
        par=0;
        impar=0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("***CONTADOR DE PARES E IMPARES***\nPRESSIONE 0 PARA SAIR");
        
        do{
            System.out.println("DIGITE UM NUMERO: ");
            num = teclado.nextInt();
            
            if(num%2==0){
                par++;
            }else{
                impar++;
            }
        }while( num!=0);
        
        par=par-1; /*PARA NAO CONTAR O ZERO DO FINAL*/
        
        System.out.printf("\nFORAM DIGITADOS %d NUMEROS PARES E %d NUMEROS IMPARES\n", par, impar);
        
    }
    
}
