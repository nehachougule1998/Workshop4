package com.bridgelabz;

public class Main3 {
	
	public void replaceword(String sentence , String old , String newword){
		String [] temp = sentence.split(" ");
	    int len = temp.length;
	    String str = "";
	    for(int i=0; i<len; i++){
	          if(temp[i].matches("my"))
	              temp[i]="our";
	          str = str + temp[i]+ " ";
	    }
	      System.out.println(str);    
    
	}

	public static void main(String[] args) {
		System.out.println("Hello World");
		String sentence =  "This is my cat. That is my dog.";
		
		Main3 main = new Main3();
		main.replaceword(sentence , "my" , "our");
	}
}
