package com.lbl.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MDjiami extends Thread {
	public String run(String password) {
		byte[] data = (byte[]) null;
		MessageDigest m = null;
		try {
			data = password.getBytes("UTF8");
			m = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		m.update(data);
		byte[] resultData = m.digest();
		return convertToHexString(resultData);
	}

	static String convertToHexString(byte[] data) {
		StringBuffer strBuffer = new StringBuffer();
		for (int i = 0; i < data.length; i++) {
			strBuffer.append(Integer.toHexString(0xFF & data[i]));
		}
		return strBuffer.toString();
	}
}
