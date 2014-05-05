package cocos2d;

import cocos2d.platform.CCDrawManager;
import com.badlogic.gdx.ApplicationAdapter;

public class cocos2d extends ApplicationAdapter {
	
	@Override
	public void create () {
		CCApplication.sharedApplication().run();
	}

	@Override
	public void resize (int width, int height) {
	}

	@Override
	public void render () {

		try 
		{
			CCDirector.sharedDirector().update();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		CCDrawManager.BeginDraw();
		CCDirector.sharedDirector().mainLoop();
		CCDrawManager.EndDraw();
	}

	@Override
	public void pause () {
	}

	@Override
	public void resume () {
	}

	@Override
	public void dispose () {
	}
}
