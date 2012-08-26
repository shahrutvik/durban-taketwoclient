package com.carpool.action;

public class AddClubActionProxy implements com.carpool.action.AddClubAction {
  private String _endpoint = null;
  private com.carpool.action.AddClubAction addClubAction = null;
  
  public AddClubActionProxy() {
    _initAddClubActionProxy();
  }
  
  public AddClubActionProxy(String endpoint) {
    _endpoint = endpoint;
    _initAddClubActionProxy();
  }
  
  private void _initAddClubActionProxy() {
    try {
      addClubAction = (new com.carpool.action.AddClubActionServiceLocator()).getAddClubAction();
      if (addClubAction != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)addClubAction)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)addClubAction)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (addClubAction != null)
      ((javax.xml.rpc.Stub)addClubAction)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.carpool.action.AddClubAction getAddClubAction() {
    if (addClubAction == null)
      _initAddClubActionProxy();
    return addClubAction;
  }
  
  public void add(java.lang.String clubName) throws java.rmi.RemoteException{
    if (addClubAction == null)
      _initAddClubActionProxy();
    addClubAction.add(clubName);
  }
  
  
}