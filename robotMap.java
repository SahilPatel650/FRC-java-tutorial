public class robotMap {
    String[][] map = new String[5][5];
    //main function
    static int turns;

    robotMap(){
        //create an array of moves:
        String[] movesA = {"f", "f", "r", "f"};
        String[] movesB = {"f", "r", "r", "f"};
        String[] movesC = {"f", "f", "f", "f", "r", "f","r", "f", "f"};

        mapMoves(movesA);
        mapMoves(movesB);
        mapMoves(movesC);
    }
    public void mapMoves(String[] moves) {
        turns +=1;
        int x = 0;
        int y=4;
        int dir = 1;//dir of 1=north 2=south 3=west 4=east
        setMap(this.map);
        for (int i=0;i<moves.length;i++){
            map[y][x] = "X";
            //Check dir then change x,y coord accordingly or dir
            switch (moves[i]){
                case "f":
                    switch (dir){
                        case 1:
                            y-=1;
                            break;
                        case 2:
                            y+=1;
                            break;
                        case 3:
                            x-=1;
                            break;
                        case 4:
                            x+=1;
                            break;
                    }
                    break;
                    
                case "r":
                    switch (dir){
                        case 1:
                            dir=4;
                            break;
                        case 2:
                            dir=3;
                            break;
                        case 3:
                            dir=1;
                            break;
                        case 4:
                            dir=2;
                            break;
                    }
                    break;
                case "l":
                    switch (dir){
                        case 1:
                            dir=3;
                            break;
                        case 2:
                            dir=4;
                            break;
                        case 3:
                            dir=2;
                            break;
                        case 4:
                            dir=1;
                            break;
                    } 
                    break;
            }
        }
        map[y][x]="#";
        printMap();
    }

    //sets full grid eauls to "O"
    public void setMap(String[][] map){
        for (int i=4;i>=0;i--){
            for (int c=0;c<this.map[i].length;c++){
                this.map[i][c] = "O";
            }
        }
    }

    //prints grid nicely
    public void printMap(){
        System.out.println(String.format("\nGrid number: %s",turns));
        System.out.println("-------------");
        for (int c=0;c<this.map.length;c++){
            System.out.print("| ");
            for (int i=0;i<this.map.length;i++){
                System.out.print(this.map[c][i]+" ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");
    }
}