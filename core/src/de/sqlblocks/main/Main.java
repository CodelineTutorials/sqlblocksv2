package de.sqlblocks.main;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Main extends Game {

	
	@Override
	public void create () {

	}

	@Override
	public void render () {
		super.render();
		this.setScreen(new MainScreen());
	}
	
	@Override
	public void dispose () {

	}
}