using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Security.Cryptography;
namespace cng1985
{
    class AdaMd5
    {
        private HashAlgorithm _md5Source;

        public HashAlgorithm Md5Source
        {
            get { return _md5Source; }
            set { _md5Source = value; }
        }
        public string getMd5Hash(string input)
        {
            // Create a new instance of the MD5CryptoServiceProvider object.
            if (Md5Source == null) {
                Md5Source = new SHA512Cng();
            }
            HashAlgorithm md5Hasher = Md5Source;

            // Convert the input string to a byte array and compute the hash.
            byte[] data = md5Hasher.ComputeHash(Encoding.Default.GetBytes(input));

            // Create a new Stringbuilder to collect the bytes
            // and create a string.
            StringBuilder sBuilder = new StringBuilder();

            // Loop through each byte of the hashed data 
            // and format each one as a hexadecimal string.
            for (int i = 0; i < data.Length; i++)
            {
                sBuilder.Append(data[i].ToString("x2"));
            }

            // Return the hexadecimal string.
            return sBuilder.ToString();
        }
        public bool verifyMd5Hash(string input, string hash)
        {
            // Hash the input.
            string hashOfInput = getMd5Hash(input);
            Console.WriteLine(hashOfInput);
            // Create a StringComparer an comare the hashes.
            StringComparer comparer = StringComparer.OrdinalIgnoreCase;

            if (0 == comparer.Compare(hashOfInput, hash))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}
