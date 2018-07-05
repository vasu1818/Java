class chp{
	public static void main(String args[]){
		int[] array={8,6,9,1,5,3,7,2,4};
		for(int i=0; i<array.length; i++){
	    	for(int j=0; j<array.length-1; j++){
				if(array[j]>array[j+1]){
				    int tmp=array[j];
				    array[j]=array[j+1];
				    array[j+1]=tmp;
				}
	    	}
		}
		System.out.print("Sorted Array :");
		for(int i=0; i<array.length; i++)
	    	System.out.print(" "+array[i]);

	}
}