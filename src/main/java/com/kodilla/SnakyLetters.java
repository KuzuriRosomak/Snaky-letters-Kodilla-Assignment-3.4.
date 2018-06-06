package com.kodilla;

import java.util.*;
import java.lang.*;

class SnakyLetters
{
	ArrayList<String> oddNumberOfA = new ArrayList<String>();
	ArrayList<String> evenNumberOfA = new ArrayList<String>();

	public void splittingTasks(ArrayDeque<String> theQueue)
	{
		while (theQueue.size() > 0)
		{
			String currentTask = theQueue.pollFirst();
			if(currentTask.length() % 2 == 0)
			{
				evenNumberOfA.add(currentTask);
			}
			else
			{
				oddNumberOfA.add(currentTask);
			}

		}
		System.out.println("\nExecuted tasks with odd number of A in the name: " + oddNumberOfA.size());
		System.out.println();
		System.out.println("\nExecuted tasks with even number of A in the name: " + evenNumberOfA.size());
	}
}


class QueueAndNameAGenerator
{
	public static void main (String[] args)
	{
		String stringOfA = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		Random generatorOfAName = new Random();
		String temporaryString = "b";

		ArrayDeque<String> aAAQueue = new ArrayDeque<String>();
		for(int i = 0; i < 50; i++)
		{
			temporaryString = stringOfA.substring(0, ((generatorOfAName.nextInt(50) + 1)));
			aAAQueue.offerLast(temporaryString);

			System.out.println("#" + (i + 1) + " task's name is: " + "\n" + temporaryString);
			System.out.println("This name has: " + temporaryString.length() + " letters");
			System.out.println();
		}

		SnakyLetters splitter = new SnakyLetters();
		splitter.splittingTasks(aAAQueue);
	}
}