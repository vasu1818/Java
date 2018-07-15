class chp{
	public static void main(String args[]){
		int[] array={8,6,9,1,5,3,7,2,4}; 				//array to be sorted
		for(int i=0; i<array.length; i++){
	    		for(int j=0; j<array.length-1; j++){
					if(array[j]>array[j+1]){			//checks larger no. from two adjacent no.
				    	int tmp=array[j];				//for
				    	array[j]=array[j+1];			//swapping
						array[j+1]=tmp;					//adjacent no.
					}
	    		}
		}
		System.out.print("Sorted Array :");
		for(int i=0; i<array.length; i++)
	    	System.out.print(" "+array[i]);				//prints sorted array

	}
}
