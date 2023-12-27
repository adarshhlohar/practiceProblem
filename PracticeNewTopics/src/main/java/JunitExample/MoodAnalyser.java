package JunitExample;

public class MoodAnalyser {

	public String analyseMood(String mood) throws CustomException{
		if (mood == "Happy") {
			return "Happy";
		}
		throw new CustomException("Invalid input");
	}

	public static void main(String[] args) {

	}

}
