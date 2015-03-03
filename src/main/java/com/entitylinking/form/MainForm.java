/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entitylinking.form;

import org.apache.struts.action.ActionForm;

/**
 *
 * @author PhungHV
 */
public class MainForm extends ActionForm {

    private String content;
    private String result;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
