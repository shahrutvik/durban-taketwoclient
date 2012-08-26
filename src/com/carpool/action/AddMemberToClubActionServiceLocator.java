/**
 * AddMemberToClubActionServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.carpool.action;

public class AddMemberToClubActionServiceLocator extends org.apache.axis.client.Service implements com.carpool.action.AddMemberToClubActionService {

    public AddMemberToClubActionServiceLocator() {
    }


    public AddMemberToClubActionServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AddMemberToClubActionServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AddMemberToClubAction
    private java.lang.String AddMemberToClubAction_address = "http://localhost:8080/durban-taketwo/services/AddMemberToClubAction";

    public java.lang.String getAddMemberToClubActionAddress() {
        return AddMemberToClubAction_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AddMemberToClubActionWSDDServiceName = "AddMemberToClubAction";

    public java.lang.String getAddMemberToClubActionWSDDServiceName() {
        return AddMemberToClubActionWSDDServiceName;
    }

    public void setAddMemberToClubActionWSDDServiceName(java.lang.String name) {
        AddMemberToClubActionWSDDServiceName = name;
    }

    public com.carpool.action.AddMemberToClubAction getAddMemberToClubAction() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AddMemberToClubAction_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAddMemberToClubAction(endpoint);
    }

    public com.carpool.action.AddMemberToClubAction getAddMemberToClubAction(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.carpool.action.AddMemberToClubActionSoapBindingStub _stub = new com.carpool.action.AddMemberToClubActionSoapBindingStub(portAddress, this);
            _stub.setPortName(getAddMemberToClubActionWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAddMemberToClubActionEndpointAddress(java.lang.String address) {
        AddMemberToClubAction_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.carpool.action.AddMemberToClubAction.class.isAssignableFrom(serviceEndpointInterface)) {
                com.carpool.action.AddMemberToClubActionSoapBindingStub _stub = new com.carpool.action.AddMemberToClubActionSoapBindingStub(new java.net.URL(AddMemberToClubAction_address), this);
                _stub.setPortName(getAddMemberToClubActionWSDDServiceName());
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
        if ("AddMemberToClubAction".equals(inputPortName)) {
            return getAddMemberToClubAction();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://action.carpool.com", "AddMemberToClubActionService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://action.carpool.com", "AddMemberToClubAction"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AddMemberToClubAction".equals(portName)) {
            setAddMemberToClubActionEndpointAddress(address);
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
