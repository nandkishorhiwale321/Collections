//package project;
//
//
//	import org.opencv.core.*;
//	import org.opencv.objdetect.CascadeClassifier;
//	import org.opencv.imgproc.Imgproc;
//
//	public class LipDetector {
//
//	    private static CascadeClassifier mouthCascade =
//	            new CascadeClassifier("resources/haarcascade_mouth.xml");
//
//	    public static Mat detectLip(Mat frame) {
//	        Mat gray = new Mat();
//	        Imgproc.cvtColor(frame, gray, Imgproc.COLOR_BGR2GRAY);
//
//	        MatOfRect mouths = new MatOfRect();
//	        mouthCascade.detectMultiScale(gray, mouths, 1.1, 5);
//
//	        Rect[] mouthArray = mouths.toArray();
//	        if (mouthArray.length > 0) {
//	            Rect mouth = mouthArray[0];
//	            return new Mat(frame, mouth);
//	        }
//	        return null;
//	    }
//	}
//
//
