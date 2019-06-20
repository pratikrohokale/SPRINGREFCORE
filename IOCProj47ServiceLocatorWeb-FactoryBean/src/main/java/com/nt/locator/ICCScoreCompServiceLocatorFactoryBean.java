package com.nt.locator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.FactoryBean;

import com.nt.external.ICCScoreComp;
import com.nt.external.ICCScoreCompImpl;

public class ICCScoreCompServiceLocatorFactoryBean implements FactoryBean<ICCScoreComp> {

	private String jndiName;
    private  Map<String,ICCScoreComp> cache=new HashMap();
	public void setJndiName(String jndiName) {
		this.jndiName = jndiName;
	}

	@Override
	public ICCScoreComp getObject() throws Exception {
		 ICCScoreComp extComp=null;
		//Actually we should write jndi code here to get Extenal comp ref through lookup code
		if(!cache.containsKey(jndiName)){
			extComp=new ICCScoreCompImpl();
			cache.put(jndiName, extComp);
		}
		return cache.get(jndiName);
	}

	@Override
	public Class<?> getObjectType() {
		return ICCScoreComp.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
