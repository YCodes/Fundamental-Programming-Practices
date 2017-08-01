package com.assignments.lesson4_1;

public class MyTable {
	private Entry[] entries = new Entry[26];

	// returns the String that is matched with char c in the table
	public String get(char c) {
		// implement
		Entry entry = entries[c - 97];
		return entry.str;

	}

	// adds to the table a pair (c, s) so that s can be looked up using c
	public void add(char c, String s) {
		Entry entry = new Entry(s, c);
		// 97 is the int value of a
		entries[c - 97] = entry;
		// System.out.println("the entry" + entries[c - 97]);

	}

	// returns a String consisting of nicely formatted display
	// of the contents of the table
	public String toString() {
		// implement
		String toReturn = "";
		for (int i = 0; i < entries.length; i++) {
			if (entries[i] != null) {
				toReturn += entries[i].toString();
			}
		}

		return toReturn;

	}

	private class Entry {
		private String str;
		private char ch;

		Entry(String str, char ch) {
			this.ch = ch;
			this.str = str;
			// implement
		}

		// returns a String of the form "ch->str"
		public String toString() {
			// implement

			return this.ch + "->" + this.str + "\n";
		}
	}

}