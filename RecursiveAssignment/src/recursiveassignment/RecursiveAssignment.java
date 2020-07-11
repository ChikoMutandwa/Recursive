package recursiveassignment;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author chiko
 */
public class RecursiveAssignment {
    
    final static String List[] = {"Chiko", "Grace", "Nay", "Mika", "Mulenga", "Mwachi"};
    static List<String> arrList = Arrays.asList(List);
    
    public int search(String target, int index){
        if (index > arrList.size() - 1) {
            return -1;
        }
        if (arrList.get(index).equals(target)) {
            return index;
        }else{
            return search(target, index+1);
        }
    }
    
    
    public static void main(String[] args) {
        Scanner cm = new Scanner(System.in);        RecursiveAssignment ra = new RecursiveAssignment();
        String name;    int c = 0;
        
        System.out.println("Please enter one of the following names you would like to search for");
        System.out.println("[0] Chiko");
        System.out.println("[1] Grace");
        System.out.println("[2] Nay");
        System.out.println("[3] Mika");
        System.out.println("[4] Mulenga");
        System.out.println("[5] Mwachi");
        System.out.print("-> ");
        name = cm.next();
        
        int index = ra.search(name,0);
        
        String result;
        if (index == -1) {
            result = "not found";
        } else {
            result = "found at index " + index;
        }
        System.out.println(name + " is " + result);
    }
    
}
