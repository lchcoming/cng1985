using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;
using System.Security.Cryptography;
namespace cng1985
{
    class MakeSafe
    {
        // Encrypt the string.
        public byte[] Encrypt(string PlainText)
        {
          key = new DESCryptoServiceProvider();
            // Create a memory stream.
            MemoryStream ms = new MemoryStream();

            // Create a CryptoStream using the memory stream and the 
            // CSP DES key.  
            CryptoStream encStream = new CryptoStream(ms, key.CreateEncryptor(), CryptoStreamMode.Write);

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
        private DESCryptoServiceProvider key;
        // Decrypt the byte array.
        public  string Decrypt(byte[] CypherText)
        {
            
            // Create a memory stream to the passed buffer.
            MemoryStream ms = new MemoryStream(CypherText);

            // Create a CryptoStream using the memory stream and the 
            // CSP DES key. 
            CryptoStream encStream = new CryptoStream(ms, key.CreateDecryptor(), CryptoStreamMode.Read);

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
