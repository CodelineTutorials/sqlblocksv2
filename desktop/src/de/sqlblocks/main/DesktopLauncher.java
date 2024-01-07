package de.sqlblocks.main;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import de.sqlblocks.main.Main;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();

		config.setForegroundFPS(60);
		config.setTitle("sqlblocks2"); // don't change the title of the window as the title is used to make it float in my i3 session!!
		config.setWindowedMode(1000, 700);

		new Lwjgl3Application(new Main(), config);
	}
}
