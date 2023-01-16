/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_B.model;
import UAS_B.model.Warnet;
import UAS_B.model.WarnetDao;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ASUS
 */
public class WarnetDaoImpl implements WarnetDao {
    List<Warnet> data = new ArrayList<>();

    public WarnetDaoImpl() {
       
    }
     
    public void save(Warnet warnet){
        data.add(warnet);
    }
    public void update(int index,Warnet warnet){
        data.set(index, warnet);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Warnet getWarnet(int index){
        return data.get(index);
    }
    public List<Warnet>getAllWarnet(){
        return data;
    }
}
