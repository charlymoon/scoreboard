package com.delunasaenz.scoreboard;

public class ScoreboardWSProxy implements com.delunasaenz.scoreboard.ScoreboardWS {
  private String _endpoint = null;
  private com.delunasaenz.scoreboard.ScoreboardWS scoreboardWS = null;
  
  public ScoreboardWSProxy() {
    _initScoreboardWSProxy();
  }
  
  public ScoreboardWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initScoreboardWSProxy();
  }
  
  private void _initScoreboardWSProxy() {
    try {
      scoreboardWS = (new com.delunasaenz.scoreboard.ScoreboardWSServiceLocator()).getScoreboardWSPort();
      if (scoreboardWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)scoreboardWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)scoreboardWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (scoreboardWS != null)
      ((javax.xml.rpc.Stub)scoreboardWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.delunasaenz.scoreboard.ScoreboardWS getScoreboardWS() {
    if (scoreboardWS == null)
      _initScoreboardWSProxy();
    return scoreboardWS;
  }
  
  public com.delunasaenz.scoreboard.Game[] byLeagueAndDate(java.lang.String league, java.lang.String date) throws java.rmi.RemoteException{
    if (scoreboardWS == null)
      _initScoreboardWSProxy();
    return scoreboardWS.byLeagueAndDate(league, date);
  }
  
  public com.delunasaenz.scoreboard.Game[] league(java.lang.String league) throws java.rmi.RemoteException{
    if (scoreboardWS == null)
      _initScoreboardWSProxy();
    return scoreboardWS.league(league);
  }
  
  public com.delunasaenz.scoreboard.Game byId(java.lang.String id, java.lang.String league) throws java.rmi.RemoteException{
    if (scoreboardWS == null)
      _initScoreboardWSProxy();
    return scoreboardWS.byId(id, league);
  }
  
  
}