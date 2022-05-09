/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

/**
 *
 * @author yandisa
 */
public class DiceGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dice1;
        int dice2;
        int count =0;
        int theSum = 0;
        int lowest = Interger.MAX_VALUE;
        int finalSum = 0;
        int diceSum = 0;
        int totalSum =0;
        
        while((Count < Interger.parseInt(args[]))){
          count = count +1;
          diceSum = 0;
          theSum = 0;
          while(diceSum !=7){
        
          diceSum = 0;
          dice1 = 1 +(int)(Math.random()*(60-1)+1);
          dice2 = 1+(int)(Math.random()*(6-1)+1);
          diceSum =  dice1 +dice2;
          if (diceSum ! = 7){
              theSum = theSum + diceSum;
          }
                  
        
        
        
        
        }
    }    
}
