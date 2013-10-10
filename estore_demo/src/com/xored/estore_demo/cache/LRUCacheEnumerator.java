package com.xored.estore_demo.cache;

import java.util.Enumeration;

@SuppressWarnings("rawtypes")
public class LRUCacheEnumerator implements Enumeration {

	protected LRUEnumeratorElement fElementQueue;

	public static class LRUEnumeratorElement {

		public Object fValue;

		public LRUEnumeratorElement fNext;

		public LRUEnumeratorElement(Object value) {
			fValue = value;
		}
	}

	public LRUCacheEnumerator(LRUEnumeratorElement firstElement) {
		fElementQueue = firstElement;
	}

	public boolean hasMoreElements() {
		return fElementQueue != null;
	}

	public Object nextElement() {
		Object temp = fElementQueue.fValue;
		fElementQueue = fElementQueue.fNext;
		return temp;
	}
}
