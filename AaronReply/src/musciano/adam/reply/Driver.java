package musciano.adam.reply;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JOptionPane;



public class Driver {
	public static void main(String []args) throws URISyntaxException, IOException{
		GUI MainWindow= new GUI();
		URI uri= new URI("https://www.youtube.com/watch?v=dFNbjbWcKl4");
		while (true){
			while(!MainWindow.isButtonClicked()){
				try{
					Thread.sleep(100);
				}catch(InterruptedException e){}
			}
			
			switch(MainWindow.getButton()){
			case ID_CONTINUE:			
				java.awt.Desktop.getDesktop().browse(uri);
				JOptionPane.showMessageDialog(null, "Dear Aaron, I really enjoyed your letter! I hope everything is going well,"+
													 "\nit seems as if it is. It's been a while since I programmed in java, so"+
													" \n apologies in advance if the code is messy. Enjoy the video :)");
				break;
			default:
				System.out.println("nothing was clicked");
				break;
			
			}
		}
		
	}
}
