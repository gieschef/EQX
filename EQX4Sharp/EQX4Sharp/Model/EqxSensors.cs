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
public partial class EqxSensors : EqxBaseSensorGroup
{
    
    #region Private fields
    private EqxFileInfo _fileInfo;
    
    private EqxAddress _owner;
    
    private EqxAddress _sender;
    
    private EqxAddress _recipient;
    
    private string _orderNumber;
    #endregion
    
    public EqxSensors()
    {
        this._recipient = new EqxAddress();
        this._sender = new EqxAddress();
        this._owner = new EqxAddress();
        this._fileInfo = new EqxFileInfo();
    }
    
    public EqxFileInfo FileInfo
    {
        get
        {
            return this._fileInfo;
        }
        set
        {
            this._fileInfo = value;
        }
    }
    
    public EqxAddress Owner
    {
        get
        {
            return this._owner;
        }
        set
        {
            this._owner = value;
        }
    }
    
    public EqxAddress Sender
    {
        get
        {
            return this._sender;
        }
        set
        {
            this._sender = value;
        }
    }
    
    public EqxAddress Recipient
    {
        get
        {
            return this._recipient;
        }
        set
        {
            this._recipient = value;
        }
    }
    
    public string OrderNumber
    {
        get
        {
            return this._orderNumber;
        }
        set
        {
            this._orderNumber = value;
        }
    }
}
}
#pragma warning restore