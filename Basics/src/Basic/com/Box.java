package Basic.com;

public class Box {
	private double width;
	private double height;
	private double depth;
	
	public Box(double width, double height,double depth) {
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	
	public String getBoxdetels() {
		return "Width of the Box:"+width+"\nHeight of the Box:"+height+"\nDepth of the Box:"+depth;
	}
    
	public double computeVolume(){
		return width*height*depth;
	}
	
	public Box add(Box b) {
        return new Box(this.width + b.width,this.height + b.height,this.depth + b.depth);
    }
    
	public boolean isEqual(Box b) {
        return this.width == b.width && this.height == b.height && this.depth == b.depth;
    }
	
	public Box offset(int offset) {
        return new Box(this.width + offset,this.height + offset,this.depth + offset);
    }
}
