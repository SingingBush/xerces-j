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
 * The datatypes supported by DOM AS implementations. Further datatypes may be 
 * added in the Schema/PSVI spec. 
 * <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load
and Save Specification</a>.
 */
@Deprecated
public interface ASDataType {
    /**
     * One of the enumerated codes representing the data type.
     */
    public short getDataType();

    // DATA_TYPES
    /**
     * A code representing the string data type as defined in .
     */
    public static final short STRING_DATATYPE           = 1;
    /**
     * The NOTATION data type as defined in .
     */
    public static final short NOTATION_DATATYPE         = 10;
    /**
     * The ID data type as defined in .
     */
    public static final short ID_DATATYPE               = 11;
    /**
     * The IDREF data type as defined in .
     */
    public static final short IDREF_DATATYPE            = 12;
    /**
     * The IDREFS data type as defined in .
     */
    public static final short IDREFS_DATATYPE           = 13;
    /**
     * The ENTITY data type as defined in .
     */
    public static final short ENTITY_DATATYPE           = 14;
    /**
     * The ENTITIES data type as defined in .
     */
    public static final short ENTITIES_DATATYPE         = 15;
    /**
     * The NMTOKEN data type as defined in .
     */
    public static final short NMTOKEN_DATATYPE          = 16;
    /**
     * The NMTOKENS data type as defined in .
     */
    public static final short NMTOKENS_DATATYPE         = 17;
    /**
     * A code representing the boolean data type as defined in .
     */
    public static final short BOOLEAN_DATATYPE          = 100;
    /**
     * A code representing the float data type as defined in .
     */
    public static final short FLOAT_DATATYPE            = 101;
    /**
     * A code representing the double data type as defined in .
     */
    public static final short DOUBLE_DATATYPE           = 102;
    /**
     * The decimal data type as defined in .
     */
    public static final short DECIMAL_DATATYPE          = 103;
    /**
     * The hexbinary data type as defined in .
     */
    public static final short HEXBINARY_DATATYPE        = 104;
    /**
     * The base64binary data type as defined in .
     */
    public static final short BASE64BINARY_DATATYPE     = 105;
    /**
     * Then uri reference data type as defined in .
     */
    public static final short ANYURI_DATATYPE           = 106;
    /**
     * Then XML qualified name data type as defined in .
     */
    public static final short QNAME_DATATYPE            = 107;
    /**
     * The duration data type as defined in .
     */
    public static final short DURATION_DATATYPE         = 108;
    /**
     * The datetime data type as defined in .
     */
    public static final short DATETIME_DATATYPE         = 109;
    /**
     * The date data type as defined in .
     */
    public static final short DATE_DATATYPE             = 110;
    /**
     * The time data type as defined in .
     */
    public static final short TIME_DATATYPE             = 111;
    /**
     * The yearmonth data type as defined in .
     */
    public static final short GYEARMONTH_DATATYPE       = 112;
    /**
     * The year data type as defined in .
     */
    public static final short GYEAR_DATATYPE            = 113;
    /**
     * The monthday data type as defined in .
     */
    public static final short GMONTHDAY_DATATYPE        = 114;
    /**
     * The day data type as defined in .
     */
    public static final short GDAY_DATATYPE             = 115;
    /**
     * The month data type as defined in .
     */
    public static final short GMONTH_DATATYPE           = 116;
    /**
     * The integer data type as defined in .
     */
    public static final short INTEGER                   = 117;
    /**
     * A code representing the Name data type as defined in .
     */
    public static final short NAME_DATATYPE             = 200;
    /**
     * A code representing the NCName data type as defined in .
     */
    public static final short NCNAME_DATATYPE           = 201;
    /**
     * A code representing the Normalized string data type as defined in .
     */
    public static final short NORMALIZEDSTRING_DATATYPE = 202;
    /**
     * The token data type as defined in .
     */
    public static final short TOKEN_DATATYPE            = 203;
    /**
     * The Language data type as defined in .
     */
    public static final short LANGUAGE_DATATYPE         = 204;
    /**
     * The Non-positive integer data type as defined in .
     */
    public static final short NONPOSITIVEINTEGER_DATATYPE = 205;
    /**
     * Then negative integer  data type as defined in .
     */
    public static final short NEGATIVEINTEGER_DATATYPE  = 206;
    /**
     * Then long data type as defined in .
     */
    public static final short LONG_DATATYPE             = 207;
    /**
     * The integer data type as defined in .
     */
    public static final short INT_DATATYPE              = 208;
    /**
     * The short data type as defined in .
     */
    public static final short SHORT_DATATYPE            = 209;
    /**
     * The byte data type as defined in .
     */
    public static final short BYTE_DATATYPE             = 210;
    /**
     * The non-negative integer data type as defined in .
     */
    public static final short NONNEGATIVEINTEGER_DATATYPE = 211;
    /**
     * The unsigned long data type as defined in .
     */
    public static final short UNSIGNEDLONG_DATATYPE     = 212;
    /**
     * The unsigned integer data type as defined in .
     */
    public static final short UNSIGNEDINT_DATATYPE      = 213;
    /**
     * The unsigned short data type as defined in .
     */
    public static final short UNSIGNEDSHORT_DATATYPE    = 214;
    /**
     * The unsigned byte data type as defined in .
     */
    public static final short UNSIGNEDBYTE_DATATYPE     = 215;
    /**
     * The positive integer data type as defined in .
     */
    public static final short POSITIVEINTEGER_DATATYPE  = 216;
    /**
     * The other simple data type as defined in .
     */
    public static final short OTHER_SIMPLE_DATATYPE     = 1000;
    /**
     * The user-defined complex data type as defined in .
     */
    public static final short COMPLEX_DATATYPE          = 1001;

}
