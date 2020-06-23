public class Box {
	int height;
	int width;
	int depth;
	public Box(int height,int width,int depth)
	{
		this.height=height;
		this.width=width;
		this.depth=depth;
	}

	
	public void display_volume()
	{
		int volume=height*width*depth;
		System.out.println("Volume is:"+volume);
	}
	public static void main(String args[])
	{
		Box b=new Box(4,7,5);
		b.display_volume();
	}

	
}
