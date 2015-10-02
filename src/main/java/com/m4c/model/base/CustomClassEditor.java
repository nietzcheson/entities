package com.m4c.model.base;

import org.springframework.util.StringUtils;
import java.beans.PropertyEditorSupport;

@SuppressWarnings("unchecked")
public class CustomClassEditor<T extends IDEntity> extends PropertyEditorSupport {

		/**
		 * Create a default ClassEditor, using the thread context ClassLoader.
		 */
		public CustomClassEditor(Class requiredType) {
	        this.requiredType = requiredType;
	    }
	   
		private Class requiredType;

	    
		public void setAsText(String text) throws IllegalArgumentException {
	        T command;
	        try {
	            command = (T) requiredType.newInstance();
	        } catch (InstantiationException e) {
	            e.printStackTrace();
	            return;
	        } catch (IllegalAccessException e) {
	            e.printStackTrace();
	            return ;
	        }

	        if (StringUtils.hasText(text)) {
	            command.setId(Long.valueOf(text));
				setValue(command);
			}
			else {
				setValue(null);
			}
		}

		public String getAsText() {
	        T command;
	        try {
	            command = (T) requiredType.newInstance();
	        } catch (InstantiationException e) {
	            e.printStackTrace();
	            return "";
	        } catch (IllegalAccessException e) {
	            e.printStackTrace();
	            return "";
	        }

	        Object value = getValue();
	        command = (T) value;
			if (command == null) {
				return "";
			}
			return command.getId().toString();
		}

}
