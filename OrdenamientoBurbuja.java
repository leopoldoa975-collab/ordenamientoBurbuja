/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenamientoburbuja;

/**
 *
 * @author Lenovo
 */
public class OrdenamientoBurbuja {

    public static void main(String[] args) {
        // Caso 1: Arreglo desordenado para Burbuja Normal
        int[] arreglo1 = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("--- PRUEBA BURBUJA NORMAL ---");
        System.out.print("Arreglo inicial: ");
        imprimirArreglo(arreglo1);
        
        ordenamientoBurbuja(arreglo1);
        
        System.out.print("Arreglo final:   ");
        imprimirArreglo(arreglo1);
        
        System.out.println("\n-----------------------------------\n");

        // Caso 2: Arreglo parcialmente ordenado para Burbuja Mejorado
        int[] arreglo2 = {1, 2, 4, 3, 5, 6}; // Casi ordenado
        
        System.out.println("--- PRUEBA BURBUJA MEJORADO ---");
        System.out.print("Arreglo inicial: ");
        imprimirArreglo(arreglo2);
        
        ordenamientoBurbujaMejorado(arreglo2);
        
        System.out.print("Arreglo final:   ");
        imprimirArreglo(arreglo2);
    }

    // Método auxiliar para imprimir el arreglo de forma bonita
    public static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Método 1: Burbuja Normal
    public static void ordenamientoBurbuja(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    // Método 2: Burbuja Mejorado
    public static void ordenamientoBurbujaMejorado(int[] arreglo) {
        int n = arreglo.length;
        boolean huboCambio;
        for (int i = 0; i < n - 1; i++) {
            huboCambio = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    huboCambio = true;
                }
            }
            if (!huboCambio) {
                break;
            }
        }
    }
}
