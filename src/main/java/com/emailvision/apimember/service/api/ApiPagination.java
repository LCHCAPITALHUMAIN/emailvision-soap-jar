
package com.emailvision.apimember.service.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiPagination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiPagination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="list" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nbItemsPerPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbPages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbTotalItems" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "apiPagination", propOrder = {
    "currentPage",
    "list",
    "nbItemsPerPage",
    "nbPages",
    "nbTotalItems",
    "nextPage"
})
public class ApiPagination {

    protected int currentPage;
    @XmlElement(nillable = true)
    protected List<Object> list;
    protected int nbItemsPerPage;
    protected int nbPages;
    protected int nbTotalItems;
    protected boolean nextPage;

    /**
     * Gets the value of the currentPage property.
     * 
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * Sets the value of the currentPage property.
     * 
     */
    public void setCurrentPage(int value) {
        this.currentPage = value;
    }

    /**
     * Gets the value of the list property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the list property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getList() {
        if (list == null) {
            list = new ArrayList<Object>();
        }
        return this.list;
    }

    /**
     * Gets the value of the nbItemsPerPage property.
     * 
     */
    public int getNbItemsPerPage() {
        return nbItemsPerPage;
    }

    /**
     * Sets the value of the nbItemsPerPage property.
     * 
     */
    public void setNbItemsPerPage(int value) {
        this.nbItemsPerPage = value;
    }

    /**
     * Gets the value of the nbPages property.
     * 
     */
    public int getNbPages() {
        return nbPages;
    }

    /**
     * Sets the value of the nbPages property.
     * 
     */
    public void setNbPages(int value) {
        this.nbPages = value;
    }

    /**
     * Gets the value of the nbTotalItems property.
     * 
     */
    public int getNbTotalItems() {
        return nbTotalItems;
    }

    /**
     * Sets the value of the nbTotalItems property.
     * 
     */
    public void setNbTotalItems(int value) {
        this.nbTotalItems = value;
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

}
