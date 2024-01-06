package junit;

public class MoodAnalyser {
	public static String message;

	public MoodAnalyser(String message) throws MoodAnalyserException {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void message(String message) {
		this.message = message;
	}

	public String analyseMood() throws MoodAnalyserException {
		try {
			if (message.toLowerCase().contains("sad")) {
				return "sad";
			} else {
				return "Happy";
			}
		} catch (NullPointerException e) {
			throw new MoodAnalyserException("Enter Invalid Mood, this mood is improper");
//			System.out.println("Please Enter the Valid Mood");
//			return "Happy";
		}
	}
}
