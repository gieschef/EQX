// ------------------------------------------------------------------------------
//  <auto-generated>
//    Generated by Xsd2Code++. Version 5.0.0.47. www.xsd2code.com
//  </auto-generated>
// ------------------------------------------------------------------------------
#pragma warning disable
namespace EQX4Sharp.Model
{
using System;
using System.Diagnostics;
using System.Xml.Serialization;
using System.Collections;
using System.Xml.Schema;
using System.ComponentModel;
using System.Xml;
using System.Collections.Generic;

[System.Diagnostics.DebuggerStepThroughAttribute()]
public partial class EqxFileInfo
{
    
    #region Private fields
    private string _dataFormatEdition;
    
    private System.DateTime _creationTime;
    
    private string _software;
    
    private string _softwareVersion;
    #endregion
    
    public string DataFormatEdition
    {
        get
        {
            return this._dataFormatEdition;
        }
        set
        {
            this._dataFormatEdition = value;
        }
    }
    
    public System.DateTime CreationTime
    {
        get
        {
            return this._creationTime;
        }
        set
        {
            this._creationTime = value;
        }
    }
    
    public string Software
    {
        get
        {
            return this._software;
        }
        set
        {
            this._software = value;
        }
    }
    
    public string SoftwareVersion
    {
        get
        {
            return this._softwareVersion;
        }
        set
        {
            this._softwareVersion = value;
        }
    }
}
}
#pragma warning restore
