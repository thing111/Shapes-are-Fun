/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithshapes;

/**
 *
 * @author Logan
 */
public class VolumeOfPyramid {
    
    double base_Edge, height, volume;
    
    public VolumeOfPyramid(double baseEdge, double h){
        base_Edge = baseEdge;
        height = h;
        volume = (baseEdge * baseEdge) * (h / 3);
    }
    
    public double getVolume(){
        return volume;
    }
    
    public double get_baseEdge(){
        return base_Edge;
    }
    
    public double getheight(){
        return height;
    }
}
