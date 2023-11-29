package com.axioma.backendwebflux.controlllers;

import com.axioma.backendwebflux.document.PlayList;
import com.axioma.backendwebflux.service.PlayListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class PlayListController {

    @Autowired
    PlayListService playListService;

    @GetMapping(value ="/playlist")
    public Flux<PlayList> getPlayList(){
        return playListService.findAll();
    }

    @GetMapping(value = "/playlist/{id}")
    public Mono<PlayList> getPlayListId(@PathVariable String id){
        return playListService.findById(id);
    }

    @PostMapping(value="/playlist")
    public Mono<PlayList> save(@RequestBody PlayList playList){
        return playListService.save(playList);
    }

    @GetMapping(value="/playlist/webflux", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Tuple2<Long, PlayList>> getPlaylistByWebflux(){

        System.out.println("---Start get Playlists by WEBFLUX--- " + LocalDateTime.now());
        Flux<Long> interval = Flux.interval(Duration.ofSeconds(10));
        Flux<PlayList> playlistFlux = playListService.findAll();

        return Flux.zip(interval, playlistFlux);

    }

    @GetMapping(value="/playlist/mvc")
    public List<String> getPlaylistByMvc() throws InterruptedException {

        System.out.println("---Start get Playlists by MVC--- " + LocalDateTime.now());


        List<String> playlistList = new ArrayList<>();
        playlistList.add("Java 8");
        playlistList.add("Spring Security");
        playlistList.add("Github");
        playlistList.add("Deploy de uma aplicação java no IBM Cloud");
        playlistList.add("Bean no Spring Framework");
        TimeUnit.SECONDS.sleep(15);

        return playlistList;

    }
}
