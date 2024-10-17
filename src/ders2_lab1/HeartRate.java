package ders2_lab1;

public class HeartRate {
	private String adsoyad;
	private int dyili;
	private int yas;
	private int mhr;
	private double thr;
	
	public HeartRate(String adsoyad, int dyili) {
		this.adsoyad = adsoyad;
		this.dyili = dyili;
	}
	
	public int getYas() {
		this.yas = 2024 - dyili;
		return yas;
	}
	public void setAdsoyad(String adsoyad) {
		this.adsoyad = adsoyad;
	}
	public String getAdsoyad() {
		return adsoyad;
	}
	public int maxHearrate() {
		 mhr = 220 - yas;
		return mhr;
	}
	
	public double targetHeartrate () {
		 thr = mhr * 0.85;
		 return thr;
	}
	
	public void show() {
		System.out.println("Ad Soyad: " + this.adsoyad);
		System.out.println("Yas: " + getYas());
		System.out.println("MHR: " + maxHearrate());
		System.out.println("THR: " + targetHeartrate());
	}

}
