package cc.gabriel.awsumgame.spatials;

import com.apollo.Layer;

public enum Layers implements Layer {
	 Background,
     Terrain,
     Effects,
     Projectiles,
     Interface;

	@Override
	public int getLayerId() {
		return ordinal();
	}

}
