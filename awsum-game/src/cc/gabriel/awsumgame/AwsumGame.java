package cc.gabriel.awsumgame;

import cc.gabriel.awsumgame.screens.GameScreen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class AwsumGame extends Game {
	
	private GameScreen gameScreen;
	@Override
	public void create() {		
		//Assets.load();
		gameScreen = new GameScreen(this);
		setScreen(gameScreen);
	}
}
