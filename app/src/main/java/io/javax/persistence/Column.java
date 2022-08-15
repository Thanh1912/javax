package io.javax.persistence;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
	String name() ;
	boolean nullable();
	boolean unique();
	boolean insertable();
	boolean updatable();
}
