package cn.com.demo;

import com.taobao.diamond.md5.MD5;

public class Demo {

	public static void main(String[] args) {
		MD5 md5 = MD5.getInstance();
		String pwd = md5.getMD5String(md5.getMD5String("abc123") + "hTxoTN");
		System.out.println(pwd);
	}

}
