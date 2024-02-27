package isp.lab2.Exercise5EvenOddSearch;

public class Exercise5EvenOddSearch {

    public static int[] findEvenOdd(String input) {
        String[] tokens = input.split(",");
        int [] result={0,-1,9999,-1};
        for(int i=0;i<tokens.length;i++) {
            int aux=Integer.parseInt(tokens[i]);
            if(aux%2==0&&aux>result[0]) {
                result[0]=aux;
                result[1]=i;
            }
            if(aux%2==1&&aux<result[2]) {
                result[2]=aux;
                result[3]=i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "1,2,3,4,5,6,7,8,9,10";
        int[] result = findEvenOdd(input);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
