/** 
 * CopyRright (c)1985-2010: ada.young <br />                             
 * Project: javaworld<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.test<br />                             
 * Author：ada.young <br />                  
 * Create Date：  Jun 9, 2010<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:Jun 9, 2010          <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;


public class UnZip {
	 /** Constants for mode listing or mode extracting. */
	  public static final int LIST = 0, EXTRACT = 1;

	  /** Whether we are extracting or just printing TOC */
	  protected int mode = LIST;

	  /** The ZipFile that is used to read an archive */
	  protected ZipFile zippy;

	  /** The buffer for reading/writing the ZipFile data */
	  protected byte[] b;

	  /**
	   * Simple main program, construct an UnZipper, process each .ZIP file from
	   * argv[] through that object.
	   */
	  public static void mains(String[] argv) {
	    UnZip u = new UnZip();

	    for (int i = 0; i < argv.length; i++) {
	      if ("-x".equals(argv[i])) {
	        u.setMode(EXTRACT);
	        continue;
	      }
	      String candidate = "E:\\jars\\guice-2.0\\guice-2.0.jar";
	      // System.err.println("Trying path " + candidate);
	      if (candidate.endsWith(".zip") || candidate.endsWith(".jar"))
	        u.unZip(candidate);
	      else
	        System.err.println("Not a zip file? " + candidate);
	    }
	    System.err.println("All done!");
	  }

	  /** Construct an UnZip object. Just allocate the buffer */
	  UnZip() {
	    b = new byte[8092];
	  }

	  /** Set the Mode (list, extract). */
	  protected void setMode(int m) {
	    if (m == LIST || m == EXTRACT)
	      mode = m;
	  }

	  /** Cache of paths we've mkdir()ed. */
	  protected SortedSet dirsMade;

	  /** For a given Zip file, process each entry. */
	  public void unZip(String fileName) {
	    dirsMade = new TreeSet();
	    try {
	      zippy = new ZipFile(fileName);
	      Enumeration all = zippy.entries();
	      while (all.hasMoreElements()) {
	        getFile((ZipEntry) all.nextElement());
	      }
	    } catch (IOException err) {
	      System.err.println("IO Error: " + err);
	      return;
	    }
	  }

	  protected boolean warnedMkDir = false;

	  /**
	   * Process one file from the zip, given its name. Either print the name, or
	   * create the file on disk.
	   */
	  protected void getFile(ZipEntry e) throws IOException {
	    String zipName = e.getName();
	    switch (mode) {
	    case EXTRACT:
	      if (zipName.startsWith("/")) {
	        if (!warnedMkDir)
	          System.out.println("Ignoring absolute paths");
	        warnedMkDir = true;
	        zipName = zipName.substring(1);
	      }
	      // if a directory, just return. We mkdir for every file,
	      // since some widely-used Zip creators don't put out
	      // any directory entries, or put them in the wrong place.
	      if (zipName.endsWith("/")) {
	        return;
	      }
	      // Else must be a file; open the file for output
	      // Get the directory part.
	      int ix = zipName.lastIndexOf('/');
	      if (ix > 0) {
	        String dirName = zipName.substring(0, ix);
	        if (!dirsMade.contains(dirName)) {
	          File d = new File(dirName);
	          // If it already exists as a dir, don't do anything
	          if (!(d.exists() && d.isDirectory())) {
	            // Try to create the directory, warn if it fails
	            System.out.println("Creating Directory: " + dirName);
	            if (!d.mkdirs()) {
	              System.err.println("Warning: unable to mkdir "
	                  + dirName);
	            }
	            dirsMade.add(dirName);
	          }
	        }
	      }
	      System.err.println("Creating " + zipName);
	      FileOutputStream os = new FileOutputStream(zipName);
	      InputStream is = zippy.getInputStream(e);
	      int n = 0;
	      while ((n = is.read(b)) > 0)
	        os.write(b, 0, n);
	      is.close();
	      os.close();
	      break;
	    case LIST:
	      // Not extracting, just list
	      if (e.isDirectory()) {
	        System.out.println("Directory " + zipName);
	      } else {
	        System.out.println("File " + zipName);
	      }
	      break;
	    default:
	      throw new IllegalStateException("mode value (" + mode + ") bad");
	    }
	  }
	public static void main(String[] args) {
		int a = 65536;
		System.out.println(a << 5);
		System.out.println(a >> 16);
		System.out.println(~a);
		System.out.println(a | 2);
		System.out.println(a & 2);
		System.out.println(a & 2);
		System.out.println(a & 1);
		System.out.println(2 << 29);
		File file=new File("C:\\Documents and Settings\\ada");
		//List<File> files = FileUtil.ListFile("C:\\Documents and Settings");
		//System.out.println(files.size());
		//System.out.println("文件个数："+file.list().length);
		try {
			JarFile jar=new JarFile("E:\\jars\\guice-2.0\\guice-2.0.jar");
			Enumeration<JarEntry>  e=	jar.entries();
			while(e.hasMoreElements()){
				String name=e.nextElement().getName();
				System.out.println(name);
				File filetemp=new  File("E:/jars/guice-2.0/guice-2.0.jar"+name);
				if(filetemp.isFile()){
					System.out.println(">>>>>");
				}
			}
			System.out.println(jar.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	
}
