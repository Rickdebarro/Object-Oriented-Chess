package Board;
import generalElements.Commons.Color;
import generalElements.*;

public class Board {

    Square board[][] = new Square[8][8];
    private boolean flag = true;

    public Board(){
        for(int i = 0 ; i<8 ; i++){
            for(int j = 0 ; j<8 ; j++)
            initSquare(i,j);
        }
    }

    public void print_board() {
		for(int i = 0;i<8;i++) {
			System.out.printf("|");
			for(int j = 0;j<8;j++) {

                int c = 0; //black

                if(board[i][j].getColor() == Color.WHITE){
                    c = 1;//white
                }

				System.out.printf("%d",c);
				System.out.printf("|");
			}
			System.out.printf("\n");
		}
	}
	

     private void initSquare(int x,int y){

        board[x][y] = new Square();

        
        if(flag){
            board[x][y].setColor(Color.WHITE);
            flag = false;
        }else{
            board[x][y].setColor(Color.BLACK);
            flag = true;
        }
        if(y == 7){
            flag = !flag;
        }
    }
}
