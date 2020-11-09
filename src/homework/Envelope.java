package homework;

public class Envelope {
	private int width;
	private int height;
	
	public Envelope() {
	}
		
	public int getWidth() {
		return width;
	};
		
	public int getHeight() {
		return height;
	};
		
	public void setWidth(int width) {
		this.width = width;
	};
		
	public void setHeight(int height) {
		this.height = height;
	};
	
	public boolean canPutEnvelope(Envelope envelope) {
		if (this.getWidth() > envelope.getWidth() & this.getHeight() > envelope.getHeight()) 
			return true;
		else if (this.getWidth() > envelope.getHeight() & this.getHeight() > envelope.getWidth()) 
			return true;
		else 
			return false;
		
	}
	
}
