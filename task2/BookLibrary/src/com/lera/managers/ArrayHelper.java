package com.lera.managers;

import com.lera.library.Entity;

public class ArrayHelper {

	public Integer getNullIndex(Entity[] arr) {
		Integer index = null;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				index = i;
				return index;
			}
		}
		return null;
	}

	public boolean checkArray(Entity[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				return true;
			}
		}
		return false;
	}

	public Entity[] incrementArray(Entity[] arr) {
		int size = arr.length;
		int newSize = size * 2;
		Entity[] newArr = new Entity[newSize];
		System.arraycopy(arr, 0, newArr, 0, size);
		return newArr;
	}

	public Integer getIndexObject(Entity[] arr, Entity obj) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == obj) {
				return i;
			}
		}
		return null;
	}

	public Entity[] deleteElementIfKnowIndex(Entity[] arr, Integer index) {
		for (int j = index; j < arr.length - 1; j++) {
			arr[j] = arr[j + 1];
		}
		Entity[] newArr = arr;
		for (int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i]);
		}
		return newArr;
	}
}
