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

package cocos2d.predefine;

import cocos2d.textures.CCTexture2D;

/// <summary>
/// CCNode objects that uses a Texture2D to render the images.
/// </summary>
/// <remarks>
/// The texture can have a blending function.
/// If the texture has alpha premultiplied the default blending function is:
///   src=GL_ONE dst= GL_ONE_MINUS_SRC_ALPHA
/// else
///    src=GL_SRC_ALPHA dst= GL_ONE_MINUS_SRC_ALPHA
/// But you can change the blending funtion at any time.
/// @since v0.8.0
/// </remarks>
public interface ICCTextureProtocol
{
    /// <summary>
    /// gets or sets a new texture. it will be retained
    /// </summary>
    CCTexture2D getTexture();
    void setTexture(CCTexture2D value);
}
