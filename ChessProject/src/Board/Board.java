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
			System.out.println("| ");
			for(int j = 0;j<8;j++) {

				System.out.printf("%d",board[i][j].getColor());
				System.out.println("|");
			}
			System.out.println("|\n");
		}
	}
	

     private void initSquare(int x,int y){
        if(flag){
            board[x][y].setColor(Color.WHITE);
            flag = false;
        }else{
            board[x][y].setColor(Color.BLACK);
            flag = true;
        }
    }
}
