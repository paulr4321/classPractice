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
        
		//checks if method can handle two charcaters to calculate
        
		boolean returnString=false;
		int count =0;
		for (int i=0; i < practice.length(); i++){
			if(Character.isDigit(practice.charAt(i)) || practice.equals("")){
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
        
        //checks if method can handle two charcaters to calculate
		
		boolean returnString=false;
		int count =0;
		for (int i=0; i < practice.length(); i++){
			if(Character.isDigit(practice.charAt(i)) || practice.equals("")){
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
	public boolean moreNumbers(String practice){
		boolean returnString=false;
		
		for (int i=0; i < practice.length(); i++){
			if(Character.isDigit(practice.charAt(i))){
				
				
				returnString = true;
				
			}else{
				returnString = false;
			}
		}
	
		return returnString;
		
		
	}
	

	public void StringCalculator(String practice){
		int calc =0;
		for (int i=0; i < practice.length(); i++){
			if(Character.isDigit(practice.charAt(i))){
				calc = calc +practice.charAt(i);
				
			}
		}
	}
	public void StringCalculatorOneNum(String practice){
		int calc =0;
		int count =0;
		for (int i=0; i < practice.length(); i++){
			if(Character.isDigit(practice.charAt(i))){
				if(count<2){
					calc = calc +practice.charAt(i);
				}
				
			}
		}
	}
	public void StringCalculatorTwoNum(String practice){
		int calc =0;
		int count =0;
		for (int i=0; i < practice.length(); i++){
			if(Character.isDigit(practice.charAt(i))){
				if(count<3){
					calc = calc +practice.charAt(i);
				}
				
			}
		}
	}
}