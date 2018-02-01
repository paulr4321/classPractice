package gitPrac;

public class practice {
	
	public void practice(){
		
	}

	

	public int Add(String practice){
		int calc =0;
		String[] listPrac = practice.split(",");
		if(listPrac.length >= 1 && listPrac[0]!=""){
			for (int i=0; i < listPrac.length; i++){
				calc = calc +Integer.parseInt(listPrac[i]);
				
			}
		}
		else{
			return 0;
		}
		
		return calc;
	}


	
}