class chp{
	public static void main(String args[]){
		String pt="HelloWorld",ct="",ot="";
		int key=2 ; 
		for(int i=0; i<pt.length(); i++) 			//For Encryption
				ct=ct+(char)(pt.charAt(i)+key);		//Every character's ascii value of 
		System.out.println("Encrypted Message : "+ct);		//plain text is increased by key

		for(int i=0; i<ct.length(); i++)			//For Decryption
				ot=ot+(char)(ct.charAt(i)-key);		//every character's ascii value of
		System.out.println("Decrypted Message : "+ot);		//cipher text is increased by key
	}
}
