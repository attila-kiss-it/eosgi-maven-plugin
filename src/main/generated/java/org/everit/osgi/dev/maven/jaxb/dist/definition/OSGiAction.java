//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.30 at 03:06:08 PM CET 
//


package org.everit.osgi.dev.maven.jaxb.dist.definition;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OSGiAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OSGiAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="startLevel" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OSGiAction")
public class OSGiAction {

    @XmlAttribute(name = "start", required = true)
    protected boolean start;
    @XmlAttribute(name = "startLevel")
    protected Integer startLevel;

    /**
     * Gets the value of the start property.
     * 
     */
    public boolean isStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     */
    public void setStart(boolean value) {
        this.start = value;
    }

    /**
     * Gets the value of the startLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartLevel() {
        return startLevel;
    }

    /**
     * Sets the value of the startLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartLevel(Integer value) {
        this.startLevel = value;
    }

}
