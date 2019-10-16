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
public partial class EqxSensorAxis : EqxCalHistoryEntry
{
    
    #region Private fields
    private string _name;
    
    private string _uUID;
    
    private bool _enabled;
    
    private bool _readoutEnabled;
    
    private bool _conversionEnabled;
    
    private EqxTedsType _tedsType;
    
    private string _locationCode;
    
    private string _locationLongname;
    
    private string _companyCode;
    
    private string _companyLongname;
    
    private string _supplier;
    
    private string _model;
    
    private string _technology;
    
    private float _excitationVoltageMin;
    
    private float _excitationVoltageMax;
    
    private EqxElectricalMethod _electricalMethod;
    
    private string _physicalDimension;
    
    private string _physicalUnit;
    
    private string _axisDirection;
    
    private float _minRange;
    
    private float _maxRange;
    
    private float _maxSensitivityDeviation;
    
    private float _maxLinearityDeviation;
    
    private float _maxStandardDeviation;
    
    private float _maxHysteresisDeviation;
    
    private string _serialNumber;
    
    private bool _usable;
    
    private string _status;
    
    private EqxIdModuleType _iDModuleType;
    
    private string _iDModuleString;
    
    private int _calPeriod;
    
    private bool _shuntCheckPos;
    
    private float _shuntGainPos;
    
    private float _shuntValuePos;
    
    private float _shuntTolRelativePos;
    
    private bool _shuntCheckNeg;
    
    private float _shuntGainNeg;
    
    private float _shuntValueNeg;
    
    private float _shuntTolRelativeNeg;
    
    private float _shuntResistance;
    
    private float _bridgeResistorPinpPexc;
    
    private float _bridgeResistorPinpNexc;
    
    private float _bridgeResistorNinpPexc;
    
    private float _bridgeResistorNinpNexc;
    
    private float _offset;
    
    private float _offsetTol;
    
    private bool _offsetCheck;
    
    private EqxPolarity _electricalPolarity;
    
    private List<EqxPin> _connectorPin;
    
    private EqxConnectorType _connectorType;
    
    private string _connectorId;
    
    private List<EqxCalHistoryEntry> _calHistory;
    
    private string _deviceChannelName;
    
    private EqxPolarity _mountingPolarity;
    
    private string _remark;
    
    private float _preferredRange;
    
    private float _sampleFrequency;
    
    private float _excitationVoltage;
    
    private bool _offsetCompensation;
    
    private bool _sWOffsetCompensation;
    
    private EqxSWOffsetCompensationType _sWOffsetCompensationType;
    
    private float _sWOffsetCalculationStartSec;
    
    private float _sWOffsetCalculationEndSec;
    
    private float _sWOffsetFixValue;
    
    private EqxFilterClassType _sWFilterClassType;
    
    private float _sWFilterAdHocFrequency;
    
    private bool _constInReadOnly;
    
    private float _constInValue;
    
    private EqxFiringMode _firingMode;
    
    private float _firingDelay;
    
    private int _firingDuration;
    
    private int _firingVoltageLimit;
    
    private int _firingCurrentLimit;
    
    private List<EqxAttachment> _attachment;
    
    private List<System.Xml.XmlAttribute> _anyAttr;
    #endregion
    
    public EqxSensorAxis()
    {
        this._anyAttr = new List<System.Xml.XmlAttribute>();
        this._attachment = new List<EqxAttachment>();
        this._calHistory = new List<EqxCalHistoryEntry>();
        this._connectorPin = new List<EqxPin>();
    }
    
    public string Name
    {
        get
        {
            return this._name;
        }
        set
        {
            this._name = value;
        }
    }
    
    public string UUID
    {
        get
        {
            return this._uUID;
        }
        set
        {
            this._uUID = value;
        }
    }
    
    public bool Enabled
    {
        get
        {
            return this._enabled;
        }
        set
        {
            this._enabled = value;
        }
    }
    
    public bool ReadoutEnabled
    {
        get
        {
            return this._readoutEnabled;
        }
        set
        {
            this._readoutEnabled = value;
        }
    }
    
    public bool ConversionEnabled
    {
        get
        {
            return this._conversionEnabled;
        }
        set
        {
            this._conversionEnabled = value;
        }
    }
    
    public EqxTedsType TedsType
    {
        get
        {
            return this._tedsType;
        }
        set
        {
            this._tedsType = value;
        }
    }
    
    public string LocationCode
    {
        get
        {
            return this._locationCode;
        }
        set
        {
            this._locationCode = value;
        }
    }
    
    public string LocationLongname
    {
        get
        {
            return this._locationLongname;
        }
        set
        {
            this._locationLongname = value;
        }
    }
    
    public string CompanyCode
    {
        get
        {
            return this._companyCode;
        }
        set
        {
            this._companyCode = value;
        }
    }
    
    public string CompanyLongname
    {
        get
        {
            return this._companyLongname;
        }
        set
        {
            this._companyLongname = value;
        }
    }
    
    public string Supplier
    {
        get
        {
            return this._supplier;
        }
        set
        {
            this._supplier = value;
        }
    }
    
    public string Model
    {
        get
        {
            return this._model;
        }
        set
        {
            this._model = value;
        }
    }
    
    public string Technology
    {
        get
        {
            return this._technology;
        }
        set
        {
            this._technology = value;
        }
    }
    
    public float ExcitationVoltageMin
    {
        get
        {
            return this._excitationVoltageMin;
        }
        set
        {
            this._excitationVoltageMin = value;
        }
    }
    
    public float ExcitationVoltageMax
    {
        get
        {
            return this._excitationVoltageMax;
        }
        set
        {
            this._excitationVoltageMax = value;
        }
    }
    
    public EqxElectricalMethod ElectricalMethod
    {
        get
        {
            return this._electricalMethod;
        }
        set
        {
            this._electricalMethod = value;
        }
    }
    
    public string PhysicalDimension
    {
        get
        {
            return this._physicalDimension;
        }
        set
        {
            this._physicalDimension = value;
        }
    }
    
    public string PhysicalUnit
    {
        get
        {
            return this._physicalUnit;
        }
        set
        {
            this._physicalUnit = value;
        }
    }
    
    public string AxisDirection
    {
        get
        {
            return this._axisDirection;
        }
        set
        {
            this._axisDirection = value;
        }
    }
    
    public float MinRange
    {
        get
        {
            return this._minRange;
        }
        set
        {
            this._minRange = value;
        }
    }
    
    public float MaxRange
    {
        get
        {
            return this._maxRange;
        }
        set
        {
            this._maxRange = value;
        }
    }
    
    public float MaxSensitivityDeviation
    {
        get
        {
            return this._maxSensitivityDeviation;
        }
        set
        {
            this._maxSensitivityDeviation = value;
        }
    }
    
    public float MaxLinearityDeviation
    {
        get
        {
            return this._maxLinearityDeviation;
        }
        set
        {
            this._maxLinearityDeviation = value;
        }
    }
    
    public float MaxStandardDeviation
    {
        get
        {
            return this._maxStandardDeviation;
        }
        set
        {
            this._maxStandardDeviation = value;
        }
    }
    
    public float MaxHysteresisDeviation
    {
        get
        {
            return this._maxHysteresisDeviation;
        }
        set
        {
            this._maxHysteresisDeviation = value;
        }
    }
    
    public string SerialNumber
    {
        get
        {
            return this._serialNumber;
        }
        set
        {
            this._serialNumber = value;
        }
    }
    
    public bool Usable
    {
        get
        {
            return this._usable;
        }
        set
        {
            this._usable = value;
        }
    }
    
    public string Status
    {
        get
        {
            return this._status;
        }
        set
        {
            this._status = value;
        }
    }
    
    public EqxIdModuleType IDModuleType
    {
        get
        {
            return this._iDModuleType;
        }
        set
        {
            this._iDModuleType = value;
        }
    }
    
    public string IDModuleString
    {
        get
        {
            return this._iDModuleString;
        }
        set
        {
            this._iDModuleString = value;
        }
    }
    
    public int CalPeriod
    {
        get
        {
            return this._calPeriod;
        }
        set
        {
            this._calPeriod = value;
        }
    }
    
    public bool ShuntCheckPos
    {
        get
        {
            return this._shuntCheckPos;
        }
        set
        {
            this._shuntCheckPos = value;
        }
    }
    
    public float ShuntGainPos
    {
        get
        {
            return this._shuntGainPos;
        }
        set
        {
            this._shuntGainPos = value;
        }
    }
    
    public float ShuntValuePos
    {
        get
        {
            return this._shuntValuePos;
        }
        set
        {
            this._shuntValuePos = value;
        }
    }
    
    public float ShuntTolRelativePos
    {
        get
        {
            return this._shuntTolRelativePos;
        }
        set
        {
            this._shuntTolRelativePos = value;
        }
    }
    
    public bool ShuntCheckNeg
    {
        get
        {
            return this._shuntCheckNeg;
        }
        set
        {
            this._shuntCheckNeg = value;
        }
    }
    
    public float ShuntGainNeg
    {
        get
        {
            return this._shuntGainNeg;
        }
        set
        {
            this._shuntGainNeg = value;
        }
    }
    
    public float ShuntValueNeg
    {
        get
        {
            return this._shuntValueNeg;
        }
        set
        {
            this._shuntValueNeg = value;
        }
    }
    
    public float ShuntTolRelativeNeg
    {
        get
        {
            return this._shuntTolRelativeNeg;
        }
        set
        {
            this._shuntTolRelativeNeg = value;
        }
    }
    
    public float ShuntResistance
    {
        get
        {
            return this._shuntResistance;
        }
        set
        {
            this._shuntResistance = value;
        }
    }
    
    public float BridgeResistorPinpPexc
    {
        get
        {
            return this._bridgeResistorPinpPexc;
        }
        set
        {
            this._bridgeResistorPinpPexc = value;
        }
    }
    
    public float BridgeResistorPinpNexc
    {
        get
        {
            return this._bridgeResistorPinpNexc;
        }
        set
        {
            this._bridgeResistorPinpNexc = value;
        }
    }
    
    public float BridgeResistorNinpPexc
    {
        get
        {
            return this._bridgeResistorNinpPexc;
        }
        set
        {
            this._bridgeResistorNinpPexc = value;
        }
    }
    
    public float BridgeResistorNinpNexc
    {
        get
        {
            return this._bridgeResistorNinpNexc;
        }
        set
        {
            this._bridgeResistorNinpNexc = value;
        }
    }
    
    public float Offset
    {
        get
        {
            return this._offset;
        }
        set
        {
            this._offset = value;
        }
    }
    
    public float OffsetTol
    {
        get
        {
            return this._offsetTol;
        }
        set
        {
            this._offsetTol = value;
        }
    }
    
    public bool OffsetCheck
    {
        get
        {
            return this._offsetCheck;
        }
        set
        {
            this._offsetCheck = value;
        }
    }
    
    public EqxPolarity ElectricalPolarity
    {
        get
        {
            return this._electricalPolarity;
        }
        set
        {
            this._electricalPolarity = value;
        }
    }
    
    public List<EqxPin> ConnectorPin
    {
        get
        {
            return this._connectorPin;
        }
        set
        {
            this._connectorPin = value;
        }
    }
    
    public EqxConnectorType ConnectorType
    {
        get
        {
            return this._connectorType;
        }
        set
        {
            this._connectorType = value;
        }
    }
    
    public string ConnectorId
    {
        get
        {
            return this._connectorId;
        }
        set
        {
            this._connectorId = value;
        }
    }
    
    public List<EqxCalHistoryEntry> CalHistory
    {
        get
        {
            return this._calHistory;
        }
        set
        {
            this._calHistory = value;
        }
    }
    
    public string DeviceChannelName
    {
        get
        {
            return this._deviceChannelName;
        }
        set
        {
            this._deviceChannelName = value;
        }
    }
    
    public EqxPolarity MountingPolarity
    {
        get
        {
            return this._mountingPolarity;
        }
        set
        {
            this._mountingPolarity = value;
        }
    }
    
    public string Remark
    {
        get
        {
            return this._remark;
        }
        set
        {
            this._remark = value;
        }
    }
    
    public float PreferredRange
    {
        get
        {
            return this._preferredRange;
        }
        set
        {
            this._preferredRange = value;
        }
    }
    
    public float SampleFrequency
    {
        get
        {
            return this._sampleFrequency;
        }
        set
        {
            this._sampleFrequency = value;
        }
    }
    
    public float ExcitationVoltage
    {
        get
        {
            return this._excitationVoltage;
        }
        set
        {
            this._excitationVoltage = value;
        }
    }
    
    public bool OffsetCompensation
    {
        get
        {
            return this._offsetCompensation;
        }
        set
        {
            this._offsetCompensation = value;
        }
    }
    
    public bool SWOffsetCompensation
    {
        get
        {
            return this._sWOffsetCompensation;
        }
        set
        {
            this._sWOffsetCompensation = value;
        }
    }
    
    public EqxSWOffsetCompensationType SWOffsetCompensationType
    {
        get
        {
            return this._sWOffsetCompensationType;
        }
        set
        {
            this._sWOffsetCompensationType = value;
        }
    }
    
    public float SWOffsetCalculationStartSec
    {
        get
        {
            return this._sWOffsetCalculationStartSec;
        }
        set
        {
            this._sWOffsetCalculationStartSec = value;
        }
    }
    
    public float SWOffsetCalculationEndSec
    {
        get
        {
            return this._sWOffsetCalculationEndSec;
        }
        set
        {
            this._sWOffsetCalculationEndSec = value;
        }
    }
    
    public float SWOffsetFixValue
    {
        get
        {
            return this._sWOffsetFixValue;
        }
        set
        {
            this._sWOffsetFixValue = value;
        }
    }
    
    public EqxFilterClassType SWFilterClassType
    {
        get
        {
            return this._sWFilterClassType;
        }
        set
        {
            this._sWFilterClassType = value;
        }
    }
    
    public float SWFilterAdHocFrequency
    {
        get
        {
            return this._sWFilterAdHocFrequency;
        }
        set
        {
            this._sWFilterAdHocFrequency = value;
        }
    }
    
    public bool ConstInReadOnly
    {
        get
        {
            return this._constInReadOnly;
        }
        set
        {
            this._constInReadOnly = value;
        }
    }
    
    public float ConstInValue
    {
        get
        {
            return this._constInValue;
        }
        set
        {
            this._constInValue = value;
        }
    }
    
    public EqxFiringMode FiringMode
    {
        get
        {
            return this._firingMode;
        }
        set
        {
            this._firingMode = value;
        }
    }
    
    public float FiringDelay
    {
        get
        {
            return this._firingDelay;
        }
        set
        {
            this._firingDelay = value;
        }
    }
    
    public int FiringDuration
    {
        get
        {
            return this._firingDuration;
        }
        set
        {
            this._firingDuration = value;
        }
    }
    
    public int FiringVoltageLimit
    {
        get
        {
            return this._firingVoltageLimit;
        }
        set
        {
            this._firingVoltageLimit = value;
        }
    }
    
    public int FiringCurrentLimit
    {
        get
        {
            return this._firingCurrentLimit;
        }
        set
        {
            this._firingCurrentLimit = value;
        }
    }
    
    public List<EqxAttachment> Attachment
    {
        get
        {
            return this._attachment;
        }
        set
        {
            this._attachment = value;
        }
    }
    
    [System.Xml.Serialization.XmlAnyAttributeAttribute()]
    public List<System.Xml.XmlAttribute> AnyAttr
    {
        get
        {
            return this._anyAttr;
        }
        set
        {
            this._anyAttr = value;
        }
    }
}
}
#pragma warning restore