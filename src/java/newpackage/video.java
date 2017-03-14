/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Chris
 */


@ManagedBean
@SessionScoped
public class video {
    private String videoPath;
    
    public String getVideoPath(){
        return videoPath;
    }
    
    public void setVideoPath(String videoPath){
        
        videoPath = "resources/reviewKUNDFinal.mp4";
        
        
        this.videoPath = videoPath;
    }
    
}
