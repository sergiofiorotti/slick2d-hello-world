import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;


public class MeuPrimeiroJogo extends BasicGame {

	public MeuPrimeiroJogo(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(GameContainer arg0, Graphics g) throws SlickException {
		g.drawString("Hello World", 200, 200);
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) throws SlickException {
		MeuPrimeiroJogo jogo = new MeuPrimeiroJogo("Meu Primeiro Jogo");
		AppGameContainer container = new AppGameContainer(jogo);
		container.start();
	}

}
