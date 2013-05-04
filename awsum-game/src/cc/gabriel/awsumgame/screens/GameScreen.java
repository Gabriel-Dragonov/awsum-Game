package cc.gabriel.awsumgame.screens;

import cc.gabriel.awsumgame.AwsumGame;
import cc.gabriel.awsumgame.actors.Ground;
import cc.gabriel.awsumgame.actors.Players;
import cc.gabriel.awsumgame.builders.GroundBuilder;

import com.apollo.Entity;
import com.apollo.components.Transform;
import com.apollo.managers.GroupManager;
import com.apollo.managers.RenderManager;
import com.apollo.managers.TagManager;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class GameScreen extends AbstractScreen {

	public static final float WORLD_WIDTH = 15;
	public static final float FRUSTUM_HEIGHT = 25;
	public static final float WORLD_HEIGHT = FRUSTUM_HEIGHT * 20;
	public static final float FRUSTUM_WIDTH = WORLD_WIDTH;
	Players player;
	Entity ground;
	//InputHandler inputHandler;
	AwsumGame game;
	private com.apollo.World world;
	private TagManager tagManager;
	private GroupManager groupManager;
	private SpriteBatch sb;	
	private RenderManager<SpriteBatch> renderManager;
	
	public GameScreen(AwsumGame awsumGame){
		this.game = awsumGame;
		System.out.println("Game screen is set");
	}	
	

	@Override
	public void render(float delta) {
		super.render(delta);
		world.update(delta);
		sb.begin();
		renderManager.render(sb);
		sb.end();
	
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void show() {
		
		world = new com.apollo.World();
		sb = new SpriteBatch();
		renderManager = new RenderManager<SpriteBatch>(sb);
		groupManager = new GroupManager();
		tagManager = new TagManager();

        world.setManager(renderManager);
        world.setManager(tagManager);
        world.setManager(groupManager);
        
        world.setEntityBuilder("Ground",new GroundBuilder());
        
        ground = world.createEntity("Ground");
        
        ground.getComponent(Transform.class).setLocation(50,50);
        world.addEntity(ground);
        
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}




}
