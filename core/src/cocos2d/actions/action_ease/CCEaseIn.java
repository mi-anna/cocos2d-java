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
import cocos2d.cocoa.ICCCopyable;

public class CCEaseIn extends CCEaseRateAction
{
    public CCEaseIn(CCActionInterval pAction, float fRate)
    {
    	super(pAction, fRate);
    }

    public CCEaseIn(CCEaseIn easeIn)
    {
    	super(easeIn);
    }

    @Override
    public void update(float time) throws Exception
    {
        m_pInner.update((float) Math.pow(time, m_fRate));
    }

    @Override
    public Object copy(ICCCopyable pZone)
    {
        if (pZone != null)
        {
            //in case of being called at sub class
        	CCEaseIn pCopy = null;
        	if (pZone instanceof CCEaseIn)
        	{
        		pCopy = (CCEaseIn)pZone;
        	}
            pCopy.initWithAction((CCActionInterval) (m_pInner.copy()), m_fRate);

            return pCopy;
        }
        return new CCEaseIn(this);
    }

    @Override
    public CCFiniteTimeAction reverse()
    {
        return new CCEaseIn((CCActionInterval) m_pInner.reverse(), 1 / m_fRate);
    }
}