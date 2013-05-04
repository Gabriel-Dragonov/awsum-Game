package cc.gabriel.awsumgame.builders;

import cc.gabriel.awsumgame.Groups;
import cc.gabriel.awsumgame.spatials.GroundSpatial;

import com.apollo.Entity;
import com.apollo.EntityBuilder;
import com.apollo.EventHandler;
import com.apollo.World;
import com.apollo.components.Transform;
import com.apollo.managers.GroupManager;
import com.badlogic.gdx.graphics.Texture;

public class GroundBuilder implements EntityBuilder {

	private Texture groundTexture;
	
	@Override
	public Entity buildEntity(World _world) {
		final World world = _world; 
		final Entity e = new Entity(world);
		groundTexture = new Texture("data/rocks.png");
		e.setComponent(new Transform());
		e.setComponent(new GroundSpatial(groundTexture));
		//e.setComponent();
		
		e.addEventHandler("Landed", new EventHandler() {
			
			@Override
			public void handleEvent() {
				System.out.println("Ground has been touched");
				
			}
		});
		
		world.getManager(GroupManager.class).setGroup(e, Groups.Ground);
		return e;
	}

}
