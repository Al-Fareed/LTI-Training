/*
 * Replacing the string


Write a program to illustrate the use of the method replace() defined in the string API.

Two companies enter into a Marketing Agreement and they prepare an Agreement Draft. After that one of the company changes its name. The name changes need to be made in the Agreement Draft as well. Write a program to perform the name changes in the agreement draft.

Input and Output Format:

Refer sample input and output for formatting specifications.
[All text in bold corresponds to input and the rest corresponds to output.]



Sample Input and Output :

Enter the content of the document
Pure is a private organisation. Pure is a product based company. NewApp is a Pure product
Enter the old name of the company
Pure
Enter the new name of the company
Pixel
The content of the modified document is
Pixel is a private organisation. Pixel is a product based company. NewApp is a Pixel product
 */
import java.util.*;
public class ReplaceString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the content of the document");
        String str=sc.nextLine();
        System.out.println("Enter the old name of the company");
        String oldStr=sc.nextLine();
        System.out.println("Enter the new name of the company");
        String newStr=sc.nextLine();
        str=str.replace(oldStr, newStr);
        System.out.println("The content of the modified document is");
        System.out.println(str);
        sc.close();
    }
}
