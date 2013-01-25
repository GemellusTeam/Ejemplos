package com.gemellusteam.ejemplo4;


import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class DrawSprite implements ApplicationListener{
	
	int width;
	int height;
	OrthographicCamera cam;
	Sprite personaje;
	SpriteBatch batch;
	Texture textura;

	@Override
	public void create() {
		width = Gdx.graphics.getWidth();
		height = Gdx.graphics.getHeight();
		cam = new OrthographicCamera(width, height );
		cam.setToOrtho(false, width, height);
		//cam.position.set(width/2, height/2, 0);
		batch = new SpriteBatch();
		textura = new Texture("personaje.png");
		personaje = new Sprite(textura);
		personaje.setPosition(width/2, width/2);
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render() {
		Gdx.gl10.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		batch.setProjectionMatrix(cam.combined);
		batch.begin();
		personaje.draw(batch);
		batch.end();
		
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
