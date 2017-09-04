package junit;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.baofoo.util.SecurityUtil;


public class Test {

	@org.junit.Test
	public void test() {
		String str="100000178|3001|20161220174748|PAGATID1482227268908|200|http://localhost:9090/PayGat-Pc/PageUrl.html|http://localhost:9090/PayGat-Pc/ReturnUrl.action|1|abcdefg";
		System.out.println(SecurityUtil.MD5(str));
		System.out.println("------------");
		System.out.println(md5_4_32(str));
		
	}
	
	
	public static String md5_4_32(String sourceStr) {
		String result = "";
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(sourceStr.getBytes());
			byte b[] = md.digest();
			int i;
			StringBuffer buf = new StringBuffer("");
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}
			result = buf.toString();
		} catch (NoSuchAlgorithmException e) {
			System.out.println(e.getMessage());
		}
		return result;
	}

}
