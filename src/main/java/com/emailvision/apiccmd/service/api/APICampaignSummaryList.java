
package com.emailvision.apiccmd.service.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APICampaignSummaryList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APICampaignSummaryList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="campaignSummaryList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="campaignSummary" type="{http://api.service.apiccmd.emailvision.com/}APICampaignSummary" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbTotalItems" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nextPage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="previousPage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APICampaignSummaryList", propOrder = {
    "campaignSummaryList",
    "pageSize",
    "nbTotalItems",
    "page",
    "nextPage",
    "previousPage"
})
public class APICampaignSummaryList {

    protected APICampaignSummaryList.CampaignSummaryList campaignSummaryList;
    protected int pageSize;
    protected long nbTotalItems;
    protected int page;
    protected boolean nextPage;
    protected boolean previousPage;

    /**
     * Gets the value of the campaignSummaryList property.
     * 
     * @return
     *     possible object is
     *     {@link APICampaignSummaryList.CampaignSummaryList }
     *     
     */
    public APICampaignSummaryList.CampaignSummaryList getCampaignSummaryList() {
        return campaignSummaryList;
    }

    /**
     * Sets the value of the campaignSummaryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link APICampaignSummaryList.CampaignSummaryList }
     *     
     */
    public void setCampaignSummaryList(APICampaignSummaryList.CampaignSummaryList value) {
        this.campaignSummaryList = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="campaignSummary" type="{http://api.service.apiccmd.emailvision.com/}APICampaignSummary" maxOccurs="unbounded" minOccurs="0"/>
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
        "campaignSummary"
    })
    public static class CampaignSummaryList {

        protected List<APICampaignSummary> campaignSummary;

        /**
         * Gets the value of the campaignSummary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the campaignSummary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCampaignSummary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link APICampaignSummary }
         * 
         * 
         */
        public List<APICampaignSummary> getCampaignSummary() {
            if (campaignSummary == null) {
                campaignSummary = new ArrayList<APICampaignSummary>();
            }
            return this.campaignSummary;
        }

    }

}
