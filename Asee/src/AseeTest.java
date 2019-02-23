import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class AseeTest {

	@Test
	public void test1 () {
		s obj1=new s();
		int result =obj1.getcount();
		assertEquals(0,result);
	}
	
	@Test
	public void test2() {
		s obj2=new s();
		product obj3=new product();
		obj2.add("Java Book");
		int result1 =s.getcount();
		int result2=s.getprice();
		assertEquals(1,result1);
		assertEquals(127,result2);
	}
	@Test
	public void test3() {
		s obj4=new s();
		s obj66=new s();
		obj4.clearLinkList();
		int result =obj4.getcount();
		product obj5=new product();
		obj4.add("Java Book");
		obj4.add("Web design Book");
		int result1=obj4.getcount();
		int result2=obj66.getprice();
		
		assertEquals(2,result1);
		assertEquals(227,result2);
	}

	
	
}
