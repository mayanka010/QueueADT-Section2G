package main;

public class QueueADT
{

	int[] queue = new int[10];
	int front = -1;
	int rear = -1;
	int size = queue.length;

	void enqueue(int value)
	{

	}

	int dequeue()
	{
		int deleted = 0;
		// Checking method if it is empty or not
		if(isEmpty())
		{
		System.out.println("Can't Dequeue!");
		}
		else
			{
				deleted = queue[0];
				// Shifting the elements
				for(int i =0; i < queue.length-1; i++)
				{
					queue[i]=queue[i+1];
				}
			queue[queue.length-1]= Integer.parseInt(null);
		   }

		// Print the deleted element
		return deleted;
	}

	int peek()
	{
		int item = 0;

		return item;
	}

	int size()
	{
		int size = 0;

		return size;
	}

	boolean isEmpty()
	{
		return false;
	}

	boolean isFull()
	{
		return false;
	}

}
