package sorted_arrays;

public class EvenDigitNumber {
	static int evennum(int [ ] arr){
		int total=0;
        for(int i=0; i<arr.length; i++){
        	int count=0;
            while(arr[i]>0){
            count=count+1;
            arr[i]=arr[i]/10;
            }
            if(count%2==0)
                total+=1;
        }  
        return total;  
        }
public static void main(String [] args){
int [] arr={1,21,3455,4,52};
int ans= evennum(arr);
System.out.println(ans);
}
}
