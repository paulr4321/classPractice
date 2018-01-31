package gitPrac;

public class practice {

	public boolean checkEmpty(String practice){
		
		boolean returnString;
		
		if(practice.equals(null) || practice.equals("")){
		    returnString = true;
		}else{
			returnString = false;
		}
		return returnString;
	}
}
