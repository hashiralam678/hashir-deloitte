package com.deloitte;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("airtel")
public class AirtelSim implements Sim {

	@Value("${airtel.callCharge}")
	private float callCharge;
	@Value("${airtel.speed}")
	private float speed;
	@Autowired
	@Qualifier("alternateMS")
	private MessageSender ms;
	
	@Value("#{${airtel.supportedNets}}")
//	private List<String> supportedNets = new ArrayList<String>(); 
	private Map<Integer, String> supportedNets = new HashMap<Integer,String>();
	
	public void sendSms() {
		ms.sendSms();
		System.out.println("From Airtel");
	}
	public void sendMms() {
		ms.sendMms();
		System.out.println("From Airtel");
	}
	
	
	
//	public List<String> getSupportedNets() {
//		return supportedNets;
//	}
//	public void setSupportedNets(List<String> supportedNets) {
//		this.supportedNets = supportedNets;
//	}
	
	public float getCallCharge() {
		return callCharge;
	}
	public Map<Integer, String> getSupportedNets() {
		return supportedNets;
	}
	public void setSupportedNets(Map<Integer, String> supportedNets) {
		this.supportedNets = supportedNets;
	}
	
	public void setCallCharge(float callCharge) {
		this.callCharge = callCharge;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	@Override
	public void browse() {
		System.out.println("Browing with Airtel...Speed "+speed+" mb/s");
		System.out.println("Networks Supported by Airtel :");
		supportedNets.forEach((x,y)-> System.out.println(x + " -> "+y));
		}
	@Override
	public void call() {
		System.out.println("Calling with Airtel...Charges "+callCharge+" /min");
		
	}
}
