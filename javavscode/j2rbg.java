import javax.swing.*;
    public class j2rbg{ 
        
        j2rbg()
        {  
        JFrame f=new JFrame();//creating instance of JFrame  
        
                  
        JButton b=new JButton("Red");//creating instance of JButton  
        b.setBounds(100,100,100, 30);  
        
        JButton b1=new JButton("Yellow");//creating instance of JButton  
        b1.setBounds(300,100,100,30);  
        
        JButton b2=new JButton("Green");//creating instance of JButton  
        b2.setBounds(500,100,100,30);  
                  
        f.add(b);//adding button in JFrame  
        f.add(b1);
        f.add(b2);
                  
        f.setSize(700,500);//400 width and 500 height  
        f.setLayout(null);//using no layout managers  
        f.setVisible(true);//making the frame visible  
        
        }  
          
        public static void main(String[] args) 
        {
        new j2rbg();
    }
}
