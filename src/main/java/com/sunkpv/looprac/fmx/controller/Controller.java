package com.sunkpv.looprac.fmx.controller;

public interface Controller {

	void register(ControllerCallback callback);
	void unregister(ControllerCallback callback);
}
