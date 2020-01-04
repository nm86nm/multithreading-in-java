package thinkingInJava4thEdition;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class TaskWithResult implements Callable<String> {
	private int id;

	public TaskWithResult(int id) {
		this.id = id;
	}

	@Override
	public String call() throws Exception {
		return "result of TaskWithResult " + id;
	}
}

public class CallableDemo {
	ExecutorService executorService = Executors.newCachedThreadPool();
	ArrayList<Future<String>> results = new ArrayList<Future<String>>();

	for(int i = 0;i<10;i++)
		results.add(executorService.submit(new TaskWithResult(i)));
	
}