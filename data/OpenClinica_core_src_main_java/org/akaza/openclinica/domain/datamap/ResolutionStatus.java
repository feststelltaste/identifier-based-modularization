// default package
// Generated Jul 31, 2013 2:03:33 PM by Hibernate Tools 3.4.0.CR1
package org.akaza.openclinica.domain.datamap;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.akaza.openclinica.domain.DataMapDomainObject;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * ResolutionStatus generated by hbm2java
 */
@Entity
@Table(name = "resolution_status")
@GenericGenerator(name = "id-generator", strategy = "native", parameters = { @Parameter(name = "sequence", value = "resolution_status_resolution_status_id_seq") })
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class ResolutionStatus  extends DataMapDomainObject {

	private int resolutionStatusId;
	private String name;
	private String description;
	private List<DiscrepancyNote> discrepancyNotes ;

	public ResolutionStatus() {
	}

	public ResolutionStatus(int resolutionStatusId) {
		this.resolutionStatusId = resolutionStatusId;
	}

	public ResolutionStatus(int resolutionStatusId, String name,
			String description, List<DiscrepancyNote> discrepancyNotes) {
		this.resolutionStatusId = resolutionStatusId;
		this.name = name;
		this.description = description;
		this.discrepancyNotes = discrepancyNotes;
	}


	
	@Id
	@Column(name = "resolution_status_id", unique = true, nullable = false)
	@GeneratedValue(generator = "id-generator")

	public int getResolutionStatusId() {
		return this.resolutionStatusId;
	}

	public void setResolutionStatusId(int resolutionStatusId) {
		this.resolutionStatusId = resolutionStatusId;
	}

	@Column(name = "name", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "resolutionStatus")
	public List<DiscrepancyNote> getDiscrepancyNotes() {
		return this.discrepancyNotes;
	}

	public void setDiscrepancyNotes(List<DiscrepancyNote> discrepancyNotes) {
		this.discrepancyNotes = discrepancyNotes;
	}



}