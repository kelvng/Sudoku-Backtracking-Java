import game.Game;

public class Launcher {
	private static int WIDTH = 850, HEIGHT = 500;

	public static void main(String[] args)
	{
		Game game = new Game(WIDTH, HEIGHT, "Sudoku Solver");
		game.start();
	}
}
