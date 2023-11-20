package com.insurance.demo.model;

public class Coverage {
	private long id;
    private String coverageName;
    private String code;
    private boolean isPolicyCoverage;
    private boolean isVehicleCoverage;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCoverageName() {
		return coverageName;
	}
	public void setCoverageName(String coverageName) {
		this.coverageName = coverageName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public boolean isPolicyCoverage() {
		return isPolicyCoverage;
	}
	public void setPolicyCoverage(boolean isPolicyCoverage) {
		this.isPolicyCoverage = isPolicyCoverage;
	}
	public boolean isVehicleCoverage() {
		return isVehicleCoverage;
	}
	public void setVehicleCoverage(boolean isVehicleCoverage) {
		this.isVehicleCoverage = isVehicleCoverage;
	}
	


}
