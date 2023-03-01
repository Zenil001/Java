import java.applet.*;
import java.awt.*;
/*

<applet code = "j1.class" width = "200" height = "200"></applet>
*/


public class applet1 extends Applet {
    	String msg = "The cuurently executing method";
	public void init()
	{
		msg += " inti() ";
	}
	public void start()
	{
		msg += "start() ";
	}
	public void stop()
	{
		msg += " stop() ";
	}


	public void paint(Graphics g)
	{
		msg+=" Paint() ";
		g.drawString(msg,100,100);
		showStatus("Test applet");
	}	
	public static void main(String[]args)
    {
        new applet1();
    }
}