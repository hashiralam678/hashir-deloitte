package com.deloitte;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo1 {

	public static void main(String[] args) {
		
		List<StringBuffer> sbList=new ArrayList<>();
		
		sbList.add(new StringBuffer("abc"));
		sbList.add(new StringBuffer("xyz"));
		sbList.add(new StringBuffer("pqr"));
		sbList.add(new StringBuffer("ijk"));
		
		for(StringBuffer sb:sbList) {
			sb.append("123");
		}
		for(StringBuffer sb:sbList) {
			System.out.println(sb);
		}

	}

}
