using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;
using System.Security.Cryptography;

namespace cng1985
{
    class MySafe
    {
      private  byte[] Key = { 0x05, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x10, 0x11, 0x12, 0x13, 0x14, 0x15, 0x26 };
       private byte[] IV = { 0x05, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x10, 0x11, 0x12, 0x13, 0x14, 0x15, 0x06 };
       private byte[] Encrypt(string PlainText)
       {
          
           // Create a memory stream.
           MemoryStream ms = new MemoryStream();
           //RijndaelManaged RMCrypto = new RijndaelManaged();
           // Create a CryptoStream using the memory stream and the 
           // CSP DES key.  
           CryptoStream encStream = new CryptoStream(ms, RMCrypto.CreateEncryptor(Key, IV), CryptoStreamMode.Write);

           // Create a StreamWriter to write a string
           // to the stream.
           StreamWriter sw = new StreamWriter(encStream);

           // Write the plaintext to the stream.
           sw.WriteLine(PlainText);

           // Close the StreamWriter and CryptoStream.
           sw.Close();
           encStream.Close();

           // Get an array of bytes that represents
           // the memory stream.
           byte[] buffer = ms.ToArray();
           // Close the memory stream.
           ms.Close();

           // Return the encrypted byte array.
           return buffer;
       }
     //  private DESCryptoServiceProvider RMCrypto=new DESCryptoServiceProvider();
       private RijndaelManaged RMCrypto = new RijndaelManaged();
       // Decrypt the byte array.
       private string Decrypt(byte[] CypherText)
       {

           // Create a memory stream to the passed buffer.
           MemoryStream ms = new MemoryStream(CypherText);
         
           // Create a CryptoStream using the memory stream and the 
           // CSP DES key. 
           CryptoStream encStream = new CryptoStream(ms,RMCrypto.CreateDecryptor(Key,IV), CryptoStreamMode.Read);

           // Create a StreamReader for reading the stream.
           StreamReader sr = new StreamReader(encStream);

           // Read the stream as a string.
           string val = sr.ReadLine();
           // Close the streams.
           sr.Close();
           encStream.Close();
           ms.Close();

           return val;
       }
       public string EncryptString(string plaintext)
       {
           return Encoding.Unicode.GetString(Encrypt(plaintext));
       }
       public string DecryptString(string plaintext)
       {
           byte[] a = Encoding.Unicode.GetBytes(plaintext);
           return Decrypt(a);
       }
    }
}
