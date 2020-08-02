package com.techlab.folder.test;

import com.techlab.folder.File;
import com.techlab.folder.Folder;

public class FolderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder dashes = new StringBuilder();
		dashes.append("--");
		Folder movieFolder = new Folder("movie");
		Folder actionFolder = new Folder("action");
		Folder comedyFolder = new Folder("comedy");
		Folder test = new Folder("try");
		File abcFile = new File("abc", 100, "avi");
		File defFile = new File("def", 100, "mp4");
		File mnoFile = new File("mno", 100, "avi");
		File pqrFile = new File("pqr", 100, "mp4");
		File xyzFile = new File("xyz", 100, "avi");
		File ghiFile = new File("ghi", 100, "mp4");

		actionFolder.addChildren(abcFile);
		actionFolder.addChildren(defFile);
		actionFolder.addChildren(ghiFile);
		comedyFolder.addChildren(pqrFile);
		comedyFolder.addChildren(mnoFile);
		comedyFolder.addChildren(xyzFile);
		//actionFolder.addChildren(comedyFolder);
		comedyFolder.addChildren(actionFolder);
		movieFolder.addChildren(actionFolder);
		movieFolder.addChildren(comedyFolder);
		System.out.println(movieFolder.display());
		//movieFolder.display(dashes);



	}

}
