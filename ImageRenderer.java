import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageRenderer {

  public static void main(String[] args) throws IOException {
    BufferedImage image = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);

    Graphics2D graphics = image.createGraphics();
    graphics.setBackground(Color.WHITE);
    graphics.clearRect(0, 0, 200, 200);

    graphics.setColor(Color.BLUE);

    graphics.drawOval(20, 50, 30, 20);
    graphics.drawString("ProgramTree", 20, 55);

    graphics.drawOval(20, 80, 30, 20);
    graphics.drawString("BlockTree", 20, 85);

    graphics.drawLine(35, 70, 35, 80);

    ImageIO.write(image, "png", (new File("image.png")));
  }
}