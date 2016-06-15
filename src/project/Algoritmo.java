/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;


/**
 *
 * @author Jhordy
 */
public class Algoritmo {
    private static ArrayList<SujetoExterna> listaExterna;
    private static ArrayList<SujetoExterna> listaInterna;
   
    public static void cargarListas(){
    
    }
    
    public static int algoritmoDistancia(String str1,String str2){
        char[] charArrayStr1=str1.toCharArray();char[] charArrayStr2=str2.toCharArray();
        int[][] distanceTable = new int[charArrayStr1.length+1][charArrayStr2.length+1];int cost;
        //rellenar bordes
        for (int i = 0; i <= charArrayStr1.length; i++) {
            distanceTable[i][0]=i;
        }
        for (int j = 0; j <= charArrayStr2.length; j++) {
            distanceTable[0][j]=j;
        }
        //rellenar centro de izquierda a derecha y de arriba hacia abajo
        for (int i = 1; i <= charArrayStr1.length; i++) {
            for (int j = 1; j <= charArrayStr2.length; j++) {
                if (charArrayStr1[i-1]==charArrayStr2[j-1])cost=0;
                else cost=1;
                //minimo entre eliminar, insertar y sustituir
                distanceTable[i][j] = minimo(distanceTable[i-1][j]+1,distanceTable[i][j-1]+1,distanceTable[i-1][j-1]+cost);
            }
        }
        /*for (int i = 0; i <= charArrayStr1.length; i++) {
            System.out.println(Arrays.toString(distanceTable[i]));
        }*/
        return distanceTable[charArrayStr1.length][charArrayStr2.length]; 
    }
    
    public static String algoritmoFonetico(String s){
        char[] charArrayS = s.toUpperCase().toCharArray();
        char letraInicial=charArrayS[0];
        for (int i = 0; i < charArrayS.length; i++) {
            switch (charArrayS[i]) {
                case 'B':
                case 'F':
                case 'P':
                case 'V':
                    charArrayS[i] = '1';
                    break;
                case 'C':
                case 'G':
                case 'J':
                case 'K':
                case 'Q':
                case 'S':
                case 'X':
                case 'Z':
                    charArrayS[i] = '2';
                    break;
                case 'D':
                case 'T':
                    charArrayS[i] = '3';
                    break;
                case 'L':
                    charArrayS[i] = '4';
                    break;
                case 'M':
                case 'N':
                    charArrayS[i] = '5';
                    break;
                case 'R':
                    charArrayS[i] = '6';
                    break;
                default:
                    charArrayS[i] = '0';
                    break;
            }
        }
        String salida = ""+letraInicial;
        for (int i = 1; i < charArrayS.length; i++)
            if (charArrayS[i] != charArrayS[i-1] && charArrayS[i] != '0')
                salida += charArrayS[i];
        salida+="0000";
        return salida.substring(0,4);
    }

    public static boolean filtroAlgoritmoFonetico(String nombres,String apellidos,double concordancia){
        ArrayList<String> filtroFonetico = new ArrayList<>();    
        return filtroAlgoritmoDistancia(filtroFonetico, nombres, apellidos, concordancia);
    }
    
    public static boolean filtroAlgoritmoDistancia(ArrayList<String> filtroFonetico,String nombres,String apellidos,double concordancia) {
        return true;
    }
    
    public static int minimo(int x,int y,int z){
        if(x<=y && x<=z)return x;
        else if(y<=x && y<=z)return y;
        else return z;
    }
}
