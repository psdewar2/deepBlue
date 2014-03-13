package com.me.deepblue;

import com.badlogic.gdx.Game;
import com.me.screens.GameScreen;
import com.me.screens.MenuScreen;

public class DeepBlue extends Game{

	public MenuScreen main_menu_screen;
	
	@Override
	public void create() {
		main_menu_screen = new MenuScreen(this);
		
		setScreen(main_menu_screen);
	}

}
