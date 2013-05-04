package cc.gabriel.awsumgame.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

public abstract class AbstractScreen implements Screen {

	@Override
	public void render(float delta) {
		// the following code clears the screen with the given RGB color (black)
        Gdx.gl.glClearColor( 255f,255f, 255f, 1f );
        Gdx.gl.glClear( GL20.GL_COLOR_BUFFER_BIT );

	}



}
