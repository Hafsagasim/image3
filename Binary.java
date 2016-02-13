import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import javax.imageio.ImageIO;
import java.io.*;
import javax.swing.ImageIcon;
import java.io.IOException;
import java.net.URL;

public class Binary extends JFrame
{
    Image image1 = null;
    private JLabel label1;
    private ImageIcon image2;
    private JLabel label2;


    Binary(){
        super();
        try{

            URL url = new URL("file:///C:/Users/Hafsa/Desktop/Earth.jpg");
            image1 = ImageIO.read(url);

            label1 = new JLabel(new ImageIcon(image1));


            add(label1);

        }
        catch(IOException e){
            e.printStackTrace();
        }




    }
    public static void main(String[]arge){
        Binary gui = new Binary ();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("Image program");
        gui.setSize(400,200);

    }

}
