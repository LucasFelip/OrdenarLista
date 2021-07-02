/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CocktailSort;

import Util.ManiArquivo;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Inspion
 */
public class Run {
    
    public static void main(String[] args) {
        CocktailSort cocktailsort = new CocktailSort();
        Scanner ler = new Scanner(System.in);
        
        int n = 0;
        
        String arquivo = "src\\Entrada\\teste.txt";
        String[] convert = ManiArquivo.lerArquivo(arquivo);
        int arr[] = new int[convert.length];
        
        System.out.println(" ===== ARQUIVO ABERTO ===== ");
        System.out.println(Arrays.toString(convert));
        
        do{
            System.out.print("\nInsira o número - 1 - para iniciar a sortear...");
            n = ler.nextInt();
            switch(n){
                case 1:
                    System.out.println("\n\n ===== COCKTAIL SORT ===== ");
                    for(int i = 0; i< convert.length; i++)
                        arr[i] = Integer.parseInt(convert[i]);
                    
                    cocktailsort.cocktailSort(arr);
                    
                    System.out.print("Resultado é: ");
                    System.out.println(Arrays.toString(arr));
                    break; 
            }
        }while(n != 1);
    }
    
}
