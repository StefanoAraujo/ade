/*
 
    Copyright IBM Corp. 2012, 2016
    This file is part of Anomaly Detection Engine for Linux Logs (ADE).

    ADE is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    ADE is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with ADE.  If not, see <http://www.gnu.org/licenses/>.
 
*/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.06 at 05:15:48 PM IDT 
//

package org.openmainframe.ade.impl.flow.factory.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openmainframe.ade.impl.flow.factory.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Layout_QNAME = new QName("http://flow.impl.ade.openmainframe.org/factory", "Layout");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openmainframe.ade.impl.flow.factory.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LinkType }
     * 
     */
    public LinkType createLinkType() {
        return new LinkType();
    }

    /**
     * Create an instance of {@link AnalysisGroupFlowType }
     * 
     */
    public AnalysisGroupFlowType createAnalysisGroupFlowType() {
        return new AnalysisGroupFlowType();
    }

    /**
     * Create an instance of {@link LayoutType }
     * 
     */
    public LayoutType createLayoutType() {
        return new LayoutType();
    }

    /**
     * Create an instance of {@link FramingFlowType }
     * 
     */
    public FramingFlowType createFramingFlowType() {
        return new FramingFlowType();
    }

    /**
     * Create an instance of {@link OutputerType }
     * 
     */
    public OutputerType createOutputerType() {
        return new OutputerType();
    }

    /**
     * Create an instance of {@link PropertyType }
     * 
     */
    public PropertyType createPropertyType() {
        return new PropertyType();
    }

    /**
     * Create an instance of {@link ScoringSchemaType }
     * 
     */
    public ScoringSchemaType createScoringSchemaType() {
        return new ScoringSchemaType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LayoutType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://flow.impl.ade.openmainframe.org/factory", name = "Layout")
    public JAXBElement<LayoutType> createLayout(LayoutType value) {
        return new JAXBElement<LayoutType>(_Layout_QNAME, LayoutType.class, null, value);
    }

}
