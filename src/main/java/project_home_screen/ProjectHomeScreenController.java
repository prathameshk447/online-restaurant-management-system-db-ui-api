package project_home_screen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import projectlogin.ProjectLoginScreen;


public class ProjectHomeScreenController {
	
	@FXML
	private Button FoodMenu;
	
	@FXML
	private Button Customers;
	
	@FXML
	private Button Back;
	
	public void FoodMenu(ActionEvent event) throws Exception {
		
	}
public void Customers(ActionEvent event) throws Exception {
	
	}
public void Back(ActionEvent event) throws Exception {
        new ProjectLoginScreen().show( );
	
}
	
	

	
}
