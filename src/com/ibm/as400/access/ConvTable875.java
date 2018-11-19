///////////////////////////////////////////////////////////////////////////////
//
// JTOpen (IBM Toolbox for Java - OSS version)
//
// Filename:  ConvTable875.java
//
// The source code contained herein is licensed under the IBM Public License
// Version 1.0, which has been approved by the Open Source Initiative.
// Copyright (C) 1997-2004 International Business Machines Corporation and
// others.  All rights reserved.
//
///////////////////////////////////////////////////////////////////////////////

package com.ibm.as400.access;

class ConvTable875 extends ConvTableSingleMap
{
    private static final String copyright = "Copyright (C) 1997-2004 International Business Machines Corporation and others.";

    private static final String toUnicode_ = 
      "\u0000\u0001\u0002\u0003\u009C\t\u0086\u007F\u0097\u008D\u008E\u000B\f\r\u000E\u000F" +
      "\u0010\u0011\u0012\u0013\u009D\u0085\b\u0087\u0018\u0019\u0092\u008F\u001C\u001D\u001E\u001F" +
      "\u0080\u0081\u0082\u0083\u0084\n\u0017\u001B\u0088\u0089\u008A\u008B\u008C\u0005\u0006\u0007" +
      "\u0090\u0091\u0016\u0093\u0094\u0095\u0096\u0004\u0098\u0099\u009A\u009B\u0014\u0015\u009E\u001A" +
      "\u0020\u0391\u0392\u0393\u0394\u0395\u0396\u0397\u0398\u0399\u005B\u002E\u003C\u0028\u002B\u0021" +
      "\u0026\u039A\u039B\u039C\u039D\u039E\u039F\u03A0\u03A1\u03A3\u005D\u0024\u002A\u0029\u003B\u005E" +
      "\u002D\u002F\u03A4\u03A5\u03A6\u03A7\u03A8\u03A9\u03AA\u03AB\u007C\u002C\u0025\u005F\u003E\u003F" +
      "\u00A8\u0386\u0388\u0389\u00A0\u038A\u038C\u038E\u038F\u0060\u003A\u0023\u0040\'\u003D\"" +
      "\u0385\u0061\u0062\u0063\u0064\u0065\u0066\u0067\u0068\u0069\u03B1\u03B2\u03B3\u03B4\u03B5\u03B6" +
      "\u00B0\u006A\u006B\u006C\u006D\u006E\u006F\u0070\u0071\u0072\u03B7\u03B8\u03B9\u03BA\u03BB\u03BC" +
      "\u00B4\u007E\u0073\u0074\u0075\u0076\u0077\u0078\u0079\u007A\u03BD\u03BE\u03BF\u03C0\u03C1\u03C3" +
      "\u00A3\u03AC\u03AD\u03AE\u03CA\u03AF\u03CC\u03CD\u03CB\u03CE\u03C2\u03C4\u03C5\u03C6\u03C7\u03C8" +
      "\u007B\u0041\u0042\u0043\u0044\u0045\u0046\u0047\u0048\u0049\u00AD\u03C9\u0390\u03B0\u2018\u2015" +
      "\u007D\u004A\u004B\u004C\u004D\u004E\u004F\u0050\u0051\u0052\u00B1\u00BD\u001A\u0387\u2019\u00A6" +
      "\\\u001A\u0053\u0054\u0055\u0056\u0057\u0058\u0059\u005A\u00B2\u00A7\u001A\u001A\u00AB\u00AC" +
      "\u0030\u0031\u0032\u0033\u0034\u0035\u0036\u0037\u0038\u0039\u00B3\u00A9\u001A\u001A\u00BB\u009F";


    private static final String fromUnicode_ = 
      "\u0001\u0203\u372D\u2E2F\u1605\u250B\u0C0D\u0E0F\u1011\u1213\u3C3D\u3226\u1819\u3F27\u1C1D\u1E1F" +
      "\u404F\u7F7B\u5B6C\u507D\u4D5D\u5C4E\u6B60\u4B61\uF0F1\uF2F3\uF4F5\uF6F7\uF8F9\u7A5E\u4C7E\u6E6F" +
      "\u7CC1\uC2C3\uC4C5\uC6C7\uC8C9\uD1D2\uD3D4\uD5D6\uD7D8\uD9E2\uE3E4\uE5E6\uE7E8\uE94A\uE05A\u5F6D" +
      "\u7981\u8283\u8485\u8687\u8889\u9192\u9394\u9596\u9798\u99A2\uA3A4\uA5A6\uA7A8\uA9C0\u6AD0\uA107" +
      "\u2021\u2223\u2415\u0617\u2829\u2A2B\u2C09\u0A1B\u3031\u1A33\u3435\u3608\u3839\u3A3B\u0414\u3EFF" +
      "\u743F\u3FB0\u3F3F\uDFEB\u70FB\u3FEE\uEFCA\u3F3F\u90DA\uEAFA\uA03F\u3FDD\u3F3F\u3FFE\u3FDB\uFFFF" +
      "\u0163\u3F3F\u3F80\u71DD\u7273\u753F\u763F\u7778\uCC41\u4243\u4445\u4647\u4849\u5152\u5354\u5556" +
      "\u5758\u3F59\u6263\u6465\u6667\u6869\uB1B2\uB3B5\uCD8A\u8B8C\u8D8E\u8F9A\u9B9C\u9D9E\u9FAA\uABAC" +
      "\uADAE\uBAAF\uBBBC\uBDBE\uBFCB\uB4B8\uB6B7\uB93F\u3F3F\u3F3F\u3FBD\uFFFF\u0E1F\u3F3F\u3FCF\u3F3F" +
      "\uCEDE\uFFFF\u6F73\u3F3F\u3F4F\u7F7B\u5B6C\u507D\u4D5D\u5C4E\u6B60\u4B61\uF0F1\uF2F3\uF4F5\uF6F7" +
      "\uF8F9\u7A5E\u4C7E\u6E6F\u7CC1\uC2C3\uC4C5\uC6C7\uC8C9\uD1D2\uD3D4\uD5D6\uD7D8\uD9E2\uE3E4\uE5E6" +
      "\uE7E8\uE94A\uE05A\u5F6D\u7981\u8283\u8485\u8687\u8889\u9192\u9394\u9596\u9798\u99A2\uA3A4\uA5A6" +
      "\uA7A8\uA9C0\u6AD0\uA13F\uFFFF\u0050\u3F3F";


    ConvTable875()
    {
        super(875, toUnicode_.toCharArray(), fromUnicode_.toCharArray());
    }
}
