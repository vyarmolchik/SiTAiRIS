package org.fr2eman.test;

import org.fr2eman.test.exceptions.WrongFormatException;

public class Rhombus {
	
	private double m_side;
	private double m_width;
	
	public Rhombus(double side, double width) throws WrongFormatException {
		m_side = side;
		m_width = width;
		if(m_side <= 0) {
			m_side = 0;
			if(m_width <= 0) {
				m_width = 0;
				throw new WrongFormatException();
			}
			throw new WrongFormatException();
		}
		if(m_width <= 0) {
			m_width = 0;
			throw new WrongFormatException();
		}
	}
	
	public double colcualteSquare() {
		return m_side * m_width;
	}
	
	public double colcualtePerimeter() {
		return m_side * 4;
	}
	
}
