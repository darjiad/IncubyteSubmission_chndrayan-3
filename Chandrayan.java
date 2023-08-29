public class Chandrayan{
    int position=0;
    public void moveForward()
    {
       position++;
    }
    public static void  main(String[] args)
    {
        
       Chandrayan sp = new Chandrayan();
        String[] commands = {"f"};
        for (String command : commands) {
            if(command=="f")
            {
                sp.moveForward();
            }
            else{
                System.out.println("Invalid Command");
            }
             
        }
   }
}



