package com.title;

public class Main {
	
	public String convertToTitle(int n) {
        StringBuffer title = new StringBuffer();
        while(n > 0) {
            int currCharOffset = n % 26;
            char currChar = ' ';
            if(currCharOffset == 0) {
                currChar = 'Z';
            }
            else {
                currChar = (char)(currCharOffset + 64);
            }
            
            title.insert(0, currChar);
            n /= 26;
            
            if(currCharOffset == 0) {
            	n -= 1;
            }
            
        }
        return title.toString();
    }

	public static void main(String[] args) {
		Main obj = new Main();
		System.out.println(obj.convertToTitle(26));
	}

}
