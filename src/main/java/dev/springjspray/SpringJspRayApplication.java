package dev.springjspray;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@SpringBootApplication
public class SpringJspRayApplication {

	@SuppressWarnings("unchecked")
	public static void disableAccessWarnings() {
		try {
			Class unsafeClass = Class.forName("sun.misc.Unsafe");
			Field field = unsafeClass.getDeclaredField("theUnsafe");
			field.setAccessible(true);
			Object unsafe = field.get(null);

			Method putObjectVolatile = unsafeClass.getDeclaredMethod("putObjectVolatile", Object.class, long.class, Object.class);
			Method staticFieldOffset = unsafeClass.getDeclaredMethod("staticFieldOffset", Field.class);

			Class loggerClass = Class.forName("jdk.internal.module.IllegalAccessLogger");
			Field loggerField = loggerClass.getDeclaredField("logger");
			Long offset = (Long) staticFieldOffset.invoke(unsafe, loggerField);
			putObjectVolatile.invoke(unsafe, loggerClass, offset, null);
		} catch (Exception ignored) {
		}
	}

	public static void main(String[] args) {
		disableAccessWarnings();
		SpringApplication.run(SpringJspRayApplication.class, args);
	}

}
