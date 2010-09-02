/** 
* CopyRright (c)1985-2010: ada.young <br />                             
* Project: javaworld<br />                                           
* Module ID:    <br />   
* Comments:            <br />                                  
* JDK version used:<JDK1.6><br />                                 
* Namespace:com.ada.set<br />                             
* Author：ada.young <br />                  
* Create Date：  Sep 2, 2010<br />   
* Modified By：ada.young          <br />                                
* Modified Date:Sep 2, 2010          <br />                               
* Why & What is modified <br />   
* Version: 1.01         <br />       
*/ 
package com.ada.set;

public class Appss {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String inputStr = "做个好男人";      
	    String key = "aaaaaa";         
	      
	    String str = HloveyRC4(inputStr,key);  
	      
	    //打印加密后的字符串      
	    System.out.println(str);    
	      
	    //打印解密后的字符串      
	    System.out.println(HloveyRC4(str,key));  
	    System.out.println(HloveyRC4(HloveyRC4(str,key),key));  
	    System.out.println(HloveyRCa("123"));  
	    System.out.println(HloveyRCb(HloveyRCa("123")));  
	}
	public static String HloveyRCa(String aInput){
		char[] data=aInput.toCharArray();
		char[] dataa=new char[aInput.length()];
		int len=aInput.length();
		for(int i=0;i<len;i++){
			dataa[i]=(char)(data[i]*500);
		}
		return new String(dataa);
	}
	public static String HloveyRCb(String aInput){
		char[] data=aInput.toCharArray();
		char[] dataa=new char[aInput.length()];
		int len=aInput.length();
		for(int i=0;i<len;i++){
			dataa[i]=(char)(data[i]/500);
		}
		return new String(dataa);
	}
	public static String HloveyRC4(String aInput,String aKey)   
    {   
        int[] iS = new int[256];   
        byte[] iK = new byte[256];   
          
        for (int i=0;i<256;i++)   
            iS[i]=i;   
              
        int j = 1;   
          
        for (short i= 0;i<256;i++)   
        {   
            iK[i]=(byte)aKey.charAt((i % aKey.length()));   
        }   
          
        j=0;   
          
        for (int i=0;i<255;i++)   
        {   
            j=(j+iS[i]+iK[i]) % 256;   
            int temp = iS[i];   
            iS[i]=iS[j];   
            iS[j]=temp;   
        }   
      
      
        int i=0;   
        j=0;   
        char[] iInputChar = aInput.toCharArray();   
        char[] iOutputChar = new char[iInputChar.length];   
        for(short x = 0;x<iInputChar.length;x++)   
        {   
            i = (i+1) % 256;   
            j = (j+iS[i]) % 256;   
            int temp = iS[i];   
            iS[i]=iS[j];   
            iS[j]=temp;   
            int t = (iS[i]+(iS[j] % 256)) % 256;   
            int iY = iS[t];   
            char iCY = (char)iY;   
            iOutputChar[x] =(char)( iInputChar[x] ^ iCY) ;      
        }   
          
        return new String(iOutputChar);   
                  
    }  
}
