package com.insurance.demo.model;

import java.time.LocalDateTime;

public class PolicyEditLog {
	private long id;
    private Policy policy;
    private String editedTableName;
    private LocalDateTime editedDate;
    private String editedBy;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Policy getPolicy() {
		return policy;
	}
	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
	public String getEditedTableName() {
		return editedTableName;
	}
	public void setEditedTableName(String editedTableName) {
		this.editedTableName = editedTableName;
	}
	public LocalDateTime getEditedDate() {
		return editedDate;
	}
	public void setEditedDate(LocalDateTime editedDate) {
		this.editedDate = editedDate;
	}
	public String getEditedBy() {
		return editedBy;
	}
	public void setEditedBy(String editedBy) {
		this.editedBy = editedBy;
	}
}
