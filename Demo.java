package lambdaexpression;

public class Demo implements Drawable
{
	
    int width=10;
	

	@Override
	public void draw() 
	{
		System.out.println(width);
		
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.draw();

	}

}

