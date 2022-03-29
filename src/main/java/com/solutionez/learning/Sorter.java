package com.solutionez.learning;

public class Sorter {
    public void bubbleSort(int[] inArray) {

        //{3,2,1,7}
        //int lastUnsortedIndex = inArray.length-1;
        for ( int lastUnsortedIndex = inArray.length-1; lastUnsortedIndex >0; lastUnsortedIndex--){
           /*
            lastunsortedIndex starts at the end of the array
            we will decrement this as we loop over the array elements
            */

            System.out.println("STARTING lastUnsortedIndex " + lastUnsortedIndex);
            for (int i = 0; i < lastUnsortedIndex; i++){

                if (inArray[i] > inArray[i+1]){
                    //in here, if we check 2 adjacent elements and left element
                    //is bigger than right, then we swap them
                    this.swapElements(inArray, i,i+1);
                }


            }

            System.out.println("END lastUnsortedIndex " + lastUnsortedIndex);

        }




    }

    public void swapElements(int[] array, int posFrom, int posTo){

        if (posFrom == posTo) return;

        int posToVal = array[posTo];
        array[posTo] = array[posFrom];
        array[posFrom] = posToVal;


    }
}

