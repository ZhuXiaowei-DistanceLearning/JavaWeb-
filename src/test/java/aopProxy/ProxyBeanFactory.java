package aopProxy;

public class ProxyBeanFactory {
	public static <T> T getBean(T obj, Interceptor interceptor) {
		return obj;
//		return (T) ProxyBeanUtil.getBean(obj, interceptor);
	}
}
