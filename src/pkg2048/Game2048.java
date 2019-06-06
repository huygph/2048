
package pkg2048;
import java.util.Random;
import java.lang.Math;
import java.util.Stack;
import javax.swing.JOptionPane;
public class Game2048 extends javax.swing.JFrame {
    public int [][] Board;
    public Stack<Integer> undo;
    public Stack<Integer> redo;
    public int [] array;
    public Game2048(){
        Board = new int[4][4];
        undo = new Stack<Integer>();
        redo = new Stack<Integer>();
        array = new int[15];
    }
 
    public void PrintArray() {
        for (int[] x : Board)
            System.out.printf("%6d%6d%6d%6d%n%n", x[0],x[1],x[2],x[3]);
        
    }
   
    public void addRandom()
    {
        
        Random r = new Random();
        //chose random position
        int x = r.nextInt(3);
        int y = r.nextInt(3);
        if (Board[x][y] == 0) {
        // add random number ( 2 or 4) if that positon is blank
         double v = new Double(1.23);
                v=r.nextInt(3);
                v = Math.pow(2, v);      
                int a;
                
                 a = (int) (v + 0.5d);
                 if ( a == 1)
                     a =2;
                Board[x][y] = a;}
        else
            addRandom();
        }

    public void Up() {
        saveundo();
    for ( int j = 0; j < 4; j++){
         String[] checkCombine = { "no", "no","no","no"};
            for (int i = 1; i <4;i++){
                if ( Board[i][j] != 0) {
                    int num = Board[i][j];
                    int I = i - 1;
                    // 
                    while (( I>=0 ) && (Board[I][j]==0) ){
                        I--;
                    }
                    if ( I == -1){
                        Board[0][j] = num;
                        Board[i][j] = 0;
                    }
                    //
                    else if ( Board[I][j] != num){
                        Board[i][j] = 0;
                        Board[I +1][j] = num;
                        
                    }
                    else {
                        if ( checkCombine[I] == "combined") {
                            Board[i][j] = 0;
                        Board[I +1][j] = num;
                        }
                        else {
                        Board[I][j] *= 2;
                        checkCombine[I] = "combined";
                        Board[i][j] = 0;}
                    }
                }
            }
}
    addRandom();
}
     public void Down() {
      saveundo();
          
    for ( int j = 0; j < 4; j++){
        String[] checkCombine = { "no", "no","no","no"};
            for (int i = 2; i >-1;i--){
                if ( Board[i][j] != 0) {
                    int num = Board[i][j];
                    int I = i + 1;
                    // 
                    while (( I<=3 ) && (Board[I][j]==0) ){
                        I++;
                    }
                    if ( I == 4){
                        Board[3][j] = num;
                        Board[i][j] = 0;
                    }
                    //
                    else if ( Board[I][j] != num){
                        Board[i][j] = 0;
                        Board[I -1][j] = num;
                        
                    }
                    else {
                        if (checkCombine[I] == "combined"){
                            Board[i][j] = 0;
                        Board[I -1][j] = num;
                        }
                        else {
                        Board[I][j] *= 2;
                        checkCombine[I] = "combined";
                        Board[i][j] = 0;}
                    }
                }
            }
}
    addRandom();
}
    public void Left() {
        saveundo();
         
    for ( int i = 0; i < 4; i++){
        String[] checkCombine = { "no", "no","no","no"};
            for (int j = 1; j <4;j++){
                if ( Board[i][j] != 0) {
                    int num = Board[i][j];
                    int J = j - 1;
                    // 
                    while (( J>=0 ) && (Board[i][J]==0) ){
                        J--;
                    }
                    if ( J == -1){
                        Board[i][0] = num;
                        Board[i][j] = 0;
                    }
                    //
                    else if ( Board[i][J] != num){
                        Board[i][j] = 0;
                        Board[i][J+1] = num;
                        
                    }
                    else {
                        if ( checkCombine[J] == "combined"){
                             Board[i][j] = 0;
                        Board[i][J+1] = num;
                        }
                        else{
                        Board[i][J] *= 2;
                        checkCombine[J] = "combined";
                        Board[i][j] = 0;
                    }
                }
            }
}
}
    addRandom();}
        public void Right() {
        saveundo();
         
    for ( int i = 0; i < 4; i++){
        String[] checkCombine = { "no", "no","no","no"};
            for (int j = 2; j >-1;j--){
                if ( Board[i][j] != 0) {
                    int num = Board[i][j];
                    int J = j + 1;
                    // 
                    while (( J<4 ) && (Board[i][J]==0) ){
                        J++;
                    }
                    if ( J == 4){
                        Board[i][3] = num;
                        Board[i][j] = 0;
                    }
                    //
                    else if ( Board[i][J] != num){
                        Board[i][j] = 0;
                        Board[i][J-1] = num;
                        
                    }
                    else {
                        if (checkCombine[J] == "combined") {
                            Board[i][j] = 0;
                        Board[i][J-1] = num;
                        }
                        else {
                        Board[i][J] *= 2;
                        checkCombine[J] = "combined";
                        Board[i][j] = 0;}
                    }
                }
            }
} addRandom();
}
    public void saveundo() {
        for ( int i = 0 ; i < 4 ; i ++) {
            for (int j = 0 ; j < 4 ; j ++ ) {
                undo.push(Board[i][j]);
            }
        }
    }
    public void saveredo() {
        for ( int i = 0 ; i < 4 ; i ++) {
            for (int j = 0 ; j < 4 ; j ++ ) {
                redo.push(Board[i][j]);
            }
        }
    }
     public void loadundo() {
        if (undo.isEmpty())
            JOptionPane.showMessageDialog(null,"Can not Undo");
        else {
            saveredo();
         for ( int i = 3 ; i >= 0 ; i --) {
            for (int j = 3 ; j >= 0 ; j -- ) {
                Board[i][j] = undo.pop();
            }
        }}
    }
      public void loadredo() {
          if (redo.isEmpty())
            JOptionPane.showMessageDialog(null,"Can not Redo");
          else {
              saveundo();
        for ( int i = 3 ; i >= 0 ; i --) {
            for (int j = 3 ; j >= 0 ; j -- ) {
                Board[i][j] = redo.pop();
            }
        }}
    }
}

