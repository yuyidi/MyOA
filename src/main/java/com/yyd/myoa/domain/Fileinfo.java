package com.yyd.myoa.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the fileinfo database table.
 * 
 */
@Entity
public class Fileinfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int fileId;

    @Temporal( TemporalType.DATE)
	private Date createDate;

    @Temporal( TemporalType.DATE)
	private Date deleteTime;

	private String fileName;

	private String fileOwner;

	private String filePath;

	private int ifDelete;

	private int parentId;

	private String remark;

	//bi-directional many-to-one association to Accessoryfile
	@OneToMany(mappedBy="fileinfo")
	private Set<Accessoryfile> accessoryfiles;

	//bi-directional many-to-one association to Filetypeinfo
    @ManyToOne
	@JoinColumn(name="FileType")
	private Filetypeinfo filetypeinfo;

    public Fileinfo() {
    }

	public int getFileId() {
		return this.fileId;
	}

	public void setFileId(int fileId) {
		this.fileId = fileId;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getDeleteTime() {
		return this.deleteTime;
	}

	public void setDeleteTime(Date deleteTime) {
		this.deleteTime = deleteTime;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileOwner() {
		return this.fileOwner;
	}

	public void setFileOwner(String fileOwner) {
		this.fileOwner = fileOwner;
	}

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public int getIfDelete() {
		return this.ifDelete;
	}

	public void setIfDelete(int ifDelete) {
		this.ifDelete = ifDelete;
	}

	public int getParentId() {
		return this.parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set<Accessoryfile> getAccessoryfiles() {
		return this.accessoryfiles;
	}

	public void setAccessoryfiles(Set<Accessoryfile> accessoryfiles) {
		this.accessoryfiles = accessoryfiles;
	}
	
	public Filetypeinfo getFiletypeinfo() {
		return this.filetypeinfo;
	}

	public void setFiletypeinfo(Filetypeinfo filetypeinfo) {
		this.filetypeinfo = filetypeinfo;
	}
	
}