package ko222gj_assign3;

public class MultiDisplay {

	
	private String setDisplayMessage;
	private String message;
	private int count;
	public MultiDisplay(){
		setDisplayMessage = " ";
		message =" ";
		count = 0;
	}
	
	public void setDisplayMessage(String string){
		message = " ";
		setDisplayMessage = "Hello world!";
	
}
	public void setDisplayMessage(int i){
		count = i;
	}
	public void setDisplayCount(int i){
		count = i;
	}
	public void display(){
		for(int i=0; i< count; i++){
			System.out.println(setDisplayMessage);
		}
	}
		public void display(String string, int n){
			this.message=string;
			this.count=n;
			for(int i=0; i< n; i++){
				System.out.println(message);
			
		}
	}
		public String getDisplayMessage(){
			return message;
		}

}







