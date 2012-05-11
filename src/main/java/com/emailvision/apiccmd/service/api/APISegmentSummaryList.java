
package com.emailvision.apiccmd.service.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APISegmentSummaryList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APISegmentSummaryList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="segmentSummaryList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="segmentSummary" type="{http://api.service.apiccmd.emailvision.com/}APISegmentSummary" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "APISegmentSummaryList", propOrder = {
    "segmentSummaryList",
    "pageSize",
    "nbTotalItems",
    "page",
    "nextPage",
    "previousPage"
})
public class APISegmentSummaryList {

    protected APISegmentSummaryList.SegmentSummaryList segmentSummaryList;
    protected int pageSize;
    protected long nbTotalItems;
    protected int page;
    protected boolean nextPage;
    protected boolean previousPage;

    /**
     * Gets the value of the segmentSummaryList property.
     * 
     * @return
     *     possible object is
     *     {@link APISegmentSummaryList.SegmentSummaryList }
     *     
     */
    public APISegmentSummaryList.SegmentSummaryList getSegmentSummaryList() {
        return segmentSummaryList;
    }

    /**
     * Sets the value of the segmentSummaryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link APISegmentSummaryList.SegmentSummaryList }
     *     
     */
    public void setSegmentSummaryList(APISegmentSummaryList.SegmentSummaryList value) {
        this.segmentSummaryList = value;
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
     *         &lt;element name="segmentSummary" type="{http://api.service.apiccmd.emailvision.com/}APISegmentSummary" maxOccurs="unbounded" minOccurs="0"/>
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
        "segmentSummary"
    })
    public static class SegmentSummaryList {

        protected List<APISegmentSummary> segmentSummary;

        /**
         * Gets the value of the segmentSummary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segmentSummary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegmentSummary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link APISegmentSummary }
         * 
         * 
         */
        public List<APISegmentSummary> getSegmentSummary() {
            if (segmentSummary == null) {
                segmentSummary = new ArrayList<APISegmentSummary>();
            }
            return this.segmentSummary;
        }

    }

}
