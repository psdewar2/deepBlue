package com.me.deepblue;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Deep Blue";
		cfg.useGL20 = true;
		cfg.width = 960;
		cfg.height = 540;
		cfg.resizable = true;
		
		new LwjglApplication(new DeepBlue(), cfg);
	}
}
