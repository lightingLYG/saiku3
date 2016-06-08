package saiku3;

import java.io.File;
import java.net.URI;

public class Test1 {
	public static void main(String[] args) {
		URI uri = new File("./test").toURI();
		System.out.println(uri);
	}
}
