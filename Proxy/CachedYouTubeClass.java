/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proxy;

/**
 *
 * @author Juan CAmilo Mesa
 */
public class CachedYouTubeClass implements ThirdPartyYouTubeLib {

    private ThirdPartyYouTubeLib service;

    public CachedYouTubeClass(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    @Override
    public void listVideos() {
        if (service == null) {
            service = new ThirdPartyYouTubeClass();
        }
        service.listVideos();
    }

    @Override
    public void getVideoinfo(int id) {
        if (service == null) {
            service = new ThirdPartyYouTubeClass();
        }
        service.getVideoinfo(id);
    }

    @Override
    public void downloadVideo(int id) {
        if (service == null) {
            service = new ThirdPartyYouTubeClass();
        }
        service.downloadVideo(id);
    }

}
