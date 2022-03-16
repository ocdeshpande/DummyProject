package com.test.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;

public class TestSortByKeyInMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<TimeZoneHelper> timeZoneHelperBeanList = new ArrayList<>();
		timeZoneHelperBeanList.add(populateTimeZoneHelper(-10, 50, "IND"));
		timeZoneHelperBeanList.add(populateTimeZoneHelper(-10, 10, "AUS"));
		timeZoneHelperBeanList.add(populateTimeZoneHelper(0, 0, "AFR"));
		timeZoneHelperBeanList.add(populateTimeZoneHelper(-2, 0, "MOZ"));
		timeZoneHelperBeanList.add(populateTimeZoneHelper(-2, 30, "MAL"));
		timeZoneHelperBeanList.add(populateTimeZoneHelper(-3, 0, "JAP"));
		timeZoneHelperBeanList.add(populateTimeZoneHelper(10, 30, "PAK"));
		timeZoneHelperBeanList.add(populateTimeZoneHelper(10, 50, "USA"));
		timeZoneHelperBeanList.add(populateTimeZoneHelper(14, 20, "UGD"));

		/*
		 * timeZoneHelperBeanList.stream().sorted(
		 * Comparator.comparingInt(TimeZoneHelper::getModulus).thenComparingInt(
		 * TimeZoneHelper::getReminder)) .forEach(timeZoneHelperObj -> {
		 * System.out.println("(" + timeZoneHelperObj.getModulus() + ":" +
		 * timeZoneHelperObj.getReminder() + ")" +
		 * timeZoneHelperObj.getTimeZoneValue()); });
		 */

		timeZoneHelperBeanList.stream().sorted((TimeZoneHelper helper1, TimeZoneHelper helper2) -> {
			return Double.valueOf(helper1.getModulus() + "." + helper1.getReminder())
					.compareTo(Double.valueOf(helper2.getModulus() + "." + helper2.getReminder()));
		}).forEach(timeZoneHelperObj -> {
			System.out.println("(" + timeZoneHelperObj.getModulus() + ":" + timeZoneHelperObj.getReminder() + ")"
					+ timeZoneHelperObj.getTimeZoneValue());
		});

		String[] avlTimeZones = TimeZone.getAvailableIDs();
		Arrays.sort(avlTimeZones);
		/*
		 * for (int i = 0; i < avlTimeZones.length; i++) {
		 * System.out.println(avlTimeZones[i]); }
		 */

	}

	private static TimeZoneHelper populateTimeZoneHelper(int modulus, int reminder, String timeZoneValue) {
		TimeZoneHelper timeZoneHelper = new TestSortByKeyInMap().new TimeZoneHelper();
		timeZoneHelper.setModulus(modulus);
		timeZoneHelper.setReminder(reminder);
		timeZoneHelper.setTimeZoneValue(timeZoneValue);
		return timeZoneHelper;

	}

	private class TimeZoneHelper {
		private int modulus;
		private int reminder;
		private String timeZoneValue;

		public int getModulus() {
			return modulus;
		}

		public void setModulus(int modulus) {
			this.modulus = modulus;
		}

		public int getReminder() {
			return reminder;
		}

		public void setReminder(int reminder) {
			this.reminder = reminder;
		}

		public String getTimeZoneValue() {
			return timeZoneValue;
		}

		public void setTimeZoneValue(String timeZoneValue) {
			this.timeZoneValue = timeZoneValue;
		}

	}

}
