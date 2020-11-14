package demo.audit.controller;

import org.hibernate.envers.RevisionListener;

import demo.audit.entity.Revision;

public class CustomRevisionListener implements RevisionListener {

	public void newRevision(Object revisionEntity) {
		
		final Revision revision = (Revision) revisionEntity;
		revision.setUserName(getThreadAccountUserName());
	}

	private String getThreadAccountUserName() {
		
		return "root";
	}

}
