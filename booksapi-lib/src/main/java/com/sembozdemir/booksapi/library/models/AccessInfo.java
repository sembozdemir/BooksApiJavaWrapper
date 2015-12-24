
package com.sembozdemir.booksapi.library.models;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class AccessInfo {

    private String country;
    private String viewability;
    private Boolean embeddable;
    private Boolean publicDomain;
    private String textToSpeechPermission;
    private Epub epub;
    private Pdf pdf;
    private String webReaderLink;
    private String accessViewStatus;
    private Boolean quoteSharingAllowed;

    /**
     * 
     * @return
     *     The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The viewability
     */
    public String getViewability() {
        return viewability;
    }

    /**
     * 
     * @param viewability
     *     The viewability
     */
    public void setViewability(String viewability) {
        this.viewability = viewability;
    }

    /**
     * 
     * @return
     *     The embeddable
     */
    public Boolean getEmbeddable() {
        return embeddable;
    }

    /**
     * 
     * @param embeddable
     *     The embeddable
     */
    public void setEmbeddable(Boolean embeddable) {
        this.embeddable = embeddable;
    }

    /**
     * 
     * @return
     *     The publicDomain
     */
    public Boolean getPublicDomain() {
        return publicDomain;
    }

    /**
     * 
     * @param publicDomain
     *     The publicDomain
     */
    public void setPublicDomain(Boolean publicDomain) {
        this.publicDomain = publicDomain;
    }

    /**
     * 
     * @return
     *     The textToSpeechPermission
     */
    public String getTextToSpeechPermission() {
        return textToSpeechPermission;
    }

    /**
     * 
     * @param textToSpeechPermission
     *     The textToSpeechPermission
     */
    public void setTextToSpeechPermission(String textToSpeechPermission) {
        this.textToSpeechPermission = textToSpeechPermission;
    }

    /**
     * 
     * @return
     *     The epub
     */
    public Epub getEpub() {
        return epub;
    }

    /**
     * 
     * @param epub
     *     The epub
     */
    public void setEpub(Epub epub) {
        this.epub = epub;
    }

    /**
     * 
     * @return
     *     The pdf
     */
    public Pdf getPdf() {
        return pdf;
    }

    /**
     * 
     * @param pdf
     *     The pdf
     */
    public void setPdf(Pdf pdf) {
        this.pdf = pdf;
    }

    /**
     * 
     * @return
     *     The webReaderLink
     */
    public String getWebReaderLink() {
        return webReaderLink;
    }

    /**
     * 
     * @param webReaderLink
     *     The webReaderLink
     */
    public void setWebReaderLink(String webReaderLink) {
        this.webReaderLink = webReaderLink;
    }

    /**
     * 
     * @return
     *     The accessViewStatus
     */
    public String getAccessViewStatus() {
        return accessViewStatus;
    }

    /**
     * 
     * @param accessViewStatus
     *     The accessViewStatus
     */
    public void setAccessViewStatus(String accessViewStatus) {
        this.accessViewStatus = accessViewStatus;
    }

    /**
     * 
     * @return
     *     The quoteSharingAllowed
     */
    public Boolean getQuoteSharingAllowed() {
        return quoteSharingAllowed;
    }

    /**
     * 
     * @param quoteSharingAllowed
     *     The quoteSharingAllowed
     */
    public void setQuoteSharingAllowed(Boolean quoteSharingAllowed) {
        this.quoteSharingAllowed = quoteSharingAllowed;
    }

}
