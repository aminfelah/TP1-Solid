package com.directi.training.ocp.exercise;

public class TimeResource implements Resource {
	@Override
	public int findFree() {
		return this.findFreeTimeSlot();
	}

	@Override
	public void markBusy(int resourceId) {

		resourceId = findFreeTimeSlot();
		markTimeSlotBusy(resourceId);

	}

	@Override
	public void markFree(int resourceId) {
		markTimeSlotFree(resourceId);
	}

	private void markTimeSlotFree(int resourceId) {
	}

	private void markTimeSlotBusy(int resourceId) {
	}

	private int findFreeTimeSlot() {
		return 0;
	}
}
