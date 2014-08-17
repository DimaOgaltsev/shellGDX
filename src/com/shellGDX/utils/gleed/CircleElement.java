/*******************************************************************************
 * Copyright 2012 David Saltares
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/ 

package com.shellGDX.utils.gleed;

import com.badlogic.gdx.math.Circle;

/**
 * @author David Saltares
 * @date 02/11/2012
 * 
 * @brief Circle GLEED2D shape implementation 
 */
public class CircleElement extends LevelObject {
	Circle circle;
	
	CircleElement() {
		super();
	}
	
	/**
	 * @return circle shape
	 */
	public Circle getCircle() {
		return circle;
	}
}