package cocos2d.cocosbuilder;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;

import cocos2d.CCApplication;
import cocos2d.CCDirector;
import cocos2d.cocoa.CCSize;
import cocos2d.layers_scenes_transitions_nodes.CCScene;

public class CocosApplication extends CCApplication {

	@Override
	public boolean applicationDidFinishLaunching() {
		// TODO Auto-generated method stub
        CCDirector pDirector = CCDirector.sharedDirector();
        pDirector.setGlClearColor(Color.WHITE);
        pDirector.setOpenGlView();
        CCScene scene = CocosScene.scene();
        pDirector.runWithScene(scene);
		return true;
	}

	@Override
	public void applicationDidEnterBackground() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applicationWillEnterForeground() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAnimationInterval(double interval) {
		// TODO Auto-generated method stub
		
	}

}
