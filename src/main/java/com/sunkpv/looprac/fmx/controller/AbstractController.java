package com.sunkpv.looprac.fmx.controller;

import java.util.ArrayList;
import java.util.List;

import com.sunkpv.looprac.exception.LoopRacException;

public abstract class AbstractController implements Controller {

	protected List<ControllerCallback> callbacks;
	protected ControllerCallback controllerCallback;

	public AbstractController(ControllerCallback cb) {
		callbacks = new ArrayList<ControllerCallback>();
		setControllerCallback(cb); 
	}

	public final void setControllerCallback(ControllerCallback cb) {
		this.controllerCallback = cb;
	}
	
	public void register(ControllerCallback cb) {
		if (cb == null) {
			try {
				throw new LoopRacException("ControllerCallback object passed is null");
			} catch (LoopRacException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		callbacks.add(cb);
	}

	public void unregister(ControllerCallback cb) {
		if (cb == null) {
			return;
		}
		callbacks.remove(cb);
	}
	
	public final ControllerCallback getCallbackInterface() {
		return controllerCallback;
	}
}
