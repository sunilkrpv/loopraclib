package com.sunkpv.looprac.fmx.controller;

/**
 * Defines interface for controller callback mechanism
 * @author sunil
 *
 */
public interface ControllerCallback {

	void onResponse(ControllerRequest request, ControllerResponse response);
	void onCompleted(ControllerRequest request, ControllerResponse response);
	void onCancelled(ControllerRequest request, ControllerResponse response);
}
