package isp.lab2.Exercise1RandomArray;

import java.util.Random;

public class Exercise1RandomArray {

    public static int[] getArrayOfRandomNumbers(int n) {
        int[] array = new int[n];
        //TODO: implement the logic to fill the array with random numbers
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]= rand.nextInt();
        }
        return array;
    }

    public static int[] findMaxAndMin(int[] array) {
        int[] mm=new int[2];
        mm[1]=0;
        mm[0]= array[0];
        for(int i=0; i<array.length; i++ ) {
            if (array[i] > mm[1]) {
                mm[1] = array[i];
            }
        }
            for(int i=0; i<array.length; i++ ) {
                if(array[i]<mm[0]) {
                    mm[0] = array[i];
                }
            }
        return mm;
        }

    public static void main(String[] args) {

        Random random = new Random();
        //genereaza numar random intre 10 si 100
        int size = random.nextInt(91) + 10;
        int[] a = getArrayOfRandomNumbers(size);
        int[] mm = findMaxAndMin(a);
        System.out.println("Min is:"+mm[0]+" Max is:"+mm[1] );
    }
}
