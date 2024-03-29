package projectlogin;





import java.sql.ResultSet;
import java.sql.SQLException;

import org.dyanyog.dto.LoginRequest;
import org.dyanyog.dto.LoginResponse;

import common.RestUtil;
import db_oprations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import project_adduser.ProjectAddUserScreen;
import project_home_screen.ProjectHomeScreen;

public class ProjectLoginScreenController {
	
	
	@FXML
	private TextField Email;
	
	@FXML
	private TextField Password;
	
	@FXML
	private Button Login;
	
	@FXML
	private Button Signup;
	
	public  void projectlogin(ActionEvent event) throws Exception {
		
		
		boolean projectloginstatus = ProjectLoginScreenController.ValidateEmailAndPassword(Email.getText(),Password.getText());
		if(projectloginstatus) {
			
		}else {
			ProjectHomeScreen projectHomeScreen = new ProjectHomeScreen();
			projectHomeScreen.show();
		}
	}
	
public  void Signup(ActionEvent event) throws Exception {
	ProjectAddUserScreen.showAddUserScreen ( );
		
	}
	
	public static boolean ValidateEmailAndPassword(String email,String password){
		LoginRequest loginRequest = new LoginRequest();
		loginRequest.setEmail("spmanagement");
		loginRequest.setPassword("Test@123");
        
		LoginResponse response;
		try {
			response = RestUtil.sendPostRequest(
				"http://localhost:8085/auth/validate",
				LoginResponse.class,
				loginRequest
				);
				if(response.getStatus().equals("Success"))
						  return true;
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			return false;
			  
		}
	

}
