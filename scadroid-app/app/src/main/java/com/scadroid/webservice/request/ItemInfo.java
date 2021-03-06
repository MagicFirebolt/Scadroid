package com.scadroid.webservice.request;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.5
//
// Date Of Creation: 7/22/2014 2:10:02 AM
//    Please dont change this code, regeneration will override your changes
//</wsdl2code-generated>
//
//------------------------------------------------------------------------------
//
//This source code was auto-generated by Wsdl2Code  Version
//
import java.util.Hashtable;

import org.ksoap2.serialization.AttributeContainer;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class ItemInfo extends AttributeContainer implements KvmSerializable{
    
    public String itemName;
    public Enums.DataType dataType;
    public boolean writable;
    
    public ItemInfo(){}
    
    public ItemInfo (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope){
	    if (inObj == null)
            return;
	    
	    SoapObject soapObject=(SoapObject)inObj; 
        if (soapObject.hasProperty("itemName"))
        {   
            
        	Object obj = soapObject.getProperty("itemName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString() != null)
                	this.itemName = j.toString();
            }else if (obj!= null && obj instanceof String){
                this.itemName = (String) obj;
            }
        }
        
        if (soapObject.hasProperty("dataType"))
        {
        	Object obj = soapObject.getProperty("dataType");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.dataType = Enums.DataType.fromString(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof Enums.DataSourceType){
                this.dataType = (Enums.DataType)obj;
            }    
        }
        if (soapObject.hasProperty("writable"))
        {
            Object obj = soapObject.getProperty("writable");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                this.writable = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                this.writable = (Boolean) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(arg0==0)
            return itemName!=null?itemName.toString():SoapPrimitive.NullSkip;
        if(arg0==1)
				return writable;

        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 2;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "itemName";
                info.namespace= "http://vo.api.scadabr.org.br";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "dataType";
                info.namespace= "http://vo.api.scadabr.org.br";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "writable";
                info.namespace= "http://vo.api.scadabr.org.br";
                break;
        }
    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
    @Override
    public String toString(){
    	return ""+ itemName;
    }

	@Override
	public String getInnerText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInnerText(String arg0) {
		// TODO Auto-generated method stub

	}
    
}
