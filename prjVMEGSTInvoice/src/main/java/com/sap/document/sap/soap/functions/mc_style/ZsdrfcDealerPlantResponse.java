
package com.sap.document.sap.soap.functions.mc_style;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DealerAdd" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="DealerAddr1" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="DealerAddr2" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="DealerAddr3" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="DealerCity" type="{urn:sap-com:document:sap:rfc:functions}char25"/&gt;
 *         &lt;element name="DealerCode" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="DealerGstin" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="DealerName" type="{urn:sap-com:document:sap:rfc:functions}char70"/&gt;
 *         &lt;element name="DealerPanNo" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="DealerPostalCode" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="DealerStateCode" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="DealerStateDesc" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="PlantAddr1" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="PlantAddr2" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="PlantAddr3" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="PlantAddress" type="{urn:sap-com:document:sap:rfc:functions}char200"/&gt;
 *         &lt;element name="PlantCity" type="{urn:sap-com:document:sap:rfc:functions}char25"/&gt;
 *         &lt;element name="PlantCode" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="PlantEccNo" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="PlantGstin" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="PlantName" type="{urn:sap-com:document:sap:rfc:functions}char70"/&gt;
 *         &lt;element name="PlantPostalCode" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="PlantStateCode" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="PlantStateDesc" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dealerAdd",
    "dealerAddr1",
    "dealerAddr2",
    "dealerAddr3",
    "dealerCity",
    "dealerCode",
    "dealerGstin",
    "dealerName",
    "dealerPanNo",
    "dealerPostalCode",
    "dealerStateCode",
    "dealerStateDesc",
    "plantAddr1",
    "plantAddr2",
    "plantAddr3",
    "plantAddress",
    "plantCity",
    "plantCode",
    "plantEccNo",
    "plantGstin",
    "plantName",
    "plantPostalCode",
    "plantStateCode",
    "plantStateDesc"
})
@XmlRootElement(name = "ZsdrfcDealerPlantResponse")
public class ZsdrfcDealerPlantResponse {

    @XmlElement(name = "DealerAdd", required = true)
    protected String dealerAdd;
    @XmlElement(name = "DealerAddr1", required = true)
    protected String dealerAddr1;
    @XmlElement(name = "DealerAddr2", required = true)
    protected String dealerAddr2;
    @XmlElement(name = "DealerAddr3", required = true)
    protected String dealerAddr3;
    @XmlElement(name = "DealerCity", required = true)
    protected String dealerCity;
    @XmlElement(name = "DealerCode", required = true)
    protected String dealerCode;
    @XmlElement(name = "DealerGstin", required = true)
    protected String dealerGstin;
    @XmlElement(name = "DealerName", required = true)
    protected String dealerName;
    @XmlElement(name = "DealerPanNo", required = true)
    protected String dealerPanNo;
    @XmlElement(name = "DealerPostalCode", required = true)
    protected String dealerPostalCode;
    @XmlElement(name = "DealerStateCode", required = true)
    protected String dealerStateCode;
    @XmlElement(name = "DealerStateDesc", required = true)
    protected String dealerStateDesc;
    @XmlElement(name = "PlantAddr1", required = true)
    protected String plantAddr1;
    @XmlElement(name = "PlantAddr2", required = true)
    protected String plantAddr2;
    @XmlElement(name = "PlantAddr3", required = true)
    protected String plantAddr3;
    @XmlElement(name = "PlantAddress", required = true)
    protected String plantAddress;
    @XmlElement(name = "PlantCity", required = true)
    protected String plantCity;
    @XmlElement(name = "PlantCode", required = true)
    protected String plantCode;
    @XmlElement(name = "PlantEccNo", required = true)
    protected String plantEccNo;
    @XmlElement(name = "PlantGstin", required = true)
    protected String plantGstin;
    @XmlElement(name = "PlantName", required = true)
    protected String plantName;
    @XmlElement(name = "PlantPostalCode", required = true)
    protected String plantPostalCode;
    @XmlElement(name = "PlantStateCode", required = true)
    protected String plantStateCode;
    @XmlElement(name = "PlantStateDesc", required = true)
    protected String plantStateDesc;

    /**
     * Gets the value of the dealerAdd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerAdd() {
        return dealerAdd;
    }

    /**
     * Sets the value of the dealerAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerAdd(String value) {
        this.dealerAdd = value;
    }

    /**
     * Gets the value of the dealerAddr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerAddr1() {
        return dealerAddr1;
    }

    /**
     * Sets the value of the dealerAddr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerAddr1(String value) {
        this.dealerAddr1 = value;
    }

    /**
     * Gets the value of the dealerAddr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerAddr2() {
        return dealerAddr2;
    }

    /**
     * Sets the value of the dealerAddr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerAddr2(String value) {
        this.dealerAddr2 = value;
    }

    /**
     * Gets the value of the dealerAddr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerAddr3() {
        return dealerAddr3;
    }

    /**
     * Sets the value of the dealerAddr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerAddr3(String value) {
        this.dealerAddr3 = value;
    }

    /**
     * Gets the value of the dealerCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerCity() {
        return dealerCity;
    }

    /**
     * Sets the value of the dealerCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerCity(String value) {
        this.dealerCity = value;
    }

    /**
     * Gets the value of the dealerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerCode() {
        return dealerCode;
    }

    /**
     * Sets the value of the dealerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerCode(String value) {
        this.dealerCode = value;
    }

    /**
     * Gets the value of the dealerGstin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerGstin() {
        return dealerGstin;
    }

    /**
     * Sets the value of the dealerGstin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerGstin(String value) {
        this.dealerGstin = value;
    }

    /**
     * Gets the value of the dealerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerName() {
        return dealerName;
    }

    /**
     * Sets the value of the dealerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerName(String value) {
        this.dealerName = value;
    }

    /**
     * Gets the value of the dealerPanNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerPanNo() {
        return dealerPanNo;
    }

    /**
     * Sets the value of the dealerPanNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerPanNo(String value) {
        this.dealerPanNo = value;
    }

    /**
     * Gets the value of the dealerPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerPostalCode() {
        return dealerPostalCode;
    }

    /**
     * Sets the value of the dealerPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerPostalCode(String value) {
        this.dealerPostalCode = value;
    }

    /**
     * Gets the value of the dealerStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerStateCode() {
        return dealerStateCode;
    }

    /**
     * Sets the value of the dealerStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerStateCode(String value) {
        this.dealerStateCode = value;
    }

    /**
     * Gets the value of the dealerStateDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerStateDesc() {
        return dealerStateDesc;
    }

    /**
     * Sets the value of the dealerStateDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerStateDesc(String value) {
        this.dealerStateDesc = value;
    }

    /**
     * Gets the value of the plantAddr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlantAddr1() {
        return plantAddr1;
    }

    /**
     * Sets the value of the plantAddr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlantAddr1(String value) {
        this.plantAddr1 = value;
    }

    /**
     * Gets the value of the plantAddr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlantAddr2() {
        return plantAddr2;
    }

    /**
     * Sets the value of the plantAddr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlantAddr2(String value) {
        this.plantAddr2 = value;
    }

    /**
     * Gets the value of the plantAddr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlantAddr3() {
        return plantAddr3;
    }

    /**
     * Sets the value of the plantAddr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlantAddr3(String value) {
        this.plantAddr3 = value;
    }

    /**
     * Gets the value of the plantAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlantAddress() {
        return plantAddress;
    }

    /**
     * Sets the value of the plantAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlantAddress(String value) {
        this.plantAddress = value;
    }

    /**
     * Gets the value of the plantCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlantCity() {
        return plantCity;
    }

    /**
     * Sets the value of the plantCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlantCity(String value) {
        this.plantCity = value;
    }

    /**
     * Gets the value of the plantCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlantCode() {
        return plantCode;
    }

    /**
     * Sets the value of the plantCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlantCode(String value) {
        this.plantCode = value;
    }

    /**
     * Gets the value of the plantEccNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlantEccNo() {
        return plantEccNo;
    }

    /**
     * Sets the value of the plantEccNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlantEccNo(String value) {
        this.plantEccNo = value;
    }

    /**
     * Gets the value of the plantGstin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlantGstin() {
        return plantGstin;
    }

    /**
     * Sets the value of the plantGstin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlantGstin(String value) {
        this.plantGstin = value;
    }

    /**
     * Gets the value of the plantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlantName() {
        return plantName;
    }

    /**
     * Sets the value of the plantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlantName(String value) {
        this.plantName = value;
    }

    /**
     * Gets the value of the plantPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlantPostalCode() {
        return plantPostalCode;
    }

    /**
     * Sets the value of the plantPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlantPostalCode(String value) {
        this.plantPostalCode = value;
    }

    /**
     * Gets the value of the plantStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlantStateCode() {
        return plantStateCode;
    }

    /**
     * Sets the value of the plantStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlantStateCode(String value) {
        this.plantStateCode = value;
    }

    /**
     * Gets the value of the plantStateDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlantStateDesc() {
        return plantStateDesc;
    }

    /**
     * Sets the value of the plantStateDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlantStateDesc(String value) {
        this.plantStateDesc = value;
    }

}
