
import java.awt.Color;

public class Grayscale {
    public static void main(String[] args) {
        {
            String filename = args[0];
            Picture pic = new Picture(filename);
            int[] freq = new int[2000];
            for (int i = 0; i < pic.height(); i++) {
                for (int j = 0; j < pic.width(); j++) {
                    Color color = pic.get(i, j);
                    Color gray = Luminance.toGray(color);
                    pic.set(i, j, gray);
                    Color c = pic.get(i, j);
                    int r = c.getRed();
                    int g = c.getGreen();
                    int b = c.getBlue();
                    if (r == c.getRed()) {
                        freq[r]++;
                    }
                    if (g == c.getGreen()) {
                        freq[g]++;
                    }
                    if (b == c.getBlue()) {
                        freq[b]++;
                    }

                    if (i % 1000 == 0) {
                        StdDraw.setPenColor(StdDraw.BLACK);
                        StdDraw.setXscale(-1, pic.width());
                        StdDraw.setYscale(0, pic.height());
                        StdDraw.setPenRadius(.5 / pic.width());
                        for (int k = 0; k < pic.width(); k++) {
                            StdDraw.line(k, 0, k, freq[k]);
                        }
                    }
                }
                pic.show();
            }
        }
    }
}
