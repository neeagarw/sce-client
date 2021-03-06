package com.motive.dmp.sce.shell;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.shell.plugin.support.DefaultPromptProvider;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class SCEPromptProvider extends DefaultPromptProvider {

	@Override
	public String getPrompt() {
		return "sce-shell>";
	}

	@Override
	public String getProviderName() {
		return "SCE Shell Prompt provider";
	}

}
