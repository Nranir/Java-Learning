package lesson41;

public class Notepad
{
	/*
	 * Multitasking  vs Multithreading
	 * 
	 * Multitasking refers to a computer's ability to perform multiple jobs concurrently
	 *  - more than one program are running concurrently eg. unix
	 *  
	 *  A thread is a single sequence of execution within a program
	 *  
	 *  Multithreading refers to multiple threads to control within a single program
	 *  	- each program can run multiple threads of control within it
	 * ################################################################
	 * 
	 * Concurrency  	vs		 parallelism
	 * 
	 * CPU:      				CPU1       CPU2
	 * [ ]						[ ] 		[ ]
	 * |_|						[ ]			[ ]
	 * 							[ ]			[ ]
	 * [_]						[ ]			[ ]
	 * 							[_]			[_]
	 * [ ]
	 * [ ]
	 * [_]
	 * 
	 * 
	 * Concurrency: 
	 * cpu przydziela priorytet jakims procesom i tak ustawie procesy
	 * 
	 * w przypadku 2x CPU 
	 * jezeli sa 2 procesy to wykonuje je oddzielnie na dwoch procesach (parallelism)
	 * 
	 * ################################################################
	 * 
	 * Threads and processes
	 * 						CPU
	 * [	[process1]	[process2]	[main		]	[process3]
	 * [	[________]	[________]  [run		]	[________]
	 * [							[Process3	]
	 * [							[GC			]
	 * [							[___________]
	 * [
	 * 
	 * 
	 * procesy to jak jakies programy
	 * proces - executing instance of a program
	 * thread - subset of a process
	 * 
	 * An executing instance of a program is called a process. A thread is a subset of the process
	 * threads share the address space of the process that created it; processes have their own address space
	 * 
	 * 
	 * 
	 * 
	 * Where are threads good for?
	 * -maintain responsiveness of an application during a long running task
	 * -to enable cancellation of separable tasks
	 * -some problems are instrinsically parallel
	 * -to monitor status of some resource (DB)
	 * -some API and systems demand it: Swing
	 * 
	 * 
	 * Application thread
	 * -when we execute an application:
	 * - the jvm(java virtial machine) create a thread object whose task is define by the main() method
	 * -it starts a thread
	 * -the thread executes the statements of the program one by one until the method returns of the thread dies
	 * 
	 * 
	 * multiple threads in an application
	 * -each thread has its private run-time stack
	 * if two threads execute the same method, each will have its own copy of the local variables and methods uses 
	 * -however all threads see the same dynamic memory (heap)
	 * -two diffrent threads can act on the same object and same static fields concurrently
	 * 
	 * 
	 * creating threads
	 * 
	 * -there are two ways to create our own thread object
	 * 1. subclassing the thread class and instantiation a new object of that class
	 * 2. implementing the runnable interface
	 * in both cases the run() method should be implemented
	 */
}
