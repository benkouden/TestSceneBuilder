package application;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
public class VBoxExempleController {
	@FXML
	private TextField texteEntre;
	@FXML
	private TextArea textSorti;
	
	public VBoxExempleController()
	{
		
	}
	
	@FXML
	private void initialize()
	{
		
	}
	
	@FXML
	private void afficheSortie()
	{
		textSorti.setText(texteEntre.getText());
	}
	
	
}
