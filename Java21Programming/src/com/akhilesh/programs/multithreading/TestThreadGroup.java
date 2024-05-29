package com.akhilesh.programs.multithreading;

public class TestThreadGroup extends Thread {
    /**
     * Allocates a new {@code Thread} object. This constructor has the same
     * effect as {@linkplain #Thread(ThreadGroup, Runnable, String) Thread}
     * {@code (group, null, name)}.
     *
     * @param group the thread group. If {@code null} and there is a security
     *              manager, the group is determined by {@linkplain
     *              SecurityManager#getThreadGroup SecurityManager.getThreadGroup()}.
     *              If there is not a security manager or {@code
     *              SecurityManager.getThreadGroup()} returns {@code null}, the group
     *              is set to the current thread's thread group.
     * @param name  the name of the new thread
     * @throws SecurityException if the current thread cannot create a thread in the specified
     *                           thread group
     */
    public TestThreadGroup(ThreadGroup group, String name) {
        super(group, name);
        start();
    }

    public void run(){

        System.out.println("Running thread name :"+ Thread.currentThread().getName());
    }

    public static void main(String args[]){
        ThreadGroup threadGroup = new ThreadGroup("Parent Thread Group");

        TestThreadGroup testThreadGroupOne = new TestThreadGroup(threadGroup,"Thread-1" );
        TestThreadGroup testThreadGroupTwo = new TestThreadGroup(threadGroup,"Thread-2" );

        System.out.println("No of active thread in the Parent thread group : "+ threadGroup.activeCount());
    }

}
