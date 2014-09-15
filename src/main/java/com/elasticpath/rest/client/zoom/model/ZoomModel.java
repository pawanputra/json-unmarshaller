package com.elasticpath.rest.client.zoom.model;

public class ZoomModel {

	private Iterable<RelationPathModel> relationPaths;

	public ZoomModel(Iterable<RelationPathModel> relationPaths) {
		this.relationPaths = relationPaths;
	}

	public Iterable<RelationPathModel> getRelationPaths() {
		return relationPaths;
	}
}
