package cosc311.kmp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class KMP {
		private static boolean repeat = false;
	    void KMPSearch(String pat, String txt)
	    {
	        int M = pat.length();
	        int N = txt.length();
	        int[] LPS = new int[M];

	        computeLPSArray(pat, M, LPS);

	        int i = 0; // index for txt[]
	        int j = 0; // index for pat[]
	        while (i < N) {
	            if (pat.charAt(j) == txt.charAt(i)) {
	                j++;
	                i++;
	            }
	            if (j == M) {
	                System.out.println("Found the pattern "
	                        + "at index " + (i - j));
	                j = LPS[j - 1];
	            }

	            // mismatch after j matches
	            else if (i < N && pat.charAt(j) != txt.charAt(i)) {
	                // Do not match LPS[0..LPS[j-1]] characters,
	                // they will match anyway
	                if (j != 0)
	                    j = LPS[j - 1];
	                else
	                    i = i + 1;
	            }
	        }
	    }

	    void computeLPSArray(String pat, int M, int LPS[])
	    {
	        // length of the previous longest prefix suffix
	        int len = 0;
	        int i = 1;
	        LPS[0] = 0; // LPS[0] is always 0

	        // the loop calculates LPS[i] for i = 1 to M-1
	        while (i < M) {
	            if (pat.charAt(i) == pat.charAt(len)) {
	                len++;
	                LPS[i] = len;
	                i++;
	            }
	            else // (pat[i] != pat[len])
	            {
	                if (len != 0) {
	                    len = LPS[len - 1];

	                }
	                else // if (len == 0)
	                {
	                    LPS[i] = len;
	                    i++;
	                }
	            }
	        }
	    }
	    
	    
	    
	    // Driver program to test above function
	    public static void main(String args[]) throws IOException {
	        Scanner input = new Scanner(System.in);
	        
	        String fileName;
	        String pat;
	        String option;
	        do {
	        System.out.print("Enter 'file' if you want to read from file and enter 'user' if you want to read from console: ");
	        option = input.nextLine();
	        if(option.equalsIgnoreCase("file")) {
	        	
	        	try {
		        	System.out.print("Please enter the file name: ");
		        	fileName = input.nextLine();
		        	
		        	System.out.print("What pattern are you looking for: ");
		        	pat = input.nextLine();
		        	
		            File myObj = new File(fileName);
		            Scanner myReader = new Scanner(myObj);
		            
		            String txt = "";
		            while (myReader.hasNextLine()) {
		              txt += myReader.nextLine();
		            }
		            
		            
		            System.out.println("\nText and pattern 1: " + txt + " : " + pat);
			        new KMP().KMPSearch(pat, txt);
		            
		            myReader.close();
		         } catch (FileNotFoundException e) {
		            System.out.println("File not found. Please enter the correct file");
		            e.printStackTrace();
		         }  
		        
		        
	        } else if(option.equalsIgnoreCase("user")) {
	        	
	        	//user input
	        	 BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
		            Scanner userPattern = new Scanner(System.in);

		            System.out.println("Please enter one line of text that you would like to search: ");
	                String textUserInput = userInput.readLine();
	                
		            System.out.println("Please enter the pattern you want to search for: ");
		            String userPatternInput = userPattern.nextLine();

		            new KMP().KMPSearch(userPatternInput, textUserInput);
	            
	        }
	        
	        System.out.print("Would you like to continue: ");
	        if(input.nextLine().equalsIgnoreCase("yes"))
	        	repeat = true;
	        else
	        	repeat = false;
	        
	        }while(repeat == true);
	    	
//	    	String txt = "XXYXXXY";
//	        String pat = "XXX";
//	        String txt2 = "ACDOQVWRQVWSTUV";
//	        String pat2 = "QVWS";
//
//	        System.out.println("Text and pattern 1: " + txt + " : " + pat);
//	        new KMP().KMPSearch(pat, txt);
//
//	        System.out.println("Text and pattern 2: " + txt2 + " : " + pat2);
//	        new KMP().KMPSearch(pat2,txt2);
	    }
	}