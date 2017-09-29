package com.jx.blackface.gaea.usercenter.entity;

import java.io.Serializable;
import java.util.Date;

import com.bj58.sfft.utility.dao.annotation.Column;
import com.bj58.sfft.utility.dao.annotation.Id;
import com.bj58.sfft.utility.dao.annotation.Table;
import com.jx.spat.gaea.serializer.component.annotation.GaeaMember;
import com.jx.spat.gaea.serializer.component.annotation.GaeaSerializable;

/**
* @ClassName: TBusessparterExtEntity 
* @author tangZY 
* @date 2016年07月28日 下午17:45:10 
*
 */
@SuppressWarnings("serial")
@GaeaSerializable
@Table(name = "t_busessparter_ext")
public class TBusessparterExtEntity implements Serializable {
	@Id(insertable = true)
	@Column(name = "id")
	@GaeaMember
	private long id;
	/** 用户Id **/
	@Column(name = "userid")
	@GaeaMember
	private long userid;
	/** 键 **/
	@Column(name = "dataKey")
	@GaeaMember
	private String dataKey;
	/** 值 **/
	@Column(name = "dataValue")
	@GaeaMember
	private String dataValue;
	/** 创建时间 **/
	@Column(name = "createDate")
	@GaeaMember
	private Date createDate;
	/** 修改时间 **/
	@Column(name = "modifyDate")
	@GaeaMember
	private Date modifyDate;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getUserId() {
		return userid;
	}
	public void setUserId(long userid) {
		this.userid = userid;
	}
	public String getDataKey() {
		return dataKey;
	}
	public void setDataKey(String dataKey) {
		this.dataKey = dataKey;
	}
	public String getDataValue() {
		return dataValue;
	}
	public void setDataValue(String dataValue) {
		this.dataValue = dataValue;
	}
	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * @return the modifyDate
	 */
	public Date getModifyDate() {
		return modifyDate;
	}
	/**
	 * @param modifyDate the modifyDate to set
	 */
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
}
