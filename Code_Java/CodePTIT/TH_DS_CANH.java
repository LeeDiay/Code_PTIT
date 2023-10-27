/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.util.Collection;
import java.util.Scanner;

class Pair<T, S> {

    private T first;
    private S second;

    public Pair(T firstElement, S secondElement) {
        first = firstElement;
        second = secondElement;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + ")";
    }

}

public class TH_DS_CANH {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] a = new int[t+5][t+5];
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= t; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] == 1 && i < j) {
                    Pair<Integer, Integer> p = new Pair(i, j);
                    System.out.println(p);
                }
            }
        }
        
    }
}
