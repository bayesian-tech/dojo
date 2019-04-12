package com.shmulik.islands;

// Write By Shmulik Glickman
//
// Find the number of islands
//
// A group of connected 1 - forms an island. Connected horizontal and vertical and diagonal.
//
// 0 - represent the sea.
//
// For example, the below matrix contains 5 islands

public class IslandsMain {

	int rowI = 5;
	int columnJ = 5;

	// Example Matrix Islands Source
	int[][] islands = { { 0, 0, 0, 0, 0, 0, 0 },
						{ 0, 1, 1, 0, 0, 0, 0 },
						{ 0, 0, 1, 0, 0, 1, 0 },
						{ 0, 1, 0, 0, 1, 1, 0 },
						{ 0, 0, 0, 0, 0, 0, 0 },
						{ 0, 1, 0, 1, 0, 1, 0 },
						{ 0, 0, 0, 0, 0, 0, 0 } };

	public int counterIslands(int[][] matrixIslands, int rowI, int columnJ) {
		int counterIslands = 0;

		for (int i = 1; i <= rowI; i++) {

			for (int j = 1; j <= columnJ; j++) {

				if (matrixIslands[i][j] == 1) {

					if ((matrixIslands[i - 1][j + 1] == 0) && (matrixIslands[i][j + 1] == 0)
							&& (matrixIslands[i + 1][j + 1] == 0) && (matrixIslands[i + 1][j] == 0)) {
						counterIslands++;
					}
				}
			}
		}
		return counterIslands;
	}

	
	private static void displayMatrixIslands(IslandsMain IslandsMainFound) {
		for (int rowI = 1; rowI <= 5; rowI++) {
			for (int columnJ = 1; columnJ <= 5; columnJ++) {
				System.out.print(IslandsMainFound.islands[rowI][columnJ]);
			}
			System.out.println("");
		}
	}
	
	
	public static void main(String[] args) {
		IslandsMain IslandsMainFound = new IslandsMain();

		System.out.println("The island matrix display at sea:\n0 - Sea\n1 - land\n\nThe Matrix Show:");

		displayMatrixIslands(IslandsMainFound);

		System.out.println("\nThe number of islands found at sea is: =  " + IslandsMainFound
				.counterIslands(IslandsMainFound.islands, IslandsMainFound.rowI, IslandsMainFound.columnJ));
	}

}
