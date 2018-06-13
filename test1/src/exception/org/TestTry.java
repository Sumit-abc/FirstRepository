package exception.org;

public class TestTry {
		public static void main(String[] args) {
			try {
				int i = 10;
				
				i=i/2;
				
				i=i+3;
				
				
			System.out.println(i);
			
			i = i/0;
			}
			catch(Exception e){System.out.println(e);}
			finally{
			System.out.println("normal");
			}
		}
}
