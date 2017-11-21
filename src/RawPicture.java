
// This is my attempt at RawPicture without using your code.
// RawPicture.java
import java.awt.Color;
public class RawPicture {
    public static void read() {
        int w = StdIn.readInt();
        int h = StdIn.readInt();
        Picture pic = new Picture(w,h);
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int red = StdIn.readInt();
                int green = StdIn.readInt();
                int blue = StdIn.readInt();
                pic.set(i, j, new Color(red, green, blue));
            }
        }
        pic.show();
    }
    public static void write(String fileName) {
        Picture pic = new Picture(fileName);
        int w = pic.width();
        int h = pic.height();
        System.out.println(w + " " + h);
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                Color color = pic.get(i, j);
                System.out.println(color.getRed() + " " + color.getGreen() + " " + color.getBlue());
            }
        }
    }
    public static void main(String[] args) {
        read();
    }
}