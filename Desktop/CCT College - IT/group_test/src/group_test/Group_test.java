/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group_test;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

/**
 *
 * @author 35383
 */
public class Group_test {

    }

    // Mayara
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;

    }

    public double divide(double a, double b) {

        if (b == 0) {

            System.out.println("Error! Dividing by zero is not allowed.");

            return 0;

        } else {

            return a / b;

        }
    }

    public double modulo(double a, double b){
            
            if( b == 0) {
              
              System.out.println("Error! Dividing by zero is not allowed.");
              
              return 0;
              
            } else {
              
              return a % b;
            }

    static void WillianMethood() {
        /**
         * @willian
         */
        System.out.println("This is Willian Methood");
        System.out.println("This is my prog");
        return;
    }

    static void wallace() {
        /**
         * @Wallace
         */
        System.out.println("wallace here");
        return;
    }

    static void CaioOliveira() {
        /**
         * @Caio
         */
        System.out.println("Caio here");
        return;
    }

    public static void main(String[] args) {

        Mayaramethod();
        WillianMethood();
        wallace();
        CaioOliveira();
        rennerSantana();

    }
}