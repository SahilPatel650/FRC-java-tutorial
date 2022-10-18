
public class robotMap 
{
    static int countUp, countDown, countLeft, countRight = 0;
    static String direction ="";
    static char[][] grid;
    static int row,column = 0;
    static int rCounter,lCounter,fCounter=0;
    static private void printPath(int x, int y)
    {
         grid= new char[5][5];
         //char ch;
         row=5;column=5;
        for(row=4; row>=0; row--)
        {
            //ch+=grid[row][column];
           // System.out.print(grid[row][column]+ "  ");
            for(column=0; column<=4;column++)
            {
                
                if(row== x && column== y){
                    grid[x][y] = 'x';
                }
                else 
                grid[row][column] = 'o';
                System.out.print(grid[row][column]); 
                System.out.print(grid[row][column]+ " ");              
            }
            
             System.out.println();
        }
    }
// Use lCounter and rCounter to track the number of repetitive occurences of r or l and based on that change the direction.

   static  private void navigateGrid(String move)
    {   
        direction="up";
        for (int i = 0; i < move.length(); i++) 
        {
            /*if (move.charAt(i)=='l')
            {
                lCounter++;
            }*/
                // for each movement increment
                // its respective counter
                // handling r cases
                if(move.charAt(i)=='r')
                {
                if (move.charAt(i) == 'r' && direction.equals("up"))
                {
                    // countRight++;
                    direction="right";
                    System.out.println("inside r & direction right");
                } else if (move.charAt(i) == 'r' && direction.equals("right"))
                {
                    // countRight++;
                    direction="down";
                    System.out.println("inside r & direction down");
                }
                else if (move.charAt(i) == 'r' && direction.equals("down"))
                {
                    // countRight++;
                    direction="left";
                    System.out.println("inside r & direction left");
                }
                else if (move.charAt(i) == 'r' && direction.equals("left"))
                {
                    // countRight++;
                    direction="up";
                    System.out.println("inside r & direction up");
                }
                if(i >=1 )
                {
                    if (move.charAt(i-1) == 'r' && direction.equals("right"))
                    {
                        // countRight++;
                        rCounter++;
                        direction="down";
                        System.out.println("inside r & direction down");
                    }
                }
                else if(i >=2)
                {
                    if (move.charAt(i-2) == 'r' && direction.equals("down"))
                    {
                        // countRight++;
                        rCounter++;
                        direction="left";
                        System.out.println("inside r & direction left");
                    }
                }
                if(i >=3)
                {
                    if (move.charAt(i-3) == 'r' && direction.equals("left"))
                    {
                        // countRight++;
                        rCounter++;
                        direction="up";
                        System.out.println("inside r & direction up");
                    }
                }
            }    
                // handling l cases
                if(move.charAt(i)=='l')
                {
                    if (move.charAt(i) == 'l' && direction.equals("up"))
                    {
                        // countRight++;
                        direction="right";
                        System.out.println("Inside l & direction right");
                    }
                    if (move.charAt(i) == 'l' && direction.equals("right"))
                    {
                        // countRight++;
                        direction="down";
                        System.out.println("Inside l & direction right");
                    }
                    if (move.charAt(i) == 'l' && direction.equals("down"))
                    {
                        // countRight++;
                        direction="left";
                        System.out.println("Inside l & direction right");
                    }
                    if (move.charAt(i) == 'l' && direction.equals("left"))
                    {
                        // countRight++;
                        direction="up";
                        System.out.println("Inside l & direction right");
                    }
                    if(i >=1 )
                    {
                        if (move.charAt(i-1) == 'l' && direction.equals("right"))
                        {
                            // countRight++;
                            rCounter++;
                            direction="down";
                            System.out.println("Inside l & direction down");
                        }
                    }
                    if(i >=2)
                    {
                        if (move.charAt(i-2) == 'l' && direction.equals("down"))
                        {
                            // countRight++;
                            rCounter++;
                            direction="left";
                            System.out.println("Inside l & direction left");
                        }
                    }
                    if(i >=3)
                    {
                        if (move.charAt(i-3) == 'l' && direction.equals("left"))
                        {
                            // countRight++;
                            rCounter++;
                            direction="up";
                            System.out.println("Inside l & direction up");
                        }
                    }                   
                }
                    // f starts here Add limit for counters to not exceed 5x5 size.
                    
                if (move.charAt(i) == 'f' && direction.equals("up"))
                {
                    countUp++;
                    System.out.println("inside f & direction up");
                }
                else if (move.charAt(i) == 'f' && direction.equals("right"))
                {
                    countRight++;
                    System.out.println("inside f & direction right");
                }
                else if (move.charAt(i) == 'f' && direction.equals("down"))
                {
                    countDown++;
                    System.out.println("inside f & direction down");
                }
                else if (move.charAt(i) == 'f' && direction.equals("left"))
                {
                    countLeft++;
                    System.out.println("inside f & direction left");
                }                
                 System.out.println("inside f & " +direction+ " & i!=0" + "value of countDown :" + countDown);
                     
               System.out.println("position:"+ (countRight-countLeft)+ "," + (countUp-countDown) );
               printPath((countRight-countLeft), (countUp-countDown));
            }
            System.out.println("countleft :"+countLeft+","+"countRight :"+countRight+","+"countUp :"+countUp+","+"countDown :"+countDown+","+"direction :"+direction);
            System.out.println("position:"+ (countRight-countLeft)+ "," + (countUp-countDown) );     
      }    
               
            
        
   



    //main function
    public static void main(String[] args) 
    {

        // Verfied case 1
         String move = "rfflrf";
        // String move = "rf"
        // String move = "rffr"
        //initializeGrid();
        navigateGrid(move);


        // mapMoves(movesA);
        // mapMoves(movesB);
        // mapMoves(movesC);
    
        
    

}
}