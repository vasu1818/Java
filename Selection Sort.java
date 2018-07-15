class SelSor{
    public static void main(String args[]){
        int array[]={1,2,6,5,8,9,3,4};          //array to be sorted
    	for(int i=0;i<array.length;i++){
    		int chkpnt=i;                       //It will store the index of the smallest element from array
    		for(int j=i+1;j<array.length;j++){
    			if(array[chkpnt]>array[j])
    				chkpnt=j;
    		}
    		int tmp=array[i];                   //Swaps the smallest number with the ith element
    		array[i]=array[chkpnt];
    		array[chkpnt]=tmp;
    	}
    	for(int i=0;i<array.length;i++){
    		  System.out.println(array[i]);     //prints sorted array

    	}
    }
}
