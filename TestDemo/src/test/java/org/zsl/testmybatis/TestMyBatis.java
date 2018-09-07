package org.zsl.testmybatis;


//@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
//@ContextConfiguration(locations = {"classpath*:spring-mybatis.xml"})

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.math.BigDecimal;
import java.util.Date;

public class TestMyBatis {
//	private static Logger logger = Logger.getLogger(TestMyBatis.class);
////	private ApplicationContext ac = null;
//	@Resource
//	private IUserService userService = null;

//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService = (IUserService) ac.getBean("userService");
//	}

//	@Test
//	public void test1() {
//		User user = userService.getUserById(1);
//		// System.out.println(user.getUserName());
//		// logger.info("值："+user.getUserName());
//		logger.info(JSON.toJSONString(user));
//	}

	public static void main(String[] args) {
		String orderCode = null;
		if (orderCode!=null){
			System.out.println("aaaaa");
		}else {
			System.out.println("bbbbbb");
		}
	}
}
