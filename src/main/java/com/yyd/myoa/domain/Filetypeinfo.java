package com.yyd.myoa.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the filetypeinfo database table.
 * 
 */
@Entity
public class Filetypeinfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int fileTypeId;

	private String fileTypeImage;

	private String fileTypeName;

	private String fileTypeSuffix;

	//bi-directional many-to-one association to Fileinfo
	@OneToMany(mappedBy="filetypeinfo")
	private Set<Fileinfo> fileinfos;

    public Filetypeinfo() {
    }

	public int getFileTypeId() {
		return this.fileTypeId;
	}

	public void setFileTypeId(int fileTypeId) {
		this.fileTypeId = fileTypeId;
	}

	public String getFileTypeImage() {
		return this.fileTypeImage;
	}

	public void setFileTypeImage(String fileTypeImage) {
		this.fileTypeImage = fileTypeImage;
	}

	public String getFileTypeName() {
		return this.fileTypeName;
	}

	public void setFileTypeName(String fileTypeName) {
		this.fileTypeName = fileTypeName;
	}

	public String getFileTypeSuffix() {
		return this.fileTypeSuffix;
	}

	public void setFileTypeSuffix(String fileTypeSuffix) {
		this.fileTypeSuffix = fileTypeSuffix;
	}

	public Set<Fileinfo> getFileinfos() {
		return this.fileinfos;
	}

	public void setFileinfos(Set<Fileinfo> fileinfos) {
		this.fileinfos = fileinfos;
	}
	
}