/*
 * Copyright (c) 2001 World Wide Web Consortium,
 * (Massachusetts Institute of Technology, Institut National de
 * Recherche en Informatique et en Automatique, Keio University). All
 * Rights Reserved. This program is distributed under the W3C's Software
 * Intellectual Property License. This program is distributed in the
 * hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE.
 * See W3C License http://www.w3.org/Consortium/Legal/ for more details.
 */

package org.apache.xerces.dom3.as;

/**
 * @deprecated
 * The <code>ASObject</code> interface is analogous to a <code>Node</code> in 
 * , e.g., an element declaration. 
 * <p>Opaque.
 * <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load
and Save Specification</a>.
 */
@Deprecated
public interface ASObject {
    // ASObjectType
    /**
     * The node is an <code>ASElementDeclaration</code>.
     */
    public static final short AS_ELEMENT_DECLARATION    = 1;
    /**
     * The node is an <code>ASAttributeDeclaration</code>.
     */
    public static final short AS_ATTRIBUTE_DECLARATION  = 2;
    /**
     * The node is a <code>ASNotationDeclaration</code>.
     */
    public static final short AS_NOTATION_DECLARATION   = 3;
    /**
     * The node is an <code>ASEntityDeclaration</code>.
     */
    public static final short AS_ENTITY_DECLARATION     = 4;
    /**
     * The node is a <code>ASContentModel</code>.
     */
    public static final short AS_CONTENTMODEL           = 5;
    /**
     * The node is a <code>ASModel</code>.
     */
    public static final short AS_MODEL                  = 6;

    /**
     * A code representing the underlying object as defined above.
     */
    public short getAsNodeType();

    /**
     * The <code>ASModel</code> object associated with this 
     * <code>ASObject</code>. For a node of type <code>AS_MODEL</code>, this 
     * is <code>null</code>. 
     */
    public ASModel getOwnerASModel();
    /**
     * The <code>ASModel</code> object associated with this 
     * <code>ASObject</code>. For a node of type <code>AS_MODEL</code>, this 
     * is <code>null</code>. 
     */
    public void setOwnerASModel(ASModel ownerASModel);

    /**
     * The <code>name</code> of this <code>ASObject</code> depending on the 
     * <code>ASObject</code> type.
     */
    public String getNodeName();
    /**
     * The <code>name</code> of this <code>ASObject</code> depending on the 
     * <code>ASObject</code> type.
     */
    public void setNodeName(String nodeName);

    /**
     * The namespace prefix of this node, or <code>null</code> if it is 
     * unspecified.
     */
    public String getPrefix();
    /**
     * The namespace prefix of this node, or <code>null</code> if it is 
     * unspecified.
     */
    public void setPrefix(String prefix);

    /**
     * Returns the local part of the qualified name of this 
     * <code>ASObject</code>.
     */
    public String getLocalName();
    /**
     * Returns the local part of the qualified name of this 
     * <code>ASObject</code>.
     */
    public void setLocalName(String localName);

    /**
     * The namespace URI of this node, or <code>null</code> if it is 
     * unspecified.  defines how a namespace URI is attached to schema 
     * components.
     */
    public String getNamespaceURI();
    /**
     * The namespace URI of this node, or <code>null</code> if it is 
     * unspecified.  defines how a namespace URI is attached to schema 
     * components.
     */
    public void setNamespaceURI(String namespaceURI);

    /**
     * Creates a copy of this <code>ASObject</code>. See text for 
     * <code>cloneNode</code> off of <code>Node</code> but substitute AS 
     * functionality.
     * @param deep Setting the <code>deep</code> flag on, causes the whole 
     *   subtree to be duplicated. Setting it to <code>false</code> only 
     *   duplicates its immediate child nodes.
     * @return Cloned <code>ASObject</code>.
     */
    public ASObject cloneASObject(boolean deep);

}
