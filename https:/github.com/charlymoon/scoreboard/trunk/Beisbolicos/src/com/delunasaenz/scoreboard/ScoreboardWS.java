/**
 * ScoreboardWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.delunasaenz.scoreboard;

public interface ScoreboardWS extends java.rmi.Remote {
    public com.delunasaenz.scoreboard.Game[] byLeagueAndDate(java.lang.String league, java.lang.String date) throws java.rmi.RemoteException;
    public com.delunasaenz.scoreboard.Game[] league(java.lang.String league) throws java.rmi.RemoteException;
    public com.delunasaenz.scoreboard.Game byId(java.lang.String id, java.lang.String league) throws java.rmi.RemoteException;
}
