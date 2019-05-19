package com.rajkamal.web.app.service;

import java.util.List;

import com.rajkamal.web.app.mapping.Color;

public interface ServiceColor {
	/**
	 * Will be used to get all colors
	 * @return
	 */
	public List<Color> getAllColors();
	
	/**
	 * By color name
	 * @param name
	 * @return
	 */
	public Color getColorByName(String name);
}
