
package com.sembozdemir.booksapi.library.models;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ImageLinks {

    private String smallThumbnail;
    private String thumbnail;

    /**
     * 
     * @return
     *     The smallThumbnail
     */
    public String getSmallThumbnail() {
        return smallThumbnail;
    }

    /**
     * 
     * @param smallThumbnail
     *     The smallThumbnail
     */
    public void setSmallThumbnail(String smallThumbnail) {
        this.smallThumbnail = smallThumbnail;
    }

    /**
     * 
     * @return
     *     The thumbnail
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * 
     * @param thumbnail
     *     The thumbnail
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

}
