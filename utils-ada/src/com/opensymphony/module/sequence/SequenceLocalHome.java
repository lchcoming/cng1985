/*
 * Copyright (c) 2002-2003 by OpenSymphony
 * All rights reserved.
 */
/*
 * Generated by XDoclet - Do not edit!
 */
package com.opensymphony.module.sequence;


/**
 * Local home interface for Sequence.
 * @author <a href="mailto:joe@truemesh.com">Joe Walnes</a>
 * @author <a href="mailto:hani@formicary.net">Hani Suleiman</a>
 * @version $Revision: 1.2 $
 */
public interface SequenceLocalHome extends javax.ejb.EJBLocalHome {
    //~ Static fields/initializers /////////////////////////////////////////////

    public static final String COMP_NAME = "java:comp/env/ejb/Sequence";
    public static final String JNDI_NAME = "Sequence";

    //~ Methods ////////////////////////////////////////////////////////////////

    public com.opensymphony.module.sequence.SequenceLocal create(java.lang.String name) throws javax.ejb.CreateException;

    public java.util.Collection findAll() throws javax.ejb.FinderException;

    public com.opensymphony.module.sequence.SequenceLocal findByPrimaryKey(java.lang.String pk) throws javax.ejb.FinderException;
}
