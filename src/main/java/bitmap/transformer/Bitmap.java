package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bitmap {

  BufferedImage img = null;

  public void readBitmap(File path) {

    try {
      this.img = ImageIO.read(path);
      System.out.println(this.img);
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("can't read file");
    }
    System.out.println("image read successfully");
  }



}
