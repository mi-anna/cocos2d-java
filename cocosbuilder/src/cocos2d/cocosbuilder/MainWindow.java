package cocos2d.cocosbuilder;

import cocos2d.cocosbuilder.test.UITest;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class MainWindow {

	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "DesktopLauncher";
		new CocosApplication();
		new LwjglApplication(new UITest(), config);
	}

}
