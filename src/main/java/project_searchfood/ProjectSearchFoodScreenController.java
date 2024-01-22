package project_searchfood;






import java.sql.ResultSet;
import java.sql.SQLException;

import org.dyanyog.dto.UserRequest;

import db_oprations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class ProjectSearchFoodScreenController  {
	
	@FXML
	private  TextField SearchFoodName;
	
	@FXML
	private  TextField FoodName;
	

	@FXML
	private TextField Price;
	
	@FXML
	private TextField Quantity;
	
	@FXML
	private Button Search;
	
	@FXML
	private Button Back;
	
	@FXML
	private Button SearchFood;
	
	@FXML
	private Button DeleteFood;
	
	
	
	
	public void showClose (ActionEvent event) throws Exception {
		
		
	}
	
public void showSearch(ActionEvent event) throws Exception {
	boolean status = Search(SearchFoodName.getText());
	if (status) {
		Search(null);
	}else {
		
	}
	
	
	
}
public boolean Search(String EmailToSearch) throws Exception {
	      UserRequest addUserRequest = new UserRequest();

	      
	if(addUserRequest.next()) {
		SearchFoodName.setText("user  Found");
		FoodName.setText(addUserRequest.getString("FoodName"));
		Price.setText(addUserRequest.getString("Price"));
		Quantity.setText(addUserRequest.getString("Quantity"));
		
	}else {
		addUserRequest.setText("user not Found");
	}



	
	return false;
}

public void showDelete(ActionEvent event) throws Exception {
	
}
public void showEdit (ActionEvent event) throws Exception {
	
}




	
}
