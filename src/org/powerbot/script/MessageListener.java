package org.powerbot.script;

import java.util.EventListener;

public interface MessageListener extends EventListener {
	public void messaged(MessageEvent e);
}