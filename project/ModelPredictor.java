//package project;
//import org.opencv.core.Mat;
//import java.util.Random;
//
//public class ModelPredictor {
//
//    private static final String[] SAMPLE_WORDS = {
//            "HELLO", "YES", "NO", "THANK YOU", "PLEASE"
//    };
//
//    public static String predict(Mat lipFrame) {
//        Mat processed = FramePreprocessor.preprocess(lipFrame);
//
//        // Simulated deep learning output
//        Random random = new Random();
//        String predictedWord = SAMPLE_WORDS[random.nextInt(SAMPLE_WORDS.length)];
//
//        return TextConverter.convert(predictedWord);
//    }
//}
