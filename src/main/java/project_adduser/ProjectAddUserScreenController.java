package project_adduser;




import db_oprations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import projectlogin.ProjectLoginScreen;


public class ProjectAddUserScreenController  {
	
	@FXML
	private TextField Name;
	

	@FXML
	private TextField Email;
	
	@FXML
	private TextField MobileNumber;
	
	
	@FXML
	private TextField Password;
	
	
	
	
	@FXML
	private Button Back;
	
	@FXML
	private Button Save;
	
	
	
	public void Save(ActionEvent event) throws Exception {
		
		
	}
	
public void Back(ActionEvent event) throws Exception {
	 new ProjectLoginScreen().show( );
	
}
	
}


	

