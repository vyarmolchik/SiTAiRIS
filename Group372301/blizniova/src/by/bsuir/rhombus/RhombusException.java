package by.bsuir.rhombus;

/**
 * Created by BlizniovaAn on 19.11.2015.
 */

public class RhombusException  extends Exception{
	private Exception _hidden;
	public RhombusException(String er) {
		super(er);
	}
	public RhombusException(String er, Exception e) {
		super(er);
	_hidden = e;
	}
	public Exception getHiddenException() {
		return _hidden;
	}
}
