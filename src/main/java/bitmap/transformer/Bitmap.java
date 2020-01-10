package bitmap.transformer;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Bitmap {

  BufferedImage img = null;

  public String readBitmap(File path) {
      String goodRead = "Good Read";
      String badRead = "Bad Read";
      try {
      this.img = ImageIO.read(path);
      System.out.println(this.img);
      return goodRead;
    } catch (IOException e) {

    // e.printStackTrace();
          return badRead;
      //System.out.println("can't read file");
     // return badRead;

    }

   // System.out.println("image read successfully");
  }

   public void imageToFile(File path){
try {

  ImageIO.write(this.img, "bmp", path);
}
      catch (IOException e) {
      e.printStackTrace();
      System.out.println("can't read file");
    }


  }

    }







