
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gio
 */
public class Herd implements Movable {
    
    private List<Movable> herd;
    
    public Herd() {
        this.herd = new ArrayList<>();
    }
    
    @Override
    public void move(int dx, int dy) {
        for (int i = 0; i < herd.size(); i++) {
            herd.get(i).move(dx, dy);
        }
    }
    
    public void addToHerd(Movable movable) {       
        herd.add(movable);
    }
    
    public String toString() {
        String string = "";
        for (int i = 0; i < herd.size(); i++) {
            string += herd.get(i).toString() + "\n";
        }
        return string;
    }
    
}
