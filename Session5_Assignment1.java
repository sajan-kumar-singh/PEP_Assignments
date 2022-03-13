package Assignments;

public class Session5_Assignment1 {
	
	static void printMP3(String[] args) {
		for(String s:args) {
			if(s.contains(".mp3")) {
				System.out.println(s);
			}
		}
	}
	
	static void printMP4(String[] args) {
		for(String s:args) {
			if(s.contains(".mp4")) {
				System.out.println(s);
			}
		}
	}
	
	static void printPNG(String[] args) {
		for(String s:args) {
			if(s.contains(".png")) {
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] files= {"song1.mp3","photo.png","video.mp4","GTA.mp3","document.mp3","sheet.mp4"};
		printMP3(files);
		printMP4(files);
		printPNG(files);

	}

}
