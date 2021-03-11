package com.weekone.assignment1;


/**
 * prints 4 patterns
 */
public class Pattern {
    
    /**
     * print pattern one recurizely
     * *
     * **
     * ***
     * @param stackSize - maxlayer size
     * @param currlayer - currentlayer printed
     */
    public void patternOne(int stackSize,int currlayer){
        //length of layer
        int len = currlayer + 1;

        //print layer
        for (int i=0; i<len; i++)
            System.out.print("*");
        System.out.println();

        //print next layer
        if (stackSize > currlayer + 1)
            patternOne(stackSize,currlayer + 1);
    }

    /**
     * print pattern two recurizely
     * ***
     * **
     * *
     * @param currlayer - current layer 
     */
    public void patternTwo(int currlayer){
        //print layer
        for (int i=0; i<currlayer; i++)
            System.out.print("*");
        System.out.println();

        //print next layer
        if (currlayer > 0)
            patternTwo(currlayer - 1);
    }

    /**
     * print pattern three recurizely
     *   *
     *  ***
     * *****
     * @param stackSize - maxlayer size
     * @param currlayer - currentlayer printed
     */
    public void patternThree(int stackSize,int currlayer){
        //length of layer
        int len = 2 * currlayer + 1 ;
        //lenght of blanck space
        int offest = stackSize + 2 - (currlayer + 1);
        
        //print layer
        for (int i=0; i<offest; i++)
            System.out.print(" ");
        for (int i=0; i<len; i++)
            System.out.print("*");
        System.out.println();

        //print next layer
        if (stackSize > currlayer + 1)
            patternThree(stackSize,currlayer + 1);
    }

    /**
     * print pattern four recurizely
     * *****
     *  ***
     *   *
     * @param stackSize - maxlayer size
     * @param currlayer - currentlayer printed
     */
    public void patternFour(int currlayer,int stackSize){
        //length of layer
        int len = 2 * currlayer - 1;
        //lenght of black space
        int offest = -1 * currlayer + stackSize + 2;

        //print layer
        for (int i=0; i<offest; i++)
            System.out.print(" ");
        for (int i=0; i<len; i++)
            System.out.print("*");
        System.out.println();

        //print next layer
        if (currlayer > 1)
            patternFour(currlayer - 1,stackSize);
    }

    public static void main(String[] args) {
        Pattern p = new Pattern();
        //number of layers
        int n = 4;

        //pattern one
        System.out.println("1)");
        p.patternOne(n, 0);
        System.out.println("---------");

        //pattern two
        System.out.println("2)");
        System.out.println("----------");
        p.patternTwo(n);

        //patten three
        System.out.println("3)");
        p.patternThree(n, 0);
        System.out.println("-----------");

        //pattern four
        System.out.println("4)");
        p.patternFour(n,n);
        System.out.println("-----------");
    }
}
