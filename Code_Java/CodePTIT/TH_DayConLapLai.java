/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TH_DayConLapLai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[][] dp = new int[109][109];
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int res = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (s.charAt(i - 1) == s.charAt(j - 1) && i != j) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } 
                    else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                    res = Math.max(res, dp[i][j]);
                }
            }
            System.out.println(res);
        }
    }
}
