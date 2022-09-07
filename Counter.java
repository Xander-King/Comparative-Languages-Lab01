
/* NOTE: Some words are not allowed in this file:
   'f o r'  is not allowed
   'w h i l e' is not allowed. 
   You can not even use them in comments!
*/

public class Counter {
	/* TODO: Write a recursive function here. Call it 'printAll'. 
           See README.md to get more instructions, look at Counter.expected to see desired output. 
	   No variable or loops allowed.
	   No calling another builtin/3rd-party function that just solves the problem!
	   You may pass whatever parameters are helpful to the 'printAll' function.
	   Non-recursive solutions will receive a zero when the grader sees them. 
	*/

	public static void printAll(int nbits, String prefix) {
		if(nbits == 0) {
			System.out.println(prefix);
		} else {
			printAll(nbits-1, prefix + "0");
			printAll(nbits-1, prefix + "1");
		}

	}
	
	public static void main(String[] args){
		//TODO: Call `printAll`
		printAll(8, "");
	}
}
