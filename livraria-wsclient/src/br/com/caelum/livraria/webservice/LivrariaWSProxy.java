package br.com.caelum.livraria.webservice;

public class LivrariaWSProxy implements br.com.caelum.livraria.webservice.LivrariaWS {
  private String _endpoint = null;
  private br.com.caelum.livraria.webservice.LivrariaWS livrariaWS = null;
  
  public LivrariaWSProxy() {
    _initLivrariaWSProxy();
  }
  
  public LivrariaWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initLivrariaWSProxy();
  }
  
  private void _initLivrariaWSProxy() {
    try {
      livrariaWS = (new br.com.caelum.livraria.webservice.LivrariaWSServiceLocator()).getLivrariaWSPort();
      if (livrariaWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)livrariaWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)livrariaWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (livrariaWS != null)
      ((javax.xml.rpc.Stub)livrariaWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.caelum.livraria.webservice.LivrariaWS getLivrariaWS() {
    if (livrariaWS == null)
      _initLivrariaWSProxy();
    return livrariaWS;
  }
  
  public br.com.caelum.livraria.webservice.Livro[] getLivrosPeloNome(java.lang.String titulo) throws java.rmi.RemoteException{
    if (livrariaWS == null)
      _initLivrariaWSProxy();
    return livrariaWS.getLivrosPeloNome(titulo);
  }
  
  
}