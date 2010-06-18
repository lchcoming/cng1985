package com.ada.common.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

	public static List<File> ListFile(String file){
		File f=new File(file);
		List<File> files=null;
		if(!f.exists()){
		return null;
		}
		else{
			if(f.isFile()){
				files=new ArrayList<File>();
				files.add(f);
			}
			if(f.isDirectory()){
				files=new ArrayList<File>();
				files.addAll(Directory(f));
			}
		}
		return files;
	}
	public static File workFile(File file){
		return file;
	}
	public static List<File> Directory(File file){
		List<File> list=new ArrayList<File>();
		File[] fs=	file.listFiles();
		for(File item:fs){
			if(item.isFile()){
				list.add(item);
			}
			else{
				list.addAll(Directory(item));
			}
		}
		return list;
		
	}
}
