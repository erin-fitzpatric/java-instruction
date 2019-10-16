public class MyConsole extends Console {

    public MyConsole () 
    {
       super();
	}
	
    @Override
	public String getString(String prompt) {
       
        boolean isValid = false;
        String str = "";
        while (!isValid) {
            System.out.println(prompt); 
            
            if (!sc.hasNext()) {
                System.out.println("Error! Invalid integer. Try again.");
            } else {
                isValid = true;
                str = sc.next();
            }
            sc.nextLine();
		}
		
		return str;
    }
}
