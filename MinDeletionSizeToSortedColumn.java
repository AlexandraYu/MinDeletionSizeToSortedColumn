public class MinDeletionSizeToSortedColumn{
    //the difficult part of this question is how you can develop an algorithm 
    //the intuition is that, searching from the first letter of the string in first element, compare it with the first letter of the strng in second element, and going forward, they should be in non-decreasing order, and if not, eliminate it, and do this to all the characters in the string
    //the algorithm itself is easy, but not obvious to see. 
    //can do several experiment to come up that this is indeed true
    public static int minDeletionSize(String[] A) {
        int count = 0; 
        for(int i=0; i<A[0].length(); i++) { //going through each "letter" in an element in string A, remember that all elements have the same length
            for(int j=0; j<A.length-1; j++) { //going through each element in array 
                if(A[j].charAt(i) > A[j+1].charAt(i)) { //so if the character in previous element is bigger than the character in same position in next element, we need to "eliminate it"
                    System.out.print("A["+j+"].charAt("+i+") is "+ A[j].charAt(i)+"\n");
                    count++; //counting how elimination
                    break; //this is important! since we're looking for 1.minum count of elimination 2.once if we find an element needs 1 more elimination, all other elements will be applied this rule too, so no point going through each of them once the counter has been increased. 
                }
            }
        }
        return count; 
    }
    public static void main(String []args){
        String[] myArray = {"abc", "def", "gge", "xyz", "zab"}; 
        int answer = minDeletionSize(myArray); 
        System.out.println("answer is "+answer+"\n");
    }
}
