//package project;
//import org.opencv.core.*;
//import org.opencv.imgproc.Imgproc;
//
//public class FramePreprocessor {
//
//    public static Mat preprocess(Mat lipImage) {
//        Mat resized = new Mat();
//        Imgproc.resize(lipImage, resized, new Size(96, 96));
//        Imgproc.cvtColor(resized, resized, Imgproc.COLOR_BGR2GRAY);
//        Imgproc.GaussianBlur(resized, resized, new Size(3, 3), 0);
//        return resized;
//    }
//}
//
//

