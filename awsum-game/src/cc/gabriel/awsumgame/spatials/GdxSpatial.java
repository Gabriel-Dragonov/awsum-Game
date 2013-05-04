package cc.gabriel.awsumgame.spatials;

import com.apollo.Layer;
import com.apollo.components.spatial.Spatial;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class GdxSpatial extends Spatial<SpriteBatch> {

	@Override
	public abstract Layer getLayer();

	@Override
	public abstract void render(SpriteBatch sb);
}
