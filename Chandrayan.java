public class Chandrayan{
    int position=0;
    public void moveForward()
    {
       position=position+1;
    }
    public void movebackward()
    {
        position=position-1;
    }
    public static void  main(String[] args)
    {
        
       Chandrayan sp = new Chandrayan();
        String[] commands = {"f","b"};
        for(int i=0;i<commands.length;i++)
        {
            if(commands[i]=="f")
            {
                sp.moveForward();
            }
            else if(commands[i]=="b")
            {
                sp.movebackward();
            }
            else{
                System.out.println("Invalid Command");
            }
        }
             
        
   }
}



