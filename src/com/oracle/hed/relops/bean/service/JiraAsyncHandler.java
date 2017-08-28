/**
 *
 */
package com.oracle.hed.relops.bean.service;

import java.io.InputStream;
import java.util.List;

import com.oracle.excel.util.helper.CommonUtil;
import com.oracle.hed.relops.bean.SubTaskResult;

import javafx.scene.control.TextArea;





/**
 * @author raparash
 *
 */
public class JiraAsyncHandler implements Runnable{

	private String username;
	private String password;
	private InputStream inputStream;
	private TextArea textArea;

	public JiraAsyncHandler(String username,String password,InputStream inputStream,TextArea textArea) {
		this.username=username;
		this.password=password;
		this.inputStream=inputStream;
		this.textArea=textArea;

	}

	public void processTask(){
		JiraRestClient restClient=new JiraRestClient(username, password,textArea);
		List<SubTaskResult> listOfCreatedTasks=null;
			textArea.appendText("Processing Started\n");
			textArea.appendText( "This might take few minutes\n");
			try {
				listOfCreatedTasks=restClient.processExcelToJira(inputStream);
				textArea.appendText("\n\n---------------------------------------------Summary-------------------------------------------\n\n");
				if(listOfCreatedTasks==null || listOfCreatedTasks.size()==0){
					textArea.appendText("No Tasks created");
				}else{
					for(SubTaskResult subtask:listOfCreatedTasks){
						String key=CommonUtil.safeTrim(subtask.getKey());
		    			if(!key.isEmpty()){
		    				textArea.appendText("Subtask created successfully: "+key+" - "+subtask.getSummary()+" ( "+JiraRestClient.SUBTASK_URL_PATTERN+key+" )\n");
		    			}
					}
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	@Override
	public void run() {
		processTask();
	}

}
