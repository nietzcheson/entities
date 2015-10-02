package com.m4c.model.base;

import java.beans.PropertyEditorSupport;
import org.springframework.util.StringUtils;

@SuppressWarnings("unchecked")
public class CustomInvoiceDetailPkEditor <InvoiceDetailPk extends IDInvoiceDetailPk> extends PropertyEditorSupport {

		/**
		 * Create a default ClassEditor, using the thread context ClassLoader.
		 */		
		public CustomInvoiceDetailPkEditor(Class requiredType) {
	        this.requiredType = requiredType;
	    }

	    private Class requiredType;

	    public void setAsText(String text) throws IllegalArgumentException {
	    	InvoiceDetailPk command;
	        try {
	            command = (InvoiceDetailPk) requiredType.newInstance();
	        } catch (InstantiationException e) {
	            e.printStackTrace();
	            return;
	        } catch (IllegalAccessException e) {
	            e.printStackTrace();
	            return ;
	        }

	        if (StringUtils.hasText(text)) {
	            command.setId(text.trim());
				setValue(command);
			}
			else {
				setValue(null);
			}
		}

		public String getAsText() {
			InvoiceDetailPk command;
	        try {
	            command = (InvoiceDetailPk) requiredType.newInstance();
	        } catch (InstantiationException e) {
	            e.printStackTrace();
	            return "";
	        } catch (IllegalAccessException e) {
	            e.printStackTrace();
	            return "";
	        }

	        Object value = getValue();
	        command = (InvoiceDetailPk) value;
			if (command == null) {
				return "";
			}
			return command.getId();
		}


}
