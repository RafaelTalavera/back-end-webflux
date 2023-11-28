package com.axioma.backendwebflux.repository;

import com.axioma.backendwebflux.document.PlayList;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PlayListRepository extends ReactiveMongoRepository<PlayList, String> {
}
