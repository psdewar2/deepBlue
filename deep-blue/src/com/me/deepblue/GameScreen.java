package com.me.deepblue;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class GameScreen implements Screen{

	private DeepBlue game;
	OrthographicCamera camera;
	
	public GameScreen(DeepBlue game){
		this.game = game;
		
		camera = new OrthographicCamera();
		camera.setToOrtho(true,1920,1080);
	}
	
	@Override
	public void render(float delta) {
		
		
	}

	@Override
	public void show() {
		
		
	}

	@Override
	public void pause() {
		
		
	}

	@Override
	public void resume() {
		
		
	}

	@Override
	public void dispose() {
		
		
	}
	
	@Override
	public void resize(int width, int height) {	
	}

	@Override
	public void hide() {
	}
}
