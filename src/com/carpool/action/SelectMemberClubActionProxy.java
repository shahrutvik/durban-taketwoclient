package com.carpool.action;

public class SelectMemberClubActionProxy implements com.carpool.action.SelectMemberClubAction {
  private String _endpoint = null;
  private com.carpool.action.SelectMemberClubAction selectMemberClubAction = null;
  
  public SelectMemberClubActionProxy() {
    _initSelectMemberClubActionProxy();
  }
  
  public SelectMemberClubActionProxy(String endpoint) {
    _endpoint = endpoint;
    _initSelectMemberClubActionProxy();
  }
  
  private void _initSelectMemberClubActionProxy() {
    try {
      selectMemberClubAction = (new com.carpool.action.SelectMemberClubActionServiceLocator()).getSelectMemberClubAction();
      if (selectMemberClubAction != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)selectMemberClubAction)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)selectMemberClubAction)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (selectMemberClubAction != null)
      ((javax.xml.rpc.Stub)selectMemberClubAction)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.carpool.action.SelectMemberClubAction getSelectMemberClubAction() {
    if (selectMemberClubAction == null)
      _initSelectMemberClubActionProxy();
    return selectMemberClubAction;
  }
  
  public java.lang.String getClubName(java.lang.String memberPhoneNumber) throws java.rmi.RemoteException{
    if (selectMemberClubAction == null)
      _initSelectMemberClubActionProxy();
    return selectMemberClubAction.getClubName(memberPhoneNumber);
  }
  
  
}