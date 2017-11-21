package skypixel.domain;

import com.sun.istack.internal.Nullable;
import skypixel.util.ResourceType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by hsw11 on 2017/11/11.
 */
@Entity
public class HotMediaResource {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(length = 1024)
    private String resourceId;
    @Column(length = 1024)
    private String accountId;
    @Column(length = 1024)
    private String accountName;
    private ResourceType resourceType;
    @Column(length = 1024)
    private String resourceUrl;
    @Column(length = 1024)
    private String resourceTitle;
    @Nullable
    private String resourceTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public ResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public String getResourceTitle() {
        return resourceTitle;
    }

    public void setResourceTitle(String resourceTitle) {
        this.resourceTitle = resourceTitle;
    }

    public String getResourceTime() {
        return resourceTime;
    }

    public void setResourceTime(String resourceTime) {
        this.resourceTime = resourceTime;
    }
}
