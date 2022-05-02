package ec.com.sipca.demosipca.models;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Data
@AllArgsConstructor
@Builder(toBuilder = true)
@Table (name = "SIPCATDEPARTMENTS")
public class Enterprise implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "CREATED_BY")
	private String createdBy;
	
	@Column(name = "CREATED_DATE")
	private Timestamp createdDate;
	
	@Column(name = "MODIFIED_BY")
	private String modifiedBy;
	
	@Column(name = "MODIFIED_DATE")
	private Timestamp modifiedDate;
	
	private String status;
	private String address;
	private String name;
	private String phone;
	
}
