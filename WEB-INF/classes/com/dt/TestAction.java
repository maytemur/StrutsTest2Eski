package com.dt;
import javax.servlet.http.*;
import org.apache.struts.action.*;

public class TestAction extends Action{
    public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest istek,HttpServletResponse cevap) {
        //burada cesitli islemeler yapilabilir
       return mapping.findForward("ok");
       }
    }
