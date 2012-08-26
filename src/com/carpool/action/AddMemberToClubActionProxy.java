package com.carpool.action;

public class AddMemberToClubActionProxy implements com.carpool.action.AddMemberToClubAction {
  private String _endpoint = null;
  private com.carpool.action.AddMemberToClubAction addMemberToClubAction = null;
  
  public AddMemberToClubActionProxy() {
    _initAddMemberToClubActionProxy();
  }
  
  public AddMemberToClubActionProxy(String endpoint) {
    _endpoint = endpoint;
    _initAddMemberToClubActionProxy();
  }
  
  private void _initAddMemberToClubActionProxy() {
    try {
      addMemberToClubAction = (new com.carpool.action.AddMemberToClubActionServiceLocator()).getAddMemberToClubAction();
      if (addMemberToClubAction != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)addMemberToClubAction)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)addMemberToClubAction)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (addMemberToClubAction != null)
      ((javax.xml.rpc.Stub)addMemberToClubAction)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.carpool.action.AddMemberToClubAction getAddMemberToClubAction() {
    if (addMemberToClubAction == null)
      _initAddMemberToClubActionProxy();
    return addMemberToClubAction;
  }
  
  public void add(java.lang.String clubName, java.lang.String memberPhoneNumber) throws java.rmi.RemoteException{
    if (addMemberToClubAction == null)
      _initAddMemberToClubActionProxy();
    addMemberToClubAction.add(clubName, memberPhoneNumber);
  }
  
  
}