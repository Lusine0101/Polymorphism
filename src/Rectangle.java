
public class Rectangle implements Shape {

	 private  int a;
	 private int b;
	 private String color;


	 public Rectangle() {
	    }



	 public Rectangle(String color,int a, int b ) {
	        this.a = a;
	        this.b = b;
	        this.color = color;
	    }
	 

	    public String getColor() {
		        return color;
		}
	
		public void setColor(String color) {
		        this.color = color;
		}
	
		public int getA() {
		        return a;
		}
	
		public void setA(int a) {
		        this.a = a;
		}
	
	    public int getB() {
	        return b;
	    }

	    public void setB(int b) {
	        this.b = b;
	    }

	    @Override
	    public double getArea() {
	        return a*b;
	    }

	    @Override
	    public double getPermiter() {
	        return 2*(a+b);
	    }

	    @Override
	    public String toString() {
	        return "Rectangle{" +
	                "a=" + a +
	                ", b=" + b +
	                ", s="+ getArea()+
	                ", p="+getPermiter()+
	                ", color='" + color + '\'' +
	                '}';
	    }
		

}
