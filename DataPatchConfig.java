package com.chbank.t24.bean;



public class DataPatchConfig {

	public final static int DUMMY = 0;
	public final static int TABLE = 1;
	public final static int FILE  = 2;
	public final static int SQL   = 3;
	
	public final static int UPDATE = 11;
	public final static int INSERT = 12;
	public final static int MERGE  = 13;

	private String target;
	private int targetType;
	private int targetMode;
	private String source;
	private int sourceType;
	private String transform;
	
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public int getTargetType() {
		return targetType;
	}
	public void setTargetType(int targetType) {
		this.targetType = targetType;
	}
	public int getTargetMode() {
		return targetMode;
	}
	public void setTargetMode(int targetMode) {
		this.targetMode = targetMode;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public int getSourceType() {
		return sourceType;
	}
	public void setSourceType(int sourceType) {
		this.sourceType = sourceType;
	}
	public String getTransform() {
		return transform;
	}
	public void setTransform(String transform) {
		this.transform = transform;
	}
	
		
}
