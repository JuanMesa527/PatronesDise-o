/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Proxy;

/**
 *
 * @author Juan CAmilo Mesa
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Probando patron proxy");
        ThirdPartyYouTubeLib service=new ThirdPartyYouTubeClass();
        CachedYouTubeClass proxy = new CachedYouTubeClass(service);
        proxy.listVideos();
        proxy.getVideoinfo(0);
        proxy.downloadVideo(0);
    }
}
