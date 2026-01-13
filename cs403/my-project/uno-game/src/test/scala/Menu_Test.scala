package menu_commands

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should._

class Menu_Test extends AnyFunSpec with Matchers {
  describe("The UNO Simulation") {
    describe("has a menu") {

      //******* SHOW PLAYER ORDER *******
      it("can show the player order") {     
        val expectedResult = "Player 1, Player 2, Player 3, Player 4"
        Menu.showPlayerOrder should be(expectedResult)  
      }

      //******* ADVANCE ORDER *******
      it("can advance the player order") {     
        val expectedResult = "Player 2, Player 3, Player 4, Player 1"
        Menu.advancePlayerOrder should be(expectedResult)  
      }

       //******* SHOW GAME AREA *******
      it("can show the game area, including the draw pile, top card of playing pile, current player, and cards in each player's hand") {
        val expectedResult = 
            " -----UNO GAME AREA-----\n"+
            "Draw Pile :40 cards\n" +
            "Playing pile: Green 4\n" +
            "\n" +
            "Players:\n" +
            "Player 1: [Red 1, Blue 2, Green Skip, Wild ]\n" +
            "Player 2: [Yellow 4, Red Reverse, Green 2]\n" +
            "Player 3: [Blue Draw 2, Red 2]\n" +
            "Player 4: [Yellow Skip, Green 4, Blue 1]\n" +
            "\n" +
            "Current Player: Player 1\n"
        Menu.showGameArea should be(expectedResult)
      }  
    }
  }
}