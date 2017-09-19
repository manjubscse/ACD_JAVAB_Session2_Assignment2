/* PROGRAM TO PRINT THE BELOW PATTERN
  A
 ABA
ABCBA
 ABA
  A
*/
public class Pattern {

	public static void main(String[] args) {

	char c; //DECLARE VARIABLE OF TYPE CHAR 
	for(int i=1;i<=3;++i)        // FOR LOOP FOR NUMBER OF ROWS
	{
		c='A'; // ASSIGN LETTER TO START FROM
		for(int j=i;j<3;++j)        // FOR LOOP FOR PRINTING SPACES
		{
			System.out.print(" "); 
		}
		for(int k=1;k<=i;++k)      // FOR LOOP FOR PRINTING ALPHABETS IN DESCENDING ORDER  
		{
			System.out.print(c); 
			++c;
		}
		c-=2;
		for(int l=1;l<i;++l)      // FOR LOOP FOR PRINTING ALPHABETS IN ASCENDING ORDER
		{
			System.out.print(c);
			--c;
		}
		System.out.println();    // INTRODUCING NEW LINE
	}
	for(int i=2;i>=0;--i)        // FOR LOOP FOR NUMBER OF ROWS
	{
		c='A';
		for(int j=i;j<3;++j)        // FOR LOOP FOR PRINTING SPACES
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;++k)      // FOR LOOP FOR PRINTING ALPHABETS IN DESCENDING ORDER  
		{
			System.out.print(c);
			++c;
		}
		c-=2;
		for(int l=1;l<i;++l)      // FOR LOOP FOR PRINTING ALPHABETS IN ASCENDING ORDER
		{
			System.out.print(c);
			--c;
		}
		System.out.println();    // INTRODUCING NEW LINE
	}
 }
}

