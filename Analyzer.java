import java.util.Scanner;
public class Analyzer {

    public static int linearSearch(String[] dataSet, String element){

        for(int i = 0 ; i < dataSet.length ; i++){  // going through every element in dataset array
            if(dataSet[i].compareTo(element) == 0){     // if element in dataset is the same as element we return the index
                return i;
            }
        }
        return -1;  // Return -1 if no element in dataset matched element
    }
    public static int binarySearch(String[] dataSet, String element){
        int low = 0;    // initialize low to 0 as the first index in dataset
        int high = dataSet.length-1;    // initiliaze high as the largets index in dataset
        int mid = 0;        // initializing the mid variable

        while(high >= low){     // as long we have a legitimate interval to look at where high is higher than low we execute while loop
            mid = (high + low)/2;       // setting mid value

            if(dataSet[mid].compareTo(element) < 0){        // if the current element in dataset is less than element
                low = mid + 1;      // cutting the lower half off and setting low to be mid + 1
            } else if(dataSet[mid].compareTo(element) > 0){     // if the current element in dataset is larger than element
                high = mid - 1; // cutting the upper half off and setting high to be mid - 1
            } else if(dataSet[mid].compareTo(element) == 0) {       // if current element is equal to element
                return mid;     // returning index
            }
        }

        return -1;      // returning -1 if no element in dataset matched element
    }
    public static void main(String[] args){
        String[] dataset = StringData.getData();      // reading in the data array

        String element= "not_here";     // first string to analyse

        long stimeb = System.nanoTime();    // start timing
        int bsearchelement = binarySearch(dataset,element);     // running the binarysearch
        long ftimeb = System.nanoTime() - stimeb;       // stop timing

        System.out.print("The binary search found " +  element + " at index " + bsearchelement + " and it took " + ftimeb + " nanoseconds\n");

        long stimel = System.nanoTime();
        int lsearchelement = linearSearch(dataset,element);
        long ftimel = System.nanoTime() - stimel;

        System.out.print("The linear search found " +  element + " at index " + lsearchelement + " and it took " + ftimel + " nanoseconds");


        System.out.println("");


        element= "mzzzz";       // Second string to analyse

        long stimeb2 = System.nanoTime();
        int bsearchelement2 = binarySearch(dataset,element);
        long ftimeb2 = System.nanoTime() - stimeb2;

        System.out.print("The binary search found " +  element + " at index " + bsearchelement2 + " and it took " + ftimeb2 + " nanoseconds\n");

        long stimel2 = System.nanoTime();
        int lsearchelement2 = linearSearch(dataset,element);
        long ftimel2 = System.nanoTime() - stimel2;

        System.out.print("The linear search found " +  element + " at index " + lsearchelement2 + " and it took " + ftimel2 + " nanoseconds");


        System.out.println("");


        element= "aaaaa";       // Third string to analyse

        long stimeb3 = System.nanoTime();
        int bsearchelement3 = binarySearch(dataset,element);
        long ftimeb3 = System.nanoTime() - stimeb3;

        System.out.print("The binary search found " +  element + " at index " + bsearchelement3 + " and it took " + ftimeb3 + " nanoseconds\n");

        long stimel3 = System.nanoTime();
        int lsearchelement3 = linearSearch(dataset,element);
        long ftimel3 = System.nanoTime() - stimel3;

        System.out.print("The linear search found " +  element + " at index " + lsearchelement3 + " and it took " + ftimel3 + " nanoseconds");
    }
}