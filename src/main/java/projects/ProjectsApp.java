package projects;

import projects.dao.DbConnection;

public class ProjectsApp {

	public static void main(String[] args) {
		DbConnection dbConnection = new DbConnection();
		dbConnection.getConnection();
	}
	
}
