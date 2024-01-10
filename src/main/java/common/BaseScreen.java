package common;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.net.URL;

public class BaseScreen {
	public void show() {
	     try {
		      String myClassName = getClass().getSimpleName();
		      String classFilePath = getClass().getResource(myClassName +".class").toString();
		
		      String fxmlFilePath = classFilePath.replace(".class", ".fxml");
		      @SuppressWarnings("deprecation")
		      Parent actorGroup = FXMLLoader.load(new URL (fxmlFilePath));
		      StageFactory.stage.setTitle(myClassName);
		      Scene scene = new Scene(actorGroup, 1325, 775);
		      StageFactory.stage.setScene(scene);
		      StageFactory.stage.show();
	         }catch (Exception e)
	             {
		         e.printStackTrace();
		
	             }
	
	
            }

}
