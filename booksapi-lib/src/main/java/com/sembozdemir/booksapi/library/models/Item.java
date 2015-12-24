
package com.sembozdemir.booksapi.library.models;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Item {

    private String kind;
    private String id;
    private String etag;
    private String selfLink;
    private VolumeInfo volumeInfo;
    private SaleInfo saleInfo;
    private AccessInfo accessInfo;
    private SearchInfo searchInfo;

    /**
     * 
     * @return
     *     The kind
     */
    public String getKind() {
        return kind;
    }

    /**
     * 
     * @param kind
     *     The kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The etag
     */
    public String getEtag() {
        return etag;
    }

    /**
     * 
     * @param etag
     *     The etag
     */
    public void setEtag(String etag) {
        this.etag = etag;
    }

    /**
     * 
     * @return
     *     The selfLink
     */
    public String getSelfLink() {
        return selfLink;
    }

    /**
     * 
     * @param selfLink
     *     The selfLink
     */
    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    /**
     * 
     * @return
     *     The volumeInfo
     */
    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }

    /**
     * 
     * @param volumeInfo
     *     The volumeInfo
     */
    public void setVolumeInfo(VolumeInfo volumeInfo) {
        this.volumeInfo = volumeInfo;
    }

    /**
     * 
     * @return
     *     The saleInfo
     */
    public SaleInfo getSaleInfo() {
        return saleInfo;
    }

    /**
     * 
     * @param saleInfo
     *     The saleInfo
     */
    public void setSaleInfo(SaleInfo saleInfo) {
        this.saleInfo = saleInfo;
    }

    /**
     * 
     * @return
     *     The accessInfo
     */
    public AccessInfo getAccessInfo() {
        return accessInfo;
    }

    /**
     * 
     * @param accessInfo
     *     The accessInfo
     */
    public void setAccessInfo(AccessInfo accessInfo) {
        this.accessInfo = accessInfo;
    }

    /**
     * 
     * @return
     *     The searchInfo
     */
    public SearchInfo getSearchInfo() {
        return searchInfo;
    }

    /**
     * 
     * @param searchInfo
     *     The searchInfo
     */
    public void setSearchInfo(SearchInfo searchInfo) {
        this.searchInfo = searchInfo;
    }

}
