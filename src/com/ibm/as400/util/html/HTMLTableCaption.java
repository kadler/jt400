///////////////////////////////////////////////////////////////////////////////
//                                                                             
// AS/400 Toolbox for Java - OSS version                                       
//                                                                             
// Filename: HTMLTableCaption.java
//                                                                             
// The source code contained herein is licensed under the IBM Public License   
// Version 1.0, which has been approved by the Open Source Initiative.         
// Copyright (C) 1997-2000 International Business Machines Corporation and     
// others. All rights reserved.                                                
//                                                                             
///////////////////////////////////////////////////////////////////////////////

package com.ibm.as400.util.html;

import com.ibm.as400.access.ExtendedIllegalArgumentException;
import com.ibm.as400.access.ExtendedIllegalStateException;
import com.ibm.as400.access.Trace;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeSupport;
import java.beans.VetoableChangeListener;
import java.io.Serializable;

/**
*  The HTMLTableCaption class represents an HTML Caption tag.
*
*  <P>This example creates an HTMLTableCaption object with an HTMLText object for the caption element.
*  <BLOCKQUOTE><PRE>
*  // Create an HTMLText object for the caption text.
*  HTMLText captionText = new HTMLText("MY TABLE");
*  // Create the HTMLTableCaption object with the new HTMLText object.
*  HTMLTableCaption caption = new HTMLTableCaption(captionText);
*  // Display the tag.
*  System.out.println(caption.getTag());
*  </PRE></BLOCKQUOTE>
*
*  <P>Here is the output of the tag:
*  <P><BLOCKQUOTE><PRE>
*  &lt;caption&gt;MY TABLE&lt;/caption&gt;
*  </PRE></BLOCKQUOTE>
*
*  <P>This example creates an HTMLTableCaption object with an HTMLHyperlink object for the caption element.
*  <BLOCKQUOTE><PRE>
*  // Create an HTMLHyperlink object for the caption text.
*  HTMLHyperlink companyLink = new HTMLHyperlink("http://www.myCompany.com", "My Company");
*  // Create the HTMLTableCaption object with the new HTMLHyperlink object.
*  HTMLTableCaption caption = new HTMLTableCaption(companyLink);
*  caption.setAlignment(HTMLConstants.BOTTOM);
*  // Display the tag.
*  System.out.println(caption.getTag());
*  </PRE></BLOCKQUOTE>
*
*  <P>Here is the output of the tag:
*  <P><BLOCKQUOTE><PRE>
*  &lt;caption align="bottom"&gt;&lt;a href="http://www.myCompany.com&gt;My Company"&lt;/a&gt;&lt;/caption&gt;
*  </PRE></BLOCKQUOTE>
*
*  <p>HTMLTableCaption objects generate the following events:
*  <ul>
*  <li>PropertyChangeEvent
*  <li>VetoableChangeEvent
*  </ul>
**/
public class HTMLTableCaption implements HTMLTagElement, HTMLConstants, Serializable
{
  private static final String copyright = "Copyright (C) 1997-2000 International Business Machines Corporation and others.";

   private HTMLTagElement element_;   // The caption element.
   private String align_;             // The caption alignment.

   transient private PropertyChangeSupport changes_ = new PropertyChangeSupport(this);
   transient private VetoableChangeSupport vetos_ = new VetoableChangeSupport(this);

   /**
   *  Constructs a default HTMLTableCaption object.
   **/
   public HTMLTableCaption()
   {

   }
  
   /**
   *  Constructs an HTMLTableCaption object with the specified <i>element</i>.
   *  @param element An HTMLTagElement object.
   **/
   public HTMLTableCaption(HTMLTagElement element)
   {
      if (element == null)
         throw new NullPointerException("element");
      
      element_ = element;
   }

   /**
   *  Adds a PropertyChangeListener.  The specified PropertyChangeListener's <b>propertyChange</b> 
   *  method is called each time the value of any bound property is changed.
   *  @see #removePropertyChangeListener
   *  @param listener The PropertyChangeListener.
   **/
   public void addPropertyChangeListener(PropertyChangeListener listener)
   {
      if (listener == null) 
         throw new NullPointerException("listener");
      changes_.addPropertyChangeListener(listener);
   }

   /**
   *  Adds the VetoableChangeListener.  The specified VetoableChangeListener's <b>vetoableChange</b> 
   *  method is called each time the value of any constrained property is changed.
   *  @see #removeVetoableChangeListener
   *  @param listener The VetoableChangeListener.
   **/
   public void addVetoableChangeListener(VetoableChangeListener listener)
   {
      if (listener == null) 
         throw new NullPointerException("listener");
      vetos_.addVetoableChangeListener(listener);
   }
   /**
   *  Returns the caption alignment relative to the table.
   *  @return The caption alignment.  One of the following constants
   *  defined in HTMLConstants:  BOTTOM, LEFT, RIGHT, or TOP.
   *  @see com.ibm.as400.util.html.HTMLConstants
   **/
   public String getAlignment()
   {
      return align_;
   }

   /**
   *  Returns the element for the caption.
   *  @return An HTMLTagElement.
   **/
   public HTMLTagElement getElement()
   {
      return element_;
   }

   /**
   *  Returns the HTML caption tag.
   *  @return The caption tag.
   **/
   public String getTag()
   {
      if (Trace.isTraceOn())
         Trace.log(Trace.INFORMATION, "Generating HTMLTableCaption tag...");

      if (element_ == null)
      {
         Trace.log(Trace.ERROR, "Attempting to get tag before setting the 'element' parameter.");
         throw new ExtendedIllegalStateException("element", ExtendedIllegalStateException.PROPERTY_NOT_SET);
      }

      StringBuffer tag = new StringBuffer("<caption");
      if (align_ != null) 
         tag.append(" align=\"" + align_ + "\"");
      tag.append(">");
      tag.append(element_.getTag());      
      tag.append("</caption>\n");

      return new String(tag);
   }

   /**
   *  Deserializes and initializes transient data.
   **/
   private void readObject(java.io.ObjectInputStream in)         
       throws java.io.IOException, ClassNotFoundException
   {
      in.defaultReadObject();

      changes_ = new PropertyChangeSupport(this);
      vetos_ = new VetoableChangeSupport(this);
   }

   /**
   *  Removes the PropertyChangeListener from the internal list.
   *  If the PropertyChangeListener is not on the list, nothing is done.
   *  @see #addPropertyChangeListener
   *  @param listener The PropertyChangeListener.
   **/
   public void removePropertyChangeListener(PropertyChangeListener listener)
   {
      if (listener == null) 
         throw new NullPointerException("listener");
      changes_.removePropertyChangeListener(listener);
   }

   /**
   *  Removes the VetoableChangeListener from the internal list.
   *  If the VetoableChangeListener is not on the list, nothing is done.
   *  @see #addVetoableChangeListener
   *  @param listener The VetoableChangeListener.
   **/
   public void removeVetoableChangeListener(VetoableChangeListener listener)
   {
      if (listener == null) 
         throw new NullPointerException("listener");
      vetos_.removeVetoableChangeListener(listener);
   }

   /**
   *  Sets the caption alignment relative to the table.
   *  @param alignment The caption alignment.  One of the following constants
   *  defined in HTMLConstants:  BOTTOM, LEFT, RIGHT, or TOP.
   *  @exception PropertyVetoException If the change is vetoed.
   *  @see com.ibm.as400.util.html.HTMLConstants
   **/
   public void setAlignment(String alignment) throws PropertyVetoException
   {
      if (alignment == null)
      {
         throw new NullPointerException("alignment");
      }
      else if (alignment.equalsIgnoreCase(BOTTOM) ||
               alignment.equalsIgnoreCase(TOP) ||
               alignment.equalsIgnoreCase(LEFT) ||
               alignment.equalsIgnoreCase(RIGHT))
      {
         String old = align_;
         vetos_.fireVetoableChange("alignment", old, alignment );
         
         align_ = alignment;
         
         changes_.firePropertyChange("alignment", old, alignment );
      }
      else
      {
         throw new ExtendedIllegalArgumentException("alignment", ExtendedIllegalArgumentException.PARAMETER_VALUE_NOT_VALID);
      } 
   }

   /**
   *  Sets the specified <i>text</i> for the caption.
   *  @param text The caption text.
   *  @exception PropertyVetoException If the change is vetoed.
   **/
   public void setElement(String text) throws PropertyVetoException
   {
      setElement(new HTMLText(text));
   }

   /**
   *  Sets the element for the caption.
   *  @param element An HTMLTagElement.
   *  @exception PropertyVetoException If the change is vetoed.
   **/
   public void setElement(HTMLTagElement element) throws PropertyVetoException
   {
      if (element == null)

         throw new NullPointerException("element");
    
      HTMLTagElement old = element_;
      vetos_.fireVetoableChange("element", old, element );
      
      element_ = element;

      changes_.firePropertyChange("element", old, element );
   }

   /**
   *  Returns the HTML caption tag.
   *  @return The caption tag.
   **/
   public String toString()
   {
      return getTag();
   }
}
