/**
 * AddClubActionServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.carpool.action;

public class AddClubActionServiceLocator extends org.apache.axis.client.Service implements com.carpool.action.AddClubActionService {

    public AddClubActionServiceLocator() {
    }


    public AddClubActionServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AddClubActionServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AddClubAction
    private java.lang.String AddClubAction_address = "http://localhost:8080/durban-taketwo/services/AddClubAction";

    public java.lang.String getAddClubActionAddress() {
        return AddClubAction_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AddClubActionWSDDServiceName = "AddClubAction";

    public java.lang.String getAddClubActionWSDDServiceName() {
        return AddClubActionWSDDServiceName;
    }

    public void setAddClubActionWSDDServiceName(java.lang.String name) {
        AddClubActionWSDDServiceName = name;
    }

    public com.carpool.action.AddClubAction getAddClubAction() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AddClubAction_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAddClubAction(endpoint);
    }

    public com.carpool.action.AddClubAction getAddClubAction(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.carpool.action.AddClubActionSoapBindingStub _stub = new com.carpool.action.AddClubActionSoapBindingStub(portAddress, this);
            _stub.setPortName(getAddClubActionWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAddClubActionEndpointAddress(java.lang.String address) {
        AddClubAction_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.carpool.action.AddClubAction.class.isAssignableFrom(serviceEndpointInterface)) {
                com.carpool.action.AddClubActionSoapBindingStub _stub = new com.carpool.action.AddClubActionSoapBindingStub(new java.net.URL(AddClubAction_address), this);
                _stub.setPortName(getAddClubActionWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AddClubAction".equals(inputPortName)) {
            return getAddClubAction();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://action.carpool.com", "AddClubActionService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://action.carpool.com", "AddClubAction"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AddClubAction".equals(portName)) {
            setAddClubActionEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
