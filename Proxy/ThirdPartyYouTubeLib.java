/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Proxy;

/**
 *
 * @author Juan CAmilo Mesa
 */
public interface ThirdPartyYouTubeLib {
    public void listVideos();
    public void getVideoinfo(int id);
    public void downloadVideo(int id);
}
