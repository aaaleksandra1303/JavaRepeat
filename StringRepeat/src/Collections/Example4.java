package Collections;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Example4 {

	public static void main(String[] args) {
	
		Map<String,String> dictionary = new HashMap<String,String>();
		dictionary.put("witam","hello");
		dictionary.put("kot","cat");
		dictionary.put("pies","dog");
		
		String word =JOptionPane.showInputDialog("Put word in polish");
		
		if(dictionary.containsKey(word)){
			JOptionPane.showMessageDialog(null, "Polish word :"+ dictionary.get(word));
		}else{
			JOptionPane.showMessageDialog(null, "The word is not find");
		}
		
		

	}

}
