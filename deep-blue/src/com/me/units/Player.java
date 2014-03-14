package com.me.units;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class Player {

	public int x;
	public int y;
	
	public Player(){
		//START PLAYER IN MIDDLE OF SCREEN
		x = 960 - 64;
		y = 540 - 64;
	}
	
	public void update(){
		if(Gdx.input.isKeyPressed(Keys.A) || Gdx.input.isKeyPressed(Keys.LEFT))
			x -= 5;
		if(Gdx.input.isKeyPressed(Keys.D) || Gdx.input.isKeyPressed(Keys.RIGHT))
			x += 5;
		if(Gdx.input.isKeyPressed(Keys.S) || Gdx.input.isKeyPressed(Keys.DOWN))
			y += 5;
		if(Gdx.input.isKeyPressed(Keys.W) || Gdx.input.isKeyPressed(Keys.UP))
			y -= 5;
	}
}
