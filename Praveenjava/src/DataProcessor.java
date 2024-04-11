
public class DataProcessor{
	public void processData (int data) throws CustomException {
		if(data<0) {
			throw new CustomException("invalid data"+data);
		}else {
			System.out.println("data proccessed successfully"+data);
		}
			
	}
}