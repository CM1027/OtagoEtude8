import java.util.*;
import java.io.*;

public class woof{
  public static void main(String[] args){
    /*woof = p,q,r, or s 
     * N + woof
     * leader + woof + woof
     * Leader = c,a,k or e
     * read a line, print woof or not woof
     */
    Scanner scan = new Scanner(System.in);
    ArrayList<String> woofs = new ArrayList<String>();
    
      while(scan.hasNextLine()){
      String word = scan.nextLine();
      int woof = 0;
      
      for(int i = word.length()-1; i >= 0; i--){
        if(word.charAt(i) == 'p' || word.charAt(i) == 'q' || word.charAt(i) == 'r' || word.charAt(i) == 's'){
          woof++;
        }else if(word.charAt(i) == 'N'){
          if(woof >= 1){
            woof = woof;
          } else{
            woofs.add("not woof");
            woof = 0;
            break;
          }
        }else if(word.charAt(i) == 'C' || word.charAt(i) == 'A' || word.charAt(i) == 'K' || word.charAt(i) == 'E'){
          if(woof >= 2){
            woof = woof -1;
          } else{
            woofs.add("not woof");
            woof = 0;
            break;
          }
        }else{
          woofs.add("not woof");
          woof = 0;
          break;
        }
      }
      if(woof == 1){
        woofs.add("woof");
      }else if(woof != 0){
        woofs.add("not woof");
      }
    }
      for(String woof:woofs) {
            System.out.println(woof);
        }
  }
                                                                                                                                                                                                                                                     }