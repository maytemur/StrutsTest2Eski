package com.dt;
import javax.servlet.http.*;
import org.apache.struts.action.*;
public class GirisAction extends Action{
    public ActionForward execute (ActionMapping mapping,ActionForm form,HttpServletRequest istek,HttpServletResponse cevap){
        GirisActionForm girisform=(GirisActionForm)form;
        String kullanici=girisform.getkullanici();
        String sifre=girisform.getsifre();
            if(kullanici.equals(sifre)){
                return mapping.findForward("ok");
                
                }else{
                return mapping.findForward("error");
                               }
                            }
     
    
    
    }    
    
