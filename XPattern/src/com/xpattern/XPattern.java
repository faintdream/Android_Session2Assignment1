//Program to display X pattern on console

package com.xpattern;

public class XPattern {
    int row,col,size=5; // variable declaration to hold row number, column number and matrix size as 5
                        // Matrix dipiction
                        //  1   2   3   4   5
                       // 1 *               *
                       //
                       // 2     *       *
                       //
                       // 3         *
                       //
                       // 4     *       *
                       //
                       // 5 *                *
                    
    void pattern(){     
     for(row=1;row<=size;row++) {   //loop through rows 
       for(col=1;col<=size;col++){  // after each row iteration loop through all columns         
           if( row==col||row+col==size+1){ //print a star if row and col size is same
                                           // or addition of row and col size same as total size +1
                                           // note: we needed to do size +1 because row and col start with 1 instead of 0
                                           
               System.out.print("*");
           }
           else
           {
               System.out.print(" ");              // if either of the two conditions not satisfied print a space
           }          
           
       }  
         System.out.println("");                  // this empty statement helps to go to next line, at the end of each row iteration.
     }                  
     
   }
    public static void main(String[] args) {

        XPattern obj=new XPattern();
        obj.pattern();
        
        
    }
    
}
