package UI;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;

public class ImageLoader {
	
	public static Image load(String filename)
	{
		return Toolkit.getDefaultToolkit().getImage(ImageLoader.class.getClassLoader().getResource(filename));
	}
}
