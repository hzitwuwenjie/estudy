package com.bj1804.estudy.entity;

import java.io.Serializable;

/**
 * course_good_collection
 * @author 
 */
public class CourseGoodCollection implements Serializable {
    /**
     * 收藏id
     */
    private Integer collectionId;

    /**
     * 企业id
     */
    private String businessid;

    /**
     * 商品的id
     */
    private String shopGoodId;

    private static final long serialVersionUID = 1L;

    public Integer getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    public String getBusinessid() {
        return businessid;
    }

    public void setBusinessid(String businessid) {
        this.businessid = businessid;
    }

    public String getShopGoodId() {
        return shopGoodId;
    }

    public void setShopGoodId(String shopGoodId) {
        this.shopGoodId = shopGoodId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CourseGoodCollection other = (CourseGoodCollection) that;
        return (this.getCollectionId() == null ? other.getCollectionId() == null : this.getCollectionId().equals(other.getCollectionId()))
            && (this.getBusinessid() == null ? other.getBusinessid() == null : this.getBusinessid().equals(other.getBusinessid()))
            && (this.getShopGoodId() == null ? other.getShopGoodId() == null : this.getShopGoodId().equals(other.getShopGoodId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCollectionId() == null) ? 0 : getCollectionId().hashCode());
        result = prime * result + ((getBusinessid() == null) ? 0 : getBusinessid().hashCode());
        result = prime * result + ((getShopGoodId() == null) ? 0 : getShopGoodId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", collectionId=").append(collectionId);
        sb.append(", businessid=").append(businessid);
        sb.append(", shopGoodId=").append(shopGoodId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}