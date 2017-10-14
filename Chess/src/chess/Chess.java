/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 * Night to King Problem
 *
 * @author Harsh
 */
import java.util.*;
public class Chess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kx = sc.nextInt();
        int ky = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(kx==x && ky==y){
            System.out.println("0");
            return;
        }
        if(Math.abs(kx-x)==7 && Math.abs(ky-y)==7){
            System.out.println("6");
            return;
        }
        if((Math.abs(kx-x)==1 && Math.abs(ky-y)==1) || (Math.abs(kx-x)==2 && Math.abs(ky-y)==2)){
            System.out.println("4");
            return;
        }
        if(((Math.abs(kx-x)+Math.abs(ky-y))%2)==0){
            //System.out.println("A");
            if((Math.abs(kx-x)<5) && (Math.abs(ky-y)<5) && (Math.abs(kx-x)+Math.abs(ky-y))<8){
                //System.out.println("B");
                System.out.println("2");
            }
            else System.out.println("4");
        }
        else{
            if(Math.abs(kx-x)+Math.abs(ky-y)<=9 && Math.abs(kx-x)!=7 && Math.abs(ky-y)!=7){
                if((Math.abs(kx-x)+Math.abs(ky-y)==3) && (kx!=x && ky!=y)){
                    System.out.println("1");
                }
                else System.out.println("3");
            }
            else System.out.println("5");
            }
        }
    
}
