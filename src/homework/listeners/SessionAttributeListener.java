package homework.listeners;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;


public class SessionAttributeListener implements HttpSessionAttributeListener {

  
    public SessionAttributeListener() {
       
    }

	
    public void attributeAdded(HttpSessionBindingEvent event)  { 
        
    	System.out.println("An attribute is added to "+
    		event.getSession().getId());
    }

	
    public void attributeRemoved(HttpSessionBindingEvent event)  { 
    }

	
    public void attributeReplaced(HttpSessionBindingEvent event)  { 
        
    }
	
}
