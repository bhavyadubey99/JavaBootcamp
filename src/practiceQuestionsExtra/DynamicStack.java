package practiceQuestionsExtra;

public class DynamicStack extends Stack{

	@Override
	public void push(int item) throws Exception{
		
		if(isFull()) {
			
			//created new arr of double size
			int[] newarr = new int[data.length * 2];
			
			//copying older values.
			for(int i = 0; i < data.length; i++) {
				newarr[i] = data[i];
			}
			
			//making new arr as data arr for future works.(ref changed)
			data = newarr;
		
		}
		
//		//add the item. 
//		tos++;
//		data[tos] = item; // but you can also call the parent push function. 
		
		super.push(item);
	}
}
