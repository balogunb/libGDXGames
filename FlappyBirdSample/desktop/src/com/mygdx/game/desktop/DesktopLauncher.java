package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.FlappyB;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = FlappyB.WIDTH;
		config.height = FlappyB.HEIGHT;
		config.title = FlappyB.TITLE;
		new LwjglApplication(new FlappyB(), config);
	}
}
