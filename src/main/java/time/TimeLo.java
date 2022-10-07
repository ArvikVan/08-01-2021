package time;

import org.json.JSONObject;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.UUID;

public class TimeLo {
    public static void main(String[] args) throws IOException {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        System.out.println(dateTimeFormatter.format(localDateTime));
        //String inputPath = "https://img1.akspic.ru/attachments/crops/2/2/4/0/50422/50422-senokosnoye_ugodye-pole-selskoe_hozyajstvo-zakat-risovoe_pole-2560x1440.jpg";
        String inputPath = "/home/arvik/Pictures/Screenshots/";
        String savePicturesDirectory = "/home/arvik/Pictures/Screenshots/";
        int sizeFromREST = 200;
        BufferedImage image;
        String id = UUID.randomUUID().toString();
        if (inputPath.startsWith("http")) {
            URL url1 = new URL(inputPath);
            image = ImageIO.read(url1);
        } else {
            File file = new File(inputPath + "kvadro.png");
            image = ImageIO.read(file);
        }
        double originalImageHeight = image.getHeight();
        double originalImageWidth = image.getWidth();
        System.out.println("originalImageHeight = " + image.getHeight());System.out.println("originalImageWidth = " + image.getWidth());
        double ratio = originalImageHeight > originalImageWidth
                ? originalImageHeight/originalImageWidth : originalImageWidth/originalImageHeight;
        System.out.println("ratio = " + ratio);
        double targetWfromREST = 0, targetHfromREST = 0;
        if (originalImageHeight > originalImageWidth) {
            targetWfromREST = sizeFromREST;
            targetHfromREST = sizeFromREST * ratio;
        } else {
            targetWfromREST = sizeFromREST * ratio;
            targetHfromREST = sizeFromREST;
        }
        System.out.println("targetWfromREST = " + targetWfromREST);
        System.out.println("targetHfromREST = " + targetHfromREST);
        //уменьшаем размер картинки
        ImageIO.write(resizeImage(image, (int) targetWfromREST, (int) targetHfromREST),
                "jpg",
                new File(savePicturesDirectory + id + "-resize.png"));

        //обрезаем картинку
        File fileForCut = new File(savePicturesDirectory + id + "-resize.png");
        BufferedImage cuttingImage = ImageIO.read(fileForCut);
        int measure = (int) (targetWfromREST < targetHfromREST ? targetWfromREST : targetHfromREST);
        ImageIO.write(cutImage(cuttingImage, measure, measure), "jpg",
                new File(savePicturesDirectory + id + "-resize-cut.png"));
    }

    public static BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) throws IOException {
        BufferedImage resizedImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = resizedImage.createGraphics();
        graphics2D.drawImage(originalImage, 0, 0, targetWidth, targetHeight, null);
        graphics2D.dispose();
        return resizedImage;
    }
    public static BufferedImage resize(BufferedImage original, int targetW, int targetH) {
        Image resultImage = original.getScaledInstance(targetW, targetH, Image.SCALE_DEFAULT);
        BufferedImage outputImage = new BufferedImage(targetW, targetH, BufferedImage.TYPE_INT_RGB);
        outputImage.getGraphics().drawImage(resultImage, 0, 0, null);
        return outputImage;
    }
    public static BufferedImage cutImage(BufferedImage image, int w, int h) {
        BufferedImage img = image.getSubimage(0, 0, w, h); //fill in the corners of the desired crop location here
        BufferedImage copyOfImage = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics g = copyOfImage.createGraphics();
        g.drawImage(img, 0, 0, null);
        return copyOfImage;
    }
}
