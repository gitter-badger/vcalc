package SymTab;

import java.util.HashMap;
import java.util.Map;

public class GlobalScope implements Scope {
	Map<String, Symbol> symbols = new HashMap<String, Symbol>();
    
	
    // Satisfy Scope interface
    public String getScopeName() { return "global"; }
    public Scope getEnclosingScope() { return null; }
    public void define(Symbol sym) { symbols.put(sym.name, sym); }
    public Symbol resolve(String name) { return symbols.get(name); }
    
    
}
