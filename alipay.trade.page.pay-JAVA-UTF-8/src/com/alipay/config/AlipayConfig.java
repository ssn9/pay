package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

	// ↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016091100485690";

	// 商户私钥，您的PKCS8格式RSA2私钥
	public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCqUTt8LA4nvvz0Uycjm0XZ4wROOY5r4PV/lBTsl6JV6JuG034nWkIFhHfeUuXm29SMjCG+2NouZjYTBEQ5twM/OBvB2n1x3JgkMWa/Nc5mQ58xykeuC/6D7EWOCA4LIvo7xAgkxVv6yGWSpdxXgg88N+WivPK8jy5mBtO47vEpB4MuTktA12wZNmndMoN1BQk+XOfpcnEf7y9d0jKdCy7g4R9RGnSSvvCHVqDwQ8PD+YGe/j+hc5T93PU7Hm7+oiRanhXiGYPBWwupGlRZfr+IueVr/2CSEpiFN6Ghz/Gy4SSMDl1a7CRDYP/WxdkP4KBvPid3LfOjxVcloQMnygIJAgMBAAECggEAf63J9Dpqmi05IEg97Rl38fGXxrSrKgBIyk1Oqla6YcCw5xAhYIrvN4eo/MgUhU6DNqHOom2aknIZU4Q9SS8Dhh8f3+FVbUg73dYS+oDxrARBkWfc+IMRWACF3AX50St1f9xjZn11iLk2PAuO9SMRHMmioq8XIXgNBntTuS2XKHO3LB9bmFWpTJCmA9VmPZT1s35zEBLvTLKfLbdWGIWYPmjRwA8JNmYPYzR2F/MLHueWw4QzKJr8ZXnQIa76v9slEvY+ovtSNux4EdlFTqMZotSEhRZM9tUCZEbDTTql+K2nzif784+Nq3Eudy3wdWTNe1PU0Own4gxQIBTiWatXqQKBgQDwBMV+IRc077LL3M2VcTRELFlHk/GG9sEMXDD7hGA64IFlmKghj567MzZVbIoZd6gaFVEZvSYTQ/hk6j9hD/1n+znZtM3csj7RlFpV+MFFeyjTokO2NyEA9CMX7XfY03ytgRKwLIaHRruI1yMruPiILq+bjCeRyxLfbjGf3rb0QwKBgQC1qF6gqxErl+MAKFT0Fd6SRkFpVoEIV8uVNkPkp2kOGLEYKhj3FAMc8k/0k+IAKORmKAtXyPIt7QIkOn2s3RLdFaoHYEbiQDucWkDWRERWeZU9zKLncxm6iLS0npsBmvUe+SSUZCnEfS25ZsNJjweCrz7P7HqWFmlHGVaX3lyRwwKBgQDchxXKIK9I5R+7bcG6mEu0g6b4PDdDkT6ok6AxyFv+XL6nUU7Rnzrxt0kpzdNJOQbMCF/+rSrpsp7sYcof7WggfNSXcidfqqpLN+qUaT1zEIjfgoyCRD7fuHDyEC74msBITnqUQiTM8DFotnrLNmWsAnE5Etpce2B4x69yu1gQLwKBgQCKVXwyF/NMYi7QaOZAtgK3G18mi2RZaRo0N42+KypaPL1nrG80gH3aZkAy/Qamnn1HugjhQboC9TCjTBN2NyftSlkfotZ35vg+GZC0Wmo7+/yFgjcvz7vxC7eor/tUXp95hbqwchJIehb+z925P301rKRFjEzRzKFBLm992SxfJwKBgQCdhio0IEnUR9Ce4h5Vm1Kse+GY27p1svrfvsG1G/Zb1l4Ror4sT1+zXrdg6LYQqTFJGHjSpAv1VzHy1RNjQdgfR7TVChDEIf+nJBMPb3dV8WydwBOpokzfWzSLmM9hgtiJwyYq7GDpRqf+/gE+X3OHqoQLRU7QEWik/xypcigE5Q==";

	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm
	// 对应APPID下的支付宝公钥。
	public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAupH842I+WNQQC0w9bDQb/wUEXL21O6tTTVFpBxyJ14nzTFG0wksgspD4HTbVuPbb8pRkfjJmqmKk/gOpFIdRS07SyMaGc+zOgkvow7I/Ypdtk7VFuC/3TKvUJxWkoZWpMQHW51AG8mtdHYo3a/u7jovCGRfu57hrnPx07lnCuVBGmW4l5yY7AkHG4iS81C/6N40uPw74yryPcXkh0sTgu9/tv/wnecFSuj4f9+xu/v8uQY+p2WmJ7rcoBvR0xiUooZnIZbyoJcwIneRRQfye3bBkCuZxLhKDwqaWH+4ZP/wMGydJNhSM/8rn81OMM3i1eyo55iSm2RSB5XlaKez78QIDAQAB";

	// 服务器异步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://127.0.0.1:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://127.0.0.1:8080/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";

	// 字符编码格式
	public static String charset = "utf-8";

	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

	// 支付宝网关
	public static String log_path = "C:\\";

	// ↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

	/**
	 * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
	 * 
	 * @param sWord
	 *            要写入日志里的文本内容
	 */
	public static void logResult(String sWord) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(log_path + "alipay_log_"
					+ System.currentTimeMillis() + ".txt");
			writer.write(sWord);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
