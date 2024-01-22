package project_foodmanagement_screen;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import project_adduser.ProjectAddUserScreen;
import project_home_screen.ProjectHomeScreen;


public class ProjectFoodmanagementScreenController  {
	
	@FXML
	private Button AddFood;
	
	@FXML
	private Button EditFood;
	
	@FXML
	private Button DeleteFood;
	
	@FXML
	private Button SearchFood;
	
	@FXML
	private Button Back;
	
	public void AddFood(ActionEvent event) throws Exception {
		ProjectAddUserScreen.showAddUserScreen ( );
		
	}
public void EditFood(ActionEvent event) throws Exception {
	
	}
public void DeleteFood(ActionEvent event) throws Exception {
	
}
public void SearchFood(ActionEvent event) throws Exception {
	
	
}public void Back(ActionEvent event) throws Exception {
	new ProjectHomeScreen().show();
	
}


	
}
