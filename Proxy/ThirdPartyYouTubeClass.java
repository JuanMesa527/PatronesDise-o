/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proxy;

/**
 *
 * @author Juan CAmilo Mesa
 */
public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib{
    
    @Override
    public void listVideos() {
        System.out.println("listando videos...");
    }

    @Override
    public void getVideoinfo(int id) {
        System.out.println("obteniendo informacion del video de id: "+id+"...");
    }

    @Override
    public void downloadVideo(int id) {
        System.out.println("descargando video de id: "+id+"...");
    }
    
}
