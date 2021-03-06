
package com.app;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SOAPEndpoint", targetNamespace = "http://app.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SOAPEndpoint {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "putDataFromXML", targetNamespace = "http://app.com/", className = "com.app.PutDataFromXML")
    @ResponseWrapper(localName = "putDataFromXMLResponse", targetNamespace = "http://app.com/", className = "com.app.PutDataFromXMLResponse")
    @Action(input = "http://app.com/SOAPEndpoint/putDataFromXMLRequest", output = "http://app.com/SOAPEndpoint/putDataFromXMLResponse")
    public void putDataFromXML(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "putDataFromJSON", targetNamespace = "http://app.com/", className = "com.app.PutDataFromJSON")
    @ResponseWrapper(localName = "putDataFromJSONResponse", targetNamespace = "http://app.com/", className = "com.app.PutDataFromJSONResponse")
    @Action(input = "http://app.com/SOAPEndpoint/putDataFromJSONRequest", output = "http://app.com/SOAPEndpoint/putDataFromJSONResponse")
    public void putDataFromJSON(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDataAsXML", targetNamespace = "http://app.com/", className = "com.app.GetDataAsXML")
    @ResponseWrapper(localName = "getDataAsXMLResponse", targetNamespace = "http://app.com/", className = "com.app.GetDataAsXMLResponse")
    @Action(input = "http://app.com/SOAPEndpoint/getDataAsXMLRequest", output = "http://app.com/SOAPEndpoint/getDataAsXMLResponse")
    public String getDataAsXML(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDataAsJSON", targetNamespace = "http://app.com/", className = "com.app.GetDataAsJSON")
    @ResponseWrapper(localName = "getDataAsJSONResponse", targetNamespace = "http://app.com/", className = "com.app.GetDataAsJSONResponse")
    @Action(input = "http://app.com/SOAPEndpoint/getDataAsJSONRequest", output = "http://app.com/SOAPEndpoint/getDataAsJSONResponse")
    public String getDataAsJSON(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
