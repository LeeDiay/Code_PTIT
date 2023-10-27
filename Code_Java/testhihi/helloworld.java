package testhihi;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class helloworld {
   public static void main(String[] args) throws FileNotFoundException {
        //Scanner sc = new Scanner(new File("DANHSACH.in"));
        Scanner sc = new Scanner(System.in);
        String res, res2;
        HashMap<String, Integer> mp = new HashMap<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine().trim().toLowerCase();
            String[] a = s.split("\\s+");
            //res = "";
            res2 = "";
            for (int i = 0; i < a.length; i++)
                res2 = res2 + a[i].toUpperCase().charAt(0) + a[i].substring(1) + " ";
            //res += a[a.length - 1];
            //for (int i = 0; i < a.length - 1; i++)
              //  res +=  a[i].substring(0, 1);
           // System.out.println(res2);
            if (mp.containsKey(res2) == false)
                mp.put(res2, 1);
            else {
                mp.put(res2, mp.get(res2) + 1);
            }
            res = "";
            String[] a2 = res2.split("\\s+");
                res += a2[a2.length - 1];
                for (int i = 0; i < a.length - 1; i++)
                res +=  a2[i].substring(0, 1);
            if (mp.get(res2) == 1) {
                
                System.out.println(res + "@ptit.edu.vn");
            }
                
            else System.out.println(res + mp.get(res) + "@ptit.edu.vn");
        }   
        
    }
}
