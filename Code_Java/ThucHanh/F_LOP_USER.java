/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
class User {

    private String id, passwd;

    public User(String id, String passwd) {
        this.id = id;
        this.passwd = passwd;
    }

    public String getId() {
        return id;
    }

    public String getPass() {
        return passwd;
    }
}

public class F_LOP_USER {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        User[] a = new User[n];
        HashMap<String, String> mp1 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] tmp = s.trim().split("\\s+");
            a[i] = new User(tmp[0], tmp[1]);
            mp1.put(a[i].getId(), a[i].getPass());
        }
        HashMap<String, Integer> mp2 = new HashMap<>();
        int m = Integer.parseInt(sc.nextLine());
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        for (int i = 0; i < m; i++) {
            String s = sc.nextLine();
            String[] tmp = s.trim().split("\\s+");
            lhs.add(tmp[0]);
            if (mp1.containsKey(tmp[0])) {
                if (mp1.get(tmp[0]).equals(tmp[1])) {
                    if (!mp2.containsKey(tmp[0])) {
                        mp2.put(tmp[0], 1);
                    } else {
                        mp2.put(tmp[0], mp2.get(tmp[0]) + 1);
                    }
                }
            } else {
                mp2.put(tmp[0], 0);
            }
        }
        for (User x : a) {
            if (mp2.get(x.getId()) == null) {
                System.out.print(0 + " ");
            } else {
                System.out.print(mp2.get(x.getId()) + " ");
            }
        }
    }
}
