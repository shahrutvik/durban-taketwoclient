package com.carpool.action;

public class AddMemberActionProxy implements com.carpool.action.AddMemberAction {
  private String _endpoint = null;
  private com.carpool.action.AddMemberAction addMemberAction = null;
  
  public AddMemberActionProxy() {
    _initAddMemberActionProxy();
  }
  
  public AddMemberActionProxy(String endpoint) {
    _endpoint = endpoint;
    _initAddMemberActionProxy();
  }
  
  private void _initAddMemberActionProxy() {
    try {
      addMemberAction = (new com.carpool.action.AddMemberActionServiceLocator()).getAddMemberAction();
      if (addMemberAction != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)addMemberAction)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)addMemberAction)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (addMemberAction != null)
      ((javax.xml.rpc.Stub)addMemberAction)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.carpool.action.AddMemberAction getAddMemberAction() {
    if (addMemberAction == null)
      _initAddMemberActionProxy();
    return addMemberAction;
  }
  
  public void add(java.lang.String firstName, java.lang.String lastName, java.lang.String phoneNumber) throws java.rmi.RemoteException{
    if (addMemberAction == null)
      _initAddMemberActionProxy();
    addMemberAction.add(firstName, lastName, phoneNumber);
  }
  
  
}