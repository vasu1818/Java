class SelSor
{
    public static void main(String args[])
    {
        int array[]={1,2,6,5,8,9,3,4};
    	for(int i=0;i<array.length;i++){
    		int chkpnt=i;
    		for(int j=i+1;j<array.length;j++){
    			if(array[chkpnt]>array[j])
    				chkpnt=j;
    		}
    		int tmp=array[i];
    		array[i]=array[chkpnt];
    		array[chkpnt]=tmp;
    	}
    	for(int i=0;i<array.length;i++){
    		  System.out.println(array[i]);
    	}
    }
}
