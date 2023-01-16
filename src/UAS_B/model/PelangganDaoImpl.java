/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_B.model;
import UAS_B.model.Pelanggan;
import UAS_B.model.PelangganDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class PelangganDaoImpl implements PelangganDao{
    List<Pelanggan> data = new ArrayList<>();
    
    public PelangganDaoImpl(){
       
    }
    public void save(Pelanggan pelanggan){
        data.add(pelanggan);
    }
    public void update(int index,Pelanggan pelanggan){
        data.set(index, pelanggan);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Pelanggan getPelanggan(int index){
        return data.get(index);
    }
    public List<Pelanggan>getAll(){
        return data;
    }

    
}
