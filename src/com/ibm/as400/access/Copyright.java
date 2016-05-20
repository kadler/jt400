///////////////////////////////////////////////////////////////////////////////
//
// JTOpen (IBM Toolbox for Java - OSS version)
//
// Filename:  Copyright.java
//
// The source code contained herein is licensed under the IBM Public License
// Version 1.0, which has been approved by the Open Source Initiative.
// Copyright (C) 1997-2005 International Business Machines Corporation and
// others.  All rights reserved.
//
///////////////////////////////////////////////////////////////////////////////

package com.ibm.as400.access;

/**
 The Copyright interface is used to hold the copyright string and the version information for the IBM Toolbox for Java.
 **/

//
//Toolbox driver change log.  Flags are used in ascending order.
//
//Flag  YYYYMMDD  Reason
//----- --------  ---------------
//@A1   20100406  Correct Syntax Error on Insert
//@A2   20100407  Update/Delete Blocking fix
//@A3   20100407  Allow DMD.getFunctions call on V5R4
//@A4   20100415  Fix update counts for batched update
//@A5   20100430  Correct JDUtilities.streamToBytes
//@A6   20100503  maximum blocked input rows property / Free storage used by blocked updates.
//@A7   20100506  buffer synchronization / remove Class.forName() contention / gc tracing
//@A8   20100507  minimize buffer usage for blocked insert
//@A9   20100720  Fix AS400JDBCResultSetMetaData.isAutoIncrement() when extended metadata is off
//@AA   20100805  Fix AS400JDBCStatement.execute to return syntax error from database engine.
//@AB   20101108  Make sure locators are scoped to cursor when isolation level = *NONE
//
//@B1   20101203  Call Trace.logLoadPath when loading class, so trace indicated where driver was loaded from.
//              Also trace JVM information.
//@B2   20101209  Fix Statement.setQueryTimeout
//@B3   20101209  Delay reading of input stream until execute
//@B4   20101215  Use NEW TABLE instead of FINAL table for autogenerated keys.
//@B5   20110105  Fix leaking DBStorage objects.
//@B6   20110114  Fix SQLResultSetTablePane
//@C1   20110119  Message File enhancement from David Gibbs
//@C2   20110121  CommandHelpRetriever fixes for empty help text.
//@C3   20110122  Make sure returnToPool is associated with nulling object. (Not Marked)
//@C4   20110217  Stored procedure scrollable cursor fixes.
//@C5   20110221  RLA Bidi Conversion
//@C6   20110224  Change JVM16 synchronization to not be default behavior
//@C7   20110303  Identify Generic Objects (replace with  subclasses)
//@C8   20110322  PCML Date/Time/Timestamp fixes
//@C9   20110405  Deadlock in DBStoragePool
//@CA   20110418  More timezone fixes.
//@D1   20110513  FileAttributes.getAttributes fails when returned data is larger than 2048 bytes.
//@D2   20010531  User library list updates
//@D3   20110601  Profile token or identity token is not valid when getting pooled connection while token is automatically refreshed.
//@D4   20110614 JDBC: query timeout mechanism property
//@D5   20110704  Handle ClassCastException in NPConversation.makeRequest()
//@D6   20110714  JDBC:  Correct Connection.isValid()
//@D7   20110714  JDBC:  Initial JDBC 4.1 changes
//@D8   20110715  Fix reading of com.ibm.as400.access.noDBReplyPooling and com.ibm.as400.access.DBDSPool.monitor properties
//@D9   20110802  JDBC: Add fetch warning to result set object.
//@DA   20110810  JDBC: Fix bug where clearParameters() causes executeBatch() failure.
//@Bidi-HCG3 20110812  Updated BIDI support
//@D10  20110815  Program Call: query timeout mechanism property
//@E1   20110902  ProfileTokenValue:  Fix bug when profileTokenCredential not used
//@E2   20110926  JDBC: Additional JDBC 4.1 changes
//@E3   20110926  JDBC: AS/IS JDBC client program
//@E4   20110929  JDBC: Always use GregorianCalendar to interpret database dates.
//@E5   20110929  JDBC: Fix updated row count for auto generated keys
//@F1   20111122  JDBC: Miscellaneous conversion fixes
//@F2   20111220  Ignore all exceptions when loading Buddhist calendar
//@F3   20111220  JDBC: Report fetch errors correctly
//@F4   20120118  PCML parser performance tuning
//@F5   20120208  JDBC: Honor decimal separator for PreparedStatement.setString()
//@F6   20120210  JDBC: describe option property
//@F7   20120210  JDBC: Ignore exceptions during race condition
//@F8   20120210  Improve CADSPool performance
//@F9   20120213  JDBC:  Decimal data errors property
//@FA   20120228  JDBC:  Fix java.util.NoSuchElementException: Vector Enumeration thrown by rollback
//@FB   20120410  Print: synchronized send and receive request in NPConversation.makeRequest()
//@FC   20120524  JDBC:  Allow using a java.net.URL for setObject and Datalink
//@G1   20120605  JDBC:  Fix array input parameters on reused CallableStatement
//@G2   20120606  JDBC:  Array parameter fixes
//@G3   20120611  JDBC:  Handle java.version of "0"
//@G4   20120730  JDBC:  Correct timestamp conversion.
//@G5   20120820  JDBC:  Fix named parameters.
//@G6   20120820  JDBC:  Fix DatabaseMetadata getCatalogTerm() and supportsExpressionsInOrderBy()
//@G7   20120823  JDBC:  Fix array input parameter when reusing callable statement
//@H1   20120830  JDBC:  Allow blocking when using asensitive cursors
//@H2   20121002  JDBC:  Report Truncation for mixed/open CCSIDs
//@H3   20121101  JDBC:  Improve timestamp support
//@H4   20121117  JDBC:  Reduce number of SQLConversionSettingsObjects
//@H5   20121119  JDBC:  Fix truncation for SQLNumeric and SQLDecimal objects
//@H6   20121206  Add QPWDEXPWRN support
//@H7   20130102  JDBC:  For CCSID 1208, do not report truncation if extra characters are spaces
//@I1   20130225  Refactor code block of SSL socket provider (shift between JSSE and SSL )
//@I2   20130318  JDBC:  Fix timestamp to String formatting
//@I3   20130404  Add Serializable interface to CancelLock
//@J1   20130702  JDBC:  Support IPV6 addresses in JDBC URL.
//@J2   20130812  JDBC:  Support timestamp as time parameter
//@J3   20130822  Support for up to 255 parameters on a remote program call request
//@J4   20130822  Support additional message data returned on remote command and remote program call replies
//@J5   20131001  JDBC:  Fix UTF-8 clobs
//@K1   20131110  JDBC:  Fix concurrent access resolution property
//@K2   20131114  JDBC:  Fix named parameters for CALL with return parameter
//@K4   20131212  JDBC:  Fix for JVM crash when -Xshareclasses is used with jt400Native.jar
//@K3   20140113  JDBC:  Variable Field compression 
//@K5   20140120  JDBC:  Fix DatabaseMetaData calls on READONLY connection
//@K6   20140127  JDBC:  Fix DatabaseMetaData.getSQLKeywords
//@K7   20140221  JDBC:  JDBC 4.2 Support
//@K8   20140225  Command Call:  Correct library name in returned message.
//@K9   20140303  Conversion:  Fix corruption of 16684 table by loading of CCSIDs 5026,5035,930, and 939. 
//@KA   20140303  Command Call:  Additional message information
//@KD   20140307  Conversion:  Add surrogate support and update 16684 table
//@KE   20140307  JDBC:  timestamp format property
//      20140408  JDBC: Set Minor Version for JDBC 4.2
//@L1   20140408  JDBC: Fix UDT Name in ResultSetMetaData
//@L2   20140408  JDBC: Correct DatabaseMetaData.getXXXFunctions
//@L3   20140408  JDBC: Variable Field Compression fixes
//@L4   20140423  PCML: Use non-validating parser if validating parser not available.
//@L5   20140516  Program Call: Compress output parameters for performance.
//@L6   20140523  Joblist: update attribute type.
//@L7   20140527  PCML: Fix xpcml parsing issue with struct_i tag.
//@L8   20140527  Program Call: Identify object in trace
//@L9   20140603  JDBC: Improve variable field compression performance
//@L10   20140624  Program Call: bi-direction RLE compression
//@L11   20140624  Cmd/pgm call: Improve performance about getjobinfo
//@L12   20140626  PTFGroup: get additional attributes
//@L13   20140701  Message: make DateFormate thread safe
//@L14   20140701  HTMLForm: make hidden field in top
//@L15   20140707  JDBC:  Correct error message when value overflow when setting BIGINT
//@L16   20140710  JDBC:  Correct default connection properties in AS400JDBCPooledConnection
//@L17   20140718  PCML: Update max string length to support 16MB
//@M1    20140821  PCML: Escape special characters when generateXPCML
//@M2    20140821  Program Call: Support program on IASP
//@M3    20140925  JDBC: Support *ALLUSR schema name on DatabaseMetaData.getTables
//@M4    20140926  Cause chain support
//@M5    20141008  JDBC:  Add getPositionOfSyntaxError to syntax exceptions
//@M6    20141010  JDBC:  Allow use of sort sequence table in IASP
//@M7    20141024  Misc:  Improve performance of RLE decompression
//@M8    20141111  DDM:  Fix DRDA correlation id issue
//@N1    20141204  JDBC:  Fix default setting of schema in AS400JDBCPooledConnect for system naming
//@N2    20141212  JDBC:  Fix !THREAD command of jdbc client to inherit environment
//@N3    20150113  JDBC:  Fix CHAR FOR BIT DATA parameters in input variable field compression
//@N4    20150119  Convert: update 16684, 300, 4396 conversion table  
//@N5    20150211  DHCP connect to port with non-localhost  
//@N6    20150213  Program Call: Support max 255 parameters in program call
//@N7    20150217  JDBC:   Delay errors from combined open/fetch
//@N8    20150324  JDBC:   Fix LONG CHAR FOR BIT DATA parameter in input variable field compression
//@O1    20150423  JPing ddm-ssl with correct port
//@O2    20150505  Command: fix up the offset for getting command processing library and program
//@O3    20150505  Fix Object Description size for OBJD0400 format
//@O4    20150505  JDBC:  Fix AS400DataSource and secure=true   
//@O5    20150610  Fix objectList name, library and type to not case sensitive   
//@O6    20150629  PCML: Fix performance issue about Class.forName in PcmlDataValues    
//@O7    20150629  JDBC: Fix trimming of leading spaces of column names
//@O8    20150630  JDBC: Fix errors from QSQFETCH from stored procedures not reported
//@O9    20150803  JDBC: Report truncation for InputStream parameters
//@P1    20150827  User: add STRAUTCOL parameters for v7r3
//@P2    20150828  Program Call: set iasp to pick up libs from current user profile and only call setasp when job asp is different
//@P3    20151005  JDBC: Fix ResultSetMetaData.getType() to match DatabaseMetaData.getColumns
//@P4    20151012  SSL set jvm ciphers list for iNav
//@P5    20151016  AS400 adds more interface to set asp group
//@P6    20151110  JDBC: Fix blank column labels.  Return labels from stored procedure calls. 
//@P7    20151110  JDBC: Performance improvement -- remove string comparisons
//@Q1    20151207  JDBC: Honor "ignore warnings" connection property for more scenarios
//@Q2    20151208  JDBC: Reduce exceptions generated by Decimal arrays
//@Q3    20160121  JDBC: Add getDB2ParameterName to CallabledStatement and ParameterMetaData
//@Q4    20160128  JDBC: Correct NullPointerException from JDError when multiple threads
//@Q5    20160222  DDS: Correct field type of Date, Time and Timestamp //remove this temply
//@Q6    20160222  Fix various javadoc typos
//@Q7    20160222  JDBC Client:  Support unicode escape '\u0000' in SQL statements
//@Q8    20160224  JDBC:  Fix BIDI column labels
//@Q9    20160224  JDBC Client:  Fix column label display
//@Q10   20160225  Make AS400.getServerName public
//@R1    20160408  Conversion: Added CCSIDs 1047,1166,5233 and Table Generator
//@R2    20160411  Beans:  Fix IFSFileBeanInfo (Due to JDK 1.7 change)
//@R3    20160419  JDBC:  "numeric range error" property
//@R4    20160422  JDBC:  Add missing get/set methods to DataSource and DataSourceBeanInfo
//@R5    20160428  IFSFileEnumeration fix issue when pattern without wildcard
//@R6    20160429  SystemStatus supports on status statistics reset
//@R7    20160516  JDBC:  "character truncation" property
//@R8    20160516  JDBC:  Fix setting timestamp from String
//@R9    20160518  JDBC:  Optimize sending of timestamp to server
//@RA    20160519  JDBC:  Fix batch insert of timestamp
//@RB    20160520  DDM: long record number support
// NOTE:  When adding a line above, adjust the "String version" with the flag value.
//--------------------------------------------------------------------

public interface Copyright
{
    /** @deprecated  This field is reserved for use within the Toolbox product. **/
    public static String copyright = "Copyright (C) 1997-2016 International Business Machines Corporation and others.";
    //                                                                                              built=20160520 is automatically set by the build (see build.xml)
    public static String version   = "Open Source Software, JTOpen 9.0, codebase 5770-SS1 V7R3M0.00 built=20160520 @RB";  

    // Constants for reference by AS400JDBCDriver.
    static final int    MAJOR_VERSION = 11; // ex: "11" indicates V7R3, "10" indicates V7R2, while "9" indicates V7R1
    static final int    MINOR_VERSION = 0; // ex: "7" indicates PTF #7 (1 is first PTF in a release)
                                           //Note: JTOpen 8.7 is synching with ptf 10.7
    static final String DRIVER_LEVEL  = "07030000"; //(ex: 07030007 -> V7R3M0 PTF#7) (needed for hidden clientInfo) (each # is 2 digits in length)

}
