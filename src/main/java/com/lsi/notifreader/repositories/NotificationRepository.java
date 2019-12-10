package com.lsi.notifreader.repositories;

import com.lsi.notifreader.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel = "notification", path = "notification")
@Repository
public interface NotificationRepository extends JpaRepository<Notification,Long > {
}
