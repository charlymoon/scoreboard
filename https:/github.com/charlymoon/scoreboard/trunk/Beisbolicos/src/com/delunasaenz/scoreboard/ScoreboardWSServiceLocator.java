/**
 * ScoreboardWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.delunasaenz.scoreboard;

public class ScoreboardWSServiceLocator extends org.apache.axis.client.Service implements com.delunasaenz.scoreboard.ScoreboardWSService {

    public ScoreboardWSServiceLocator() {
    }


    public ScoreboardWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ScoreboardWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ScoreboardWSPort
    private java.lang.String ScoreboardWSPort_address = "http://www.beisbolicos.com:8081/ScoreboardApp/ScoreboardWSService";

    public java.lang.String getScoreboardWSPortAddress() {
        return ScoreboardWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ScoreboardWSPortWSDDServiceName = "ScoreboardWSPort";

    public java.lang.String getScoreboardWSPortWSDDServiceName() {
        return ScoreboardWSPortWSDDServiceName;
    }

    public void setScoreboardWSPortWSDDServiceName(java.lang.String name) {
        ScoreboardWSPortWSDDServiceName = name;
    }

    public com.delunasaenz.scoreboard.ScoreboardWS getScoreboardWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ScoreboardWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getScoreboardWSPort(endpoint);
    }

    public com.delunasaenz.scoreboard.ScoreboardWS getScoreboardWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.delunasaenz.scoreboard.ScoreboardWSPortBindingStub _stub = new com.delunasaenz.scoreboard.ScoreboardWSPortBindingStub(portAddress, this);
            _stub.setPortName(getScoreboardWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setScoreboardWSPortEndpointAddress(java.lang.String address) {
        ScoreboardWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.delunasaenz.scoreboard.ScoreboardWS.class.isAssignableFrom(serviceEndpointInterface)) {
                com.delunasaenz.scoreboard.ScoreboardWSPortBindingStub _stub = new com.delunasaenz.scoreboard.ScoreboardWSPortBindingStub(new java.net.URL(ScoreboardWSPort_address), this);
                _stub.setPortName(getScoreboardWSPortWSDDServiceName());
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
        if ("ScoreboardWSPort".equals(inputPortName)) {
            return getScoreboardWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://scoreboard.delunasaenz.com/", "ScoreboardWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://scoreboard.delunasaenz.com/", "ScoreboardWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ScoreboardWSPort".equals(portName)) {
            setScoreboardWSPortEndpointAddress(address);
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
