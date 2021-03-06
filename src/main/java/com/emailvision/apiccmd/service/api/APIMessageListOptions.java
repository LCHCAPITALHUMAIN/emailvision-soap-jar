
package com.emailvision.apiccmd.service.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APIMessageListOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APIMessageListOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="search" type="{http://api.service.apiccmd.emailvision.com/}APIMessageSearchCriteria" minOccurs="0"/>
 *         &lt;element name="sortOptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sortOption" type="{http://api.service.apiccmd.emailvision.com/}APIMessageSortOption" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APIMessageListOptions", propOrder = {
    "page",
    "pageSize",
    "search",
    "sortOptions"
})
public class APIMessageListOptions {

    protected int page;
    protected Integer pageSize;
    protected APIMessageSearchCriteria search;
    protected APIMessageListOptions.SortOptions sortOptions;

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
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the search property.
     * 
     * @return
     *     possible object is
     *     {@link APIMessageSearchCriteria }
     *     
     */
    public APIMessageSearchCriteria getSearch() {
        return search;
    }

    /**
     * Sets the value of the search property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIMessageSearchCriteria }
     *     
     */
    public void setSearch(APIMessageSearchCriteria value) {
        this.search = value;
    }

    /**
     * Gets the value of the sortOptions property.
     * 
     * @return
     *     possible object is
     *     {@link APIMessageListOptions.SortOptions }
     *     
     */
    public APIMessageListOptions.SortOptions getSortOptions() {
        return sortOptions;
    }

    /**
     * Sets the value of the sortOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIMessageListOptions.SortOptions }
     *     
     */
    public void setSortOptions(APIMessageListOptions.SortOptions value) {
        this.sortOptions = value;
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
     *         &lt;element name="sortOption" type="{http://api.service.apiccmd.emailvision.com/}APIMessageSortOption" maxOccurs="unbounded" minOccurs="0"/>
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
        "sortOption"
    })
    public static class SortOptions {

        protected List<APIMessageSortOption> sortOption;

        /**
         * Gets the value of the sortOption property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sortOption property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSortOption().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link APIMessageSortOption }
         * 
         * 
         */
        public List<APIMessageSortOption> getSortOption() {
            if (sortOption == null) {
                sortOption = new ArrayList<APIMessageSortOption>();
            }
            return this.sortOption;
        }

    }

}
