package com.ibs.project.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="spacemap")
public class SpaceMap {
 
	@Id

	@Column(name="space_id")
	private long spaceId;
	
	@Column(name="space_column")
	private String spaceColumn;
	
	@Column(name="space_row")
	private String spaceRow;
	
	@ManyToOne
	@JoinColumn(name="wing_id")
	private Wing wing;
	
	@Column(name="created_time",nullable=false,updatable=false)
	private Date createdTime;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_time")
	private Date updatedTime;

	public long getSpaceId() {
		return spaceId;
	}

	public void setSpaceId(long spaceId) {
		this.spaceId = spaceId;
	}

	public String getSpaceColumn() {
		return spaceColumn;
	}

	public void setSpaceColumn(String spaceColumn) {
		this.spaceColumn = spaceColumn;
	}

	public String getSpaceRow() {
		return spaceRow;
	}

	public void setSpaceRow(String spaceRow) {
		this.spaceRow = spaceRow;
	}

	public Wing getWing() {
		return wing;
	}

	public void setWing(Wing wing) {
		this.wing = wing;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}
	
 
}
