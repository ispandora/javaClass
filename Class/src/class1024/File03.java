package class1024;

import java.io.File;

public class File03 {

	public static void main(String[] args) {
		String desktop = System.getProperty ("user.home") + "/Desktop/";
		File file = new File(desktop + "screen.txt");
		
		System.out.println("size:"+file.length());
		System.out.println("last modify:"+file.lastModified());
		System.out.println("can read:"+file.canRead());
		System.out.println("can write:"+file.canWrite());
		System.out.println("can parent:"+file.getParent());
		System.out.println("getAbsolutePath:"+file.getAbsolutePath());
		System.out.println("getPath:"+file.getPath());
		
		File file2 = new File(desktop);
		File dir[] = file2.listFiles();
		for(int i = 0; i < dir.length; i++){
			if(dir[i].isDirectory()){
				System.out.print("/");
			}
			System.out.println(dir[i].getName());
		}
		
		
	}

}
