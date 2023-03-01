import java.awt.*;
import java.applet.*;

/*

<applet code = "j3.class" width = "200" height = "200"></applet>
<param name = name value = "bhargav">
<param name = age value = "20">
<param name = sem value = "6">
<param name = year value = "3">
*/

public class applet3 extends Applet
    {
        public void paint(Graphics g)
        {
            String name = getParameter(name: "name");
            String age = getParameter(name: "age");
            String sem = getParameter(name: "sem");
            String yr = getParameter(name: "year");
            
            g.drawString("Name : " + name, 20, 20);
            g.drawString("Age : " + age,20, 40);
            g.drawString("Semester : " + sem, 20, 60);
            g.drawString("Year : " + yr, 20, 80);
        }
    }
