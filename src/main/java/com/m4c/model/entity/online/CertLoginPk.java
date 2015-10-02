package com.m4c.model.entity.online;

import java.io.Serializable;

/**
 * User: Elvira Aranda
 * Date: 1/04/2008
 * Time: 10:01:46 AM
 */
public class CertLoginPk implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long campaignId;
    private String userId;

    public Long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CertLoginPk that = (CertLoginPk) o;

        if (campaignId != null ? !campaignId.equals(that.campaignId) : that.campaignId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = (campaignId != null ? campaignId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        return result;
    }
}
