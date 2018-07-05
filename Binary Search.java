class BinarySearch
{
	public static void main(String args[]){
	int array[]={11,13,14,15,16,18,19,20,21,24};
    int find=18;
	int f=0;
	int c=array.length;
	if(find<array[c-1]){
    	while(f<=c){
    	    int mid=(f+c)/2;
    		if(array[mid]>find)
    			c=mid-1;
    		else if(array[mid]==find){
    			System.out.println("Position of "+find+" is "+(mid+1));
    			break;
    		}
    		else
    			f=mid+1;
	    }
	}
	else
		System.out.println(find+"- Not found ");
	
    }
}