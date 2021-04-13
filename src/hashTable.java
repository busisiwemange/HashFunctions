import java.util.*;
import java.io.*;


public class hashTable{
   static int tableSize = 20011;
/***return hash value 1 for all the keys */
public int worstHash(String key){

return 1;
}
/***add unicode values of the key to generate the hash value for the key  */
public static int hash1 ( String key ) { 
  int hashVal = 0;    
  for( int i = 0; i < key.length(); i++ )  
        hashVal += key.charAt(i);
   return hashVal % tableSize;
 }
 /***shift/multiply the unicode values by 37, of the key to generate the hash value for the key  */
 public static int hash2 ( String key ) { 
   int hashVal = 0;     
    for( int i = 0; i < key.length(); i++ )     
     hashVal = (37 * hashVal) + key.charAt(i);
   return hashVal % tableSize; 
   }
/***shift/multiply the unicode values by 17, of the key to generate the hash value for the key  */
   public static int hash3 ( String key ) {  
    int hashVal = 0;     
     for( int i = 0; i < key.length(); i++ )  
         hashVal = (17 * hashVal) + key.charAt(i);
   return hashVal % tableSize;
    }
    
  /***create a hash table object */  
    public static void main(String[] args){
        
       try{ //String file = "testdata.txt";
        String line = null;
        FileReader fr = new FileReader("testdata.txt");
        BufferedReader br = new BufferedReader(fr);
        int count=0;
        while((line = br.readLine())!= null)
       {
       count++;
       String[] name = line.split("\\|");
       System.out.println(count+" "+hash1(name[2]));
       
       
       
       
       }
        
       }
       catch(FileNotFoundException ex){System.out.println("file not found");}
       catch(IOException ex){System.out.println("Error reading file");}
        
        
        
        
        
        
    
    }
}
