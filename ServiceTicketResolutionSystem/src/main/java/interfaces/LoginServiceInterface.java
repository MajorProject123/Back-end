package interfaces;

import bean.LoginCredentials;

public interface LoginServiceInterface {

	public LoginCredentials validate(LoginCredentials credentials) throws Exception;
}
