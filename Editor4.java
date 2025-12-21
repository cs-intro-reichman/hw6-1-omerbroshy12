import java.awt.Color;

public class Editor4 {

    public static void main(String[] args) {
        // בדיקת קלט

        String fileName = args[0];
        int n = Integer.parseInt(args[1]);

        // קריאת התמונה המקורית
        Color[][] sourceImage = Runigram.read(fileName);

        // יצירת תמונת היעד (גרסת גווני אפור של המקור)
        Color[][] targetImage = Runigram.grayScaled(sourceImage);

        // הפעלת המורפינג
        // הפונקציה morph כבר דואגת להגדיר את הקנבס ולהציג את השלבים
        Runigram.morph(sourceImage, targetImage, n);
    }
}
