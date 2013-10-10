package com.xored.estore_demo.cache;

import com.xored.estore_demo.ModelEntry;

public class ModelEntryCache extends OverflowingLRUCache {
	private ModelEntry spaceLimitParent = null;

	public ModelEntryCache(int size) {
		super(size);
	}

	public ModelEntryCache(int size, int overflow) {
		super(size, overflow);
	}

	@Override
	protected boolean close(LRUCacheEntry entry) {
		ModelEntry element = (ModelEntry) entry._fValue;
		element.save(true);
		return true;
	}

	public void ensureSpaceLimit(int childrenSize, ModelEntry parent) {
		// ensure the children can be put without closing other elements
		int spaceNeeded = 1 + (int) ((1 + fLoadFactor) * (childrenSize + fOverflow));
		if (fSpaceLimit < spaceNeeded) {
			// parent is being opened with more children than the space limit
			shrink(); // remove overflow
			setSpaceLimit(spaceNeeded);
			this.spaceLimitParent = parent;
		}
	}

	@Override
	protected LRUCache newInstance(int size, int overflow) {
		return new ModelEntryCache(size, overflow);
	}

	public void resetSpaceLimit(int defaultLimit, ModelEntry parent) {
		if (parent.equals(this.spaceLimitParent)) {
			setSpaceLimit(defaultLimit);
			this.spaceLimitParent = null;
		}
	}

}
