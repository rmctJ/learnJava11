package learnJava11;

import java.lang.Runtime.Version;

public class Object {

	public static void main(String[] args) {
		Version version = Runtime.version();
		String versionStr = "feature=" + version.feature() + " interim=" + version.interim()
			+ " update=" + version.update() + " patch=" + version.patch()
			+ " toString=" + version.toString();
		
		// some update
		System.out.println(versionStr);

	}

}
