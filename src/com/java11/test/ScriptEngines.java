package com.java11.test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ScriptEngines {

	public static void main(String[] args) throws ScriptException {
		ScriptEngine engine=new ScriptEngineManager().getEngineByName("nashorn");
		engine.eval("print('Hello!!!')");
	}
	
	public static void scriptEngineTest() {
		ScriptEngineManager scriptEngineManager=new ScriptEngineManager();
		for(ScriptEngineFactory factory : scriptEngineManager.getEngineFactories()) {
			System.out.println("Engine Name : "+factory.getEngineName());
			System.out.println("Engine Version : "+factory.getEngineVersion());
			System.out.println("Language Name : "+factory.getLanguageName());
			System.out.println("Language Version : "+factory.getLanguageVersion());
			System.out.println("Engine Short Names : "+factory.getNames());
			System.out.println("Mime Types : "+factory.getMimeTypes());
			
		}
	}

}
