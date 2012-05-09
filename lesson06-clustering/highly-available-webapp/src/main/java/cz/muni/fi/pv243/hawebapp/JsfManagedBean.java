package cz.muni.fi.pv243.hawebapp;

import java.io.Serializable;
//import java.util.Map;
//import javax.faces.component.UIViewRoot;
//import javax.faces.context.FacesContext;
//import javax.servlet.http.HttpSession;
import cz.muni.fi.pv243.hawebapp.SerialBean;

public class JsfManagedBean extends SerialBean implements Serializable {
//    public SomeBean() {
//        super();
//        HttpSession ses = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
//        ses.getId();
//    }
//
//    @Override
//    public int getSerialAndIncrement() {
//        UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
//        Map<String, Object> map = viewRoot.getViewMap(true);
//        Object o = map.get(this.getClass().getName());
//        SerialBean s;
//
//        if (o == null) {
//            s = new SerialBean();
//        } else {
//            s = (SerialBean) o;
//        }
//
//        int toret = s.getSerial() + 1;
//        s.setSerial(toret);
//
//        // Persist
//        map.put(this.getClass().getName(), s);
//
//        System.out.println("I stored this: " + s.getSerial());
//
//
//        return super.getSerialAndIncrement();
//    }
}
