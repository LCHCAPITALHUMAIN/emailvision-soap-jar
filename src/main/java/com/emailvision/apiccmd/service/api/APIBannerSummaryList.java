
package com.emailvision.apiccmd.service.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APIBannerSummaryList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APIBannerSummaryList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bannerSummaryList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="bannerSummary" type="{http://api.service.apiccmd.emailvision.com/}APIBannerSummary" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbTotalItems" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="previousPage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nextPage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APIBannerSummaryList", propOrder = {
    "bannerSummaryList",
    "pageSize",
    "nbTotalItems",
    "page",
    "previousPage",
    "nextPage"
})
public class APIBannerSummaryList {

    protected APIBannerSummaryList.BannerSummaryList bannerSummaryList;
    protected int pageSize;
    protected long nbTotalItems;
    protected int page;
    protected boolean previousPage;
    protected boolean nextPage;

    /**
     * Gets the value of the bannerSummaryList property.
     * 
     * @return
     *     possible object is
     *     {@link APIBannerSummaryList.BannerSummaryList }
     *     
     */
    public APIBannerSummaryList.BannerSummaryList getBannerSummaryList() {
        return bannerSummaryList;
    }

    /**
     * Sets the value of the bannerSummaryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIBannerSummaryList.BannerSummaryList }
     *     
     */
    public void setBannerSummaryList(APIBannerSummaryList.BannerSummaryList value) {
        this.bannerSummaryList = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the nbTotalItems property.
     * 
     */
    public long getNbTotalItems() {
        return nbTotalItems;
    }

    /**
     * Sets the value of the nbTotalItems property.
     * 
     */
    public void setNbTotalItems(long value) {
        this.nbTotalItems = value;
    }

    /**
     * Gets the value of the page property.
     * 
     */
    public int getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     */
    public void setPage(int value) {
        this.page = value;
    }

    /**
     * Gets the value of the previousPage property.
     * 
     */
    public boolean isPreviousPage() {
        return previousPage;
    }

    /**
     * Sets the value of the previousPage property.
     * 
     */
    public void setPreviousPage(boolean value) {
        this.previousPage = value;
    }

    /**
     * Gets the value of the nextPage property.
     * 
     */
    public boolean isNextPage() {
        return nextPage;
    }

    /**
     * Sets the value of the nextPage property.
     * 
     */
    public void setNextPage(boolean value) {
        this.nextPage = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="bannerSummary" type="{http://api.service.apiccmd.emailvision.com/}APIBannerSummary" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bannerSummary"
    })
    public static class BannerSummaryList {

        protected List<APIBannerSummary> bannerSummary;

        /**
         * Gets the value of the bannerSummary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bannerSummary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBannerSummary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link APIBannerSummary }
         * 
         * 
         */
        public List<APIBannerSummary> getBannerSummary() {
            if (bannerSummary == null) {
                bannerSummary = new ArrayList<APIBannerSummary>();
            }
            return this.bannerSummary;
        }

    }

}
