/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lucas Wolfs <lwolfs@my.wctc.edu>
 */
public class ReadFromUser extends BookReader {

    List<String> userInput = new ArrayList<String>();
    
    @Override
    void initialize() {
        
        System.out.println("Enter multiple lines of code. Enter a blank line to continue.");
        Scanner input = new Scanner(System.in);
        String line = "";
        do
        {
            line = input.nextLine();
            if(!line.isEmpty())
            {
                userInput.add(line);
            }
        }while(!line.isEmpty());
    }

    @Override
    void startReading() {
        for(String line: userInput)
        {
            System.out.println(line);
        }
    }

    @Override
    void stopReading() {
        
    }
    
    
}
