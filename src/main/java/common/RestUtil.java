package common;

import java.net.URI;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.dyanyog.dto.AddUserRequest;
import org.dyanyog.dto.AddUserResponse;
import org.dyanyog.dto.LoginRequest;
import org.dyanyog.dto.LoginResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

public class RestUtil {
	private static final ObjectMapper objectMapper = new ObjectMapper();

	
public static AddUserResponse sendGetRequest(String url)throws Exception{
		HttpClient client =  HttpClient.newHttpClient();
		
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).header("Content-Type", "application/json")
				  .GET().build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		AddUserResponse userResponse = objectMapper.readValue(response.body(), AddUserResponse.class);
		
		return userResponse;
	}

	public  static <T>T  sendPostRequest(String url ,Class<T> responseType, Object addUserRequest)throws Exception{
		
		String jsonRequestAsString = objectMapper.writeValueAsString(addUserRequest);
	
		HttpClient client =  HttpClient.newHttpClient();
		
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).header("Content-Type", "application/json")
				  .POST(HttpRequest.BodyPublishers.ofString(jsonRequestAsString)).build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		String strResponse = response.body();
		System.out.println(strResponse);
		T userResponse = objectMapper.readValue(response.body(), responseType);
		
		return userResponse;

}
}
