public class ShapePrinter {
    public void printTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = height - i; j < height; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
public class ShapePrinter {
    public void printTriangle(int height) {
        String star = "*";
        for (int i = 1; i <= height; i++) {
            System.out.println(star);
            star += " *";
        }
    }
}
*/