<%@taglib prefix="bean" uri="/WEB-INF/struts-bean.tld" %>
<%@taglib prefix="html" uri="/WEB-INF/struts-html.tld" %>
<%@page contentType="text/html;charset=UTF-8"%>
<form method="POST" action="main.do?actionMethod=link" accept-charset="utf-8">
    <div class="row">
        <div class="panel-body col-md-10 col-md-offset-1">
            <html:textarea styleClass="form-control" styleId="content" rows="12" property="content" name="mainForm" />
        </div>
    </div>

    <div class="row col-md-10 col-md-push-10">
        <button type="button" onclick="link()" class="btn btn-success">Link</button>
        <button type="reset" class="btn btn-success">Reset</button>
    </div>
    <div class="row">
        <div class="panel-body col-md-10 col-md-offset-1">
            <p class="navbar-text" id="result">
                
            </p>
        </div>
    </div>
</form>
<script>
    function link() {
        var content = document.getElementById("content");
        var value = content.value.trim();
        if (value === null || value === '') {
            content.focus();
            return false;
        }
        loadAjax(value);
        return true;
    }
    function loadAjax(string) {
        confirm('Load ajax');
        var xmlhttp;
        if (window.XMLHttpRequest)
        {// code for IE7+, Firefox, Chrome, Opera, Safari
            xmlhttp = new XMLHttpRequest();
        }
        else
        {// code for IE6, IE5
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        }
        xmlhttp.onreadystatechange = function ()
        {
            if (xmlhttp.readyState == 4 && xmlhttp.status == 200)
            {
                document.getElementById("result").innerHTML = xmlhttp.responseText;
            }
        }
        xmlhttp.open("GET", "main.do?actionMethod=link", true);
        xmlhttp.send();
    }
</script>