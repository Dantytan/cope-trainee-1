package Factory.Transporte;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public interface Transporte {
    void arrancar();
    void detener ();
    String tipo ();
}
