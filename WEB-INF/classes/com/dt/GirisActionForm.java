package com.dt;
import javax.servlet.http.*;
import org.apache.struts.action.*;
public class GirisActionForm extends ActionForm{
        private String kullanici;
        private String sifre;
        public String getkullanici(){
            return kullanici;
            }
            public void setkullanici(String kullanici){
            this.kullanici=kullanici;
                    }
            public String getsifre(){
            return sifre;
                        }
            public void setsifre(String sifre){
            this.sifre=sifre;
               }    
}
