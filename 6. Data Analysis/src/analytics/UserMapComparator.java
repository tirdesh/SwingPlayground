/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analytics;

import java.util.Comparator;
import java.util.HashMap;
import model.User;

/**
 *
 * @author tirdesh
 */

public class UserMapComparator implements Comparator<User> {

    HashMap<Integer,Integer> userPostMap;
    
    public UserMapComparator(HashMap<Integer,Integer> userPostmap){
        this.userPostMap = userPostmap;
    }
    
    @Override
    public int compare(User o1, User o2) {
        return Integer.compare(
                ((userPostMap.get(o1.getId()) == null ? 0 : userPostMap.get(o1.getId()))),
                ((userPostMap.get(o2.getId()) == null ? 0 : userPostMap.get(o2.getId()))));
    }
    
}
