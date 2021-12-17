package com.directi.training.ocp.exercise;

public class SpaceResource implements Resource {
	@Override
	public int findFree() {
		return this.findFreeSpaceSlot();
	}

	@Override
	public void markBusy(int resourceId) {
		resourceId = findFreeSpaceSlot();
		markSpaceSlotBusy(resourceId);
	}

	@Override
	public void markFree(int resourceId) {
		markSpaceSlotFree(resourceId);
	}

	private void markSpaceSlotFree(int resourceId) {
	}

	private void markSpaceSlotBusy(int resourceId) {
	}

	private int findFreeSpaceSlot() {
		return 0;
	}
}
