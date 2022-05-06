package com.myself.practice;

public class Hospital {
	private int hospitalId;
	private String hospitalName;
	private String hospitalCity;
	private long hospitalEmergency;
	private int hospitalDoctorId;

	public Hospital() {
		super();
	}

	public Hospital(int hospitalId, String hospitalName, String hospitalCity,
			int hospitalEmergency, int hospitalDoctorId) {
		super();
		this.hospitalId = hospitalId;
		this.hospitalName = hospitalName;
		this.hospitalCity = hospitalCity;
		this.hospitalEmergency = hospitalEmergency;
		this.hospitalDoctorId = hospitalDoctorId;
	}

	public int getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalCity() {
		return hospitalCity;
	}

	public void setHospitalCity(String hospitalCity) {
		this.hospitalCity = hospitalCity;
	}

	public long getHospitalEmergency() {
		return hospitalEmergency;
	}

	public void setHospitalEmergency(int hospitalEmergency) {
		this.hospitalEmergency = hospitalEmergency;
	}

	public int getHospitalDoctorId() {
		return hospitalDoctorId;
	}

	public void setHospitalDoctorId(int hospitalDoctorId) {
		this.hospitalDoctorId = hospitalDoctorId;
	}

	@Override
	public String toString() {
		return "hospitalId= " + hospitalId + "\nhospitalName= " + hospitalName
				+ "\nhospitalCity= " + hospitalCity + "\nhospitalEmergency="
				+ hospitalEmergency + "\nhospitalDoctorId=" + hospitalDoctorId;
	}
	
	public boolean equals(Object obj)
	{
		Hospital h1=(Hospital)obj;
		if(this.hospitalId==h1.getHospitalId() && this.hospitalName==h1.getHospitalName() && this.hospitalCity==h1.getHospitalCity() && this.hospitalEmergency== h1.getHospitalEmergency() && this.hospitalDoctorId==h1.getHospitalDoctorId())
			return true;
		else
			return false;
		
	}

}
