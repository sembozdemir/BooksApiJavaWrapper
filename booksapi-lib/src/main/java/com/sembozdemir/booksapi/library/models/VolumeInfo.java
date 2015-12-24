
package com.sembozdemir.booksapi.library.models;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class VolumeInfo {

    private String title;
    private List<String> authors = new ArrayList<String>();
    private String publishedDate;
    private List<IndustryIdentifier> industryIdentifiers = new ArrayList<IndustryIdentifier>();
    private ReadingModes readingModes;
    private Integer pageCount;
    private String printType;
    private String maturityRating;
    private Boolean allowAnonLogging;
    private String contentVersion;
    private ImageLinks imageLinks;
    private String language;
    private String previewLink;
    private String infoLink;
    private String canonicalVolumeLink;

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The authors
     */
    public List<String> getAuthors() {
        return authors;
    }

    /**
     * 
     * @param authors
     *     The authors
     */
    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    /**
     * 
     * @return
     *     The publishedDate
     */
    public String getPublishedDate() {
        return publishedDate;
    }

    /**
     * 
     * @param publishedDate
     *     The publishedDate
     */
    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    /**
     * 
     * @return
     *     The industryIdentifiers
     */
    public List<IndustryIdentifier> getIndustryIdentifiers() {
        return industryIdentifiers;
    }

    /**
     * 
     * @param industryIdentifiers
     *     The industryIdentifiers
     */
    public void setIndustryIdentifiers(List<IndustryIdentifier> industryIdentifiers) {
        this.industryIdentifiers = industryIdentifiers;
    }

    /**
     * 
     * @return
     *     The readingModes
     */
    public ReadingModes getReadingModes() {
        return readingModes;
    }

    /**
     * 
     * @param readingModes
     *     The readingModes
     */
    public void setReadingModes(ReadingModes readingModes) {
        this.readingModes = readingModes;
    }

    /**
     * 
     * @return
     *     The pageCount
     */
    public Integer getPageCount() {
        return pageCount;
    }

    /**
     * 
     * @param pageCount
     *     The pageCount
     */
    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    /**
     * 
     * @return
     *     The printType
     */
    public String getPrintType() {
        return printType;
    }

    /**
     * 
     * @param printType
     *     The printType
     */
    public void setPrintType(String printType) {
        this.printType = printType;
    }

    /**
     * 
     * @return
     *     The maturityRating
     */
    public String getMaturityRating() {
        return maturityRating;
    }

    /**
     * 
     * @param maturityRating
     *     The maturityRating
     */
    public void setMaturityRating(String maturityRating) {
        this.maturityRating = maturityRating;
    }

    /**
     * 
     * @return
     *     The allowAnonLogging
     */
    public Boolean getAllowAnonLogging() {
        return allowAnonLogging;
    }

    /**
     * 
     * @param allowAnonLogging
     *     The allowAnonLogging
     */
    public void setAllowAnonLogging(Boolean allowAnonLogging) {
        this.allowAnonLogging = allowAnonLogging;
    }

    /**
     * 
     * @return
     *     The contentVersion
     */
    public String getContentVersion() {
        return contentVersion;
    }

    /**
     * 
     * @param contentVersion
     *     The contentVersion
     */
    public void setContentVersion(String contentVersion) {
        this.contentVersion = contentVersion;
    }

    /**
     * 
     * @return
     *     The imageLinks
     */
    public ImageLinks getImageLinks() {
        return imageLinks;
    }

    /**
     * 
     * @param imageLinks
     *     The imageLinks
     */
    public void setImageLinks(ImageLinks imageLinks) {
        this.imageLinks = imageLinks;
    }

    /**
     * 
     * @return
     *     The language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 
     * @param language
     *     The language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * 
     * @return
     *     The previewLink
     */
    public String getPreviewLink() {
        return previewLink;
    }

    /**
     * 
     * @param previewLink
     *     The previewLink
     */
    public void setPreviewLink(String previewLink) {
        this.previewLink = previewLink;
    }

    /**
     * 
     * @return
     *     The infoLink
     */
    public String getInfoLink() {
        return infoLink;
    }

    /**
     * 
     * @param infoLink
     *     The infoLink
     */
    public void setInfoLink(String infoLink) {
        this.infoLink = infoLink;
    }

    /**
     * 
     * @return
     *     The canonicalVolumeLink
     */
    public String getCanonicalVolumeLink() {
        return canonicalVolumeLink;
    }

    /**
     * 
     * @param canonicalVolumeLink
     *     The canonicalVolumeLink
     */
    public void setCanonicalVolumeLink(String canonicalVolumeLink) {
        this.canonicalVolumeLink = canonicalVolumeLink;
    }

}
