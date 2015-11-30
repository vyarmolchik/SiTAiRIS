package by.bsuir.rhombus;

/**
 * Created by BlizniovaAn on 19.11.2015.
 */
public class Rhombus {   
	private static final String DEFINE_COLOR = "red";
	private String color;
    public Rhombus(){
        super();
        this.color = DEFINE_COLOR;
		System.out.println("cotic");
    }

    public int square(int a,int height)throws RhombusException{
    	
    	int	square = a*height;
    		if(square < 1 || square == 0){
    			throw new RhombusException("The square is negative or equal 0");
    		}    			
    	return square;    
    }

    public int perimeter(int a) throws RhombusException{
        int perimeter = 4*a;
        if(perimeter < 4 || perimeter == 0){
			throw new RhombusException("The perimeter is negative or equal 0");
		} 
        return perimeter;
    }
}
