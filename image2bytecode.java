package image2bytecode;

import java.nio.file.Files;
import java.io.File;
import java.io.IOException;
import java.util.Base64;

class Image2bytecode{
	public static void main(String[] args) throws IOException{
		File image = new File("Cookie_stack.jpg");
		String bytecode = Base64.getEncoder().encodeToString(Files.readAllBytes(image.toPath()));
		System.out.print(bytecode);
	}
}
