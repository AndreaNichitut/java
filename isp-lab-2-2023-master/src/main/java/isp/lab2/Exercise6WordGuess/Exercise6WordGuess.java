package isp.lab2.Exercise6WordGuess;

import java.util.Random;
import java.util.Scanner;

public class Exercise6WordGuess {

    /**
     * This method will return the number of occurrences of a character in a word
     * @param c
     * @param word
     * @return
     */
    public static int countOccurence(char c, char[] word) {
        int nr=0;
        for(int i=0;i<word.length;i++){
            if(word[i]==c)
                nr++;
        }
        return nr;
    }

    public static void main(String[] args) {
        String alfabet = "abcdefghijklmnopqrstuvwxyz";
        int wordLength = 5;
        StringBuilder sb = new StringBuilder(wordLength);
        Random random = new Random();
        for(int i=0;i<wordLength;i++) {
            int j=random.nextInt(alfabet.length());
            char randomChar=alfabet.charAt(j);
            sb.append(randomChar);
        }
        String randomWord = sb.toString();
        System.out.println("Random word: " + randomWord);
        char[] vcuv=new char[wordLength];
        for(int i=0;i<wordLength;i++) {
            vcuv[i]='-';
        }
        char[] vcar=new char[wordLength];
        for(int i=0;i<wordLength;i++) {
            vcar[i]=sb.charAt(i);
        }
        System.out.print("Vectorul de caractere: ");
        for(int i=0;i<vcar.length;i++) {
            System.out.print(vcar[i] + " ");
        }
        int nrl=0;
        int nri=0;
        while(nrl!=wordLength){
            Scanner scanner=new Scanner(System.in);
            System.out.print("\nIntroduceti o litera: ");
            char litera=scanner.next().charAt(0);
            System.out.println("Litera apare de " + countOccurence(litera,vcar) + " ori in cuvant." );
            nri++;
            nrl=nrl+countOccurence(litera,vcar );
            if(countOccurence(litera,vcar)!=0){
                for(int i=0;i<vcar.length;i++)
                    if(vcar[i]==litera)
                        vcuv[i]=litera;
            }
            System.out.println("Structura cuvantului: " );
            for(int i=0;i<vcuv.length;i++) {
                System.out.print(vcuv[i] + " ");
            }
        }
        System.out.print("\nCuvantul era: ");
        for(int i=0;i<vcuv.length;i++) {
            System.out.print(vcuv[i] + " ");
        }
        System.out.print("\nNumarul de incercari pana la gasirea cuvantului: " + nri);
    }

}
