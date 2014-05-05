/******************************************************************************
 * Copyright (c) 2014 cocos2d-java.org
 * 
 *   http://www.cocos2d-java.org
 *   
 *   The MIT License (MIT)
 *      
 *Permission is hereby granted, free of charge, to any person obtaining a copy
 *of this software and associated documentation files (the "Software"), to deal
 *in the Software without restriction, including without limitation the rights
 *to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *copies of the Software, and to permit persons to whom the Software is
 *furnished to do so, subject to the following conditions:

 *The above copyright notice and this permission notice shall be included in
 *all copies or substantial portions of the Software.

 *THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *THE SOFTWARE.
 *******************************************************************************/

package cocos2d.actions.action_ease;

import cocos2d.actions.action.CCFiniteTimeAction;
import cocos2d.actions.action_intervals.CCActionInterval;
import cocos2d.base_nodes.CCNode;
import cocos2d.cocoa.ICCCopyable;

public class CCActionEase extends CCActionInterval
{
    protected CCActionInterval m_pInner;

    // This can be taken out once all the classes that extend it have had their constructors created.
    protected CCActionEase()
    {
    }

    public CCActionInterval getInnerAction()
    {
        return m_pInner;
    }

    public CCActionEase(CCActionInterval pAction)
    {
        initWithAction(pAction);
    }

    protected CCActionEase(CCActionEase actionEase)
    {
    	super(actionEase);
        initWithAction((CCActionInterval) (actionEase.m_pInner.copy()));
    }

    protected boolean initWithAction(CCActionInterval pAction)
    {
        if (super.initWithDuration(pAction.getDuration()))
        {
            m_pInner = pAction;
            return true;
        }
        return false;
    }

    @Override
    public Object copy(ICCCopyable pZone)
    {
        if (pZone != null)
        {
            //in case of being called at sub class
        	CCActionEase pCopy = null;
        	if (pZone instanceof CCActionEase)
        	{
        		pCopy = (CCActionEase)pZone;
        	}
        	super.copy(pZone);

            pCopy.initWithAction((CCActionInterval) (m_pInner.copy()));

            return pCopy;
        }
        return new CCActionEase(this);
    }

    @Override
    public void startWithTarget(CCNode target)
    {
        super.startWithTarget(target);
        m_pInner.startWithTarget(m_pTarget);
    }

    @Override
    public void stop()
    {
        m_pInner.stop();
        super.stop();
    }

    @Override
    public void update(float time) throws Exception
    {
        m_pInner.update(time);
    }

    @Override
    public CCFiniteTimeAction reverse()
    {
        return new CCActionEase((CCActionInterval) m_pInner.reverse());
    }
}