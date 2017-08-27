/**
 *
 */
package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * @author raparash
 *
 */
public class UiController implements Initializable {

	@FXML
	private TextField username;

	@FXML
	private TextField password;

	@FXML
	private TextField browse;

	@FXML
	private Button submit;

	@FXML
	private Button download;

	@FXML
	private Button cancel;

	@FXML
	private TextArea log;

	@FXML
	private ChoiceBox<String> jira;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the username
	 */
	public TextField getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(TextField username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public TextField getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(TextField password) {
		this.password = password;
	}

	/**
	 * @return the browse
	 */
	public TextField getBrowse() {
		return browse;
	}

	/**
	 * @param browse the browse to set
	 */
	public void setBrowse(TextField browse) {
		this.browse = browse;
	}

	/**
	 * @return the submit
	 */
	public Button getSubmit() {
		return submit;
	}

	/**
	 * @param submit the submit to set
	 */
	public void setSubmit(Button submit) {
		this.submit = submit;
	}

	/**
	 * @return the download
	 */
	public Button getDownload() {
		return download;
	}

	/**
	 * @param download the download to set
	 */
	public void setDownload(Button download) {
		this.download = download;
	}

	/**
	 * @return the cancel
	 */
	public Button getCancel() {
		return cancel;
	}

	/**
	 * @param cancel the cancel to set
	 */
	public void setCancel(Button cancel) {
		this.cancel = cancel;
	}

	/**
	 * @return the log
	 */
	public TextArea getLog() {
		return log;
	}

	/**
	 * @param log the log to set
	 */
	public void setLog(TextArea log) {
		this.log = log;
	}

	/**
	 * @return the jira
	 */
	public ChoiceBox<String> getJira() {
		return jira;
	}

	/**
	 * @param jira the jira to set
	 */
	public void setJira(ChoiceBox<String> jira) {
		this.jira = jira;
	}


	public void submitOnClick(ActionEvent event) throws InterruptedException{
/*		Thread t=new Thread(new Runnable(){

			@Override
			public void run() {
				Platform.runLater(new Runnable(){

					@Override
					public void run() {
						if(Platform.isFxApplicationThread()){
							username.setText("Test UsernameTest");
						}else{
							username.setText("Test Username");
						}


					}

				});
				try {
					Thread.sleep(10000);
					System.out.println("Test");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});
		t.start();
*/

	}


}
