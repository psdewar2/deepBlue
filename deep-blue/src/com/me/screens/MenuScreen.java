package com.me.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.me.deepblue.DeepBlue;
import com.me.deepblue.Objects;

public class MenuScreen implements Screen{

	DeepBlue game;
	OrthographicCamera camera;
	SpriteBatch batch;
	
	public MenuScreen(DeepBlue game){
		Objects.loadMainMenu();
		this.game = game;
		
		camera = new OrthographicCamera();
		camera.setToOrtho(true,1920,1080);
		
		batch = new SpriteBatch();
	}
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1f, 1f, 1f, 1f);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		camera.update();
		
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		
		//RENDERING CODE GOES HERE
		batch.draw(Objects.background_sprite, 0, 0);
		batch.draw(Objects.tutorial_sprite, 709, 347);
		batch.draw(Objects.play_sprite, 881, 501);
		batch.draw(Objects.leaderboards_sprite, 675, 669);
		batch.draw(Objects.credits_sprite, 809, 831);
		
		batch.end();
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