/*
* File: Nyiri_István_Employee.java
* Author: Nyiri István
* Copyright: 2022, Nyiri István
* Group: Szoft I/N
* Date: 2022-03-31
* Github: https://github.com/nyiriistvan
* Licenc: GNU GPL
*/
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Készítő:Nyiri István,2022.03.31");
    }


 class Employee {
	public static void main(String args[]) throws IOException {
 
		FileReader olvaso = new FileReader("Employee.txt");
 
		StringBuilder strb = new StringBuilder();
 
		char ch;
		while(olvaso.ready()) {
			ch = (char)olvaso.read();
			strb.append(ch);
		}
		olvaso.close();
 
		System.out.println(strb);
	}
}
}