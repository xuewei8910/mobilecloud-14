package org.magnum.mobilecloud.video.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by wei on 8/25/14.
 */

@Repository
public interface VideoRepository extends CrudRepository<Video,Long>{
    public Collection<Video> findByName(String title);
    public Collection<Video> findByDurationLessThan(long maxduration);
}
