
package com.emailvision.apiccmd.service.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APIMessageSummaryList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APIMessageSummaryList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageSummaryList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="messageSummary" type="{http://api.service.apiccmd.emailvision.com/}APIMessageSummary" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "APIMessageSummaryList", propOrder = {
    "messageSummaryList",
    "pageSize",
    "nbTotalItems",
    "page",
    "nextPage",
    "previousPage"
})
public class APIMessageSummaryList {

    protected APIMessageSummaryList.MessageSummaryList messageSummaryList;
    protected int pageSize;
    protected long nbTotalItems;
    protected int page;
    protected boolean nextPage;
    protected boolean previousPage;

    /**
     * Gets the value of the messageSummaryList property.
     * 
     * @return
     *     possible object is
     *     {@link APIMessageSummaryList.MessageSummaryList }
     *     
     */
    public APIMessageSummaryList.MessageSummaryList getMessageSummaryList() {
        return messageSummaryList;
    }

    /**
     * Sets the value of the messageSummaryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIMessageSummaryList.MessageSummaryList }
     *     
     */
    public void setMessageSummaryList(APIMessageSummaryList.MessageSummaryList value) {
        this.messageSummaryList = value;
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
     *         &lt;element name="messageSummary" type="{http://api.service.apiccmd.emailvision.com/}APIMessageSummary" maxOccurs="unbounded" minOccurs="0"/>
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
        "messageSummary"
    })
    public static class MessageSummaryList {

        protected List<APIMessageSummary> messageSummary;

        /**
         * Gets the value of the messageSummary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the messageSummary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMessageSummary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link APIMessageSummary }
         * 
         * 
         */
        public List<APIMessageSummary> getMessageSummary() {
            if (messageSummary == null) {
                messageSummary = new ArrayList<APIMessageSummary>();
            }
            return this.messageSummary;
        }

    }

}
