package com.ada.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller which handles simple, single request use cases such as index pages and contact deletion.
 *
 * @author Luke Taylor
 * @since 3.0
 */
@Controller
public class IndexController {
    

    //~ Methods ========================================================================================================

    /**
     * The public index page, used for unauthenticated users.
     */
    @RequestMapping(value="/index.htm", method=RequestMethod.GET)
    public ModelAndView displayPublicIndex() {
       
        return new ModelAndView("index", "contact", "ddd");
    }

    /**
     * The index page for an authenticated user.
     * <p>
     * This controller displays a list of all the contacts for which the current user has read or admin permissions.
     * It makes a call to {@link ContactManager#getAll()} which automatically filters the returned list using Spring
     * Security's ACL mechanism (see the expression annotations on this interface for the details).
     * <p>
     * In addition to rendering the list of contacts, the view will also include a "Del" or "Admin" link beside the
     * contact, depending on whether the user has the corresponding permissions (admin permission is assumed to imply
     * delete here). This information is stored in the model using the injected {@link PermissionEvaluator} instance.
     * The implementation should be an instance of {@link AclPermissionEvaluator} or one which is compatible with Spring
     * Security's ACL module.
     */
    @RequestMapping(value="/search.htm", method=RequestMethod.POST)
    public ModelAndView displayUserContacts(String search) {
      

        return new ModelAndView("querylist", "search", search);
    }
}