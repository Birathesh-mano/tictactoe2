# tictactoe2

User Stories:

1. John clicks on bottom right box, marks it with an X. Billy chooses the bottom left and marks it with an O

2. John clicks on bottom right box, marks it with an X. Billy chooses a box he did not mean to and decides to click the restart button.

3. John clicks on bottom right box, marks it with an X. Billy chooses the bottom left and marks it with an O, it does not get marked, billy must pick another move.

4. John clicks on bottom right box, marks it with an X. He has marked 4 in a row and won the game, the board resets, his score goes from 3 to 6.

Architecture: Front end with buttons and textviews, buttons to indicate X's and O's. Backend has one class, MainACtivity it has methods to make the game work, I cant tell if its a method not working
the correct way or if its because my labtop is crashing when I try to click a button on the app.

How to Modify: The original concept of the game was to make a 5x5 tictactoe board where connecting 4 would win the match.
                Unfortunately do to errors I had to aim for part marks and make a simpler 4x4 where it takes 4 ina  row to win.
                To implement a 5x5 there are many more ways to win if u do 4 in a row, i had all these solutions ready but was unable to input them effectively.
                There would be a total of 32 solutions to the game that would need to be accounted for.
                
Umple Code for UML Class Diagram:

class MainActivity
{
      isA AppCompatActivity;
void onCreate;
  void onClick;
  boolean checkWin;
  void p1Win;
  void p2Win;
  void tie;
  void updatePointText;
  void resetBoard;
}

class AppCompatActivity
{
  }
  
  How to build the app: Simply download file into android studio and click build, then run it.
  


                
     
