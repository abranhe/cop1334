//
// Write a program that opens the file, reads all the numbers
// from the file, and calculates the following:
//
//  The number of numbers in the file
//  The sum of all the numbers in the file (a running total)
//  The average of all the numbers in the file
//
// Copyright (c) Carlos Abraham Hernandez
// <abraham@abranhe.com> (abranhe.com)
//
#include <iostream>
#include <fstream>
#include <string>
#include "main.h"

using namespace std;

int main()
{
	ifstream numbersFile;

	numbersFile.open("random.txt");

	if (!numbersFile) cout << "Error opening file.\n";

	double numbers;
	double amountOf_Numbers = 0;
	double sum = 0
	double average;

	while (numbersFile >> numbers)
	{
		cout << "The numbers are " << numbers << endl;
		amountOf_Numbers++;
		sum += numbers;
	}

	// Find average
	average = averageCalculator(amountOf_Numbers, sum);
  	cout << "There are "<< amountOf_Numbers << " numbers."<< endl;
  	cout << "The sum of all numbers in the file is " << sum << endl;
  	cout << "The average in the file is " << average << endl;

	numbersFile.close();
	return 0;
}

// Function to calculate average
double averageCalculator(double noNumbers, double sum)
{
    return sum / noNumbers;
}
