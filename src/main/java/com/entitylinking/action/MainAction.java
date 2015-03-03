/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entitylinking.action;

import com.entitylinking.form.MainForm;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 *
 * @author PhungHV
 */
public class MainAction extends DispatchAction {

//    @Override
//    public ActionForward execute(ActionMapping mapping, ActionForm form,
//            HttpServletRequest request, HttpServletResponse response)
//            throws Exception {
//        MainForm frm = (MainForm) form;
//        String content = frm.getContent();
//        System.out.println("Running here...");
//        frm.setResult("Đã trích xuất : " + content);
//        return mapping.findForward("success");
//    }
    public ActionForward prepareLink(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) {
        System.out.println("PrepareLink");
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(MainAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/plain;");
        return mapping.findForward("success");
    }

    public ActionForward link(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) {
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(MainAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/plain;");
        System.out.println("method link");
        MainForm frm = (MainForm) form;
        String content = frm.getContent();
        System.out.println("content :" + content);

        frm.setResult("Đã trích xuất : " + content);

        return mapping.findForward("result");
        //return null;
    }
}
