package project_foodmanagement_screen;



import java.net.URL;

import common.StageFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;


public abstract class ProjectFoodmanagementScreen  extends  Application {
	

	
	public static void showFoodmanagementScreen ( ) throws Exception {
		try {
			
			@SuppressWarnings("deprecation")
			Parent actorGroup = FXMLLoader.load(new URL("file:///C|/Users/user//eclipse-workspace//online-restaurant-management-system-ui-db-api/src/main/java/project_foodmanagement_screen//FoodmanagementScreen.fxml"));
			
			Scene scene = new Scene(actorGroup, 1310, 775);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	

}
