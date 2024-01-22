package project_adduser;

import org.dyanyog.dto.UserRequest;
import org.dyanyog.dto.UserResponse;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import common.RestUtil;
import db_oprations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import projectlogin.ProjectLoginScreen;

public class ProjectAddUserScreenController {

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

		UserRequest addUserRequest = new UserRequest();

		addUserRequest.setUsername(Name.getText());
		addUserRequest.setPassword(Password.getText());
		addUserRequest.setEmail(Email.getText());
		

		try {
			UserResponse response = RestUtil.sendPostRequest("http://localhost:8085/auth/user", UserResponse.class,
					addUserRequest);
			System.out.println("User Added Successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	

	public void Back(ActionEvent event) throws Exception {
		new ProjectLoginScreen().show();

	}

}
