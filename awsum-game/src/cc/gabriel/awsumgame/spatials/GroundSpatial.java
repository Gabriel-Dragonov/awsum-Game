package cc.gabriel.awsumgame.spatials;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.apollo.Layer;
import com.apollo.Entity;
import com.apollo.annotate.InjectComponent;
import com.apollo.annotate.InjectTaggedEntity;
import com.apollo.components.Transform;

public class GroundSpatial extends GdxSpatial {
	
        @InjectComponent
        Transform transform;
       
//        @InjectTaggedEntity("Player")
//        Entity player;
       
        private Texture groundTexture;
       
        public GroundSpatial(Texture groundTexture) {
                this.groundTexture = groundTexture;
        }
       
        @Override
        public void initialize() {
                //System.out.println("I have player: " + player);
        	System.out.println("Grounding");
        }
       
        @Override
        public void render(SpriteBatch sb) {
        	System.out.println("Drawing at "+ transform.getX()+" , "+transform.getY());
                sb.draw(groundTexture, transform.getX(), transform.getY());
        }

        @Override
        public Layer getLayer() {
                return Layers.Terrain;
        }

}
