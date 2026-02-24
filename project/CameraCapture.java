//package project;
//
//public class CameraCapture {
//	import org.opencv.core.*;
//	import org.opencv.videoio.VideoCapture;
//	import org.opencv.highgui.HighGui;
//
//	public class CameraCapture {
//
//	    static {
//	        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
//	    }
//
//	    public void start() {
//	        VideoCapture camera = new VideoCapture(0);
//
//	        if (!camera.isOpened()) {
//	            System.out.println("Error: Camera not accessible");
//	            return;
//	        }
//
//	        Mat frame = new Mat();
//
//	        while (true) {
//	            camera.read(frame);
//
//	            if (!frame.empty()) {
//	                Mat lipFrame = LipDetector.detectLip(frame);
//
//	                if (lipFrame != null) {
//	                    String result = ModelPredictor.predict(lipFrame);
//	                    Imgproc.putText(
//	                            frame,
//	                            "Text: " + result,
//	                            new Point(20, 40),
//	                            Imgproc.FONT_HERSHEY_SIMPLEX,
//	                            1,
//	                            new Scalar(0, 255, 0),
//	                            2
//	                    );
//	                }
//
//	                HighGui.imshow("Lip Movement Detection", frame);
//	            }
//
//	            if (HighGui.waitKey(1) == 27) { // ESC
//	                break;
//	            }
//	        }
//
//	        camera.release();
//	        HighGui.destroyAllWindows();
//	    }
//	}
//
