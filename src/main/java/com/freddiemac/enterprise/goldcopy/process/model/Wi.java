package com.freddiemac.enterprise.goldcopy.process.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

public class Wi {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String id_aba;
	private String name_finl_insttn_tlgrpc_abrvtn;
	private String id_bnfcry_acct;
	private String name_bnfcry;
	private String desc_origr_to_bnfcry_info;
	private String desc_rcvr_finl_insttn_info;
	private String desc_finl_insttn_to_finl_insttn;

	public String getId_aba() {
		return id_aba;
	}

	public void setId_aba(String id_aba) {
		this.id_aba = id_aba;
	}

	public String getName_finl_insttn_tlgrpc_abrvtn() {
		return name_finl_insttn_tlgrpc_abrvtn;
	}

	public void setName_finl_insttn_tlgrpc_abrvtn(String name_finl_insttn_tlgrpc_abrvtn) {
		this.name_finl_insttn_tlgrpc_abrvtn = name_finl_insttn_tlgrpc_abrvtn;
	}

	public String getId_bnfcry_acct() {
		return id_bnfcry_acct;
	}

	public void setId_bnfcry_acct(String id_bnfcry_acct) {
		this.id_bnfcry_acct = id_bnfcry_acct;
	}

	public String getName_bnfcry() {
		return name_bnfcry;
	}

	public void setName_bnfcry(String name_bnfcry) {
		this.name_bnfcry = name_bnfcry;
	}

	public String getDesc_origr_to_bnfcry_info() {
		return desc_origr_to_bnfcry_info;
	}

	public void setDesc_origr_to_bnfcry_info(String desc_origr_to_bnfcry_info) {
		this.desc_origr_to_bnfcry_info = desc_origr_to_bnfcry_info;
	}

	public String getDesc_rcvr_finl_insttn_info() {
		return desc_rcvr_finl_insttn_info;
	}

	public void setDesc_rcvr_finl_insttn_info(String desc_rcvr_finl_insttn_info) {
		this.desc_rcvr_finl_insttn_info = desc_rcvr_finl_insttn_info;
	}

	public String getDesc_finl_insttn_to_finl_insttn() {
		return desc_finl_insttn_to_finl_insttn;
	}

	public void setDesc_finl_insttn_to_finl_insttn(String desc_finl_insttn_to_finl_insttn) {
		this.desc_finl_insttn_to_finl_insttn = desc_finl_insttn_to_finl_insttn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
