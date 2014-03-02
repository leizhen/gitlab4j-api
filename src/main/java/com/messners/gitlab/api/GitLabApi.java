package com.messners.gitlab.api;


/**
 * This class specifies methods to interact with a GitLab server utilizing the standard GitLab API.
 * 
 * @author Greg Messner <greg@messners.com>
 */
public class GitLabApi {
	
	GitLabApiClient apiClient;
	private CommitsApi commitsApi;
	private MergeRequestApi mergeRequestApi;
	private ProjectApi projectApi;
	private RepositoryApi repositoryApi;
	private UserApi userApi;
	

	/**
	 * Contructs a GitLabApi instance set up to interact with the GitLab server
	 * specified by hostUrl.
	 * 
	 * @param hostUrl
	 * @param privateToken 
	 */
	public GitLabApi (String hostUrl, String privateToken) {	
		apiClient = new GitLabApiClient(hostUrl, privateToken);
		commitsApi = new CommitsApi(this);
		mergeRequestApi = new MergeRequestApi(this);
		projectApi = new ProjectApi(this);
		repositoryApi = new RepositoryApi(this);
		userApi = new UserApi(this);
	}
	
	
	/**
	 * Return the GitLabApiClient associated with this instance.  This is used by all the sub API classes
	 * to communicate with the GitLab API.
	 * 
	 * @return the GitLabApiClient associated with this instance
	 */
	GitLabApiClient getApiClient () {
		return (apiClient);
	}
	
	
	/**
	 * Gets the CommitsApi instance owned by this GitLabApi instance.  The CommitsApi is used
	 * to perform all commit related API calls.
	 * 
	 * @return the CommitsApi instance owned by this GitLabApi instance
	 */
	public CommitsApi getCommitsApi () {
		return (commitsApi);		
	}
	
		
	/**
	 * Gets the MergeRequestApi instance owned by this GitLabApi instance.  The MergeRequestApi is used
	 * to perform all merge request related API calls.
	 * 
	 * @return the MergeRequestApi instance owned by this GitLabApi instance
	 */
	public MergeRequestApi getMergeRequestApi () {
		return (mergeRequestApi);		
	}
	

	/**
	 * Gets the ProjectApi instance owned by this GitLabApi instance.  The ProjectApi is used
	 * to perform all project related API calls.
	 * 
	 * @return the ProjectApi instance owned by this GitLabApi instance
	 */
	public ProjectApi getProjectApi () {
		return (projectApi);		
	}
	
	
	/**
	 * Gets the RepositoryApi instance owned by this GitLabApi instance.  The RepositoryApi is used
	 * to perform all user related API calls.
	 * 
	 * @return the RepositoryApi instance owned by this GitLabApi instance
	 */
	public RepositoryApi getRepositoryApi () {
		return (repositoryApi);		
	}
	
	
	/**
	 * Gets the UserApi instance owned by this GitLabApi instance.  The UserApi is used
	 * to perform all user related API calls.
	 * 
	 * @return the ProjectApi instance owned by this GitLabApi instance
	 */
	public UserApi getUserApi () {
		return (userApi);		
	}
}
