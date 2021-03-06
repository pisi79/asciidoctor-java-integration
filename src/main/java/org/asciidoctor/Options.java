package org.asciidoctor;

import java.util.HashMap;
import java.util.Map;

public class Options {

	protected static final String IN_PLACE = "in_place";
	protected static final String ATTRIBUTES = "attributes";
	protected static final String HEADER_FOOTER = "header_footer";
	protected static final String TEMPLATE_DIR = "template_dir";
	protected static final String TEMPLATE_ENGINE = "template_engine";
	protected static final String TO_FILE = "to_file";
	protected static final String TO_DIR = "to_dir";
	protected static final String MKDIRS = "mkdirs";
	protected static final String SAFE = "safe";
	protected static final String ERUBY = "eruby";
	protected static final String COMPACT = "compact";
	protected static final String DESTINATION_DIR = "destination_dir";
	protected static final String BACKEND = "backend";
	protected static final String DOCTYPE = "doctype";
	
	private Map<String, Object> options = new HashMap<String, Object>();
	
	public Options() {
		super();
	}

	public Options(Map<String, Object> options) {
		this.options=options;
	}
	
	public void setInPlace(boolean inPlace) {
		this.options.put(IN_PLACE, inPlace);
	}
	
	public void setAttributes(Attributes attributes) {
		this.options.put(ATTRIBUTES, attributes.map());
	}
	
	public void setAttributes(Map<String, Object> attributes) {
		this.options.put(ATTRIBUTES, attributes);
	}
	
	public void setHeaderFooter(boolean headerFooter) {
		this.options.put(HEADER_FOOTER, headerFooter);
	}
	
	public void setTemplateDir(String templateDir) {
		this.options.put(TEMPLATE_DIR, templateDir);
	}
	
	public void setTemplateEngine(String templateEngine) {
		this.options.put(TEMPLATE_ENGINE, templateEngine);
	}
	
	public void setToFile(String toFile) {
		this.options.put(TO_FILE, toFile);
	}
	
	public void setToDir(String toDir) {
		this.options.put(TO_DIR, toDir);
	}
	
	public void setMkDirs(boolean mkDirs) {
		this.options.put(MKDIRS, mkDirs);
	}
	
	/**
	 * Safe method calls safeMode.getLevel() to put the required level.
	 * @param safeMode enum.
	 */
	public void setSafe(SafeMode safeMode) {
		this.options.put(SAFE, safeMode.getLevel());
	}
	
	public void setEruby(String eruby) {
		this.options.put(ERUBY, eruby);
	}
	
	public void setCompact(boolean compact) {
		this.options.put(COMPACT, compact);
	}
	
	public void setDestinationDir(String destinationDir) {
		this.options.put(DESTINATION_DIR, destinationDir);
	}
	
	public void setBackend(String backend) {
		this.options.put(BACKEND, backend);
	}
	
	public void setDocType(String docType) {
		this.options.put(DOCTYPE, docType);
	}
	
	public void setOption(String optionName, Object optionValue) {
		this.options.put(optionName, optionValue);
	}
	
	public Map<String, Object> map() {
		return this.options;
	}
	
}
