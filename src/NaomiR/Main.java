package NaomiR;
import java.util.Scanner;

public class Main {
    private  static Scanner myscanner=new Scanner(System.in);
    public static void main(String[] args) {
	//  challenge:  sort array in descendig order( greatest to lowest)

int [] myIntegers=getIntegers(5); // method called with 5 passed
int [] sorted= sortIntegers(myIntegers);
        printArray(sorted);

    }

    // method to allow us ti read from and return
    public  static  int[] getIntegers( int capacity){


        int [] array= new int[capacity];
        System.out.println(" enter " + capacity+ " intger values: \r");
        for (int i=0; i<array.length; i++){
            array[i]=myscanner.nextInt();

        }
        return  array;
    }

    public static  void printArray(int []array){

        for( int k=0; k<array.length;k++){
            System.out.println(" Element "+ k+ " contents "+ array[k]);
        }
    }




       public static  int [] sortIntegers(int [] array) {

           // method to sort array
           int temp;
           boolean flag = true;
           int[] sortArray = new int[array.length];
           for(int n=0; n<array.length; n++){
             // created sort array and sabving contents of
               // array to sortarray
               sortArray[n]=array[n];
           }

           while (flag) {
               flag = false;
               for (int j = 0; j < sortArray.length - 1; j++) {
// must have length-1 because of the j+1, next value
                   if (sortArray[j] < sortArray[j + 1]) {
                       // swap lowest valu with larger
                       //small number is in temp temporary
                       // they smaller and larger are swapped
                       // and larger is in the varible temp
                       // element 0 50
                       // element 1 160
                       //element 2 40

                       temp = sortArray[j];
                       sortArray[j] = sortArray[j+1];
                       sortArray[j + 1] = temp;
                       flag = true;

                   }

               }

           }
           return sortArray;
       }

/*
output:

 Element 0 contents 10
 Element 1 contents 8
 Element 2 contents 6
 Element 3 contents 4
 Element 4 contents 2



 */


}
