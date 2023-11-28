package com.axioma.backendwebflux.service;

import com.axioma.backendwebflux.document.PlayList;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PlayListService  {

    /**
    Este método devuelve un flujo reactiva de instancias de la clase PlayList. En el contexto de
    programación reactiva en Spring, un Flux representa una secuencia de elementos que puede emitir cero,
    uno o varios elementos a lo largo del tiempo.
     */
    Flux<PlayList> findAll();

    /**
     Este método devuelve un mono reactiva de una instancia de la clase PlayList. Un Mono es una
     secuencia que puede emitir cero o un elemento. En este caso, se espera que emita la instancia
     de PlayList correspondiente al identificador proporcionado.
     */
    Mono<PlayList> findById(String id);

    Mono<PlayList> save (PlayList playList);
}
