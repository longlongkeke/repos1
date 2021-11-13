package com.company;

import java.util.Scanner;

public class 背包01 {

    public static void MaxValue(int[] v,int[]w,int C,int n) {
        int[][] dp=new int[n+1][C+1];
        for(int i=1;i<n+1;i++){
            for(int j=w[i];j<C+1;j++){
                dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-w[i]]+v[i]);//前i件物品放入背包容量为j的最大价值 等于没放入之前i-1个物品的最大价值加上第i件物品本身的价值
            }
        }
        System.out.println(dp[n][C]);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int C=input.nextInt();
        int[] w=new int[n+1];
        int[] v=new int[n+1];
        for(int i=1;i<w.length;i++){
            w[i] = input.nextInt();
        }
        for(int i=1;i<v.length;i++){
            v[i] = input.nextInt();
        }
        MaxValue(v,w,C,n);
    }
}
