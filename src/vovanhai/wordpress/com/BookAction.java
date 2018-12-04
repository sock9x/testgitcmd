package vovanhai.wordpress.com;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;

import org.apache.struts.action.ActionForward;

import org.apache.struts.action.ActionMapping;

public class BookAction extends org.apache.struts.action.Action {

/* forward name=”success” path=”” */

private final static String SUCCESS = "success";

private final static String FAILED = "failed";

/**

* This is the action called from the Struts framework.

* @param mapping The ActionMapping used to select this instance.

* @param form The optional ActionForm bean for this request.

* @param request The HTTP Request we are processing.

* @param response The HTTP Response we are processing.

* @throws java.lang.Exception

* @return

*/

@Override

public ActionForward execute(ActionMapping mapping, ActionForm  form,

HttpServletRequest request, HttpServletResponse response)

throws Exception {

BookActionForm frm=(BookActionForm)form;

if(frm.getName().trim().equals("")||frm.getAge()<1)

return mapping.findForward(FAILED);

return mapping.findForward(SUCCESS);

}

}