package suiteCRM.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SuiteCRMConfigLoader {
	private static Properties prop;

	static {
		prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream("src/test/java/suiteCRM/Utils/suiteCRMConfig.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.getMessage();
		}

	}

	public static String getMyValue(String key) {

		String value = prop.getProperty(key);
		return value;

}
}
