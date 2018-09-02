package Debug;

public class Shift_zeros {

	public static void main(String[] args) {
		int[] A = new int[] {1, 10, -1, 11, 5, 0, -7, 0, 25, -35 };
		move_zeros_to_left_in_array(A);
		System.out.println(A.toString());

	}
	public static void move_zeros_to_left_in_array(int[] A) {
	    int j = A.length-1,k = A.length-1, count = 0;
	    while(j>=0){
	      if(A[j] == 0){
	        count++;
	        j--;
	      }
	      else{
	        A[k--] =  A[j--];    
	      }
	    }
	    count-=1;
	    while(count >= 0){
	      A[count--] = 0;
	    }
	   }
	  

}
