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
	
	public boolean checkOne(String practice){
		
		boolean returnString=false;
		int count =0;
		for (int i=0; i < practice.length(); i++){
			if(practice.equals(practice.charAt(i)) || practice.equals("")){
				count++;
				if(count<2){
					returnString = true;
				}
				else{
					returnString = false;
				}
			}else{
				returnString = false;
			}
		}
	
		return returnString;
		
	}
	public boolean checkTwo(String practice){
		
		boolean returnString=false;
		int count =0;
		for (int i=0; i < practice.length(); i++){
			if(practice.equals(practice.charAt(i)) || practice.equals("")){
				count ++;
				if(count<3){
					returnString = true;
				}
				else{
					returnString = false;
				}
			}else{
				returnString = false;
			}
		}
	
		return returnString;
		
	}
}
