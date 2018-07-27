/**
 * LivrariaWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.caelum.livraria.webservice;

public class LivrariaWSServiceLocator extends org.apache.axis.client.Service implements br.com.caelum.livraria.webservice.LivrariaWSService {

    public LivrariaWSServiceLocator() {
    }


    public LivrariaWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LivrariaWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LivrariaWSPort
    private java.lang.String LivrariaWSPort_address = "http://localhost:8080/livraria/LivrariaWS";

    public java.lang.String getLivrariaWSPortAddress() {
        return LivrariaWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LivrariaWSPortWSDDServiceName = "LivrariaWSPort";

    public java.lang.String getLivrariaWSPortWSDDServiceName() {
        return LivrariaWSPortWSDDServiceName;
    }

    public void setLivrariaWSPortWSDDServiceName(java.lang.String name) {
        LivrariaWSPortWSDDServiceName = name;
    }

    public br.com.caelum.livraria.webservice.LivrariaWS getLivrariaWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LivrariaWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLivrariaWSPort(endpoint);
    }

    public br.com.caelum.livraria.webservice.LivrariaWS getLivrariaWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.caelum.livraria.webservice.LivrariaWSServiceSoapBindingStub _stub = new br.com.caelum.livraria.webservice.LivrariaWSServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getLivrariaWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLivrariaWSPortEndpointAddress(java.lang.String address) {
        LivrariaWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.caelum.livraria.webservice.LivrariaWS.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.caelum.livraria.webservice.LivrariaWSServiceSoapBindingStub _stub = new br.com.caelum.livraria.webservice.LivrariaWSServiceSoapBindingStub(new java.net.URL(LivrariaWSPort_address), this);
                _stub.setPortName(getLivrariaWSPortWSDDServiceName());
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
        if ("LivrariaWSPort".equals(inputPortName)) {
            return getLivrariaWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.livraria.caelum.com.br/", "LivrariaWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.livraria.caelum.com.br/", "LivrariaWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LivrariaWSPort".equals(portName)) {
            setLivrariaWSPortEndpointAddress(address);
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
