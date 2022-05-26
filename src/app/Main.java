package app;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Main {

	public static void main(String[] args) {

		String fuente = JsonUtiles.leer("Untitled-1");
		String fuente2 = JsonUtiles.leer("arreglo");
		System.out.println(fuente);
		//System.out.println(fuente2);

		try {
			JSONObject obj = new JSONObject(fuente);
			
			boolean success = obj.getBoolean("success");
			System.out.println(success);
			int code = obj.getInt("code");
			System.out.println(code);
			String text = obj.getJSONObject("message").getString("text");
			System.out.println(text);
			String access_token = obj.getJSONObject("data").getString("access_token");
			System.out.println(access_token);
			String refresh_token = obj.getJSONObject("data").getString("refresh_token");
			System.out.println(refresh_token);
			int status = obj.getJSONObject("data").getInt("status");
			System.out.println(status);
			String name = obj.getJSONObject("data").getString("name");
			System.out.println(name);
			String initials = obj.getJSONObject("data").getString("initials");
			System.out.println(initials);
			System.out.println("-------------------------------");
			
			JSONArray array = obj.getJSONArray("arreglo");
			
			
			for(int i = 0; i< array.length(); i++)
			{
				JSONObject temp = array.getJSONObject(i);
				boolean enabled = temp.getBoolean("enabled");
				System.out.println(enabled);
				
				int service_id = temp.getInt("service_id");
				System.out.println(service_id);
				
				String service_text = temp.getString("service_text");
				System.out.println(service_text);
				
				String service_url = temp.getString("service_url");
				System.out.println(service_url);
				
			}
			
			JSONArray array_tel = obj.getJSONArray("telefonos");
			
			for (int i = 0; i<array_tel.length();i++)
			{
		
				String aux = array_tel.getString(i);
				System.out.println(aux);
			}

		} catch (JSONException e) {

		}

	}

}
