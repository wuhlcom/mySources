package com.ann.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface ClassInfo {
	String created();
	String createdBy();
	String lastModified();
	String lastModifiedby();
	int revivion();
}
