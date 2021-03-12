
import javax.swing.*;
import java.awt.*;

public class ShapeOfWindow extends JFrame {
	private TextArea textArea1=new TextArea
            (10,30);
    private TextArea textArea2=new TextArea
            (10,25);

    public ShapeOfWindow()
    {
        setLayout(new FlowLayout());
        Circle circle1=new Circle("red",2);
        Circle circle2=new Circle("blue", 10);
        Circle circle3=new Circle("yellow", 60);

        Rectangle rectangle1=new Rectangle
                ("black",2,5);
        Rectangle rectangle2=new Rectangle
                ("black",8,5);
        Rectangle rectangle3=new Rectangle
                ("red",5,5);


        Shape shapes []={ circle1,circle2, circle3,
                rectangle1,rectangle2,rectangle3};


        String newString1="";

        for (int i = 0; i <shapes.length ; i++)
        {
            newString1+=shapes[i];
            newString1+="\n";
        }
        String  newString2="";
        Shape  temp;
        boolean t=true;
        for (int i = 0; i <shapes.length ; i++) {
            for (int j = 0; j <shapes.length-i-1 ; j++) {

               if(shapes[j].getArea()>shapes[j+1].getArea()&&t)
                {
                    temp=shapes[j];
                    shapes[j]= shapes[j+1];
                    shapes[j+1]=temp;
                }
            }

            newString2+=shapes[i];
            newString2+="\n";
            System.out.println(shapes[i]);
            
        }
        add(textArea1);
        add(textArea2);
        textArea1.setText(newString1);
        textArea2.setText(newString2);
        setSize(500,400);
        setVisible(true);
    }
	
}
