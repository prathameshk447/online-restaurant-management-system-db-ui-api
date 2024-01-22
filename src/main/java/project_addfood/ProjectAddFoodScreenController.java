package project_addfood;




import java.io.IOException;

import org.dyanyog.dto.UserRequest;
import org.dyanyog.dto.UserResponse;

import common.RestUtil;
import db_oprations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;



public class ProjectAddFoodScreenController  {
	
	@FXML
	private TextField FoodName;
	

	@FXML
	private TextField Price;
	
	@FXML
	private TextField Quantity;
	
	
	
	
	
	
	@FXML
	private Button AddFood;
	@FXML
	private Button Back;
	
	
	
	public void showClose (ActionEvent event) throws Exception {
		
		
	}
	
public void showSave(ActionEvent event) throws Exception {
	UserRequest addUserRequest = new UserRequest();

	addUserRequest.setUsername(FoodName.getText());
	addUserRequest.setPassword(Price.getText());
	addUserRequest.setEmail(Quantity.getText());
	

	try {
		UserResponse response = RestUtil.sendPostRequest("http://localhost:8085/auth/user", UserResponse.class,
				addUserRequest);
		System.out.println("User Added Successfully");
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
	
}


	

