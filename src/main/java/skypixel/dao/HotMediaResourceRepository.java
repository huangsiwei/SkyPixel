package skypixel.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import skypixel.domain.HotMediaResource;
import skypixel.util.ResourceType;

import java.util.List;

/**
 * Created by hsw11 on 2017/11/13.
 */
public interface HotMediaResourceRepository extends JpaRepository<HotMediaResource,Long> {
    List<HotMediaResource> findAll();

    List<HotMediaResource> findAllByResourceType(ResourceType resourceType);
}
