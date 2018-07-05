class chp{
	public static void main(String args[]){
		String pt="HelloWorld",ct="",ot="";
		int key=2 ;
		for(int i=0; i<pt.length(); i++)
				ct=ct+(char)(pt.charAt(i)+key);
		System.out.println("Encrypted Message : "+ct);

		for(int i=0; i<ct.length(); i++)
				ot=ot+(char)(ct.charAt(i)-key);
		System.out.println("Decrypted Message : "+ot);
	}
}