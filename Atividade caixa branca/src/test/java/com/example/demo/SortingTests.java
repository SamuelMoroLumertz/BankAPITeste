package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SortingTests {
	Sorting sorting = new Sorting();
	@Test
	void testaBubbleSortOrdenado() {
		int[] arr = { 1,2,3,4,5,6,7,8,9,10};

		assertTimeoutPreemptively(Duration.ofMillis(1),()->sorting.bubble(arr));
		
	}

	@Test
	void testaBubbleSortOrdenadoDecrescente() {
		int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

		assertTimeoutPreemptively(Duration.ofMillis(1),()->sorting.bubble(arr));
	}

	@Test
	void testaInsertionSortOrdenado() {
		int[] arr = { 1,2,3,4,5,6,7,8,9,10};

		assertTimeoutPreemptively(Duration.ofMillis(1),()->sorting.insertion(arr));
	}

	@Test
	void testaInsertionSortOrdenadoDecrescente() {
		int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

		assertTimeoutPreemptively(Duration.ofMillis(1),()->sorting.insertion(arr));
	}

	@Test
	void testaQuickSortOrdenado() {
		int[] arr = { 1,2,3,4,5,6,7,8,9,10};

		assertTimeoutPreemptively(Duration.ofMillis(1),()->sorting.quick(arr,0,arr.length-1));
	}

	@Test
	void testaQuickSortOrdenadoDecrescente() {
		int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

		assertTimeoutPreemptively(Duration.ofMillis(1),()->sorting.quick(arr,0,arr.length-1));
	}
}
